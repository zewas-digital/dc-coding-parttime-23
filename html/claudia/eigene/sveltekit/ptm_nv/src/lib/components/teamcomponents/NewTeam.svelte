<script lang="ts">
	import { updateTeam } from '$lib/actions/teamHelpers';
	import { currentUser } from '$lib/stores/userStore';
	import type { User } from '$lib/stores/userStore';
	import type { Team } from '$lib/stores/teamStore';
	import { get } from 'svelte/store';
	import { updateUser } from '$lib/actions/userHelpers';
	import { goto } from '$app/navigation';
	import { getNextID } from '$lib/utils/storageHelpers';
	
	
	let teamName = '';
	let color = '#FFFFFF';
	let teamCreated = false;

	
	$: if (teamCreated){
		goto(`/myteams/${teamName}/edit`);
	}

	function handleSubmit(event: Event): void {
		event.preventDefault();

		// console.log('currentUser: ', $currentUser);
		// console.log('Submit');

		const user: User | null = get(currentUser);
		if (user) {
			// if ($currentUser) {
			const newTeam = {
				teamID: getNextID("team"),
				teamName: teamName,
				allMembers: [user.userID],
				allAdmins: [user.userID],
				allDates: [],
				allTasks: [],
				allCoaches: [],
				allDrivers: [],
				color: color
			};

			updateTeam(newTeam);
			// console.log('newTeam created: ', newTeam);

			// const allMemberships = $currentUser?.memberships;
			const allMemberships = user.memberships.slice(); //shallow copy (im GEgensatz zu: deep copy): neues Array mit denselben REferenzen, aber nicht das Original
			allMemberships.push({teamID: newTeam.teamID, isAdmin: true});
			const updates = {memberships: allMemberships};
			updateUser(updates);
			teamCreated = true;
			
		} else {
			console.error('currentUser null!');
		}




		
	}

	// Set the default color to light grey if none is chosen
	// function setColor(event: InputEvent): void {
	// 	if (!color) {
	// 		color = '#cccccc'; // Default color is light grey
	// 	} else color = (event.target as HTMLInputElement).value;
	// }
</script>

<!--TODO: neuesTeamButton verschwinden lassen, stattdessen Seite "Edit Team"-->
{#if !teamCreated}
<h1>Leg jetzt ein neues Team an!</h1>

<form on:submit={handleSubmit}>
	<!-- <label> -->
	Name:
	<input type="text" bind:value={teamName} required />
	<!-- Farbe:
	<input type="color" bind:value={color} on:input={setColor} /> -->
	<!-- </label> -->

	<button type="submit">Team anlegen!</button>
</form>

{/if}


