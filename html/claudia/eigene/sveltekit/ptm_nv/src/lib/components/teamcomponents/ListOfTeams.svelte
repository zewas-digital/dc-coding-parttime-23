<script lang="ts">
	import { goto } from '$app/navigation';
	import { currentUser } from '$lib/stores/userStore';
	import type { Team } from '../../utils/testdata';
	import CreateNewTeamButton from './CreateNewTeamButton.svelte';

	function handleTeamClick(team: Team) {
		console.log('Clicked on team:', team);
        goto("/team/{teamName}");
	}
</script>

{#if $currentUser}
	{#each $currentUser.teams as team, index}
		<button on:click={() => handleTeamClick(team)}>{team.teamName}</button>{/each}
{/if}

<CreateNewTeamButton />
