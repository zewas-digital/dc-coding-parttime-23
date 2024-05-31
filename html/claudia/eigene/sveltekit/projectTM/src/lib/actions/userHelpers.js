
import { currentUser } from "$lib/stores/userStore";


export function updateUser(updates) {
    
    let user;

    
    const unsubscribe = currentUser.subscribe(value => {
        user = value;
    });

    unsubscribe();

    // Create a new updated user object
    const updatedUser = { ...user, ...updates };
    
    // Save the updated user object to localStorage
    console.log("****** UpdateUser schreibt in Local Storage! **************");
    localStorage.setItem(user.email, JSON.stringify(updatedUser));

    // Update the Svelte store with the new user object
    currentUser.set(updatedUser);

    // Log the updated user for debugging purposes
    // console.log("UpdateUser beendet, updatedUser: ", updatedUser);

    return updatedUser;
}




// export function updateUser(updates) {
    
//     let user;
//     currentUser.subscribe(value => {
//         user = value;
//     })();
//     console.log("UpdateUser, currentUser: ", currentUser);
//     // Create a new updated user object
//     const updatedUser = { ...user, ...updates };

//     // Save the updated user object to localStorage
//     localStorage.setItem(user.email, JSON.stringify(updatedUser));
//     currentUser.set(updateUser);
//     // Update the Svelte store
//     // setStore(updatedUser);

//     // return updatedUser;
//     console.log("Ende UpdateUser, currentUser: ", currentUser);
// }

/*
     // Get the current user value
    let currentUser;
    actualUser.subscribe(value => {
        currentUser = value;
    })();

    // Create a new updated user object
    const updatedUser = { ...currentUser, ...updates };

    // Save the updated user object to localStorage
    localStorage.setItem('actualUser', JSON.stringify(updatedUser));

    // Update the Svelte store
    actualUser.set(updatedUser);

    return updatedUser;
 */




// export function updateUser(currentUser, updates) {
//     console.log("updateUser, currentUser: ", currentUser);
//     const newUserData = { ...currentUser, updates};
//     console.log("Updates: ",updates);
//     currentUser.set(newUserData);
//     localStorage.setItem(currentUser.email, JSON.stringify(currentUser));
// }

export async function initializeUser(email) {
    // console.log("Initialize USER! ---------------");
    // console.log("currentUser ", currentUser);
    // console.log("Email:; ", email);

    
    const userData = JSON.parse(localStorage.getItem(email));
    if (userData) {
      currentUser.set({ ...userData, loggedIn: false }); // Set loggedIn within set
    }
    else {
        const emptyUser = {
            email: email,
            accountCreated: false,
            loggedIn: false,
            password: "",
            userName: "",
            teams: [],
          };
          currentUser.set(emptyUser);
    }
    // console.log("currentUser: ", currentUser);
    // console.log("Initialize fertig! ------------------------");
  }







{/* <script>
    import { actualUser } from './stores.js';
    import { updateUser } from './utils.js';

    // Local reactive variable to hold the current user data
    let user;
    actualUser.subscribe(value => {
        user = value;
    });

    function handleUpdateUser() {
        // Example update: changing loggedIn status
        const updates = { loggedIn: true };

        // Update the user, save to localStorage, and update the store
        updateUser(user, updates, actualUser.set);
    }
</script> */}











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



