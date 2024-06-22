<script lang="ts">
	import type { DateOrTask } from '$lib/stores/teamStore';
	import { currentTeam } from '$lib/stores/teamStore';
	import { getNextID } from '$lib/utils/storageHelpers';
	import { onMount } from 'svelte';
	import { updateCurrentTeam } from '$lib/actions/teamHelpers';
	import { countFeedback, saveDate } from '$lib/actions/dateOrTaskHelpers';

	let today: string;

	onMount(() => {
		today = new Date().toISOString().split('T')[0];

		
	});

	
	// let newDate: Date;
	let newDate: string; 
	let newTime: string;
	let description: string;

	let newTeamdate: DateOrTask;


	function addNewDate() {
		//TODO: UserGRUPPE einladen
		//Date im User und im Team speichern
		//User benachrichtigen

		//T is separator between date and time:
		if (newDate && newTime) {
			const dueDate = new Date(`${newDate}T${newTime}`);
		
		// console.log('Neues Ereignis hinzufügen!');
		// console.log('newDate: ', newDate, 'description: ', description);
		// if (newDate !== undefined && description !== undefined && $currentTeam.teamID !== 0) {
			if (!isNaN(dueDate.getTime())) {
			console.log('Daten ok');
			const nextID = getNextID('date');
			newTeamdate = {
				dateOrTaskID: nextID,
				teamID: $currentTeam.teamID,
				dueDate: dueDate,
				description: description,
				receivedFeedbacks: [],
				isDone: false,
			};
			console.log('newTeamdate: ', newTeamdate);
			saveDate(newTeamdate);
			
		
		} else console.log('Daten sind Schrott!');
	}

}


</script>

<section>
	<label for="date">Select a date:</label>
	<input type="date" id="date" required min={today} bind:value={newDate} />

	<label for="time">Select a time:</label>
	<input type="time" id="time" required bind:value={newTime} />

	<input type="text" required placeholder="neues Ereignis" bind:value={description} />
	
</section>

<button on:click={addNewDate}>Hinzufügen!</button>

