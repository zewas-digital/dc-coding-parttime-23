<script lang="ts">
	import { getTeamByID, getUserByID } from "$lib/utils/storageHelpers";
    import type { User } from "$lib/stores/userStore";

    export let teamID: number;
	const myTeam = getTeamByID(teamID.toString());
    // const allMembers = myTeam?.allMembers;
    let allNames: string[] = [];




	$: if (myTeam) {
		//find out names of all member who have already created an account ////////////////
		const allMembers = myTeam.allMembers || []; //Array of integers!
		// allNames = [];
		// console.log('allMembers: ', allMembers);

		allMembers.forEach((member) => {
			const idString = member.toString();
			// const storedUser = localStorage.getItem(idString);
            const storedUser = getUserByID(idString);
            if (storedUser) allNames.push(storedUser.userName);

			// if (storedUser) {
			// 	try {
			// 		const nextUser: User = JSON.parse(storedUser);
			// 		allNames.push(nextUser.userName);
			// 	} catch (error) {
			// 		console.error('Error parsing user from localStorage', error);
			// 	}
			// } else {
			// 	console.warn(`No user found in localStorage for id: ${idString}`);
			// }
		});
	}





</script>

{#if myTeam}
<h2>{myTeam.teamName}, Anzahl Mitglieder: {myTeam.allMembers.length}</h2>
{/if}
<h3>Account bereits angelegt:</h3>
	{#each allNames as name}
		<div>{name}</div>
	{/each}