import type { User, UserUpdates } from '$lib/stores/userStore';
import { currentUser, defaultUser } from '$lib/stores/userStore';
import { getNextID } from '$lib/utils/storageHelpers';
import { get } from 'svelte/store';  // Import `get` for synchronous store access


// Define the type for the updates parameter
// type UserUpdates = Partial<User>;


// export function createUser(updates: UserUpdates): void {
//     const newMembership = {teamID: updates.teamID, idAdmin: updates.isAdmin}
//     const newUser = {
//         userID: getNextID("user"),
//         email: updates.email,
//         accountCreated: false,
//         loggedIn: false,
//         password: "",
//         userName: "",
//         memberships: [],
//     };

//     // const newUser: User = { ...d}
// }


export function updateUser(user: User, userupdates: UserUpdates) {
    const updatedUser: User = { ...user, ...userupdates };
    localStorage.setItem(updatedUser.userID.toString(), JSON.stringify(updatedUser));
    localStorage.setItem(updatedUser.email, updatedUser.userID.toString());
}
//TODO: Überprüfen!
export function updateMembershipsOfUser(user: User, teamID: number, isAdmin: boolean): UserUpdates{
    const myMemberships = user.memberships;
    let found = false;
//     let someArray = [1, "string", false];
// for (let entry of someArray) {
//   console.log(entry); // 1, "string", false
// }
    for (let membership of myMemberships){
        if (!found && membership.teamID === teamID){
            membership.isAdmin = isAdmin;
            found = true;
            }
    }
    if (!found) myMemberships.push({teamID: teamID, isAdmin: isAdmin});

    const userupdates = {memberships: myMemberships};
    return userupdates;
    // updateUser(user, userupdates);
}

// export function saveUserData(user: User, userupdates: UserUpdates): void{
//     const updatedUser: User = { ...user, ...userupdates};
//     localStorage.setItem(updatedUser.userID.toString(), JSON.stringify(updatedUser));
//     localStorage.setItem(updatedUser.email, updatedUser.userID.toString());
// }

// Function to update the currentUser
export function updateCurrentUser(updates: UserUpdates): User | null {
    // Synchronously get the current user value
    let user = get(currentUser);
    // console.log("updateCurrentUser", updates);
    // Check if the user exists before proceeding
    if (!user) {
        console.error('No user is currently logged in.');
        return null;
    }

    // Create a new updated user object
    const updatedUser: User = { ...user, ...updates };

    // Save the updated user object to localStorage
    // console.log("****** UpdateUser schreibt in Local Storage! **************");
    localStorage.setItem(updatedUser.userID.toString(), JSON.stringify(updatedUser));
    localStorage.setItem(updatedUser.email, updatedUser.userID.toString());

    // Update the Svelte store with the new user object
    currentUser.set(updatedUser);

    // Log the updated user for debugging purposes
    // console.log("UpdateUser beendet, updatedUser: ", updatedUser);

    return updatedUser;
}
// Function to initialize the currentUser
export async function initializeUser(email: string): Promise<void> {
    // export async function initializeUser(userID: number): Promise<void> {
    // console.log("Initialize USER! ---------------");
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

        currentUser.set(defaultUser);
    }

    // Debugging logs

    // console.log("currentUser ", currentUser);
    // console.log("Email:; ", email);
    // console.log("currentUser: ", currentUser);
    // console.log("Initialize fertig! ------------------------");
}