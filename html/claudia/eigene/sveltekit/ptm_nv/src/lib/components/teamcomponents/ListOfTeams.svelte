<script lang="ts">
	import { currentUser } from '$lib/stores/userStore';

	// import { currentUser } from '$lib/stores/userStore';
	import type { Team } from '../../utils/testdata';
    

	// export let allTeams;
	// import { currentUser } from "../stores/userStore";
	// import NewTeam from "./NewTeam.svelte";

	function handleTeamClick(team: Team) {
		// Handle click logic here
		console.log('Clicked on team:', team);
	}
</script>

{#if $currentUser}
	{#each $currentUser.teams as team, index}
		<button on:click={() => handleTeamClick(team)}>{team.teamName}</button>{/each}
{/if}
<!-- <NewTeamButton /> -->
