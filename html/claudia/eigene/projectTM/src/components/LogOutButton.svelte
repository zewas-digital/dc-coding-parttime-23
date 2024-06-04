<script>
    import { currentUser } from "../stores/userStore.js";
    import { started } from "../stores/userStore.js";
    import { updateUser } from "../actions/userHelpers.js";

    function logOut(){
        const updates = {loggedIn: false};
        // console.log("function logOut, updates: ", updates);
        // console.log("currentUser: ", currentUser);
        updateUser(updates);
        // const email = $currentUser.email;
        // const userData = JSON.parse(localStorage.getItem(email));
        // console.log("logout, email, userData ", email, userData);
        // currentUser.set({ ...userData, loggedIn: false})
        // localStorage.setItem(email, JSON.stringify(currentUser));
        started.set(false);
        // console.log("logout beendet, currentUser: ", currentUser);
    }
</script>


<button on:click={logOut}>LOGOUT!</button>

