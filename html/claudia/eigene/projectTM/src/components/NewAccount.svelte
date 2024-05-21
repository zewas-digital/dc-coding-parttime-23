<script>
    export let email;

    // import {getContext} from "svelte";

// let email = getContext("emailAddressFromContext");
    // console.log("Erhaltene Email:", email);
    // console.log("Local Storage-Eintrag: ", localStorage.getItem(email));
    // console.log("entsprechendes Object: ", JSON.parse(localStorage.getItem(email)));
    // console.log(localStorage.getItem(email) === null, "Eintrag gleich null?");

    //user can only exist with not-null-array of teams!
    const userExists = localStorage.getItem(email) !== null;
    // console.log("user exists? ", userExists);
    const actualUser = userExists
        ? JSON.parse(localStorage.getItem(email))
        : null;
    const allTeams = userExists ? actualUser.teams : null;
    $: accountCreated = actualUser.accountCreated;

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
        // console.log("Event", event);
        // const actualUser = JSON.parse(localStorage.getItem(email));
        // const allTeams = actualUser.teams;
        // console.log("neuer User", actualUser);
        // console.log("allTeams", allTeams);
        // console.log("HandleSubmit, email, pw, user, teams", email, password, userName, allTeams);
        const newUser = {
            email,
            password,
            userName,
            allTeams,
        };
        // console.log("Neuer Nutzer: ", newUser);
        localStorage.setItem(email, JSON.stringify(newUser));
        // console.log("Nutzer aus LocalStorage: ", localStorage.getItem(email));
        actualUser.accountCreated = true;

        //if user has teams already -> list of Teams
        //if user is new -> has to make new Team
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
            <input type="text" bind:value={password} required />
        </label>

        <button type="submit">Account anlegen!</button>
    </form>
{:else}
    Neuer Nutzer angelegt!
{/if}
