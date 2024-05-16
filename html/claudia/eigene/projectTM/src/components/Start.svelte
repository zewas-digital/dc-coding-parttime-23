<script>
    import NewAccount from "./NewAccount.svelte";

    //TODO
    let email = "";
    let userExists = localStorage.getItem(email) !== null;
    $: started = false;
    $: actualUser = userExists ? JSON.parse(localStorage.getItem(email)) : null;
    // actualUser will be updated whenever userExists changes. You can use actualUser directly in your code without prepending $.

    $: allTeams = actualUser ? actualUser.teams : null;
    $: showComponentNewAccount = false;

    // console.log("aktueller User",localStorage.getItem(email));
    // console.log("aktueller User geparst",JSON.parse(localStorage.getItem(email)));

    // $: allTeams = email !== "" ? JSON.parse(localStorage.getItem(email)).teams : null;
    // $: console.log(allTeams, "Teams am Anfang");

    // Retrieve members from localStorage
    // let retrievedMembers = [];

    // for (let i = 0; i < localStorage.length; i++) {
    //     let key = localStorage.key(i);
    //     let member = JSON.parse(localStorage.getItem(key));
    //     retrievedMembers.push(member);
    // }
    // console.log(retrievedMembers);

    function start() {
        started = true;
        const actualUser = JSON.parse(localStorage.getItem(email));
        userExists = localStorage.getItem(email) !== null;
        const allTeams = email !== "" ? actualUser.teams : null;
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

    function handleTeamClick(team) {
        // Handle click logic here
        console.log("Clicked on team:", team);
    }

    function newAccount() {
        console.log(showComponentNewAccount);

        console.log("new Account");
        showComponentNewAccount = true;
        console.log(showComponentNewAccount);
    }

    function newTeam() {
        console.log("new Team");
    }

    function emailTyped() {
        console.log("neue Mail, started true?", started);
        started = false;
        console.log("neue Mail, started false?", started);
    }
</script>

<div>
    {#if actualUser}
        <h1>Hallo {actualUser.name}!</h1>
    {:else}
        <h1>Hallo neuer Nutzer!</h1>
    {/if}

    <p>
        Idee: bereits vorhandene oder aufgeforderte User können sich einloggen;
        wenn sie schon einen Account angelegt haben, gibt es schon ein PW, sonst
        nicht
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
        {#if !userExists || actualUser.name === ""}
            <p>
                {#if !showComponentNewAccount}
                User noch nicht registriert: <button
                    on:click={() => newAccount()}>Account anlegen</button
                >
                {/if}
                <!-- <button on:click={() => newTeam()}>Team anlegen???????</button> -->
                {#if showComponentNewAccount}
                <p>Hier übergeben wir die Mailadresse {email}</p>
                    <NewAccount {email} />
                {/if}
            </p>
        {:else}
            <p>Du bist für folgende Teams registriert:</p>
            {#if allTeams}
                <br />
                {#each allTeams as team, index}
                    <button on:click={() => handleTeamClick(team)}
                        >{team.name}</button
                    >{/each}
                    <button on:click={() => newTeam()}>Team anlegen</button>
                    <!-- <h2>{index + 1}: {team.name}</h2> -->
                
                <!-- {:else}
                <p>Keine Teams gefunden.</p> -->
            {/if}
        {/if}
    {/if}
</div>
