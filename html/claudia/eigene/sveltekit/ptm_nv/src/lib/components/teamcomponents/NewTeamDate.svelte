<script lang="ts">
	import type { DateOrTask } from '$lib/stores/teamStore';
	import { currentTeam } from '$lib/stores/teamStore';
	import { getNextID } from '$lib/utils/storageHelpers';
	import { onMount } from 'svelte';
	import { updateCurrentTeam } from '$lib/actions/teamHelpers';
	import { countFeedback, saveDate } from '$lib/actions/dateOrTaskHelpers';

	let today: string;
	let responseVisible = false;


	onMount(() => {
		today = new Date().toISOString().split('T')[0];
		responseVisible = false
	
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
			// console.log('newTeamdate: ', newTeamdate);
			saveDate(newTeamdate);
			
		
		} else console.log('Daten sind Schrott!');
	}
	responseVisible = true;
	newTime = "";
	newDate = "";
	description = "";
	
	setTimeout(() => {
            responseVisible = false;
        }, 3000);
}


</script>

<section>
	<label for="date">Select a date:</label>
	<input type="date" id="date" required min={today} bind:value={newDate} />

	<label for="time">Select a time:</label>
	<input type="time" id="time" required bind:value={newTime} />

	<input type="text" required placeholder="neuer Termin" maxlength="30" bind:value={description} />
	
	{#if responseVisible}
    <div id="response">Termin gespeichert!</div>
	{/if}

</section>

<button on:click={addNewDate}>Hinzufügen!</button>

<style>
	#response {
        display: block;
        margin-top: 10px;
        color: green;
    }
</style>