<script lang="ts">
	import { currentTeam } from '$lib/stores/teamStore';
	import { currentUser, type User } from '$lib/stores/userStore';
	import { getDateByID, getTeamByID, replaceBlanks } from '$lib/utils/storageHelpers';
	import TeamCard from './TeamCard.svelte';
	import type { Team, DateOrTask, UserFeedback } from '$lib/stores/teamStore';
	import { goto } from '$app/navigation';
	import { userIsAdmin } from '$lib/actions/teamHelpers';
	import {
		countFeedback,
		formatDate,
		formatTime,
		updateDate,
		updateFeedbacksOfDate,
		userInvited
	} from '$lib/actions/dateOrTaskHelpers';
	import {
		hasNullFeedback,
		numberOfMissingFeedbacks,
		updateCurrentUser,
		updateFeedbacksOfUser,
		updateUser,
		userHasConfirmed
	} from '$lib/actions/userHelpers';
	import type { Feedback } from '$lib/stores/userStore';
	import ListOfDates from './ListOfDates.svelte';
	//TODO: verschiedene Modi für Admin und Nicht-Admin?
	//TODO: Radio-Buttons gemäß Feedbacks initialisieren

	// $: console.log("Component Overview!, currentUser: ", $currentUser);
	// TeamID  als Prop übergeben
	export let teamID: number;
	const myTeam = getTeamByID(teamID.toString());
	let teamcolor = 'FFF321';
	let currentUserIsAdmin = false;

	//variable to set color of text:
	let statusOfInvitation = 'standard';

	
	$: if (myTeam) currentUserIsAdmin = userIsAdmin($currentUser, myTeam);
	// $: console.log("isAdmin?", currentUserIsAdmin,"User: ", $currentUser.userName, "Team: ", myTeam?.teamID);
	// console.log('TeamID, myTeam: ', teamID, myTeam);
	let allNames: string[] = [];
	// let hasNextDate: boolean = false;
	let allDateIDs: number[] = [];
	let allDates: DateOrTask[] = [];

	let allFeedbacks: (boolean | null)[][] = []; //rows: 
	let allUserFeedbacks: (boolean | null)[][] = [];

	//initialize allDates-Array with all Dates of Team
	$: if (myTeam) {
		// currentUserIsAdmin = userIsAdmin($currentUser, myTeam);
		// console.log("Initialisiere allDateIDs: ", allDateIDs);
		// console.log("myTeam.allDates: ", myTeam, myTeam.allDates);
		// console.log("Initialize allFeedbacks! ++++++++++++++++++++++++++")
		allDateIDs = myTeam.allDates;
		allDateIDs.forEach((myDateID) => {
			// console.log("Schleife allDates!")
			const nextDate = getDateByID(myDateID.toString());
			if (nextDate) {
				allDates.push(nextDate);
			}
		});
		// console.log(allDates, "allDates");

		allDates.forEach((date) => {
			let listOfFeedbacks: (boolean | null)[];

		});


		// allFeedbacks = allDates.map((date) => date.receivedFeedbacks.map((fb) => fb.feedback));
		// console.log("Initialisiert? allDateIDs: ", allDateIDs, "allDates: ", allDates);
		// console.log(allFeedbacks, "Initialize allFeedbacks fertig! ++++++++++++++++++++++++++")

	}
	// $: console.log("all Feedbacks: ", allFeedbacks);

	// Initialize allFeedbacks based on allDates.receivedFeedbacks
	// $: {
	// 	if (myTeam) {
	// 		// allDateIDs = myTeam.allDates;
	// 		allFeedbacks = allDates.map((date) => date.receivedFeedbacks.map((fb) => fb.feedback));
	// 	}
	// }
	// $: {
	// 	if (allDates) {
	// 		allFeedbacks = allDates.map((date) => date.receivedFeedbacks.map((fb) => fb.feedback));
	// 	}
	// }


	

	$: if (myTeam && myTeam.color !== null) teamcolor = myTeam.color;



	// $: if (myTeam) console.log("user, team, admin? ",$currentUser, myTeam.teamID, userIsAdmin($currentUser, myTeam));
	// $: console.log("Component TeamOverview, userisAdmin? ", currentUserIsAdmin);

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
	}


	// function handleYesChange(dateIndex: number, feedbackIndex: number, event: Event) {
	// 	const target = event.target as HTMLInputElement;
	// 	if (target.checked) {
	// 		allFeedbacks[dateIndex][feedbackIndex] = true;
	// 	} else {
	// 		allFeedbacks[dateIndex][feedbackIndex] = null;
	// 	}
	// }

	// function handleNoChange(dateIndex: number, feedbackIndex: number, event: Event) {
	// 	const target = event.target as HTMLInputElement;
	// 	if (target.checked) {
	// 		allFeedbacks[dateIndex][feedbackIndex] = false;
	// 	} else {
	// 		allFeedbacks[dateIndex][feedbackIndex] = null;
	// 	}
	// }


	// function updateAllFeedbacks(myDate: DateOrTask, feedback: boolean) {
	// 	// console.log('Fct updateallFeedbacks Anfang: *********************************************');
	// 	// console.log("CurrentUser: ", $currentUser);
	// 	const userupdates = updateFeedbacksOfUser($currentUser, myDate.dateOrTaskID, feedback);
	// 	// console.log("Userupdates: ", userupdates)

	// 	updateUser($currentUser, userupdates);
	// 	// updateCurrentUser(userupdates);
	// 	// console.log("currentUser nach Update: ", $currentUser);

	// 	const dateupdates = updateFeedbacksOfDate(myDate, $currentUser.userID, feedback);
	// 	// console.log("Dateupdates: ", dateupdates);
	// 	updateDate(myDate, dateupdates);
	// 	// console.log("myDate nach Update: ", myDate);
	// 	// console.log('Fct updateallFeedbacks: *********************************************');
		
	
	// }

	function handleTeamClick(team: Team) {
		if (team) currentTeam.set(team);
		const address = replaceBlanks(team.teamName);
		// goto(`/myteams/${team?.teamName}/edit`);
		goto(`/myteams/${address}/edit`);

	}

	// function handleUserClick() {
	// 	console.log('Userclick');
	// 	goto(`../../edituser`);
	// }

	function setColor(myDate: DateOrTask): string {
		// console.log('fct setColor: *********************************');
		if (!userInvited(myDate, $currentUser)) {
			// console.log('not invited');
			statusOfInvitation = 'not-invited';
			return 'not-invited';
		} else {
			if (userHasConfirmed($currentUser, myDate)) {
				// console.log('confirmed');
				statusOfInvitation = 'confirmed';
				return 'confirmed';
			}
			if (userHasConfirmed($currentUser, myDate) === false) {
				// console.log('cancelled');
				statusOfInvitation = 'cancelled';
				return 'cancelled';
			}
			// console.log('Standard');
			statusOfInvitation = 'standard';
			return 'standard';
		}
	}
