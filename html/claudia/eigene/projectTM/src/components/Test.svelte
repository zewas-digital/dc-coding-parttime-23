<!-- <script>
    import NewAccount from "./NewAccount.svelte";
    import ListOfTeams from "./ListOfTeams.svelte";
    import NewUser from "./NewUser.svelte";
    import Login from "./Login.svelte";
    import { actualUser } from "../stores/userStore.js";
    import { started } from "../stores/userStore.js"; // Import the store
  
    let email = "";
  
    $: console.log("Email changed! ", email);
  
    $: userExists = !(actualUser.email === "" || actualUser.email === undefined || actualUser.email === null);
  
    $: console.log("started geändert ", $started); // Use $started to log the store's value
  
    $: allTeams = actualUser ? actualUser.teams : null;
  
    let showComponentNewAccount = false;
    let showComponentNewUser = false;
  
    $: loggedIn = $actualUser?.loggedIn ?? false; // Optional chaining, default value
  
    $: console.log("actualUser geändert: ", actualUser);
  
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
      started.set(false); // Use .set() to update the store
      showComponentLogin = false;
      showComponentNewAccount = false;
      showComponentNewUser = false;
    }
  </script>
  
  <div>
    <input
      type="email"
      bind:value={email}
      placeholder="Email"
      on:input={emailTyped}
    />
  
    {#if !$started} <button on:click={start} on:keypress:enter={start}>LOS!</button>
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
  
    <p>TEST: loggedIn? {$actualUser.loggedIn}</p>
    <p>TEST: started? {$started}</p>
  
    {#if $actualUser.loggedIn}
      
  

 -->
<!-- 
 # Projektstruktur kann diese sein:
 ├── src/
 │ ├── assets/
 │ ├── components/
 │ ├── actions/
 │ ├── stores/
 │ ├── utils/
 │ ├── App.svelte
 ## Komponenten wie besprochen noch organisieren:
 src/components/
 ├── Button.svelte
 ├── Header.svelte
 └── Todo/
 ├── TodoList.svelte
 └── TodoItem.svelte
 ## Actions für wiederverwendbare/mehrfach verwendete JS-Funktionen
 src/actions/
 └── clickOutside.js
 ## stores/ oder dann context/
 für den globalen Speicher
 ## Utils für Hilfsfunktionen und -Scripts
 src/utils/
 └── dateFormatter.js -->