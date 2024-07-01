<script>
    import { actualUser } from '../src/stores/userStore.js';
    import { writable } from 'svelte/store';
  
    let email = '';
  
    function emailTyped(event) {
      email = event.target.value;
    }
  
    function initializeUser() {
      console.log("Initialize User from ", $actualUser);
    //   console.log("Email: ", email, "from LS: ", localStorage.getItem(email));
      const userData = JSON.parse(localStorage.getItem(email));
      console.log("userData", userData);
      if (userData) {
        actualUser.set(userData);
      }
      console.log("...to: ", $actualUser);
    }
  </script>
  
  <input
    type="email"
    bind:value={email}
    placeholder="Email"
    on:input={emailTyped}
  />
  <button on:click={initializeUser}>Log In</button>
  
  {#if $actualUser}
    <div>
      <p>Welcome, {$actualUser.userName}!</p>
      <p>Email: {$actualUser.email}</p>
      <p>Status: {$actualUser.loggedIn ? 'Logged In' : 'Logged Out'}</p>
    </div>
  {:else}
    <p>No user data available.</p>
  {/if}
  