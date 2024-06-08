// import type { User } from '$lib/stores/userStore';
// import { currentUser } from '$lib/stores/userStore';
import { get } from 'svelte/store';  // Import `get` for synchronous store access
import type { Team } from '$lib/stores/teamStore';
import { currentTeam } from '$lib/stores/teamStore';


//let teamIDs start with 2, so first regular teamID is 21
// export function getNewTeamID(): number {
//     // console.log("function newTeamID");
//     const lastUsedTeamID = localStorage.getItem("lastUsedTeamID"); //Key and Value are Strings!
//     // console.log("lastUsedTeamID", lastUsedTeamID);
    
//     if (!lastUsedTeamID) { //no team exists
//         if (typeof window !== "undefined")
//             localStorage.setItem("lastUsedTeamID", "1");
//         return 1; //then next team is the first one to be created
//     }
//     else {
//         const newTeamID = parseInt(lastUsedTeamID) + 1;
//         if (typeof window !== "undefined")
//             localStorage.setItem("lastUsedTeamID", newTeamID.toString());
//         return newTeamID;
//     }
// }





// Define the type for the updates parameter
// type TeamUpdates = Partial<Team>;

// Function to update team
export function updateTeam(updates: Partial<Team>): Team | null {
    // Synchronously get the current team value
    let team = get(currentTeam);
    // console.log("updateTeam");
    // Check if team exists before proceeding
    if (!team) {
        console.error('No team chosen.');
        return null;
    }

    // Create a new updated team object
    const updatedTeam: Team = { ...team, ...updates };

    // Save the updated tem object to localStorage
    console.log("****** UpdateTeam schreibt in Local Storage! **************");
    localStorage.setItem(updatedTeam.teamID.toString(), JSON.stringify(updatedTeam));
    
    // Update the Svelte store with the new team object
    currentTeam.set(updatedTeam);

    console.log("UpdateTeam beendet, updatedTeam: ", updatedTeam);

    return updatedTeam;
}
