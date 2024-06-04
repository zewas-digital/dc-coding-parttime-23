<script lang="ts">
	
	// import type { User } from '$lib/stores/userStore'; // Import the User type
	import { currentUser, started } from '$lib/stores/userStore';
	import { onMount } from 'svelte';
	import { updateUser, initializeUser } from '$lib/actions/userHelpers';
	import { goto } from '$app/navigation';
	import Login from '$lib/components/usercomponents/Login.svelte';
	import NewAccount from '$lib/components/usercomponents/NewAccount.svelte';
	import NewUser from '$lib/components/usercomponents/NewUser.svelte';
	import LogOutButton from '$lib/components/usercomponents/LogOutButton.svelte';

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

	onMount(() => {
		if (showComponentEmailInput && emailInput) emailInput.focus(); //Focus auf Input-Feld
	});

	// $: console.log('Email changed! ', email);
	$: console.log('Component Start, CurrentUser: ', $currentUser);
	// $: console.log('Component Start, User: ', user);
	// $: console.log("Component Start, hasStarted, started: ", hasStarted, $started);
	// $: console.log("Component Start, user, currentUser: ", user, $currentUser);

	// $: userExists =
	// 	user !== null && user.email !== '' && user.email !== undefined && user.email !== null;
	$: userExists =
		$currentUser !== null &&
		$currentUser.email !== '' &&
		$currentUser.email !== undefined &&
		$currentUser.email !== null;
	// $: console.log('started geändert ', $started); // Use $started to log the store's value

	// $: allTeams = userExists ? $currentUser.teams : [];
	// // $: console.log("allTeams: ", allTeams);
	let showComponentNewAccount = false;
	let showComponentNewUser = false;

	$: loggedIn = $currentUser?.loggedIn ?? false; // Optional chaining, default value
	// $: console.log('currentUser geändert: ', $currentUser);
	// $: console.log('user geändert: ', $user);

	// $: console.log("loggedIn geändert ", currentUser.loggedIn);
	// // $: console.log("userExists geändert", userExists);
	$: showComponentLogin = !$currentUser?.loggedIn && userExists && $currentUser?.accountCreated;

	function start(event: MouseEvent | KeyboardEvent): void {
		// console.log("Start, vor initialize, email: ", email);
		initializeUser(email);
		// console.log('function started, nach initialize, currentUser ', $currentUser);
		started.set(true); // Use .set() to update the store
		// console.log("Started is set!: (started, hasStarted)", $started, hasStarted);
		userExists = localStorage.getItem(email) !== null;
		// console.log('userExists? ', userExists, $currentUser);
		// console.log('function started, user', $user);

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
		// console.log("function start beendet!, $started, hasStarted: ", $started, hasStarted);
		// console.log("function start beendet!, $currentUser, user: ", $currentUser, user);
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

	$: console.log("currentUser loggedin?: ", $currentUser);
	$:	if ($currentUser && $currentUser.loggedIn) {
		goto("/myteams");
	}
	
</script>

<div>
	<!-- {#if $currentUser && $currentUser.userName !== ""}
		<p>Welcome, {$currentUser.userName}!</p>
	{/if} -->
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

	<!-- {#if $currentUser}
		<p>TEST: loggedIn? {$currentUser.loggedIn}</p>
	{/if} -->
	<!-- {#if $currentUser && $currentUser.loggedIn}
		<h2>Hallo {$currentUser.userName}!</h2>
		
		<LogOutButton />
		<ListOfTeams /> -->
	<!-- {/if} -->

	<!-- {/if} -->
	<!-- <p>TEST: started? {$started}</p> -->
</div>
