<script>
    import { currentUser } from "../stores/userStore.js";
    import { started } from "../stores/userStore.js";

    function logOut(){
        const email = $currentUser.email;
        const userData = JSON.parse(localStorage.getItem(email));
        console.log("logout, email, userData ", email, userData);
        currentUser.set({ ...userData, loggedIn: false})
        localStorage.setItem(email, JSON.stringify(currentUser));
        started.set(false);
    }
</script>

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