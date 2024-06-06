// import type { User } from '$lib/stores/userStore';
// import { currentUser } from '$lib/stores/userStore';
import { get } from 'svelte/store';  // Import `get` for synchronous store access
import type { Team } from '$lib/stores/teamStore';
import { currentTeam } from '$lib/stores/teamStore';


export function getTeamByID(teamIDString: string): Team | null {
    const myTeamJSON = localStorage.getItem(teamIDString);
    if (myTeamJSON === null) {
        return null;
    }
    try {
        const myTeam: Team = JSON.parse(myTeamJSON);
        return myTeam;
    } catch (error) {
        // Handle the case where JSON parsing fails
        console.error("Error parsing team JSON:", error);
        return null;
    }
}



// Define the type for the updates parameter
type TeamUpdates = Partial<Team>;

// Function to update team
export function updateTeam(updates: TeamUpdates): Team | null {
    // Synchronously get the current team value
    let team = get(currentTeam);
    console.log("updateTeam");
    // Check if team exists before proceeding
    if (!team) {
        console.error('No team chosen.');
        return null;
    }

    // Create a new updated tem object
    const updatedTeam: Team = { ...team, ...updates };

    // Save the updated tem object to localStorage
    console.log("****** UpdateTeamschreibt in Local Storage! **************");
    localStorage.setItem(team.teamID.toString(), JSON.stringify(updatedTeam));

    // Update the Svelte store with the new team object
    currentTeam.set(updatedTeam);

      console.log("UpdateTeam beendet, updatedTeam: ", updatedTeam);

    return updatedTeam;
}
// Function to initialize the user
// export async function initializeTeam(email: string): Promise<void> {
//     // console.log("Initialize USER! ---------------");
//     // Retrieve user data from localStorage
//     const userData = localStorage.getItem(email);

//     if (userData) {
        
//         const parsedUserData: User = JSON.parse(userData);
//         // Set currentUser with the retrieved data and set loggedIn to false
//         currentUser.set({ ...parsedUserData, loggedIn: false });
//     } else {
//         // Define an empty user object with default values
//         const emptyUser: User = {
//             email: email,
//             accountCreated: false,
//             loggedIn: false,
//             password: "",
//             userName: "",
//             memberships: [],
//         };
//         // Set currentUser with the empty user object
//         currentUser.set(emptyUser);
//     }

    // Debugging logs
    
    // console.log("currentUser ", currentUser);
    // console.log("Email:; ", email);
    // console.log("currentUser: ", currentUser);
    // console.log("Initialize fertig! ------------------------");
// }