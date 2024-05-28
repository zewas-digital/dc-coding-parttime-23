<script>
    import { onMount } from "svelte";
    import Login from './routes/Login.svelte';
    import Start from './routes/Start.svelte';
    // import Layout from './routes/Layout.svelte';


    let loggedIn = false;

    const login = () => {
        console.log("Login");
        loggedIn = true;
    }

    const logout = () => {
        console.log("Logout");
        loggedIn = false;
    }

    onMount(() => {
        // Set loggedIn to false initially
        loggedIn = false;
    });
</script>
<!-- <Layout> -->
{#if loggedIn}
    <Start {logout} />
{:else}
    <Login {login} />
{/if}

<!-- </Layout> -->