<script lang="ts">
	import { currentTeam } from '$lib/stores/teamStore';
	import { currentUser, type User } from '$lib/stores/userStore';
	import { getTeamByID } from '$lib/utils/storageHelpers';
	import TeamCard from './TeamCard.svelte';
	import type { Team, DateOrTask } from '$lib/stores/teamStore';
	import { goto } from '$app/navigation';
	import { userIsAdmin } from '$lib/actions/teamHelpers';
	import { countFeedback } from '$lib/actions/dateOrTaskHelpers';

	// console.log('Component Overview!');
	// TeamID  als Prop übergeben
	export let teamID: number;
	let teamcolor = 'FFF321';
	let currentUserIsAdmin = false;

	const myTeam = getTeamByID(teamID.toString());
	$: if (myTeam) currentUserIsAdmin = userIsAdmin($currentUser, myTeam);
	// $: console.log("isAdmin?", currentUserIsAdmin,"User: ", $currentUser.userName, "Team: ", myTeam?.teamID);
	// console.log('TeamID, myTeam: ', teamID, myTeam);
	let allNames: string[] = [];
	let hasNextDate: boolean = false;

	let yes: number = -1;
	let no: number = -1;
	let none: number = -1;
	let what: string = '';
	let date: string = "";
	let time: string = "";

	let nextDate: DateOrTask | null = null;




// // Extract date and time as strings
// const extractedDate = dueDate.toISOString().split('T')[0];
// const extractedTime = dueDate.toTimeString().split(' ')[0].slice(0, 5); // Using toTimeString to get the time part

// // Alternative approach using locale methods
// const localeDate = dueDate.toLocaleDateString('en-CA'); // 'en-CA' for YYYY-MM-DD format
// const localeTime = dueDate.toLocaleTimeString('en-GB', { hour: '2-digit', minute: '2-digit' }); // 'en-GB' for HH:MM forma



	$: if (myTeam && myTeam.color !== null) teamcolor = myTeam.color;

	$: if (myTeam) {
		// currentUserIsAdmin = userIsAdmin($currentUser, myTeam);
		hasNextDate = myTeam.allDates.length > 0;

		// console.log("hasNextDate. ", hasNextDate);
	}

	// $: if (myTeam) console.log("user, team, admin? ",$currentUser, myTeam.teamID, userIsAdmin($currentUser, myTeam));
	// $: console.log("Component TeamOverview, userisAdmin? ", currentUserIsAdmin);




	$: if (hasNextDate && myTeam ) {
			const nextDateID = myTeam.allDates[0];
			
			yes = countFeedback(nextDateID, 'yes');
			no = countFeedback(nextDateID, 'no');
			none = countFeedback(nextDateID, 'none');
			// let nextDate: DateOrTask | null = null;
			// console.log("Comp. TeamOverview: ", yes, no, none);

			const nextDateJSON = localStorage.getItem(nextDateID.toString());
			if (nextDateJSON) {
				nextDate = JSON.parse(nextDateJSON) as DateOrTask;
			}
			if (nextDate !== null && nextDate.dueDate) {
				const when = new Date(nextDate.dueDate);
				date = when.toLocaleDateString("de-DE");
				
				// date = when.toLocaleDateString("de-DE");
				time = when.toLocaleTimeString("de-DE");

				what = nextDate.description;
			}
		}



	$: if (myTeam) {
		//find out names of all member who have already created an account ////////////////
		const allMembers = myTeam.allMembers || []; //Array of integers!
		// allNames = [];
		// console.log('allMembers: ', allMembers);

		allMembers.forEach((member) => {
			const idString = member.toString();
			const storedUser = localStorage.getItem(idString);

			if (storedUser) {
				try {
					const nextUser: User = JSON.parse(storedUser);
					allNames.push(nextUser.userName);
				} catch (error) {
					console.error('Error parsing user from localStorage', error);
				}
			} else {
				console.warn(`No user found in localStorage for id: ${idString}`);
			}
		});
		/////////////////////////////////////////////////////////////////////////////////////
		//find out next date: ///////////////////////////////////////////////////////
		// console.log("Comp. TeamOverview: ");
		//  if (hasNextDate) {
		// 	const nextDateID = myTeam.allDates[0];
		// 	yes = countFeedback(nextDateID, 'yes');
		// 	no = countFeedback(nextDateID, 'no');
		// 	none = countFeedback(nextDateID, 'none');
		// 	// let nextDate: DateOrTask | null = null;
		// 	// console.log("Comp. TeamOverview: ", yes, no, none);

		// 	const nextDateJSON = localStorage.getItem(nextDateID.toString());
		// 	if (nextDateJSON) {
		// 		nextDate = JSON.parse(nextDateJSON);
		// 	}
		// 	if (nextDate !== null) {
		// 		when = nextDate.dueDate;
		// 		what = nextDate.description;
		// 	}
		// }
		// allDates.forEach((teamdate) => {

		// });
		/////////////////////////////////////////////////////////////////////////////////////
	}

	function handleTeamClick(team: Team) {
		// console.log('Clicked on team:', team.teamName);
		// updateTeam(membership.team);
		// const teamID = membership.teamID;
		// const myTeam = teamMap.get(membership.teamID);
		// console.log('teamclick, currentTeam', $currentTeam);
		if (team) currentTeam.set(team);
		goto(`/myteams/${team?.teamName}/edit`);
	}


	
</script>

<article class="teamoverview" style="border-color: {myTeam?.color}">
	<!-- <h1>{$currentTeam.teamName}</h1> -->
	{#if myTeam}
		<h2>{myTeam.teamName}, Anzahl Mitglieder: {myTeam.allMembers.length}</h2>
		<!-- <h3></h3> -->
	{/if}
	<h3>Account bereits angelegt:</h3>
	{#each allNames as name}
		<div>{name} </div>
	{/each}
	{#if hasNextDate}
		<h3>Nächster Termin: {date} {time} {what}</h3>
		<p>Zugesagt: {yes}, Abgesagt: {no}</p>
	{/if}
	<!-- <p>Admin? {currentUserIsAdmin}</p> -->
	{#if myTeam && currentUserIsAdmin}
		<!--TODO: Wenn kein Admin? Ansehen? Oder nix?-->

		<button style="background-color: {myTeam?.color}" on:click={() => handleTeamClick(myTeam)}>
			{myTeam?.teamName} bearbeiten!
		</button>
	{/if}
	<!--Offene Aufgaben, nächste Termine..-->
</article>

<!-- <TeamCard >
	<div slot="header">
		{#if myTeam}
		<h2>{myTeam.teamName}</h2>
		{/if}
	</div>
	<div slot="content">
		{#if myTeam}
		<h3>Anzahl aller Mitglieder: {myTeam.allMembers.length}</h3>
	{/if}
	<<h3>Anzahl aller Mitglieder: {$currentTeam.allMembers.length}</h3> -->
<!-- <h3>Account bereits angelegt:</h3>
	{#each allNames as name}
		<p>{name}</p> -->
<!-- {/each}
	</div>
	<div slot="footer">
		<button>KNOPF</button>
	</div>
</TeamCard> -->

<style>
	.teamoverview {
		border: 5px solid;

		padding: 10px;
	}
</style>
