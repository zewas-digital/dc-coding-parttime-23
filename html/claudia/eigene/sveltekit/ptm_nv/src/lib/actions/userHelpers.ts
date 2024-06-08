import type { User } from '$lib/stores/userStore';
import { currentUser, defaultUser } from '$lib/stores/userStore';
import { get } from 'svelte/store';  // Import `get` for synchronous store access


// export function getNewUserID(): number {
//     // console.log("function newTeamID");
//     const lastUsedUserID = localStorage.getItem("lastUsedUserID"); //Key and Value are Strings!
//     // console.log("lastUsedTeamID", lastUsedTeamID);

//     if (!lastUsedUserID) { //no user exists
//         if (typeof window !== "undefined")
//             localStorage.setItem("lastUsedUserID", "1");
//         return 1; //then next team is the first one to be created
//     }
//     else {
//         const newUserID = parseInt(lastUsedUserID) + 1;
//         if (typeof window !== "undefined")
//             localStorage.setItem("lastUsedUserID", newUserID.toString());
//         return newUserID;
//     }
// }

// Define the type for the updates parameter
type UserUpdates = Partial<User>;

// Function to update the user
export function updateUser(updates: UserUpdates): User | null {
    // Synchronously get the current user value
    let user = get(currentUser);
    console.log("updateUser", updates);
    // Check if the user exists before proceeding
    if (!user) {
        console.error('No user is currently logged in.');
        return null;
    }

    // Create a new updated user object
    const updatedUser: User = { ...user, ...updates };

    // Save the updated user object to localStorage
    console.log("****** UpdateUser schreibt in Local Storage! **************");
    localStorage.setItem(updatedUser.userID.toString(), JSON.stringify(updatedUser));
    localStorage.setItem(updatedUser.email, updatedUser.userID.toString());

    // Update the Svelte store with the new user object
    currentUser.set(updatedUser);

    // Log the updated user for debugging purposes
    console.log("UpdateUser beendet, updatedUser: ", updatedUser);

    return updatedUser;
}
// Function to initialize the user
export async function initializeUser(email: string): Promise<void> {
    // export async function initializeUser(userID: number): Promise<void> {
    console.log("Initialize USER! ---------------");
    // Retrieve user data from localStorage
    let userData;
    const userID = localStorage.getItem(email);
    if (userID) {
        userData = localStorage.getItem(userID);
    }

    if (userData) {

        const parsedUserData: User = JSON.parse(userData);
        // Set currentUser with the retrieved data and set loggedIn to false
        currentUser.set({ ...parsedUserData, loggedIn: false });
    } else {
        // Define an empty user object with default values
        // const emptyUser: User = {

        //     email: email,
        //     accountCreated: false,
        //     loggedIn: false,
        //     password: "",
        //     userName: "",
        //     memberships: [],
        // };
        // Set currentUser with the empty user object
        currentUser.set(defaultUser);
    }

    // Debugging logs

    // console.log("currentUser ", currentUser);
    // console.log("Email:; ", email);
    // console.log("currentUser: ", currentUser);
    // console.log("Initialize fertig! ------------------------");
}