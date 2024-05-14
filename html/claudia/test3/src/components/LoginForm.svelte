<script>
    let email = '';
    let password = '';

    function login() {
        // Your login logic here
        console.log("Logging in with email:", email, "and password:", password);
    }
</script>

<div>
    <input type="email" bind:value={email} placeholder="Email" />
    <input type="password" bind:value={password} placeholder="Password" />
    <button on:click={login}>Login</button>
</div>
