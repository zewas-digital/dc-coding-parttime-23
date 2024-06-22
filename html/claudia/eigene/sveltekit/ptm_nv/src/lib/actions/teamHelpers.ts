// import type { User } from '$lib/stores/userStore';
// import { currentUser } from '$lib/stores/userStore';
import { get } from 'svelte/store';  // Import `get` for synchronous store access
import type { Team } from '$lib/stores/teamStore';
import { currentTeam } from '$lib/stores/teamStore';
import type { User } from '$lib/stores/userStore';
import type { TeamUpdates } from '$lib/stores/teamStore';


// Define the type for the updates parameter
// type TeamUpdates = Partial<Team>;

export function updateTeam(team: Team, updates: TeamUpdates) {
    const updatedTeam: Team = { ...team, ...updates };
    localStorage.setItem(updatedTeam.teamID.toString(), JSON.stringify(updatedTeam));
}




// Function to update current team
export function updateCurrentTeam(updates: TeamUpdates): Team | null {
    // Synchronously get the current team value
    let team = get(currentTeam);
    // console.log("Current");
    // Check if team exists before proceeding
    if (!team) {
        console.error('No team chosen.');
        return null;
    }

    // Create a new updated team object
    const updatedTeam: Team = { ...team, ...updates };

    // Save the updated tem object to localStorage
    // console.log("****** UpdateTeam schreibt in Local Storage! **************");
    localStorage.setItem(updatedTeam.teamID.toString(), JSON.stringify(updatedTeam));
    
    // Update the Svelte store with the new team object
    currentTeam.set(updatedTeam);

    // console.log("UpdateTeam beendet, updatedTeam: ", updatedTeam);

    return updatedTeam;
}

export function userIsAdmin(myUser: User, myTeam: Team): boolean {
    const myUserID = myUser.userID;
    const myAdmins = myTeam.allAdmins;

    return myAdmins.includes(myUserID);
}