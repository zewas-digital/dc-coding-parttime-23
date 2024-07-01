<script lang="ts">
	
	// import type { User } from '$lib/stores/userStore'; // Import the User type
	import { currentUser, started } from '$lib/stores/userStore';
	import { onMount } from 'svelte';
	import { updateUser, initializeUser } from '$lib/actions/userHelpers';
	import { goto } from '$app/navigation';
	import Login from '$lib/components/usercomponents/Login.svelte';
	import NewAccount from '$lib/components/usercomponents/NewAccount.svelte';
	import NewUser from '$lib/components/usercomponents/NewUser.svelte';
	// import LogOutButton from '$lib/components/usercomponents/LogOutButton.svelte';
	import { currentTeam } from '$lib/stores/teamStore';
	
// console.log("Component Start!");
        started.set(false);
        currentUser.set(null);


	// Initialize the variables with appropriate types
	// let user: User | null = null;
	// let hasStarted: boolean = false;

	// Directly use the store with the `$` prefix
	// No need to manually subscribe
	// $: user = $currentUser;
	// $: hasStarted = $started;

	let email: string = '';
	let emailInput: HTMLInputElement | null;

	
	$: showComponentEmailInput = $currentUser === null || !$currentUser.loggedIn;
	// $: console.log("Emailinput? ", showComponentEmailInput);

	onMount(() => {
		
		if (showComponentEmailInput && emailInput) emailInput.focus(); //Focus auf Input-Feld
	});

	// $: console.log('Email changed! ', email);
	// $: console.log('Component Start, CurrentUser: ', $currentUser);
	// $: console.log("currentTEam: ", $currentTeam);


	
	$: userExists =
		$currentUser !== null &&
		$currentUser.email !== '' &&
		$currentUser.email !== undefined &&
		$currentUser.email !== null;

	
	let showComponentNewAccount = false;
	let showComponentNewUser = false;

	$: loggedIn = $currentUser?.loggedIn ?? false; // Optional chaining, default value
	
	$: showComponentLogin = !$currentUser?.loggedIn && userExists && $currentUser?.accountCreated;

	function start(event: MouseEvent | KeyboardEvent): void {
		initializeUser(email);
		started.set(true); // Use .set() to update the store
		userExists = localStorage.getItem(email) !== null;
		
		if (userExists && $currentUser && !$currentUser.loggedIn) {
			if ($currentUser.accountCreated) {
				showComponentLogin = true;
			} else {
				showComponentNewAccount = true;
			}
		}

		if (!userExists && email !== '') {
			showComponentNewUser = true;
		}
		
	}

	function emailTyped(event: Event) {
		const input = event.target as HTMLInputElement;
		email = input.value;

		initializeUser("");
		started.set(false); // Use .set() to update the store
		showComponentLogin = false;
		showComponentNewAccount = false;
		showComponentNewUser = false;
	}

	// $: console.log("currentUser loggedin?: ", $currentUser);
	$:	if ($currentUser && $currentUser.loggedIn) {
		goto("/myteams");
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

	{#if showComponentNewUser}
		<NewUser {email} /> <!--email übergeben!!-->
	{/if}

	{#if showComponentNewAccount}
		<NewAccount {email} />
	{/if}

	{#if showComponentLogin}
		<Login />
	{/if}

	
</div>
