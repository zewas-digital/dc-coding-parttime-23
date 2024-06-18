import type { DateOrTask } from "$lib/stores/teamStore";
// import { getTeamByID } from "$lib/utils/storageHelpers";
import type { UserFeedback } from "$lib/stores/teamStore";
import { getCategory, getTeamByID, getUserByID } from "$lib/utils/storageHelpers";
import { updateTeam } from "./teamHelpers";
import { updateUser } from "./userHelpers";
type KindOfFeedback = "yes" | "no" | "none";
// let allFeedbacks: UserFeedback[] | [] = [];
let allFeedbacks: UserFeedback[] = [];

// let myDate: Teamdate | undefined = undefined;
// let myDate: { receivedFeedbacks: Array<{ feedback: boolean | null }> } | null = null;



// export function countFeedback(dateID: number, feedback: KindOfFeedback): number {

//     const myDateJSON = localStorage.getItem(dateID.toString());
//     if (myDateJSON) {
//         myDate = JSON.parse(myDateJSON);
//     }
//     if (myDate) {
//         const allFeedbacks = myDate.receivedFeedbacks;
//     }
//     let count = 0;

//     switch (feedback) {
//         case "yes":
//             console.log("Zugesagt");
//             allFeedbacks.forEach((userFeedback) => {
//                 if (userFeedback.feedback) count++;
//             });
//             break;
//         case "no":
//             console.log("Abgesagt");
//             allFeedbacks.forEach((userFeedback) => {
//                 if (userFeedback.feedback === false) count++;
//             });
//             break;
//         case "none":
//             console.log("keine Rückmeldung");
//             allFeedbacks.forEach((userFeedback) => {
//                 if (userFeedback.feedback === null) count++;
//             });
//             break;
//         default:
//             console.log("unmöglicher Fehler");
//     }


//     return count;
// }

export function saveDate(newDate: DateOrTask): void {
    const dateID = newDate.dateOrTaskID;
    const teamID = newDate.teamID;
    const myTeam = getTeamByID(teamID.toString());
    const allUserIDs = myTeam?.allMembers; //array of userIDs

    allUserIDs?.forEach(userID => {
        allFeedbacks.push({ userID: userID, feedback: null }); //fill in feedback-array of date

        const myUser = getUserByID(userID.toString());
        if (myUser) { //fill in feedback-array of user
            let myFeedbacks = myUser?.feedbacks;
            myFeedbacks?.push({ dateOrTaskID: dateID, feedback: null });
            updateUser(myUser, { feedbacks: myFeedbacks })
        };

    });
    newDate.receivedFeedbacks = allFeedbacks; //update feedback-array of date with {userID, null} for each member

    let allDates = myTeam?.allDates;
    allDates?.push(dateID);
    if (myTeam) updateTeam(myTeam, {allDates: allDates}); //push dateID into allDates-Array of team
    
    localStorage.setItem(dateID.toString(), JSON.stringify(newDate));
}



export function isDateOrTask(dateOrTaskID: number): string {
    return getCategory(dateOrTaskID.toString());
}

export function countFeedback(dateOrTaskID: number, feedback: KindOfFeedback): number {
    console.log("DateID: ", dateOrTaskID);
    const myDateJSON = localStorage.getItem(dateOrTaskID.toString());
    let myDate: { receivedFeedbacks: Array<{ feedback: boolean | null }> } | null = null;
    if (myDateJSON) {
        myDate = JSON.parse(myDateJSON);
    }

    if (myDate) {
        const allFeedbacks = myDate.receivedFeedbacks;
        let count = 0;

        switch (feedback) {
            case "yes":
                console.log("Zugesagt");
                allFeedbacks.forEach((userFeedback) => {
                    if (userFeedback.feedback) count++;
                });
                break;
            case "no":
                console.log("Abgesagt");
                allFeedbacks.forEach((userFeedback) => {
                    if (userFeedback.feedback === false) count++;
                });
                break;
            case "none":
                console.log("keine Rückmeldung");
                allFeedbacks.forEach((userFeedback) => {
                    if (userFeedback.feedback === null) count++;
                });
                break;
            default:
                console.log("unmöglicher Fehler");
        }

        return count;
    } else {
        console.log("myDate is null");
        return 0; // Return 0 if myDate is null or undefined
    }
}
