<script>
    import NewAccount from "./NewAccount.svelte";
    // import ListOfTeams from "./ListOfTeams.svelte";
    import NewUser from "./NewUser.svelte";
    import Login from "./Login.svelte";
    import { construct_svelte_component } from "svelte/internal";
    // import { getContext } from "svelte";

    let email = "";
    // let email = getContext("emailAddressFromContext");
    console.log("Start, email: ", email);

    $: userExists = localStorage.getItem(email) !== null;
    // let userExists = false;

    let started = false;
    $: actualUser = userExists ? JSON.parse(localStorage.getItem(email)) : null;

    // actualUser will be updated whenever userExists changes. You can use actualUser directly in your code without prepending $.

    $: allTeams = actualUser ? actualUser.teams : null;
    let showComponentNewAccount = false;
    let showComponentNewUser = false;
    let showComponentLogin = false;
    // $: showComponentListOfTeams = userExists && actualUser.accountCreated;

    // console.log("Start, userExists ", userExists);
    // console.log("Start, showComponentListofTeams: ", showComponentListOfTeams);

    function start() {
        started = true;
        userExists = localStorage.getItem(email) !== null;
        actualUser = JSON.parse(localStorage.getItem(email));
        console.log("function start, userExists?", userExists);
        console.log("function start, email", email);

        // const allTeams = email !== "" ? actualUser.teams : null;
        // console.log(actualUser, "actualUser, start");
        {
            if (userExists) {
                if (actualUser.accountCreated) {
                    showComponentLogin = true;
                } else showComponentNewAccount = true;

                console.log("aktueller Nutzer", actualUser);
                console.log(actualUser.email, actualUser.teams);
            } else console.log("User existiert noch nicht!");
        }

        if (!userExists && email !== "") {
            showComponentNewUser = true;
        }
    }

    // function handleKeyPress(event){
    //     if (event.key === "Enter"){
    //         console.log("Enter is pressed");
    //         start();
    //     }
    // }

    // function handleTeamClick(team) {
    //     // Handle click logic here
    //     console.log("Clicked on team:", team);
    // }

    function newAccount() {
        // console.log(showComponentNewAccount);

        console.log("new Account");
        showComponentNewAccount = true;

        // console.log(showComponentNewAccount);
    }

    function newUser() {
        console.log("new User");
        showComponentNewUser = true;
    }

    function login() {
        console.log("Login");
        showComponentLogin = true;
    }

    // function newTeam() {
    //     console.log("new Team");
    // }

    function emailTyped() {
        // console.log("neue Mail, started true?", started);
        started = false;
        showComponentLogin = false;
        showComponentNewAccount = false;
        showComponentNewUser = false;
        // console.log("neue Mail, started false?", started);
    }
</script>

<div>
    <!-- {#if actualUser}
        <h1>Hallo {actualUser.userName}!</h1>
    {:else}
        <h1>Hallo neuer Nutzer!</h1>
    {/if} -->

    Möglichkeiten:
    <ul>
        <li>
            Mail noch nicht im Local Storage -> !userExists -> neuen Nutzer
            anlegen
        </li>
        <li>
            Mail bereits vorhanden, d.h. userExists === true, dann:
            <ul>!hasAccount -> neuen Account anlegen</ul>
            <ul>hasAccount === true -> Login</ul>
        </li>
    </ul>

    <input
        type="email"
        bind:value={email}
        placeholder="Email"
        on:input={emailTyped}
    />

    <!--TODO: Enter-Taste?-->
    <!-- <button on:click={start} on:keydown={handleKeyPress}>start</button> -->
    <!--TODO: Sicherstellen, dass wirklich Emailadresse!-->
    <button on:click={start} on:keypress:enter={start}>LOS!</button>

    {#if showComponentNewUser}
        <NewUser email = {email} />
    {/if}

    {#if showComponentNewAccount}
        <NewAccount email = {email} />
    {/if}

    {#if showComponentLogin}
        <Login email = {email} />
    {/if}

    <!-- <p>{showComponentListOfTeams}showComponentListOfTEams, {showComponentNewAccount} showComponentNewAccount</p> -->

    <!-- {#if email !== "" && started}
        {#if showComponentListOfTeams}
        
        <p>Du bist für folgende Teams registriert:</p>
        <!--TODO: User übergeben statt allTeams? Oder Context-API?-->
    <!-- {#if allTeams} -->
    <!--TODO if userExists??-->
    <!-- <br /> -->
    <!-- <ListOfTeams {allTeams} /> -->

    <!-- <button on:click={() => newTeam()}>Team anlegen</button>
        {/if}
        {/if} -->

    <!-- {#if !showComponentNewAccount}
            {#if !userExists || (userExists && !actualUser.accountCreated)}
                User noch nicht registriert: <button
                    on:click={() => newAccount()}>Account anlegen</button
                >
            {/if}
            {:else} -->
    <!-- <p>
                Hier an Child übergeben: Mailadresse {email}; besser mit
                Context-API?
            </p>
            <NewAccount {email} />
            <!-- <NewAccount /> -->
    <!-- {/if} --> -->

    <!-- {/if} --> -->
</div>
