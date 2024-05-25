<script>
    export let email;
    // import { writable } from "svelte/store";
    import { showTemporaryMessage } from "../actions/showHelpers.js";
    import { actualUser } from "../stores/userStore.js"
    
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

        if ($actualUser.password === password) {
            console.log("Login successful, actualUser:", $actualUser);
            const newUserData = { ...$actualUser, loggedIn: true };
            actualUser.set(newUserData);
            // console.log("newUserDAta im Store: ", newUserData);
            // console.log("aus Storage, ALT: ", localStorage.getItem(email));
//             const enabled = writable<actualUser>(JSON.parse(localStorage.getItem('email')));

// enabled.subscribe((value) => localStorage.actualUser = JSON.stringify(value))
// localStorage.setItem("hallo", "1234");
// console.log("Local Storage im Login: ");
// for (let i = 0; i < localStorage.length; i++) {
//     let key = localStorage.key(i);
//     let user = JSON.parse(localStorage.getItem(key));
//     console.log("Key: ", key, "VAlue: ", user);
// }

            //Fehler beim Speichern! !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            // localStorage.setItem("3456", JSON.stringify(actualUser));
            localStorage.setItem(email, JSON.stringify(newUserData));
            // members.forEach(member => {localStorage.setItem(member.email, JSON.stringify(member))});


            // console.log("actualUser in Login: ", $actualUser);
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

{#if !actualUser.loggedIn}
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
