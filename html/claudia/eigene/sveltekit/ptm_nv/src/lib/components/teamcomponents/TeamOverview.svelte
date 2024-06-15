<script lang="ts">
	import { currentTeam } from '$lib/stores/teamStore';
	import { currentUser, type User } from '$lib/stores/userStore';
	import { getTeamByID } from '$lib/utils/storageHelpers';
	import TeamCard from './TeamCard.svelte';
	import type { Team, Teamdate } from '$lib/stores/teamStore';
	import { goto } from '$app/navigation';
	import { userIsAdmin } from '$lib/actions/teamHelpers';
	import { countFeedback } from '$lib/actions/dateHelpers';

	// console.log('Component Overview!');
	// TeamID  als Prop übergeben
	export let teamID: number;
	let teamcolor = 'FFF321';
	let currentUserIsAdmin = false;

	const myTeam = getTeamByID(teamID.toString());
	// console.log('TeamID, myTeam: ', teamID, myTeam);
	let allNames: string[] = [];

	let yes = -1;
	let no = -1;
	let none = -1;
	let what = '';
	let when: Date | null = null;
	let nextDate: Teamdate;

	$: if (myTeam && myTeam.color !== null) teamcolor = myTeam.color;

	$: if (myTeam) currentUserIsAdmin = userIsAdmin($currentUser, myTeam);

	// $: if (myTeam) console.log("user, team, admin? ",$currentUser, myTeam, userIsAdmin($currentUser, myTeam));
	// $: console.log("Component TeamOverview, userisAdmin? ", currentUserIsAdmin);

	if (myTeam) {
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
		const nextDateID = myTeam.allDates[0];
		yes = countFeedback(nextDateID, 'yes');
		no = countFeedback(nextDateID, 'no');
		none = countFeedback(nextDateID, 'none');
		let nextDate: Teamdate | null = null;

		const nextDateJSON = localStorage.getItem(nextDateID.toString());
		if (nextDateJSON) {
			nextDate = JSON.parse(nextDateJSON);
		}
		if (nextDate !== null) {
		when = nextDate.datedate;
		what = nextDate.description;
	}
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
		<p>{name}</p>
	{/each}
	<h3>Nächster Termin: {when} {what}</h3>
	<p>Zugesagt: {yes}, Abgesagt: {no}</p>

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
