<script>
    import { actualUser } from "../stores/userStore.js";
    import { started } from "../stores/userStore.js";

    function logOut(){
        const email = $actualUser.email;
        const userData = JSON.parse(localStorage.getItem(email));
        console.log("logout, email, userData ", email, userData);
        actualUser.set({ ...userData, loggedIn: false})
        localStorage.setItem(email, JSON.stringify(actualUser));
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

actualUser.set(newUser); -->