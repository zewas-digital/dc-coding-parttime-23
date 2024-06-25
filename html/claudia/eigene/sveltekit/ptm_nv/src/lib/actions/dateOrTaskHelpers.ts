import type { DateOrTask, DateOrTaskUpdates } from "$lib/stores/teamStore";
// import { getTeamByID } from "$lib/utils/storageHelpers";
import type { UserFeedback } from "$lib/stores/teamStore";
import { getCategory, getTeamByID, getUserByID } from "$lib/utils/storageHelpers";
import { updateTeam } from "./teamHelpers";
import { updateCurrentUser, updateUser } from "./userHelpers";
type KindOfFeedback = "yes" | "no" | "none";
import { currentUser, type User } from "$lib/stores/userStore";
import { get } from "svelte/store";
// let allFeedbacksOfDate: UserFeedback[] | [] = [];
// let allFeedbacksOfDate: UserFeedback[] = [];

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

//function to test if given date belongs to user
export function dateOfUser(myDate: DateOrTask, myUser: User): boolean {
    const dateID = myDate.dateOrTaskID;
    const feedbacks = myUser.feedbacks;

    if (!Array.isArray(feedbacks)) {
        return false;
    }
    return feedbacks.some(fb => fb.dateOrTaskID === dateID);
}

export function updateDate(date: DateOrTask, updates: DateOrTaskUpdates): void {
    // console.log("Fct updateDate, updates: ", updates);
    const updatedDate: DateOrTask = { ...date, ...updates};
    // console.log("updated Date: ", updatedDate);
    localStorage.setItem(updatedDate.dateOrTaskID.toString(), JSON.stringify(updatedDate));
}
export function updateFeedbacksOfDate( myDate: DateOrTask, userID: number, feedback: boolean): DateOrTaskUpdates {
    // Find userID in all feedbacks to given date
    const userfeedbacks = myDate.receivedFeedbacks;
    const fb = userfeedbacks.find((fb) => fb.userID === userID);

    // If item is found, update its boolean value
    if (fb) fb.feedback = feedback;
    
    const dateupdates = {receivedFeedbacks: userfeedbacks};
    return dateupdates;
}

export function saveDate(newDate: DateOrTask): void {
    console.log("FKT saveDate: *********************************");
    let allFeedbacksOfDate: UserFeedback[] = [];
    //TODO: Sort Dates!     dates.sort((a, b) => a.getTime() - b.getTime());
    // console.log("*********************saveDate, Date-Feedbacks am Anfang: ", newDate.receivedFeedbacks);
    const dateID = newDate.dateOrTaskID;
    const teamID = newDate.teamID;
    const myTeam = getTeamByID(teamID.toString());
    const allUserIDs = myTeam?.allMembers; //array of userIDs
    const currUser = get(currentUser); 
    console.log("currentUser: ", currUser);
    // console.log("AllUsers: ", allUserIDs);
    allUserIDs?.forEach(userID => {
        allFeedbacksOfDate.push({ userID: userID, feedback: null }); //fill in feedback-array of date

        // console.log("Fct saveDate, feedbacks of user ", userID);
        const myUser = getUserByID(userID.toString());
        console.log("curr ist gleich  myUser? ", currUser === myUser);

        // console.log("myUser.feedbacks: ", myUser?.feedbacks);
        if (myUser) { //fill in feedback-array of user
            // console.log("if-Condition user: ", myUser.userID, " ++++++++++++++++")
            let myFeedbacks = myUser?.feedbacks;
            console.log("Feedbacks am Anfang: ", myFeedbacks);
            myFeedbacks?.push({ dateOrTaskID: dateID, feedback: null });
            console.log("Feedbacks am Ende: ", myFeedbacks);
            if (!myUser.loggedIn) updateUser(myUser, { feedbacks: myFeedbacks });
            if (myUser.loggedIn) {
                updateCurrentUser({feedbacks: myFeedbacks});
                console.log("???????????? currentUser? ", get(currentUser));
            }
            // console.log("if-Ende (das sollte das gleiche sein): ", myUser.feedbacks);
        };

    });
    
    newDate.receivedFeedbacks = allFeedbacksOfDate; //update feedback-array of date with {userID, null} for each member
    // console.log("saveDate, Feedbacks in der Mitte: ");
    // console.log(allFeedbacksOfDate);
    // console.log("newDate", newDate);

    let allDates = myTeam?.allDates;
    allDates?.push(dateID);
    if (myTeam) updateTeam(myTeam, {allDates: allDates}); //push dateID into allDates-Array of team
    
    localStorage.setItem(dateID.toString(), JSON.stringify(newDate));
    console.log("FKT saveDate ENDE, currentUser:  ");

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
        const allFeedbacksOfDate = myDate.receivedFeedbacks;
        let count = 0;

        switch (feedback) {
            case "yes":
                // console.log("Zugesagt");
                allFeedbacksOfDate.forEach((userFeedback) => {
                    if (userFeedback.feedback) count++;
                });
                break;
            case "no":
                // console.log("Abgesagt");
                allFeedbacksOfDate.forEach((userFeedback) => {
                    if (userFeedback.feedback === false) count++;
                });
                break;
            case "none":
                // console.log("keine Rückmeldung");
                allFeedbacksOfDate.forEach((userFeedback) => {
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
        const options: Intl.DateTimeFormatOptions = { hour: "2-digit", minute: "2-digit" };
        const when = new Date(myDate);
    
        return when.toLocaleTimeString(undefined, options);
    }
    

    