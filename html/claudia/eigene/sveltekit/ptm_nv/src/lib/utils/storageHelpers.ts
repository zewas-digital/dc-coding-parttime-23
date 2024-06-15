import type { Team } from "$lib/stores/teamStore";
import { defaultUser, type User } from "$lib/stores/userStore";

function looseFirstDigit(id: string): string {
    return  id.substring(1);
} 

function addFirstDigit(id: string, category: string): string {
     let firstDigit = "x";
     if (category === "user") firstDigit = "1";
     if (category === "team") firstDigit = "2";
     if (category === "date") firstDigit = "3";
     
    return firstDigit + id;
    }

function addOne(id: string): string {
    let idNumber = parseInt(id) + 1;
    // console.log(idNumber, "idNumber");
    return (idNumber).toString();
}

export function getNextID(category: string): number {
    // console.log("getNextID:", category);
    let key = "";
    let newIDString = "";
    let newID: number;

    if (category === "user") key = "lastUserID";
    if (category === "team") key = "lastTeamID";
    if (category === "date") key = "lastDateID";

    if (typeof window !== "undefined" && key !=="") {
        let lastID = localStorage.getItem(key); //type string or null
        // console.log("lastID ", lastID);
        if (lastID === null) {//then next team or user is the first one
            newID =  parseInt(addFirstDigit("1", category));
        }
        else {
            lastID = looseFirstDigit(lastID);
            newIDString = addOne(lastID);
            newID = parseInt(addFirstDigit(newIDString, category));
        }
        // console.log("newID: ", newID);
        localStorage.setItem(key, newID.toString());
        return newID;
    }
return -1;
}

export function getTeamByID(teamIDString: string): Team | null {
    // console.log("Function getTeamByID! ***************", teamIDString);
    const myTeamJSON = localStorage.getItem(teamIDString);
    // console.log("myTeamJSON: ", myTeamJSON);
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

// export function getUserByEmail(email: string): User {
//     const myUserJSON = localStorage.getItem(email); //userID!
//     // 
//     if (myUserJSON === null) { //dann nichts im LocalStorage
//         return defaultUser;
//     }
//     const myUserID = JSON.parse(myUserJSON);
//     if (myUserID === 0) return defaultUser;
//     return JSON.parse(localStorage.getItem(myUserID));
    
//    }

//function returns existing user or default user
   export function getUserByEmail(email: string): User {
    const myUserJSON = localStorage.getItem(email); // Retrieve userID by email
    if (!myUserJSON) { // If nothing in localStorage, return defaultUser
        return defaultUser;
    }

    const myUserID = JSON.parse(myUserJSON);
    if (typeof myUserID !== 'number' || myUserID === 0) {
        return defaultUser;
    }

    const userJSON = localStorage.getItem(myUserID.toString());
    if (!userJSON) {
        return defaultUser;
    }

    try {
        const user = JSON.parse(userJSON);
        if (typeof user === 'object' && user !== null) {
            return user;
        }
    } catch (error) {
        console.error('Error parsing user data:', error);
    }

    return defaultUser;
}