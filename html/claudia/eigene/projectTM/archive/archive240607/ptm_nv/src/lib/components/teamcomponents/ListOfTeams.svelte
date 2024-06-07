<script lang="ts">
	import { goto } from '$app/navigation';
	import { updateTeam } from '$lib/actions/teamHelpers';
	import { currentTeam } from '$lib/stores/teamStore';
	import { currentUser } from '$lib/stores/userStore';

	import type { Membership } from '$lib/stores/userStore';
	import CreateNewTeamButton from './CreateNewTeamButton.svelte';

// console.log("Component ListofTeams, currentUser: ", $currentUser );

	function handleTeamClick(membership: Membership) {
		console.log('Clicked on team:', membership);
		updateTeam(membership.team);
		goto(`/myteams/${membership?.team.teamName}`);
	}
</script>

{#if $currentUser}
	{#each $currentUser.memberships as membership, index}
		<button
			style="background-color: {membership.team.color}"
			on:click={() => handleTeamClick(membership)}>{membership.team.teamName}</button
		>{/each}
{/if}

<CreateNewTeamButton />
