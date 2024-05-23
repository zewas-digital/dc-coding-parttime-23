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



