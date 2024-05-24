<script>
    export let email;
    import { showTemporaryMessage } from "../actions/teamHelpers.js";
    import { actualUser } from "../stores/userStore.js"
    
    // let email = "";

    let password = "";
    let loginSuccessful = false;
    let errorMessage = "";
    // $: actualUser = JSON.parse(localStorage.getItem(email)) //!!!!!!!!!!!!!!!!!??????????????

    let showMessage = false; //to display message
    const duration = 3000; //in milliseconds
    function setShowMessage(value) {
        //boolean value
        showMessage = value;
    }

    function handleLogin(email, password) {
        // const actualUser = JSON.parse(localStorage.getItem(email));

        if ($actualUser.password === password) {
            console.log("Login successful!");
            // actualUser = { ...actualUser, loggedIn: true }; //Spreadoperator //!!!!!!!!!!!!!
            const newUserData = { ...$actualUser, loggedIn: true };
            actualUser.set(newUserData);

            localStorage.setItem(email, JSON.stringify(actualUser));
            console.log("actualUser in Login: ", $actualUser);
            // localStorage.setItem(email, JSON.stringify(user));
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
        <!-- <label>
        Email:
        <input type="email" bind:value={email} required />
    </label> -->

        <label>
            Password:
            <!-- TODO: Password-Type korrigieren! -->
            <input type="text" bind:value={password} required />
        </label>

        <button type="submit">Login</button>
    </form>
    <!-- {#if showMessage} -->
   
{/if}
 {#if errorMessage}
        <p class="error">{errorMessage}</p>
    {:else if loginSuccessful}
        <p class="success">Login successful!</p>
    {/if}