<script>
    let email = "";
    let userExists = false;
    $: allTeams;
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

    function login() {
        const actualUser = JSON.parse(localStorage.getItem(email));
        userExists = localStorage.getItem(email) !== null;
        const allTeams = email !== "" ? actualUser.teams : null
        // console.log(actualUser, "actualUser, Login");
        {
            if (userExists) {
                console.log(actualUser);
                console.log(actualUser.email, actualUser.teams);
            } else console.log("User existiert noch nicht!");
        }
    }
</script>

<div>
    <p>
        Idee: bereits vorhandene oder aufgeforderte User können sich einloggen;
        wenn sie schon einen Account angelegt haben, gibt es schon ein PW, sonst
        nicht
    </p>
    <input type="email" bind:value={email} placeholder="Email" />

    <button on:click={login}>Login</button>

    {#if email !== ""}
        {#if !userExists}
            <p>User noch nicht registriert: Account anlegen, Team anlegen?</p>
        {:else}
            <p>User bereits registriert.</p>
            {#each allTeams as team, index}
                <h2>{index + 1}{team}</h2>
            {/each}
        {/if}
    {/if}
</div>
