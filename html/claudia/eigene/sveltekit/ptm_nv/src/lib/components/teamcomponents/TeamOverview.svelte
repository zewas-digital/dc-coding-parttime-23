<script lang="ts">
	import { currentTeam } from '$lib/stores/teamStore';
	import { currentUser, type User } from '$lib/stores/userStore';
	import { getDateByID, getTeamByID } from '$lib/utils/storageHelpers';
	import TeamCard from './TeamCard.svelte';
	import type { Team, DateOrTask } from '$lib/stores/teamStore';
	import { goto } from '$app/navigation';
	import { userIsAdmin } from '$lib/actions/teamHelpers';
	import { countFeedback, formatDate, formatTime, userInvited } from '$lib/actions/dateOrTaskHelpers';
	import { hasNullFeedback, numberOfMissingFeedbacks } from '$lib/actions/userHelpers';
	

	//TODO: verschiedene Modi für Admin und Nicht-Admin

	// console.log('Component Overview!');
	// TeamID  als Prop übergeben
	export let teamID: number;
	let teamcolor = 'FFF321';
	let currentUserIsAdmin = false;

	//variable to set color of text:
	let statusOfInvitation = "standard";

	const myTeam = getTeamByID(teamID.toString());
	$: if (myTeam) currentUserIsAdmin = userIsAdmin($currentUser, myTeam);
	// $: console.log("isAdmin?", currentUserIsAdmin,"User: ", $currentUser.userName, "Team: ", myTeam?.teamID);
	// console.log('TeamID, myTeam: ', teamID, myTeam);
	let allNames: string[] = [];
	// let hasNextDate: boolean = false;
	let allDateIDs: number[] = [];
	let allDates: DateOrTask[] = [];
	
	// let allFeedbacks: (boolean | null)[] = [];
	let allFeedbacks: (boolean | null)[][] = [];

  // Initialize allFeedbacks based on allDates.receivedFeedbacks
  $: {
        if (allDates) {
            allFeedbacks = allDates.map(date => date.receivedFeedbacks.map(fb => fb.feedback));
        }
    }



	$: console.log("allFeedbacks: ", allFeedbacks);


	function handleYesChange(dateIndex: number, feedbackIndex: number, event: Event) {
        const target = event.target as HTMLInputElement;
        if (target.checked) {
            allFeedbacks[dateIndex][feedbackIndex] = true;
        } else {
            allFeedbacks[dateIndex][feedbackIndex] = null;
        }
    }

    function handleNoChange(dateIndex: number, feedbackIndex: number, event: Event) {
        const target = event.target as HTMLInputElement;
        if (target.checked) {
            allFeedbacks[dateIndex][feedbackIndex] = false;
        } else {
            allFeedbacks[dateIndex][feedbackIndex] = null;
        }
    }





	// let yes: number = -1;
	// let no: number = -1;
	// let none: number = -1;
	// let what: string = '';
	// let date: string = '';
	// let time: string = '';

	// let nextDate: DateOrTask | null = null;

	$: if (myTeam && myTeam.color !== null) teamcolor = myTeam.color;

	$: if (myTeam) {
		// currentUserIsAdmin = userIsAdmin($currentUser, myTeam);

		allDateIDs = myTeam.allDates;
		allDateIDs.forEach((myDateID) => {
			const nextDate = getDateByID(myDateID.toString());
			if (nextDate) {
				allDates.push(nextDate);
			}
		});

//TODO: Feedback-Array initialisieren mit vorhandenen Feedbacks


	// 	$: {
    //     if (myDate && myDate.receivedFeedbacks) {
    //         allFeedbacks = myDate.receivedFeedbacks.map(fb => fb.booleanValue);
    //     }
    // }

		// hasNextDate = allDateIDs.length > 0;
		// console.log('alle Daten ');
		// allDates.forEach((myDate) => {
		// 	// console.log(myDate.dateOrTaskID);
		// 	const allFeedbacks = myDate.receivedFeedbacks;
		// 	// console.log('Feedbacks: ');
		// 	allFeedbacks.forEach((fb) => {
		// 		console.log(fb.userID, fb.feedback);
		// 	});
		// });
	}

	// $: if (myTeam) console.log("user, team, admin? ",$currentUser, myTeam.teamID, userIsAdmin($currentUser, myTeam));
	// $: console.log("Component TeamOverview, userisAdmin? ", currentUserIsAdmin);

	// $: if (hasNextDate && myTeam) {
	// 	const nextDateID = myTeam.allDates[0];

	// 	yes = countFeedback(nextDateID, 'yes');
	// 	no = countFeedback(nextDateID, 'no');
	// 	none = countFeedback(nextDateID, 'none');
	// 	// let nextDate: DateOrTask | null = null;
	// 	// console.log("Comp. TeamOverview: ", yes, no, none);

	// 	const nextDateJSON = localStorage.getItem(nextDateID.toString());
	// 	if (nextDateJSON) {
	// 		nextDate = JSON.parse(nextDateJSON) as DateOrTask;
	// 	}
	// 	if (nextDate !== null && nextDate.dueDate) {
	// 		const when = new Date(nextDate.dueDate);
	// 		// date = when.toLocaleDateString('de-DE');
	// 		date = formatDate(when);
	// 		// date = when.toLocaleDateString("de-DE");
	// 		// time = when.toLocaleTimeString('de-DE');
	// 		time = formatTime(when);
	// 		what = nextDate.description;
	// 	}
	// }

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



	function handleTeamClick(team: Team) {
		if (team) currentTeam.set(team);
		goto(`/myteams/${team?.teamName}/edit`);
	}

	function handleUserClick() {
		console.log('Userclick');
		goto(`../../edituser`);
	}
