<script>
    import NewAccount from "./NewAccount.svelte";
    import ListOfTeams from "./ListOfTeams.svelte";

    let email = "";
    // let userExists = localStorage.getItem(email) !== null;
    let userExists = false;

    $: started = false;
    $: actualUser = userExists ? JSON.parse(localStorage.getItem(email)) : null;

    // actualUser will be updated whenever userExists changes. You can use actualUser directly in your code without prepending $.

    $: allTeams = actualUser ? actualUser.teams : null;
    $: showComponentNewAccount = false;

    function start() {
        started = true;
        userExists = localStorage.getItem(email) !== null;
        actualUser = JSON.parse(localStorage.getItem(email));
        
        // const allTeams = email !== "" ? actualUser.teams : null;
        // console.log(actualUser, "actualUser, start");
        {
            if (userExists) {
                console.log("aktueller Nutzer", actualUser);
                console.log(actualUser.email, actualUser.teams);
            } else console.log("User existiert noch nicht!");
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

    function newTeam() {
        console.log("new Team");
    }

    function emailTyped() {
        // console.log("neue Mail, started true?", started);
        started = false;
        // console.log("neue Mail, started false?", started);
    }
</script>

<div>
    {#if actualUser}
        <h1>Hallo {actualUser.userName}!</h1>
    {:else}
        <h1>Hallo neuer Nutzer!</h1>
    {/if}

    <p>
        Idee: bereits vorhandene User können sich einloggen; aufgeforderte
        Nutzer müssen erst einen Account anlegen. Unterschied: kein PW vorhanden
    </p>
    <input
        type="email"
        bind:value={email}
        placeholder="Email"
        on:input={emailTyped}
    />

    <!--TODO: Enter-Taste?-->
    <!-- <button on:click={start} on:keydown={handleKeyPress}>start</button> -->
    <button on:click={start} on:keypress:enter={start}>LOS!</button>

    {#if email !== "" && started}
        {#if !userExists || actualUser.userName === ""}
            <p>
                {#if !showComponentNewAccount}
                    User noch nicht registriert: <button
                        on:click={() => newAccount()}>Account anlegen</button
                    >
                {/if}
                <!-- <button on:click={() => newTeam()}>Team anlegen???????</button> -->
                {#if showComponentNewAccount}
                    <p>Hier an Child übergeben: Mailadresse {email}; besser mit Context-API?</p>
                    <NewAccount {email} />
                {/if}
            </p>
        {:else}
            <p>Du bist für folgende Teams registriert:</p>
            <!--TODO: User übergeben statt allTeams? Oder Context-API?-->
            {#if allTeams} <!--TODO if userExists??-->
                <br />
                <ListOfTeams {allTeams}/>

                
                <button on:click={() => newTeam()}>Team anlegen</button>
                <!-- <h2>{index + 1}: {team.name}</h2> -->

                <!-- {:else}
                <p>Keine Teams gefunden.</p> -->

            {/if}
        {/if}
    {/if}
</div>
