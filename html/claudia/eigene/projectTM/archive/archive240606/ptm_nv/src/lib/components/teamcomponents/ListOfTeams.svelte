<script lang="ts">
	import { goto } from '$app/navigation';
	import { currentUser } from '$lib/stores/userStore';
	// import type { Membership } from '../../utils/testdata';
	// import type { User } from '$lib/stores/userStore';
	import type { Membership } from '$lib/stores/userStore';
	import CreateNewTeamButton from './CreateNewTeamButton.svelte';

	function handleTeamClick(membership: Membership) {
		console.log('Clicked on team:', membership);
        // goto("/team/{teamName}");
		goto(`/myteams/${membership.teamName}`);
	}
</script>

{#if $currentUser}
	{#each $currentUser.memberships as membership, index}
		<button on:click={() => handleTeamClick(membership)}>{membership.teamName}</button>{/each}
{/if}




<CreateNewTeamButton />
