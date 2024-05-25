<script>
    export let email;
    // import { writable } from "svelte/store";
    import { showTemporaryMessage } from "../actions/showHelpers.js";
    import { currentUser } from "../stores/userStore.js"
    import { updateUser } from "../actions/userHelpers.js";
    
    let password = "";
    let loginSuccessful = false;
    let errorMessage = "";

    let showMessage = false; //to display message
    const duration = 3000; //in milliseconds
    function setShowMessage(value) {
        //boolean value
        showMessage = value;
    }

    function handleLogin(email, password) {

        if ($currentUser.password === password) {
            console.log("Login successful, currentUser:", $currentUser);
           
            // const newUserData = { ...$currentUser, loggedIn: true };
            // currentUser.set(newUserData);
            const updates = {loggedIn: true};
            console.log("Updates: ", updates);
            updateUser(updates);

            console.log("currentUser im Store: ", $currentUser);
            console.log("aus Storage, ALT: ", localStorage.getItem(email));
//

            //Fehler beim Speichern! !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            // localStorage.setItem("3456", JSON.stringify(currentUser));
            // localStorage.setItem(email, JSON.stringify(newUserData));
            // members.forEach(member => {localStorage.setItem(member.email, JSON.stringify(member))});


            // console.log("currentUser in Login: ", $currentUser);
            // console.log("aus Storage, NEU: ", localStorage.getItem(email));
            return true;
        } else {
            console.error("Incorrect password.");
            return false;
        }
        showTemporaryMessage(setShowMessage, duration);
    }

    function handleSubmit(event) {
        event.preventDefault();

        if (handleLogin(email, password)) {
            loginSuccessful = true;
            errorMessage = "";
        } else {
            loginSuccessful = false;
            errorMessage = "Login fehlgeschlagen! Email + PW prüfen!";
        }
    }
</script>

{#if !currentUser.loggedIn}
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