</script>

<article class="teamoverview" style="border-color: {myTeam?.color}">
	<!-- <h1>{$currentTeam.teamName}</h1> -->
	{#if myTeam}
		<h2>{myTeam.teamName}, Anzahl Mitglieder: {myTeam.allMembers.length}</h2>
		<p>
			Du hast auf {numberOfMissingFeedbacks($currentUser, myTeam)} Anfragen noch nicht reagiert!
		</p>
		<!-- <h3></h3> -->
	{/if}
	<h3>Account bereits angelegt:</h3>
	{#each allNames as name}
		<div>{name}</div>
	{/each}

	<!--TODO: nur eigene Termine?-->
	<h3>Nächste Termine:</h3>
	<div class="date-list">
		{#each allDates as myDate, dateIndex}
			<div class="date-item">
				<h3 class={statusOfInvitation}>
					{formatDate(myDate.dueDate)}
					{formatTime(myDate.dueDate)}
					{myDate.description}
				</h3>
				<!--TODO: Nur für ADMIN? -->
				<!-- <p>
			Zugesagt: {countFeedback(myDate.dateOrTaskID, 'yes')}, Abgesagt: {countFeedback(
				myDate.dateOrTaskID,
				'no'
			)}, keine Rückmeldung: {countFeedback(myDate.dateOrTaskID, 'none')}
		</p> -->
				{#if userInvited(myDate, $currentUser)}
				<!-- {#each myDate.receivedFeedbacks as feedback, feedbackIndex} -->
					<input type="radio" name="acceptOrCancel"  />
					<label for="yes">Zusagen?</label>
					<input type="radio" name="acceptOrCancel"  />
					<label for="no">Absagen?</label>
					<!-- {/each} -->
				{/if}
			</div>
		{/each}
	</div>
	<!-- <p>Admin? {currentUserIsAdmin}</p> -->
	{#if myTeam}
		<button style="background-color: {myTeam?.color}" on:click={() => handleUserClick()}>
			Eigenen Nutzer bearbeiten!
		</button>
	{/if}
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

	/* 	
  .date-list {
    max-height: 200px; 
    /* overflow-y: auto; */ /*Scroll-Bar*/
	/* } */

	/* .date-item {
    margin-bottom: 10px;
  } */

	.not-invited {
		color: grey;
	}
	.confirmed {
		color: green;
	}
	.cancelled {
		color: red;
	}
	.standard {
		color: black;
	}

	h3 {
		margin: 0;
	}

	p {
		margin: 5px 0 15px 0;
	}
</style>




<!--

<script lang="ts">
    import { onMount } from 'svelte';
    import { userInvited } from './utils';
    import { currentUser } from './stores'; // Import your current user store

    // TypeScript types for your data
    interface DateOrTask {
        receivedFeedbacks: { userID: number; booleanValue: boolean | null }[];
    }

    interface User {
        userID: number;
    }

    // Assuming myDate is passed as a prop or fetched somehow
    export let myDate: DateOrTask;

    let $currentUser: User;

    // Subscribe to the store to get the current user
    $: currentUser.subscribe(value => {
        $currentUser = value;
    });

    // Initialize the feedbacks array with the initial state
    let allFeedbacks: (boolean | null)[] = [];

    // Initialize the feedbacks array based on myDate.receivedFeedbacks
    $: {
        if (myDate && myDate.receivedFeedbacks) {
            allFeedbacks = myDate.receivedFeedbacks.map(fb => fb.booleanValue);
        }
    }

    function handleYesChange(index: number, event: Event) {
        const target = event.target as HTMLInputElement;
        if (target.checked) {
            allFeedbacks[index] = true;
        } else {
            allFeedbacks[index] = null;
        }
    }

    function handleNoChange(index: number, event: Event) {
        const target = event.target as HTMLInputElement;
        if (target.checked) {
            allFeedbacks[index] = false;
        } else {
            allFeedbacks[index] = null;
        }
    }
</script>

{#if userInvited(myDate, $currentUser)}
    {#each allFeedbacks as feedback, index}
        {#if feedback !== undefined}
            <div>
                <input type="checkbox" id="yes-{index}" on:change="{(e) => handleYesChange(index, e)}" checked={feedback === true}/>
                <label for="yes-{index}">Zusagen?</label> 
                <input type="checkbox" id="no-{index}" on:change="{(e) => handleNoChange(index, e)}" checked={feedback === false}/>
                <label for="no-{index}">Absagen?</label> 
            </div>
        {/if}
    {/each}
{/if}
-->