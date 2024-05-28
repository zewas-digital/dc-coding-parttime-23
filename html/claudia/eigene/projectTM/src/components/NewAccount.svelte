<script>
    export let email;
    import { showTemporaryMessage } from "../actions/teamHelpers.js";
    import { actualUser } from "../stores/userStore.js"
 

    let showMessage = false; //to display message
    const duration = 3000; //in milliseconds

    function setShowMessage(value) { //boolean value
        showMessage = value;
    }

     const userExists = localStorage.getItem(email) !== null; //userExists sowie true?
  
    const allTeams = userExists ? actualUser.teams : null;
    let accountCreated = false;
    
    let password;
    let userName;
 
    function handleSubmit(event) {
        event.preventDefault();

        const newUser = {
            email: email,
            accountCreated: true,
            loggedIn: true,
            password: password,
            userName: userName,
            allTeams: allTeams,
        };
        console.log("Neuer Nutzer in NewAccount: ", newUser);
        localStorage.setItem(email, JSON.stringify(newUser));
      
        actualUser.set(newUser);

        accountCreated = true;
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
