<script lang="ts">
	import { getTeamByID, getUserByID } from '$lib/utils/storageHelpers';
	import type { User } from '$lib/stores/userStore';

	export let teamID: number;
	const myTeam = getTeamByID(teamID.toString());
	// const allMembers = myTeam?.allMembers;
	let allNames: string[] = [];
	let allMembersWithoutAccount: string[] = [];

	$: if (myTeam) {
		//find out names of all member who have already created an account ////////////////
		const allMembers = myTeam.allMembers || []; //Array of integers!
		// allNames = [];
		// console.log('allMembers: ', allMembers);

		allMembers.forEach((member) => {
			const idString = member.toString();
			// const storedUser = localStorage.getItem(idString);
			const storedUser = getUserByID(idString);

			if (storedUser) {
				if (storedUser.accountCreated) {
					allNames.push(storedUser.userName);
				} else allMembersWithoutAccount.push(storedUser.email);
			}
		});

		// console.log('allNames ', allNames, 'allMembersWithout ', allMembersWithoutAccount);
	}
</script>

<!-- {#each allNames as name}
	<div>{name}</div>
{/each} -->

<div class="container">
	<ul>
		<p>Mitglieder mit Account</p>
		{#each allNames as name}
			<li>{name}</li>
		{/each}
	</ul>

	<ul>
		<p>Mitglieder ohne Account</p>
		{#each allMembersWithoutAccount as memberswithout}
			<li>{memberswithout}</li>
		{/each}
	</ul>
</div>

<style>
	.container {
		display: flex;
		gap: 20px;
	}
</style>
