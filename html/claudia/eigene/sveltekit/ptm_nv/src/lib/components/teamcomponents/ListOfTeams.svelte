<script lang="ts">
	import { goto } from '$app/navigation';
	import { updateCurrentTeam } from '$lib/actions/teamHelpers';
	import { currentTeam } from '$lib/stores/teamStore';
	import { currentUser } from '$lib/stores/userStore';
	// import { allTeams } from '$lib/stores/teamStore';
	import type { Team } from '$lib/stores/teamStore';

	import type { Membership } from '$lib/stores/userStore';
	import { getTeamByID } from '$lib/utils/storageHelpers';
	import CreateNewTeamButton from './CreateNewTeamButton.svelte';
	import { onMount } from 'svelte';
	import TeamOverview from './TeamOverview.svelte';

	// console.log("Component ListofTeams, currentUser: ", $currentUser );

	// let teamMap: Map<number, Team> = new Map();
	// onMount(() => {
	// 	allTeams.subscribe($allTeams => {
	// 		teamMap = new Map ($allTeams.map(team => [team.teamID, team]));
	// 	});
	// });
	// console.log("TeamMap: ", teamMap);

	let allmyTeams: Team[] = [];
	// console.log('Component ListOfTeams *********************');
	$: {
		const currentMemberships = $currentUser?.memberships;
		// console.log('currentUser', $currentUser);
		// console.log('currentMemberships ', currentMemberships);
		allmyTeams = [];

		if (currentMemberships && Array.isArray(currentMemberships)) {
			currentMemberships.forEach((element) => {
				// console.log('teamID: ', element.teamID, element.teamID.toString());
				const nextTeam = getTeamByID(element.teamID.toString());
				// console.log('nextTeam: ', nextTeam);
				if (nextTeam) allmyTeams.push(nextTeam);
			});
			// console.log('List of Teams, allmyTeams: ', allmyTeams);
		}
	}

	// function handleTeamClick(team: Team) {
	// 	// console.log('Clicked on team:', team.teamName);
	// 	// updateCurrentTeam(membership.team);
	// 	// const teamID = membership.teamID;
	// 	// const myTeam = teamMap.get(membership.teamID);
	// 	// console.log('teamclick, currentTeam', $currentTeam);
	// 	if (team) currentTeam.set(team);
	// 	goto(`/myteams/${team?.teamName}`);
	// }
</script>

{#if $currentUser}
	<section class="container">
		{#each allmyTeams as team, index (team.teamID)}
			<!-- <button style="background-color: {team?.color}" on:click={() => handleTeamClick(team)}>
				{team?.teamName}
			</button> -->

			<TeamOverview teamID={team.teamID} />
		{/each}
	</section>
{/if}

<!-- {#if $currentUser}
	{#each $currentUser.memberships as membership}
		{#if teamMap.has(membership.teamID)}
			<button
				style="background-color: {teamMap.get(membership.teamID)?.color}"
				on:click={() => handleTeamClick(membership)}
			>
				{teamMap.get(membership.teamID)?.teamName}
			</button>
		{/if}
	{/each}
{/if} -->

<CreateNewTeamButton />

<style>
	.container {
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
	}
</style>
