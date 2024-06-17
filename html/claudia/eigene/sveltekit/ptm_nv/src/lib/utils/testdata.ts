// export interface Membership {
//     teamName: string;
//     isAdmin: boolean;
// }
// import type { Membership } from "../stores/userStore";
import type { User } from "../stores/userStore";
import type { Team } from "$lib/stores/teamStore";
import { getNextID } from "./storageHelpers";
import type { Feedback } from "../stores/userStore";

// import { getNewTeamID } from "$lib/actions/teamHelpers";


export function setTestData() {
    // console.log("Testdaten!");
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
    teamID: getNextID("team"),
    teamName: "Team 1",
    allMembers: [11, 12, 13],
    allAdmins: [11],
	allDates: [],
	allTasks: [],
	allCoaches: [],
	allDrivers: [],
	color: "#ff5733"
}
const team2: Team = {
    teamID: getNextID("team"),
    teamName: "Team 2",
    allMembers: [11, 12, 13],
    allAdmins: [12],
	allDates: [],
	allTasks: [],
	allCoaches: [],
	allDrivers: [],
	color: "#337ab7"
}
const team3: Team = {
    teamID: getNextID("team"),
    teamName: "Team 3",
    allMembers: [13, 14],
    allAdmins: [13],
	allDates: [],
	allTasks: [],
	allCoaches: [],
	allDrivers: [],
	color: "#28a745"
}
const team4: Team = {
    teamID: getNextID("team"),
    teamName: "Team 4",
    allMembers: [13, 14],
    allAdmins: [13],
	allDates: [],
	allTasks: [],
	allCoaches: [],
	allDrivers: [],
	color: "#6f42c1"
}
teams.push(team1, team2, team3, team4);
teams.forEach((team) => {
    if (typeof window !== "undefined"){
        localStorage.setItem(team.teamID.toString(), JSON.stringify(team));
    }
})
///////////////// TESTDATEN TEAM ENDE //////////////////////
   //////////// TESTDATEN USER ////////////////////////////////
    let members: User[] = [];

    const member1: User = {
        userID: getNextID("user"),
        email: 'a@a.com',
        accountCreated: true,
        loggedIn: false,
        password: 'aaa',
        userName: 'Anna',
        memberships: [
            { teamID: 21, isAdmin: true },
            { teamID: 22, isAdmin: false }
        ],
        feedbacks: [],
    };
    const member2: User = {
        userID: getNextID("user"),

        email: 'b@b.com',
        accountCreated: true,
        loggedIn: false,
        password: 'bbb',
        userName: 'Betti',
        memberships: [
            { teamID: 21, isAdmin: false },
            { teamID: 22, isAdmin: true }
        ],
        feedbacks: [],

    };
    const member3: User = {
        userID: getNextID("user"),

        email: 'c@c.com',
        accountCreated: true,
        loggedIn: false,
        password: 'ccc',
        userName: 'Conni',
        memberships: [
            { teamID: 21, isAdmin: false },
            { teamID: 22, isAdmin: false },
            { teamID: 23, isAdmin: true },
            { teamID: 24, isAdmin: true }
        ],
        feedbacks: [],

    };

    const member4: User = {
        userID: getNextID("user"),

        email: 'd@d.com',
        accountCreated: false,
        loggedIn: false,
        password: '',
        userName: '',
        memberships: [
            { teamID: 23, isAdmin: false },
            { teamID: 24, isAdmin: false }
        ],
        feedbacks: [],

    };
    members.push(member1, member2, member3, member4);
    // console.log('Members: ', members);

    members.forEach((member) => {
        // console.log('Schleife localStorage!');
        if (typeof window !== 'undefined') {
            localStorage.setItem(member.userID.toString(), JSON.stringify(member));
            localStorage.setItem(member.email, member.userID.toString());
            
        }
    }); //andersrum: JSON.parse()
///////////////// TESTDATEN USER ENDE //////////////////////




}




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
