<script lang="ts">
    
    import { showTemporaryMessage } from '$lib/actions/showHelpers';
    import { updateUser } from '$lib/actions/userHelpers.js';
	// import { currentUser } from '$lib/stores/userStore.js';
    export let email: string;

    let showMessage = false; //to display message
    const duration = 3000; //in milliseconds

    function setShowMessage(value: boolean): void { //boolean value
        showMessage = value;
    }

  
    let password: string;
    let userName: string;
    let userCreated = false;
 

    function handleSubmit(event:Event): void {
        event.preventDefault();

        const newUser = {
            email: email,
            accountCreated: true,
            loggedIn: true,
            password: password,
            userName: userName,
            allTeams: [],
        };
        
        // console.log("Neuer Nutzer in NewUser ", newUser);
       
        updateUser(newUser);

        userCreated = true;
        showTemporaryMessage(setShowMessage, duration);
    }

 
</script>

{#if !userCreated}
    <h2>Leg jetzt ein Nutzerkonto an!</h2>
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

        <button type="submit">Nutzer anlegen!</button>
    </form>
{:else if showMessage}
    Neuer Nutzer angelegt!
{/if}
