<script>
    import { actualUser } from "../stores/userStore.js";

    function logOut(){
        const email = actualUser.email;
        const userData = JSON.parse(localStorage.getItem(email));

        actualUser.set({ ...userData, loggedIn: false})
    }
</script>

<button on:click={logOut}>LOGOUT!</button>
