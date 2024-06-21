import type { DateOrTask, DateOrTaskUpdates } from "$lib/stores/teamStore";
// import { getTeamByID } from "$lib/utils/storageHelpers";
import type { UserFeedback } from "$lib/stores/teamStore";
import { getCategory, getTeamByID, getUserByID } from "$lib/utils/storageHelpers";
import { updateTeam } from "./teamHelpers";
import { updateUser } from "./userHelpers";
type KindOfFeedback = "yes" | "no" | "none";
import type { User } from "$lib/stores/userStore";
// let allFeedbacks: UserFeedback[] | [] = [];
// let allFeedbacks: UserFeedback[] = [];

// let myDate: Teamdate | undefined = undefined;
// let myDate: { receivedFeedbacks: Array<{ feedback: boolean | null }> } | null = null;


//function to test if given user has been invited/included to date
//some-method returns true if any of the entries fulfills condition
// export function userInvited(feedbacks: UserFeedback[], userID: number): boolean {
export function userInvited(myDate: DateOrTask, myUser: User): boolean {
    const feedbacks = myDate.receivedFeedbacks;
    const userID = myUser.userID;

    if (!Array.isArray(feedbacks)) {
        return false;
    }

    return feedbacks.some(fb => fb.userID === userID);
}
export function updateDate(date: DateOrTask, updates: DateOrTaskUpdates): void {
    const updatedDate: DateOrTask = { ...date, ...updates};
    localStorage.setItem(updatedDate.dateOrTaskID.toString(), JSON.stringify(updateDate));
}
export function saveFeedback(): void {

}

export function saveDate(newDate: DateOrTask): void {
    let allFeedbacks: UserFeedback[] = [];
    //TODO: Sort Dates!     dates.sort((a, b) => a.getTime() - b.getTime());
    // console.log("saveDate, Feedbacks am Anfang: ", newDate.receivedFeedbacks);
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
    // console.log("saveDate, Feedbacks in der Mitte: ");
    // console.log(allFeedbacks);
    // console.log("newDate", newDate);

    let allDates = myTeam?.allDates;
    allDates?.push(dateID);
    if (myTeam) updateTeam(myTeam, {allDates: allDates}); //push dateID into allDates-Array of team
    
    localStorage.setItem(dateID.toString(), JSON.stringify(newDate));
}



export function isDateOrTask(dateOrTaskID: number): string {
    return getCategory(dateOrTaskID.toString());
}



export function countFeedback(dateOrTaskID: number, feedback: KindOfFeedback): number {
    // console.log("DateID: ", dateOrTaskID);
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
                // console.log("Zugesagt");
                allFeedbacks.forEach((userFeedback) => {
                    if (userFeedback.feedback) count++;
                });
                break;
            case "no":
                // console.log("Abgesagt");
                allFeedbacks.forEach((userFeedback) => {
                    if (userFeedback.feedback === false) count++;
                });
                break;
            case "none":
                // console.log("keine Rückmeldung");
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
	// Function to format the date
	export function formatDate(myDate: Date): string {
		const when = new Date(myDate);
		return when.toLocaleDateString();
	}

	// Function to format the time
	export function formatTime(myDate: Date): string {
		const when = new Date(myDate);

		return when.toLocaleTimeString();
	}