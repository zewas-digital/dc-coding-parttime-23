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
  import { onMount } from "svelte";

  let email = "";
  // $: console.log("Email changed! ", email);

  $: showComponentEmailInput = $currentUser === null || !$currentUser.loggedIn;



  onMount(() => {
    if (showComponentEmailInput) email.focus();
  });
  // Local reactive variable to hold the current user data
  //TODO: user verwenden?
  // let user;
  //   currentUser.subscribe(value => {
  //       user = value;
  //   });

  $: userExists = !(
    currentUser.email === "" ||
    currentUser.email === undefined ||
    currentUser.email === null
  );

  // $: console.log("started geändert ", $started); // Use $started to log the store's value

  $: allTeams = userExists ? $currentUser.teams : [];
  // $: console.log("allTeams: ", allTeams);
  let showComponentNewAccount = false;
  let showComponentNewUser = false;

  // $: loggedIn = $currentUser?.loggedIn ?? false; // Optional chaining, default value
  $: console.log("currentUser geändert: ", $currentUser);
  // $: console.log("loggedIn geändert ", currentUser.loggedIn);
  // $: console.log("userExists geändert", userExists);
  // $: showComponentLogin = (!$currentUser?.loggedIn ?? false) && userExists && ($currentUser?.accountCreated ?? false);
  $: showComponentLogin =
    !$currentUser?.loggedIn && userExists && $currentUser?.accountCreated;
  function start() {
    // console.log("Start, vor initialize, email: ", email);
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

  function emailTyped(event) {
    email = event.target.value;

    initializeUser("");

    started.set(false); // Use .set() to update the store

    showComponentLogin = false;
    showComponentNewAccount = false;
    showComponentNewUser = false;
    //   console.log("EmailTyped: email:", email, "started: ", $started);
  }
</script>

<div>
  {#if showComponentEmailInput}
    <input
      type="email"
      bind:this={email}
      placeholder="Email"
      on:input={emailTyped}
    />
  {/if}
  <!-- bind:this={email} für den Autofocus bei onMount anstelle von:
bind:value={email}  -->

  <!--TODO: svelte:component this = {...} anstelle von if's ???-->

  {#if !$started}
    <!-- Use $started to auto-subscribe to the store -->
    <button on:click={start} on:keypress:enter={start}>LOS!</button>
  {/if}

  {#if showComponentNewUser}
    <NewUser {email} /> <!--email übergeben???-->
  {/if}

  {#if showComponentNewAccount}
    <NewAccount {email} />
  {/if}

  {#if showComponentLogin}
    <Login />
  {/if}

  <!-- {#if $currentUser}
    <p>TEST: loggedIn? {$currentUser.loggedIn}</p> -->
  {#if $currentUser && $currentUser.loggedIn}
    <h2>Hallo {$currentUser.userName}!</h2>
    <LogOutButton />
    <ListOfTeams />
  {/if}

  <!-- {/if} -->
  <!-- <p>TEST: started? {$started}</p> -->
</div>
