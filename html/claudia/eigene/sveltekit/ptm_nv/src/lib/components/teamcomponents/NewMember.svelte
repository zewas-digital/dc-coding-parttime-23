<!--
TODO: 

- allen Emailadressen Infomail zusenden


-->

<script lang="ts">
	import { onMount } from 'svelte';
	import {
		type User,
		type Membership,
		defaultUser,
		type UserUpdates,
		currentUser
	} from '$lib/stores/userStore';
	import { currentTeam } from '$lib/stores/teamStore';
	import { getNextID, getUserByEmail } from '$lib/utils/storageHelpers';
	import { updateMembershipsOfUser, updateUser } from '$lib/actions/userHelpers';
	import type { TeamUpdates } from '$lib/stores/teamStore';
	import { updateCurrentTeam } from '$lib/actions/teamHelpers';

		
	interface UserData {
		userID: number;
		email: string;
		isAdmin: boolean;
		membership: number; //currentTeam.id!!
	}

	// let isCoach = false;

	let allNewUserData: UserData[] = [
		{ userID: 0, email: '', isAdmin: false, membership: $currentTeam.teamID }
	];
	let allNewCoaches: boolean[] = [];
	// let newMembership: Membership;

	let responseVisible = false;

	onMount(() => {responseVisible = false});


	// Function to handle form submission
	function inviteNewMembers() {
		let userUpdates: UserUpdates = {};
		// let teamUpdates: TeamUpdates = {};
		// console.log('Submitted users:', allNewUserData);
		//get rid of last element (which is always empty because of empty line):
		allNewUserData.pop();
		// console.log('newUserData ohne letztes Element:', allNewUserData);
		// console.log('allNewUserData: ', allNewUserData);
		// allNewUserData = allNewUserData.filter(entry => entry.userID !== 0);
		// console.log("allNewUserData: ", allNewUserData);

		let allMembers = $currentTeam.allMembers;
		let allAdmins = $currentTeam.allAdmins;
		let allCoaches = $currentTeam.allCoaches;

		allNewUserData.forEach((userData, index) => {
			const myUser = getUserByEmail(userData.email); //existing user or default

			//noch nicht existierender Nutzer:
			if (myUser.userID === 0) {
				const newMembership = { teamID: $currentTeam.teamID, isAdmin: userData.isAdmin };
				const nextID = getNextID('user');
				userUpdates = {
					userID: nextID,
					email: userData.email,
					memberships: [newMembership]
				};
				allMembers.push(nextID); //update memberlist of team
				if (userData.isAdmin) allAdmins.push(nextID);
				if (allNewCoaches[index]) allCoaches.push(nextID);
			} else {
				//user exists already -> only check memberships
				//update user data:
				if (myUser !== $currentUser)
					userUpdates = updateMembershipsOfUser(myUser, $currentTeam.teamID, userData.isAdmin);
				//update team data:
				if (userData.isAdmin && !allAdmins.includes(myUser.userID)) {
					allAdmins.push(myUser.userID);
				}
				if (!allMembers.includes(myUser.userID)) {
					allMembers.push(myUser.userID);
				}
				if (!allCoaches.includes(myUser.userID)){
					allCoaches.push(myUser.userID);
				}
			}
			updateUser(myUser, userUpdates);
		});

		updateCurrentTeam({ allMembers: allMembers, allAdmins: allAdmins, allCoaches: allCoaches });

		responseVisible = true;
		//TODO: Eingabeliste muss verschwinden!

		 // Clear the first input field
		 allNewUserData[0] = { userID: 0, email: '', isAdmin: false, membership: 0 };
        allNewCoaches[0] = false;

        // Remove all other input lines
        allNewUserData = allNewUserData.slice(0, 1);
        allNewCoaches = allNewCoaches.slice(0, 1);

        // Hide the response message after a few seconds
        setTimeout(() => {
            responseVisible = false;
        }, 3000);
	}

	// function existingUserData(email: string): User {
	//   const myUser= getUserByEmail(email); //existing user or default user

	// }

	//some-method: test if at least one element of given array passes the implemented test;
	//returns true if yes
	// function hasMembership(memberships: Membership[], teamID: number): boolean {
	// 	return memberships.some((membership) => membership.teamID === teamID);
	// }

	function newUserFilledIn(userdata: UserData): boolean {
		return userdata.email !== '';
	}

	//add a new line of userData when last email-input is typed into
	function addNewLine() {
		if (allNewUserData.every(newUserFilledIn)) {
			allNewUserData.push({
				userID: 0,
				email: '',
				isAdmin: false,
				membership: $currentTeam.teamID
			});
		}
	}
</script>

<!-- type="email"
			bind:this={emailInput}
			bind:value={email}
			placeholder="Email"
			on:input={emailTyped} -->

<section class="input-block">
	{#each allNewUserData as userData, index}
		<p>
			<input
				type="email"
				id="emailInput{index}"
				placeholder="Email"
				bind:value={userData.email}
				on:input={addNewLine}
			/>

			<input type="checkbox" id="isAdmin{index}" bind:checked={userData.isAdmin} />
			<label for="isAdmin{index}">Admin?</label>

			<input type="checkbox" id="isCoach{index}" bind:checked={allNewCoaches[index]} />
			<label for="isCoach{index}">Coach?</label>
		</p>
	{/each}
	{#if responseVisible}
    <div id="response">Emails wurden übermittelt!</div>
	{/if}
</section>

<button on:click={inviteNewMembers}>Mitglieder einladen!</button>



<style>
	
	.input-block {
		max-height: 300px; /* Adjust the maximum height as needed */
		overflow-y: auto; /* Enable vertical scroll bar */
		/*border: 1px solid #ccc; /* Optional: Add border for clarity */
		padding: 10px;
	}


	#response {
        display: block;
        margin-top: 10px;
        color: green;
    }
    

</style>
