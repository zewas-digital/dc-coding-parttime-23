<script lang="ts">

	import { currentUser } from '$lib/stores/userStore';
	import type { Team } from '$lib/stores/teamStore';

	import { getTeamByID } from '$lib/utils/storageHelpers';
	import CreateNewTeamButton from './CreateNewTeamButton.svelte';
	import { onMount } from 'svelte';
	import TeamOverview from './TeamOverview.svelte';

	// console.log("Component ListofTeams, currentUser: ", $currentUser );
 
	onMount(() => {
        const cards = document.querySelectorAll('.teamcard') as NodeListOf<HTMLElement>;
        let maxWidth = 0;

        cards.forEach((card) => {
            const cardWidth = card.offsetWidth;
            console.log("cardWidth: ", cardWidth);
            if (cardWidth > maxWidth) {
                maxWidth = cardWidth;
            }
        });

        cards.forEach((card) => {
            card.style.width = `${maxWidth}px`;
        });
    });

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

	// document.addEventListener('DOMContentLoaded', () => {
	// 	const cards = document.querySelectorAll('.teamcard') as NodeListOf<HTMLElement>;
	// 	let maxWidth = 0;

	// 	cards.forEach((card) => {
	// 		const cardWidth = card.offsetWidth;
	// 		console.log("cardWidth: ", cardWidth);
	// 		if (cardWidth > maxWidth) {
	// 			maxWidth = cardWidth;
	// 		}
	// 	});

	// 	cards.forEach((card) => {
	// 		card.style.width = `${maxWidth}px`;
	// 	});
	// });
</script>

{#if $currentUser}
	<section class="container">
		{#each allmyTeams as team, index (team.teamID)}
			
			<div class="teamcard">
				<TeamOverview teamID={team.teamID} />
			</div>
		{/each}
	</section>
{/if}


<CreateNewTeamButton />

<style>
	.container {
		display: flex;
		flex-direction: row;
		flex-wrap: wrap;
		gap: 5px;
	}

	.teamcard {
		/* flex: 1; */
		padding: 20px;
	}
</style>
