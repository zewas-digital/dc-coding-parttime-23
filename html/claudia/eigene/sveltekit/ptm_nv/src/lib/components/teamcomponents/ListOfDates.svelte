<script lang="ts">
	import { getDateByID, getTeamByID } from '$lib/utils/storageHelpers';
	import type { DateOrTask } from '$lib/stores/teamStore';
	import {
		countFeedback,
		dateHasPassed,
		formatDate,
		updateDate
	} from '$lib/actions/dateOrTaskHelpers';
	import { formatTime } from '$lib/actions/dateOrTaskHelpers';
	import { currentUser } from '$lib/stores/userStore';
	import { userIsAdmin } from '$lib/actions/teamHelpers';
	export let teamID: number;
	import { userHasConfirmed } from '$lib/actions/userHelpers';
	import { userInvited } from '$lib/actions/dateOrTaskHelpers';
	import { updateFeedbacksOfUser } from '$lib/actions/userHelpers';
	import { updateUser } from '$lib/actions/userHelpers';
	import { updateFeedbacksOfDate } from '$lib/actions/dateOrTaskHelpers';

	$: statusOfInvitation = 'standard';
	$: console.log('StatusOfInvitation: ', statusOfInvitation);

	const myTeam = getTeamByID(teamID.toString());

	let allDates: DateOrTask[] = [];
	let isAdmin = false;

	$: if (myTeam) {
		isAdmin = userIsAdmin($currentUser, myTeam);
		const allDateIDs = myTeam.allDates;
		allDateIDs.forEach((dateID) => {
			const storedDate = getDateByID(dateID.toString());
			if (storedDate && dateHasPassed(storedDate)) {
				storedDate.isDone = true;
				updateDate(storedDate, { isDone: true });
			}
			if (storedDate) allDates.push(storedDate);
		});

		// 		const testCases = [
		//     { dueDate: new Date('2022-01-01') },  // Past date
		//     { dueDate: new Date('9999-12-31') },  // Future date
		//     { dueDate: undefined },               // Undefined date
		//     { dueDate: null },                    // Null date
		//     { dueDate: new Date('Invalid Date') } // Invalid date
		// ];

		// testCases.forEach(testCase => {
		//     console.log(`Testing with dueDate: ${testCase.dueDate}`);
		//     console.log(dateHasPassed(testCase));
		// });
	}

	function updateAllFeedbacks(myDate: DateOrTask, feedback: boolean) {
		setColor(myDate);
		// console.log('Fct updateallFeedbacks Anfang: *********************************************');
		// console.log("CurrentUser: ", $currentUser);
		const userupdates = updateFeedbacksOfUser($currentUser, myDate.dateOrTaskID, feedback);
		// console.log("Userupdates: ", userupdates)

		updateUser($currentUser, userupdates);
		// updateCurrentUser(userupdates);
		// console.log("currentUser nach Update: ", $currentUser);

		const dateupdates = updateFeedbacksOfDate(myDate, $currentUser.userID, feedback);
		// console.log("Dateupdates: ", dateupdates);
		updateDate(myDate, dateupdates);
		// console.log("myDate nach Update: ", myDate);
		// console.log('Fct updateallFeedbacks: *********************************************');
	}
	function setColor(myDate: DateOrTask): string {
		// console.log('fct setColor: *********************************');
		if (dateHasPassed(myDate)) {
			statusOfInvitation = 'gone';
			return 'gone';
		} else {
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
	}
</script>

<!--IDEE: zwei verschiedene Modi für Admins und Nicht-Admins-->

<table>
	<tr>
		<th class="date">Datum</th>
		<th class="time">Uhrzeit</th>
		<th class="descripton">Beschreibung</th>
		{#if isAdmin}
			<th class="feedback">Rückmeldungen</th>
		{/if}
	</tr>

	{#each allDates as myDate, dateIndex}
		<!-- <tr> -->
		<!--UNEVEN ROWS-->
		<!-- <tr class:confirmed={userHasConfirmed($currentUser, myDate)}
		class:not-confirmed={!userHasConfirmed($currentUser, myDate)}> -->
		<tr>
			<td class="date">
				<div class={setColor(myDate)}>
					{formatDate(myDate.dueDate)}
				</div>
			</td>
			<td class="time">
				<div class={setColor(myDate)}>
					{formatTime(myDate.dueDate)}
				</div>
			</td>
			<td class="description"> <div class={setColor(myDate)}>{myDate.description}</div></td>

			{#if !myDate.isDone && isAdmin && userInvited(myDate, $currentUser)}
				<td class="feedback" rowspan="2">
					<ul>
						<li>Zugesagt: {countFeedback(myDate.dateOrTaskID, 'yes')}</li>
						<li>Abgesagt: {countFeedback(myDate.dateOrTaskID, 'no')}</li>
						<li>Keine: {countFeedback(myDate.dateOrTaskID, 'none')}</li>
					</ul>
				</td>
			{:else if !myDate.isDone && isAdmin && !userInvited(myDate, $currentUser)}
				<td class="feedback">
					<ul>
						<li>Zugesagt: {countFeedback(myDate.dateOrTaskID, 'yes')}</li>
						<li>Abgesagt: {countFeedback(myDate.dateOrTaskID, 'no')}</li>
						<li>Keine: {countFeedback(myDate.dateOrTaskID, 'none')}</li>
					</ul>
				</td>
			{/if}
		</tr>
		<!--EVEN ROWS FOR USER-FEEDBACK-->
		{#if userInvited(myDate, $currentUser) && !dateHasPassed(myDate)}
			<tr>
			<!-- <tr class="{ 'confirmed': userHasConfirmed($currentUser, myDate), 'not-confirmed': !userHasConfirmed($currentUser, myDate) }"> -->
			<!-- <tr
				class:confirmed={userHasConfirmed($currentUser, myDate)}
				class:not-confirmed={!userHasConfirmed($currentUser, myDate)}
			> -->
				<td class="date">
					<input
						type="radio"
						name="acceptOrCancel{myTeam?.teamID}_{dateIndex}"
						id="yes{myTeam?.teamID}_{dateIndex}"
						checked={userHasConfirmed($currentUser, myDate) === true}
						on:change={() => updateAllFeedbacks(myDate, true)}
					/>
					<label for="yes{myTeam?.teamID}_{dateIndex}">Habe Zeit</label>
				</td>
				<td colspan="2">
					<input
						type="radio"
						name="acceptOrCancel{myTeam?.teamID}_{dateIndex}"
						id="no{myTeam?.teamID}_{dateIndex}"
						checked={userHasConfirmed($currentUser, myDate) === false}
						on:change={() => updateAllFeedbacks(myDate, false)}
					/>
					<label for="no{myTeam?.teamID}_{dateIndex}">keine Zeit</label>
				</td>
			</tr>
		{/if}
	{/each}
</table>

<style>
	table {
		width: 100%;
		/* table-layout: fixed; */
		border-collapse: collapse;
	}

	td {
		border: 1px solid #ccc; /* Optional: Add borders for better visibility */
	}

	/*
	tr:nth-child(2n-1) {
		background-color: #f0f0f0; 
	}

	/* Apply white background to rows 3 and 4 */
	/* tr:nth-child(2n) {
		background-color: red;
	} */

	/* tr:nth-child(odd) {
    background-color: #f2f2f2;
  }

  /* Styling for even rows */
	/* tr:nth-child(even) {
    background-color: #ffffff; */
	/*  } */
	td.date {
		width: 120px;
		/* font-weight: bold; */
	}
	td.time {
		width: 120px;
		/* font-weight: bold; */
	}
	td.description {
		width: 300px;
		/* font-weight: bold; */
	}
	td.feedback {
		width: 200px;
	}

	th {
		text-align: left;
	}

	.gone {
		color: lightgrey;
	}
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
</style>
