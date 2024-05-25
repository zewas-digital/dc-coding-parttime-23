import { actualUser } from "../stores/userStore.js";


export function updateUser(){

}


export async function initializeUser(email) {
    console.log("Initialize USER! ---------------");
    console.log("ActualUser ", actualUser);
    console.log("Email:; ", email);

    
    const userData = JSON.parse(localStorage.getItem(email));
    if (userData) {
      actualUser.set({ ...userData, loggedIn: false }); // Set loggedIn within set
    }
    else {
        const emptyUser = {
            email: "",
            accountCreated: false,
            loggedIn: false,
            password: "",
            userName: "",
            teams: [],
          };
          actualUser.set(emptyUser);
    }
    console.log("actualUser: ", actualUser);
    // console.log("Initialize fertig! ------------------------");
  }



  export function updateUser(user, updates) {
    return { ...user, ...updates };
}


{/* <script>
    import { updateUser } from './utils.js';

    let member1 = {
        email: "a@a.com",
        accountCreated: true,
        loggedIn: false,
        password: "aaa",
        userName: "Anna",
        teams: [
            { teamName: "Team A", isAdmin: true },
            { teamName: "Team B", isAdmin: false },
        ],
    };

    // Function to handle the update
    function handleUpdateUser() {
        // Example update: changing userName and loggedIn status
        member1 = updateUser(member1, {
            userName: "Annabelle",
            loggedIn: true
        });
    }
</script>

<button on:click={handleUpdateUser}>Update User</button>

<p>User Name: {member1.userName}</p>
<p>Logged In: {member1.loggedIn}</p> */}
