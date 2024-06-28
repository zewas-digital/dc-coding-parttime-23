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
		responseVisible = false;
	});

	// let newDate: Date;
	let newDate: string;
	let newTime: string;
	let description: string;
	let invitedGroup: string[] = [];

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
				console.log('invitedGroup: ', invitedGroup);
				const nextID = getNextID('date');
				newTeamdate = {
					dateOrTaskID: nextID,
					teamID: $currentTeam.teamID,
					dueDate: dueDate,
					description: description,
					receivedFeedbacks: [],
					isDone: false
				};

				saveDate(newTeamdate, invitedGroup[0]);
				console.log('newTeamdate: ', newTeamdate);
			} else console.log('Daten sind Schrott!');
		}
		responseVisible = true;
		newTime = '';
		newDate = '';
		description = '';

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

	<select multiple id="group" required size="2" bind:value={invitedGroup}>
		<option value="allMembers">alle Mitglieder</option>
		<option value="allCoaches">nur Trainer</option>
	</select>
	<button on:click={addNewDate}>Hinzufügen!</button>
	{#if responseVisible}
		<div id="response">Termin gespeichert!</div>
	{/if}
</section>

<style>
	#response {
		display: block;
		margin-top: 10px;
		color: green;
	}

	section {
		max-width: 400px;
		margin: 20px auto;
		padding: 20px;
		border: 1px solid #ccc;
		border-radius: 8px;
		background-color: #f9f9f9;
	}

	label {
		display: block;
		margin-bottom: 5px;
		font-weight: bold;
	}

	input[type='date'],
	input[type='time'],
	input[type='text'],
	select {
		width: calc(100% - 20px);
		padding: 10px;
		margin-bottom: 15px;
		border: 1px solid #ccc;
		border-radius: 4px;
		box-sizing: border-box;
	}

	button {
		width: 100%;
		padding: 10px;
		background-color: #007bff;
		color: white;
		border: none;
		border-radius: 4px;
		cursor: pointer;
		font-size: 16px;
	}

	button:hover {
		background-color: #0056b3;
	}
</style>
