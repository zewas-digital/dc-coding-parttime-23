import type { Teamdate } from "$lib/stores/teamStore";
// import { getTeamByID } from "$lib/utils/storageHelpers";
import type { UserDate } from "$lib/stores/teamStore";

type KindOfFeedback = "yes" | "no" | "none";
// let myDate: Teamdate | undefined = undefined;
let myDate: { receivedFeedbacks: Array<{ feedback: boolean | null }> } | null = null;

let allFeedbacks: UserDate[] | [] = [];

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

export function countFeedback(dateID: number, feedback: KindOfFeedback): number {
    console.log("DateID: ", dateID);
    const myDateJSON = localStorage.getItem(dateID.toString());
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
