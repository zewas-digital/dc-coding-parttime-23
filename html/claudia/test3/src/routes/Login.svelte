<script>
    import LoginForm from '../components/LoginForm.svelte';
    export let login;
</script>

<h1>LOGIN</h1>
<div>
    <button on:click={login}>LOGIN</button>
</div>


<LoginForm />
