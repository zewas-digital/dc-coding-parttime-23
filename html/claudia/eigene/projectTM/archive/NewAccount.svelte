<script>
    export let email;
    import { showTemporaryMessage } from "../actions/teamHelpers.js";
    import { actualUser } from "../stores/userStore.js"
    // import {onMount} from "svelte";

    // import {getContext} from "svelte";

    let showMessage = false; //to display message
    const duration = 3000; //in milliseconds

    function setShowMessage(value) { //boolean value
        showMessage = value;
    }


    //user can only exist with not-null-array of teams!
    const userExists = localStorage.getItem(email) !== null; //userExists sowie true?
    // console.log("user exists? ", userExists);
    // const actualUser = userExists
    //     ? JSON.parse(localStorage.getItem(email))
    //     : null; //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    const allTeams = userExists ? actualUser.teams : null;
    // $: accountCreated = actualUser.accountCreated;
    let accountCreated = false;
    

    // console.log("NewAccount, actualUser zu Beginn: ", actualUser);
    // console.log("allTeams zu Beginn: ", allTeams);

    // let allUsers = [];
    let password;
    let userName;
    //get all users from local storage:
    // for (let i = 0; i < localStorage.length; i++) {
    //     let key = localStorage.key(i);
    //     let user = JSON.parse(localStorage.getItem(key));
    //     allUsers.push(user);
    // }
    // console.log(allUsers);
    //two possibilities: either user already exists in localstorage with email or NOT

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
        // console.log("Nutzer aus LocalStorage: ", localStorage.getItem(email));
        // actualUser.accountCreated = true;
        actualUser.set(newUser);

        //if user has teams already -> list of Teams
        //if user is new -> has to make new Team
        accountCreated = true;
        showTemporaryMessage(setShowMessage, duration);
    }

    // function displayMessage(value) {
    //     showText = value;
    // }
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
