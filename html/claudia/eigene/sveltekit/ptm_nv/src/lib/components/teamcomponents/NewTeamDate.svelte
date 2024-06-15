<script lang="ts">
	import type { Teamdate } from '$lib/stores/teamStore';
	import { currentTeam } from '$lib/stores/teamStore';
	import { getNextID } from '$lib/utils/storageHelpers';
	import { onMount } from 'svelte';
	import { updateCurrentTeam } from "$lib/actions/teamHelpers";
	import { countFeedback } from "$lib/actions/dateHelpers";

	let today: string;

	onMount(() => {
		today = new Date().toISOString().split('T')[0];

// 		console.log("CountFeedbacktest: ");
// console.log("yes 3?", countFeedback(1, "yes"));
// console.log("no 2?", countFeedback(1, "no"));
// console.log("none 1?", countFeedback(1, "none"));


	});

	// 	interface UserDate {
	// 	userID: number;
	// 	feedback: boolean | null; //null if user hasn't reacted yet, then true or false
	// }

	// //TODO: eigener Store for dates and tasks?
	// export interface Teamdate{
	// 	dateID: number;
	// 	datedate: Date;
	// description: string;
	// 	receivedFeedbacks: UserDate[];
	// }
	// const today = new Date().toISOString().split('T')[0];
	let newDate: Date;
	let description: string;
	let newTeamdate: Teamdate;

	// let newDate;

	function addNewDate() {
		console.log('Neues Ereignis hinzufügen!');
		console.log('newDate: ', newDate, 'description: ', description);
		if(newDate !== undefined && description !== undefined && $currentTeam.teamID !== 0){
			console.log("Daten ok");
			const nextID = getNextID("date");
			newTeamdate = {
				dateID: nextID,
				teamID: $currentTeam.teamID,
				datedate: newDate,
				description: description,
				receivedFeedbacks: [],
			}
			console.log("newTeamdate: ", newTeamdate);
			// Team updaten!
			let allTeamdates = $currentTeam.allDates;
			// console.log("Daten vorher: ", allTeamdates);
			allTeamdates.push(nextID);
			updateCurrentTeam({allDates: allTeamdates});
			localStorage.setItem(nextID.toString(), JSON.stringify(newTeamdate));
			// console.log("Daten hinterher aus LS: ", $currentTeam.allDates);
		}
		else console.log("Daten sind Schrott!");
	}

	


	// console.log(new Date());
	// console.log(new Date().toISOString());
	// console.log(new Date().toISOString().split('T'));
	//T is separator between date and time:
</script>

<section>
	<input type="date" required min={today} bind:value={newDate} />
	<input type="text" required placeholder="neues Ereignis" bind:value={description} />
	<!-- {#each allNewUserData as userData, index} -->
	<!-- <p>
			<input
				type="email"
				id="emailInput{index}"
				placeholder="Email"
				bind:value={userData.email}
				on:input={addNewLine}
			/>

			<input type="checkbox" id="isAdmin{index}" bind:checked={userData.isAdmin} />
			<label for="isAdmin{index}">Admin?</label>
		</p>
	{/each} -->
</section>

<button on:click={addNewDate}>Hinzufügen!</button>
