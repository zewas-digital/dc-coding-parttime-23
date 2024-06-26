<script lang="ts">
	// import type { User } from '$lib/stores/userStore'; // Import the User type
	import { currentUser, defaultUser, started } from '$lib/stores/userStore';
	import { onMount } from 'svelte';
	import { updateCurrentUser, initializeUser } from '$lib/actions/userHelpers';
	import { goto } from '$app/navigation';
	import Login from '$lib/components/usercomponents/Login.svelte';
	import NewAccount from '$lib/components/usercomponents/NewAccount.svelte';
	// import NewUser from '$lib/components/usercomponents/NewUser.svelte'; //TODO: Component überhaupt notwendig?
	
	// import LogOutButton from '$lib/components/usercomponents/LogOutButton.svelte';
	import { currentTeam} from '$lib/stores/teamStore';
	import type { Team } from '$lib/stores/teamStore';
	import NewTeam from './teamcomponents/NewTeam.svelte';
	// console.log("Component Start!");
	started.set(false);
	// currentUser.set(null);
	currentUser.set(defaultUser);

	// Initialize the variables with appropriate types
	// let user: User | null = null;
	// let hasStarted: boolean = false;

	// Directly use the store with the `$` prefix
	// No need to manually subscribe
	// $: user = $currentUser;
	// $: hasStarted = $started;

	let email: string = "";
	let emailInput: HTMLInputElement | null;

	// $: showComponentEmailInput = $currentUser === null || !$currentUser.loggedIn;
	$: showComponentEmailInput = $currentUser && !$currentUser.loggedIn;
	// $: console.log("Emailinput? ", showComponentEmailInput);
	// let teamMap: Map<number, Team> = new Map();
	onMount(() => {
		if (showComponentEmailInput && emailInput) emailInput.focus(); //Focus auf Input-Feld

		
	});

	// $: console.log('Email changed! ', email);
	// $: console.log('Component Start, CurrentUser: ', $currentUser.feedbacks);
	// $: console.log("currentTEam: ", $currentTeam);

	// $: userExists =
	// 	$currentUser !== null &&
	// 	$currentUser.email !== '' &&
	// 	$currentUser.email !== undefined &&
	// 	$currentUser.email !== null;

	// $: userExists = $currentUser !== null;
	// $: userExists = $currentUser !== null && $currentUser.userID !== 0;
	$: userExists = $currentUser && $currentUser.userID !== 0;
	// $: console.log("Component Start, userExists? ", userExists);

	let showComponentNewAccount = false;
	let showComponentNewTeam = false;

	// $: loggedIn = $currentUser?.loggedIn ?? false; // Optional chaining, default value

	$: showComponentLogin = !$currentUser?.loggedIn && userExists && $currentUser?.accountCreated;

	// $: console.log($currentUser?.memberships.length, "Länge Array");
	// $: console.log($currentUser?.userID === 0);
	$: if ($currentUser) console.log($currentUser?.memberships.length > 0);
	$: if ($currentUser && !$currentUser?.accountCreated && $currentUser?.memberships.length > 0) showComponentNewAccount = true;
	// $: console.log("showcomp.newacc: ", showComponentNewAccount);
	// $: if ($currentUser?.userID === 0 && $currentUser.memberships.length > 0) showComponentNewAccount = true;
	// $: if ($currentUser?.memberships.length > 0 && $currentUser.userID === 0)

	function start(event: MouseEvent | KeyboardEvent): void {
		
		initializeUser(email);
		started.set(true); // Use .set() to update the store
		
		let localUserExists = localStorage.getItem(email) !== null;
		if (localUserExists && $currentUser && !$currentUser.loggedIn) {
			if ($currentUser.accountCreated) {
				showComponentLogin = true;
			} 
			
			else {
				showComponentNewAccount = true;
			}


		}

		if (!localUserExists && email !== "") {
			showComponentNewTeam = true;
		}
		
	}

	function emailTyped(event: Event) {
		const input = event.target as HTMLInputElement;
		email = input.value;

		initializeUser("");
		started.set(false); // Use .set() to update the store
		showComponentLogin = false;
		showComponentNewAccount = false;
		showComponentNewTeam = false;
	}

	// $: console.log("currentUser loggedin?: ", $currentUser);
	$: if ($currentUser && $currentUser.loggedIn && $currentUser.accountCreated) { //10.06. acc.created hinzugefügt
		goto('/myteams');
	}
</script>

<div>
	{#if showComponentEmailInput}
		<!-- <input type="email" bind:value={email} placeholder="Email" on:input={emailTyped} /> -->
		<input
			type="email"
			bind:this={emailInput}
			bind:value={email}
			placeholder="Email"
			on:input={emailTyped}
		/>
	{/if}
	<!-- bind:this={emailInput} für den Autofocus bei onMount;
  	bind:value={email} für den reaktiven Wert -->

	<!--TODO: svelte:component this = {...} anstelle von if's ???-->

	{#if !$started}
		<!-- Use $started to auto-subscribe to the store -->
		<!-- <button on:click={start} on:keypress:enter={start}>LOS!</button> -->
		<button on:click={start} on:keypress={(event) => event.key === 'Enter' && start(event)}
			>LOS!</button
		>
	{/if}

	{#if showComponentNewTeam} 
		<!-- <NewUser {email} /> email übergeben!! -->
		 <p>Unbekannte Emailadresse -> zunächst Team anlegen! (Nutzer ohne Team ist sinnlos.)</p>
		 <NewTeam />
	{/if}

	{#if showComponentNewAccount}
		
		<NewAccount />
	{/if}

	{#if showComponentLogin}
	<p>Nutzer schon angelegt und mit Teams verbunden.</p>
		<Login />
	{/if}
</div>
