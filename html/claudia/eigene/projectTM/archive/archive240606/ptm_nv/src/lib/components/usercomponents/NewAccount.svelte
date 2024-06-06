<script lang="ts">
    
    import { showTemporaryMessage } from '$lib/actions/showHelpers';
    import { updateUser } from '$lib/actions/userHelpers.js';
	import { currentUser } from '$lib/stores/userStore.js';
    export let email: string;

    // console.log("NewAccount, currentUser am Anfang: ", $currentUser);
    let showMessage = false; //to display message
    const duration = 3000; //in milliseconds

    function setShowMessage(value: boolean): void { //boolean value
        showMessage = value;
    }

    $: console.log("NewAccount,showMessage: ", showMessage);

    // const userExists = localStorage.getItem(email) !== null; //userExists sowie true?
    const userExists = $currentUser && $currentUser.email !== null;
    // console.log("NewAccount, userExists?, email ", userExists, email);
    const allMemberships = userExists ? $currentUser.memberships : [];
    // console.log("NewAccount, allTeams: ", allTeams);
    let accountCreated = false; //???
    
    let password: string;
    let userName: string;
 
    function handleSubmit(event: Event): void {
        event.preventDefault();

        const newAccount = {
            email: email,
            accountCreated: true,
            loggedIn: true,
            password: password,
            userName: userName,
            allMemberships: allMemberships,
        };
        updateUser(newAccount);

        // console.log("Neuer Nutzer in NewAccount: ", newUser);
    

        accountCreated = true; //???
        showTemporaryMessage(setShowMessage, duration);
    }


</script>

{#if !accountCreated}
    <h2>Leg jetzt einen neuen Account an!</h2>
    <form on:submit={handleSubmit}>
        <label>
            Name:
            <input type="text" bind:value={userName} required />
        </label>

        <label>
            Password:
            <!-- TODO: Type ersetzen für Passwort! -->
            <!-- <input type="password" bind:value={password} required /> -->
                        <!-- PW wiederholen -->

            <input type="text" bind:value={password} required />
        </label>

        <button type="submit">Account anlegen!</button>
    </form>
{:else if showMessage}
    Neuer Account angelegt!
{/if}
