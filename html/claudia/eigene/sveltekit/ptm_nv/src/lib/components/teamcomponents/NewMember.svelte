<!--
TODO: 
- Emailadressen angeben, welche boolean-Werte?
- wenn alle ausgefüllt: Button
- Unterscheiden, ob email schon existiert (dann nur Membership hinzufügen) oder nicht
- allen Emailadressen Infomail zusenden


-->

<script lang="ts">
	import { onMount } from 'svelte';
	import { type User, type Membership, defaultUser, type UserUpdates } from '$lib/stores/userStore';
	import { currentTeam } from '$lib/stores/teamStore';
	import { getNextID, getUserByEmail } from '$lib/utils/storageHelpers';
	import { updateMembershipsOfUser, updateUser } from '$lib/actions/userHelpers';

	// Initialize the list with three empty email inputs
	// let emails = ['', '', ''];

	let newUsers: User[] = [];

	interface UserData {
		userID: number;
		email: string;
		isAdmin: boolean;
		membership: number; //currentTeam.id!!
	}

	let allNewUserData: UserData[] = [
		{ userID: 0, email: '', isAdmin: false, membership: $currentTeam.teamID }
	];
	let newMembership: Membership; 

	// Function to handle form submission
	function inviteNewMembers() {
		let userUpdates: UserUpdates = {};
		// console.log('Submitted users:', allNewUserData);
		//get rid of last element (which is always empty because of empty line):
		allNewUserData.pop();
		// console.log('newUserData ohne letztes Element:', allNewUserData);
		console.log('allNewUserData: ', allNewUserData);
		// allNewUserData = allNewUserData.filter(entry => entry.userID !== 0);
		// console.log("allNewUserData: ", allNewUserData);

		allNewUserData.forEach((userData, index) => {

			const myUser = getUserByEmail(userData.email); //existing user or default

			//noch nicht existierender Nutzer:
			if (myUser.userID === 0) {
				const newMembership = { teamID: $currentTeam.teamID, isAdmin: userData.isAdmin };

				userUpdates = {
					userID: getNextID('user'),
					email: userData.email,
					memberships: [newMembership]
				};
				// myUser.userID = getNextID('user');
				// myUser.email = userData.email;
				// myUser.memberships = [newMembership];
				// userUpdates.email = userData.email;
				// userUpdates.userID = getNextID("user");
			}
			else { //user exists already -> only check memberships
				userUpdates = updateMembershipsOfUser(myUser, $currentTeam.teamID, userData.isAdmin);
				
			}


			updateUser(myUser, userUpdates);
			// const myMemberships = myUser.memberships;

			// if (!hasMembership(myMemberships, $currentTeam.teamID)) {
			// 	myMemberships.push(newMembership);
			// 	userUpdates.memberships = myMemberships;
			// }
			// // else if (hasMembership(myMemberships, $currentTeam.teamID))
			// saveUserData(myUser, userUpdates);
		});

		//Achtung: Liste muss verschwinden!
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

<section class="input-block">
	{#each allNewUserData as userData, index}
		<p>
			<input
				type="email"
				id="emailInput{index}"
				placeholder="Enter Email"
				bind:value={userData.email}
				on:input={addNewLine}
			/>

			<input type="checkbox" id="isAdmin{index}" bind:checked={userData.isAdmin} />
			<label for="isAdmin{index}">Admin?</label>
		</p>
	{/each}
</section>

<button on:click={inviteNewMembers}>Als neue Mitglieder einladen!</button>

<style>
	/* div {
		margin-bottom: 10px;
	} */

	.input-block {
		max-height: 300px; /* Adjust the maximum height as needed */
		overflow-y: auto; /* Enable vertical scroll bar */
		/*border: 1px solid #ccc; /* Optional: Add border for clarity */
		padding: 10px;
	}
</style>
