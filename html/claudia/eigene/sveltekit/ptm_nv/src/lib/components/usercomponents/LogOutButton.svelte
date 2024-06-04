<script lang="ts">
	import { currentUser, started } from '$lib/stores/userStore.js';
    import { updateUser } from '$lib/actions/userHelpers.js';

    function logOut(): void{
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

<!-- const updates = {loggedIn: true};
            console.log("Updates: ", updates);
            updateUser(updates); -->

<button on:click={logOut}>LOGOUT!</button>


<!-- const newUser = {
    email: email,
    accountCreated: true,
    loggedIn: true,
    password: password,
    userName: userName,
    allTeams: allTeams,
};
// console.log("Neuer Nutzer in NewAccount: ", newUser);
localStorage.setItem(email, JSON.stringify(newUser));

currentUser.set(newUser); -->