<script lang="ts">
	import { showTemporaryMessage } from '$lib/actions/showHelpers';
	import { updateUser } from '$lib/actions/userHelpers.js';
	import { currentUser } from '$lib/stores/userStore.js';

	let password: string = "";
	let loginSuccessful = false;
	let errorMessage: string = "";

	let showMessage = false; //to display message
	const duration = 3000; //in milliseconds

	function setShowMessage(value: boolean): void {
		showMessage = value;
	}

	// function handleLogin(email, password) {
	function handleLogin(password: string): boolean {
		if ($currentUser && $currentUser.password === password) {
			// console.log("Login successful, currentUser:", $currentUser);

			// const newUserData = { ...$currentUser, loggedIn: true };
			// currentUser.set(newUserData);
			const updates = { loggedIn: true };
			// console.log("Updates: ", updates);
			updateUser(updates);
		} else {
			console.error('Incorrect password.');
			return false;
		}
		showTemporaryMessage(setShowMessage, duration);
        return true;
	}

	function handleSubmit(event: Event): void {
    event.preventDefault();

    if (handleLogin(password)) {
        loginSuccessful = true;
        errorMessage = '';
    } else {
        loginSuccessful = false;
        errorMessage = 'Login fehlgeschlagen! Email + PW prüfen!';
    }
}

</script>

{#if $currentUser && !$currentUser.loggedIn}
	<h2>Login</h2>
	<form on:submit={handleSubmit}>
		<label>
			Password:
			<!-- TODO: Password-Type korrigieren! -->
			<input type="text" bind:value={password} required />
		</label>

		<button type="submit">Login</button>
	</form>
{/if}
{#if errorMessage}
	<p class="error">{errorMessage}</p>
{:else if loginSuccessful}
	<p class="success">Login successful!</p>
{/if}
