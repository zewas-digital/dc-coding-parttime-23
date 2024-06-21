import type { User, UserUpdates } from '$lib/stores/userStore';
import { currentUser, defaultUser } from '$lib/stores/userStore';
import { getDateByID, getNextID, getTeamByID } from '$lib/utils/storageHelpers';
import { get } from 'svelte/store';  // Import `get` for synchronous store access
import type { Team } from '$lib/stores/teamStore';
import { updateCurrentTeam, updateTeam } from './teamHelpers';

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

export function updateMembershipsOfUser(user: User, teamID: number, isAdmin: boolean): UserUpdates {
    //Step 1: if isAdmin, add userID to list of admins:
    const myTeam = getTeamByID(teamID.toString());
    if (myTeam && isAdmin) {

        let allAdmins = myTeam.allAdmins;
        if (!allAdmins?.includes(user.userID)) {
            allAdmins?.push(user.userID);
            updateTeam(myTeam, { allAdmins: allAdmins });
        }
    }
    //Step 2: check memberships of user, add teamID if necessary
    const myMemberships = user.memberships;
    let found = false;


    //     let someArray = [1, "string", false];
    // for (let entry of someArray) {
    //   console.log(entry); // 1, "string", false
    // }
    for (let membership of myMemberships) {
        console.log("überprüfe membership", membership)
        if (!found && membership.teamID === teamID) {
            membership.isAdmin = isAdmin;
            // myTeam?.allAdmins.push(user.userID);
            found = true;
            console.log("gefunden");
        }

    }
    if (!found) {
        console.log("nicht gefunden");
        myMemberships.push({ teamID: teamID, isAdmin: isAdmin });
    }

    const userupdates = { memberships: myMemberships };
    console.log("Userupdates: ", userupdates);
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

export function hasNullFeedback(user: User): boolean {
    return user.feedbacks.some(feedback => feedback.feedback === null);
}

export function numberOfMissingFeedbacks(user: User, team: Team): number {
    let count = 0;
    //all dates of the chosen team:
    const allTeamDateIDs = team?.allDates;
    allTeamDateIDs.forEach((tdID) => {
        const myDate = getDateByID(tdID.toString());
        const allFeedbacks = myDate?.receivedFeedbacks || [];
        
        allFeedbacks.forEach((fb) => {
            if (fb.userID === user.userID) {
                count++;
            }
        });

    });





    return count;
}