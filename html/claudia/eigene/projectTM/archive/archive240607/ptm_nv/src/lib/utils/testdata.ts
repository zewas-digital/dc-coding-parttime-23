// export interface Membership {
//     teamName: string;
//     isAdmin: boolean;
// }
// import type { Membership } from "../stores/userStore";
import type { User } from "../stores/userStore";
import type { Team } from "$lib/stores/teamStore";


import { getNewTeamID } from "$lib/actions/teamHelpers";


export function setTestData() {
    console.log("Testdaten!");
    //TESTDATEN: ////////////////////////////////////////////////////////

    //localStorage is not defined on server!
    if (typeof window !== 'undefined') {
        // This code will only run in the browser
        localStorage.clear();
    }
    // const lastUsedTeamID = initializeLastUsedTeamID(); //set to 0 as long as LS is cleared
///////////////// TESTDATEN TEAM ///////////////////////////
let teams: Team[] = [];
const team1: Team = {
    teamID: getNewTeamID(),
    teamName: "Team 1",
    allMembers: [],
    allAdmins: [],
	allDates: [],
	allTasks: [],
	allCoaches: [],
	allDrivers: [],
	color: "#ff5733"
}
const team2: Team = {
    teamID: getNewTeamID(),
    teamName: "Team 2",
    allMembers: [],
    allAdmins: [],
	allDates: [],
	allTasks: [],
	allCoaches: [],
	allDrivers: [],
	color: "#337ab7"
}
const team3: Team = {
    teamID: getNewTeamID(),
    teamName: "Team 3",
    allMembers: [],
    allAdmins: [],
	allDates: [],
	allTasks: [],
	allCoaches: [],
	allDrivers: [],
	color: "#28a745"
}
const team4: Team = {
    teamID: getNewTeamID(),
    teamName: "Team 4",
    allMembers: [],
    allAdmins: [],
	allDates: [],
	allTasks: [],
	allCoaches: [],
	allDrivers: [],
	color: "#6f42c1"
}
teams.push(team1, team2, team3, team4);
teams.forEach((team) => {
    if (typeof window !== "undefined"){
        localStorage.setItem("Team" + team.teamID, JSON.stringify(team));
    }
})
///////////////// TESTDATEN TEAM ENDE //////////////////////
   //////////// TESTDATEN USER ////////////////////////////////
    let members: User[] = [];

    const member1: User = {
        email: 'a@a.com',
        accountCreated: true,
        loggedIn: false,
        password: 'aaa',
        userName: 'Anna',
        memberships: [
            { team: team1, isAdmin: true },
            { team: team2, isAdmin: false }
        ]
    };
    const member2: User = {
        email: 'b@b.com',
        accountCreated: true,
        loggedIn: false,
        password: 'bbb',
        userName: 'Betti',
        memberships: [
            { team: team1, isAdmin: false },
            { team: team2, isAdmin: true }
        ]
    };
    const member3: User = {
        email: 'c@c.com',
        accountCreated: true,
        loggedIn: false,
        password: 'ccc',
        userName: 'Conni',
        memberships: [
            { team: team1, isAdmin: false },
            { team: team2, isAdmin: false },
            { team: team3, isAdmin: true },
            { team: team4, isAdmin: true }
        ]
    };

    const member4: User = {
        email: 'd@d.com',
        accountCreated: false,
        loggedIn: false,
        password: '',
        userName: '',
        memberships: [
            { team: team3, isAdmin: false },
            { team: team4, isAdmin: false }
        ]
    };
    members.push(member1, member2, member3, member4);
    // console.log('Members: ', members);

    members.forEach((member) => {
        // console.log('Schleife localStorage!');
        if (typeof window !== 'undefined') {
            localStorage.setItem(member.email, JSON.stringify(member));
        }
    }); //andersrum: JSON.parse()
///////////////// TESTDATEN USER ENDE //////////////////////


}

// function initializeLastUsedTeamID(): number {
// 	const lastUsedTeamID = localStorage.getItem('lastUsedTeamID');
// 	if (lastUsedTeamID === null) {
// 		localStorage.setItem('lastUsedTeamID', '0');
// 		return 0;
// 	}
// 	return parseInt(lastUsedTeamID, 10);
// }

// const lastUsedTeamID = initializeLastUsedTeamID();

// function getNewTeamID(): number {
// 	const lastUsedTeamID = localStorage.getItem('lastUsedTeamID');
// 	if (lastUsedTeamID === null) {
// 		throw new Error('Last used team ID is not initialized');
// 	}
// 	const newTeamID = parseInt(lastUsedTeamID, 10) + 1;
// 	localStorage.setItem('lastUsedTeamID', newTeamID.toString());
// 	return newTeamID;
// // }
// function createNewTeam(teamName: string, color: string): Team {
// 	const newTeamID = getNewTeamID();
// 	const newTeam: Team = {
// 		teamID: newTeamID,
// 		teamName: teamName,
// 		allMembers: [],
// 		allAdmins: [],
// 		allDates: [],
// 		allTasks: [],
// 		allCoaches: [],
// 		allDrivers: [],
// 		color: color
// 	};
// 	localStorage.setItem(`team_${newTeamID}`, JSON.stringify(newTeam));
// 	return newTeam;
// }

// // Example usage: create a new team
// const newTeam = createNewTeam('My New Team', '#ff0000');
// currentTeam.set(newTeam);










//Testausgabe: 
    // if (typeof window !== "undefined") {
    //     for (let i = 0; i < localStorage.length; i++) {
    //         const key = localStorage.key(i);
    //         if (key) {  // Check if key is not null
    //             const item = localStorage.getItem(key);
    //             if (item) {  // Check if item is not null
    //                 const user: Member = JSON.parse(item);
    //                 // console.log("User aus ls: ", user);
    //             }
    //         }
    //     }
    // }
// }
