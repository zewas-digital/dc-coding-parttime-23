<script lang="ts">
	import { page } from '$app/stores';
	import NewMember from '$lib/components/teamcomponents/NewMember.svelte';
	import NewTeamDate from '$lib/components/teamcomponents/NewTeamDate.svelte';
	import { currentTeam } from '$lib/stores/teamStore';
	import ListOfMembers from '$lib/components/teamcomponents/ListOfMembers.svelte';
	import ListOfDates from '$lib/components/teamcomponents/ListOfDates.svelte';
	import { onMount } from 'svelte';

	// const { teamname } = $page.params;
	const teamID = $currentTeam.teamID;

	onMount(() => {
		const details = document.querySelectorAll<HTMLDetailsElement>('details');

		details.forEach((detail) => {
			detail.addEventListener('click', () => {
				details.forEach((otherDetail) => {
					if (otherDetail !== detail) {
						otherDetail.removeAttribute('open');
					}
				});
			});
		});
	});
</script>

<article class="teamoverview" style="border-color: {$currentTeam.color}">
	<h2>{$currentTeam.teamName}, Anzahl Mitglieder: {$currentTeam.allMembers.length}</h2>

	<details>
		<summary>Mitglieder mit Account</summary>
		<ListOfMembers {teamID} />
	</details>

	<details>
		<summary>Neue Mitglieder hinzufügen</summary>
		<NewMember />
	</details>

	<details>
		<summary>Anstehende Termine</summary>
		<ListOfDates {teamID} />
	</details>

	<details>
		<summary>Neue Ereignisse hinzufügen</summary>
		<NewTeamDate />
	</details>
</article>

<style>
	summary {
		font-size: larger;
		font-weight: bold;
	}
	.teamoverview {
		border: 5px solid;
		padding: 10px;
	}
</style>
