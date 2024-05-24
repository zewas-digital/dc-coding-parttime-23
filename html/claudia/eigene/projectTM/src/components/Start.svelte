<script>
    import NewAccount from "./NewAccount.svelte";
    import ListOfTeams from "./ListOfTeams.svelte";
    import NewUser from "./NewUser.svelte";
    import Login from "./Login.svelte";
    import LogOutButton from "./LogOutButton.svelte";
    import { actualUser } from "../stores/userStore.js";
    import { started } from "../stores/userStore.js"; // Import the store
  
    let email = "";
    $: console.log("Email changed! ", email);
  
    $: userExists = !(actualUser.email === "" || actualUser.email === undefined || actualUser.email === null);
  
    $: console.log("started geändert ", $started); // Use $started to log the store's value
  
    $: allTeams = actualUser ? actualUser.teams : null;
    let showComponentNewAccount = false;
    let showComponentNewUser = false;
    // $: loggedIn = $actualUser?.loggedIn ?? false; // Optional chaining, default value
    $: console.log("actualUser geändert: ", actualUser);
    $: console.log("loggedIn geändert ", actualUser.loggedIn);
    // $: showComponentLogin = (!$actualUser?.loggedIn ?? false) && userExists && ($actualUser?.accountCreated ?? false);
    $: showComponentLogin = !$actualUser?.loggedIn && userExists && $actualUser?.accountCreated;
    function start() {
      initializeUser();
  
      started.set(true); // Use .set() to update the store
      userExists = localStorage.getItem(email) !== null;
  
      if (userExists && !$actualUser.loggedIn) {
        if ($actualUser.accountCreated) {
          showComponentLogin = true;
        } else {
          showComponentNewAccount = true;
        }
      }
  
      if (!userExists && email !== "") {
        showComponentNewUser = true;
      }
    }
  
    async function initializeUser() {
      const userData = JSON.parse(localStorage.getItem(email));
      if (userData) {
        actualUser.set({ ...userData, loggedIn: false }); // Set loggedIn within set

      }
    }
  
    function emailTyped(event) {
      email = event.target.value;
      actualUser.set(null); //TODO ?????????????????
      started.set(false); // Use .set() to update the store
    //   loggedIn = false;
//     actualUser.set({
//     ...userData, // Spread existing user data
//     loggedIn: false, // Set loggedIn to false
//   });
      showComponentLogin = false;
      showComponentNewAccount = false;
      showComponentNewUser = false;
    //   console.log("EmailTyped: email:", email, "started: ", $started);
    }
  </script>
  
  <div>
    <input
      type="email"
      bind:value={email}
      placeholder="Email"
      on:input={emailTyped}
    />
  
    {#if !$started} <!-- Use $started to auto-subscribe to the store -->
      <button on:click={start} on:keypress:enter={start}>LOS!</button>
    {/if}
  
    {#if showComponentNewUser}
      <NewUser {email} />
    {/if}
  
    {#if showComponentNewAccount}
      <NewAccount {email} />
    {/if}
  
    {#if showComponentLogin}
      <Login {email} />
    {/if}
    
    {#if $actualUser}
    <p>TEST: loggedIn? {$actualUser.loggedIn}</p>
    {#if $actualUser.loggedIn}
    <h2>Hallo {$actualUser.userName}</h2>
    <LogOutButton />
    {/if}

    <!-- {#if $actualUser.loggedIn}
      <h1>Hallo {actualUser.userName}!</h1>
      <ListOfTeams {allTeams} />
    {/if} -->
    {/if}
    <p>TEST: started? {$started}</p>
  
    
  </div>
  