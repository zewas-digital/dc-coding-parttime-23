<script>
    import { onMount } from 'svelte';
    import { createEventDispatcher } from 'svelte';

    const dispatcher = createEventDispatcher();
    //reactive variables: 
    let email = "";
    let userExists = false;

    function checkUserExists() {
        userExists = localStorage.getItem(email) !== null;
    }

    function login() {
        dispatcher.dispatch("login", { email });
    }

    onMount(() => {
        // Check if user exists in localStorage on page load
        checkUserExists();
    });
</script>

<div>
    <input type="email" bind:value={email} placeholder="Email" />
    <button on:click={login}>Login</button>

    {#if userExists}
        <p>User already exists in localStorage</p>
    {:else}
        <p>User does not exist in localStorage</p>
    {/if}
</div>



   <!------------------------------------------------------------->
   {#if !userExists || actualUser.userName === ""}
   <p>
       {#if !showComponentNewAccount}
           User noch nicht registriert: <button
               on:click={() => newAccount()}>Account anlegen</button
           >
       {/if}
       <!-- <button on:click={() => newTeam()}>Team anlegen???????</button> -->
       {#if showComponentNewAccount}
           <p>
               Hier an Child übergeben: Mailadresse {email}; besser mit
               Context-API?
           </p>
           <!-- <NewAccount {email} /> -->
           <NewAccount />
       {/if}
   </p>
{:else}
   <p>Du bist für folgende Teams registriert:</p>
   <!--TODO: User übergeben statt allTeams? Oder Context-API?-->
   {#if allTeams}
       <!--TODO if userExists??-->
       <br />
       <ListOfTeams {allTeams} />

       <button on:click={() => newTeam()}>Team anlegen</button>
       <!-- <h2>{index + 1}: {team.name}</h2> -->

       <!-- {:else}
       <p>Keine Teams gefunden.</p> -->
   {/if}
{/if}