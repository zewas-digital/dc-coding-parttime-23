<script>
  import NewAccount from "./NewAccount.svelte";
  import ListOfTeams from "./ListOfTeams.svelte";
  import NewUser from "./NewUser.svelte";
  import Login from "./Login.svelte";
  import LogOutButton from "./LogOutButton.svelte";
  import { currentUser } from "../stores/userStore.js";
  import { started } from "../stores/userStore.js"; // Import the store
  import { initializeUser } from "../actions/userHelpers";
  import { updateUser } from "../actions/userHelpers";

  let email = "";
  $: console.log("Email changed! ", email);


  // Local reactive variable to hold the current user data
  //TODO: user verwenden?
  let user;
    currentUser.subscribe(value => {
        user = value;
    });


  $: userExists = !(
    currentUser.email === "" ||
    currentUser.email === undefined ||
    currentUser.email === null
  );

  // $: console.log("started geändert ", $started); // Use $started to log the store's value

  $: allTeams = currentUser ? currentUser.teams : null;
  let showComponentNewAccount = false;
  let showComponentNewUser = false;
  // $: loggedIn = $currentUser?.loggedIn ?? false; // Optional chaining, default value
  $: console.log("currentUser geändert: ", $currentUser);
  $: console.log("loggedIn geändert ", currentUser.loggedIn);
  // $: console.log("userExists geändert", userExists);
  // $: showComponentLogin = (!$currentUser?.loggedIn ?? false) && userExists && ($currentUser?.accountCreated ?? false);
  $: showComponentLogin =
    !$currentUser?.loggedIn && userExists && $currentUser?.accountCreated;
  function start() {
    console.log("Start, vor initialize, email: ", email);
    initializeUser(email);
    // console.log("function started, nach initialize, currentUser ", $currentUser );
    started.set(true); // Use .set() to update the store
    userExists = localStorage.getItem(email) !== null;
    // console.log("function started, currentUser", $currentUser);

    if (userExists && !$currentUser.loggedIn) {
      if ($currentUser.accountCreated) {
        showComponentLogin = true;
      } else {
        showComponentNewAccount = true;
      }
    }

    if (!userExists && email !== "") {
      showComponentNewUser = true;
    }
  }

  // async function initializeUser() {
  //   // console.log("Initialize USER! ---------------");
  //   // console.log("Email:; ", email);
  //   const userData = JSON.parse(localStorage.getItem(email));
  //   if (userData) {
  //     currentUser.set({ ...userData, loggedIn: false }); // Set loggedIn within set
  //   }
  //   // console.log("currentUser: ", $currentUser);
  //   // console.log("Initialize fertig! ------------------------");
  // }

  function emailTyped(event) {
    email = event.target.value;
    // currentUser.set(null); //TODO ?????????????????
    // console.log("emailTyped! *********************");
    // const emptyUser = {
    //   email: "",
    //   accountCreated: false,
    //   loggedIn: false,
    //   password: "",
    //   userName: "",
    //   teams: [],
    // };
    // currentUser.set(emptyUser);

    //TODO: aktuellen User ausloggen!
    initializeUser("");

    started.set(false); // Use .set() to update the store
    //   loggedIn = false;
    //     currentUser.set({
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

  {#if !$started}
    <!-- Use $started to auto-subscribe to the store -->
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

  {#if $currentUser}
    <p>TEST: loggedIn? {$currentUser.loggedIn}</p>
    {#if $currentUser.loggedIn}
      <h2>Hallo {$currentUser.userName}</h2>
      <LogOutButton />
    {/if}

    <!-- {#if $currentUser.loggedIn}
      <h1>Hallo {currentUser.userName}!</h1>
      <ListOfTeams {allTeams} />
    {/if} -->
  {/if}
  <p>TEST: started? {$started}</p>
</div>