</script>

<article class="teamoverview" style="border-color: {myTeam?.color}">
	{#if myTeam}
		<h2>{myTeam.teamName}</h2>
			<!-- , Anzahl Mitglieder: {myTeam.allMembers.length} -->
		<p>
			{numberOfMissingFeedbacks($currentUser, myTeam)} Terminanfragen offen!
		</p>
	{/if}
	<!-- <h3>Account bereits angelegt:</h3>
	{#each allNames as name}
		<div>{name}</div>
	{/each} -->

	

	<h3>Nächste Termine:</h3>
	<ListOfDates teamID={teamID}/>

	<!-- <div class="date-list"> -->

<!--

	 <h1>SCHLEIFE DATEN</h1>
	 <div>
		{#each allDates as myDate, dateIndex}
			 <div class="date-item"> -->
<!-- 				
				<h3 class={setColor(myDate)}>
					 dateID: {myDate.dateOrTaskID} -->
					<!-- {formatDate(myDate.dueDate)}
					{formatTime(myDate.dueDate)}
					{myDate.description}
				</h3> -->

				<!-- {#if userInvited(myDate, $currentUser)}
				<input
				  type="radio"
				  name="acceptOrCancel{myTeam?.teamID}_{dateIndex}"
				  id="yes{myTeam?.teamID}_{dateIndex}"
				  checked={userHasConfirmed($currentUser, myDate) === true}
				  on:change={() => updateAllFeedbacks(myDate, true)} -->
				<!-- />
				<label for="yes{myTeam?.teamID}_{dateIndex}">Habe Zeit</label>
				<input
				  type="radio"
				  name="acceptOrCancel{myTeam?.teamID}_{dateIndex}"
				  id="no{myTeam?.teamID}_{dateIndex}"
				  checked={userHasConfirmed($currentUser, myDate) === false}
				  on:change={() => updateAllFeedbacks(myDate, false)}
				/>
				<label for="no{myTeam?.teamID}_{dateIndex}">keine Zeit</label> -->
			  <!-- {/if} -->



			<!-- </div> -->
		<!-- {/each}
	</div>
	<h1>SCHLEIFE DATEN</h1> -->


	{#if myTeam && currentUserIsAdmin}
		<button style="background-color: {myTeam?.color}" on:click={() => handleTeamClick(myTeam)}>
			{myTeam?.teamName} bearbeiten!
		</button>
	{/if}
	<!--Offene Aufgaben, nächste Termine..-->
</article>



<style>
	.teamoverview {
		border: 5px solid;
		padding: 10px;
		border-radius: 10px;
		background-color: #e9e9e9;
	}



	h3 {
		margin: 0;
	}

	p {
		margin: 5px 0 15px 0;
	}
</style>
