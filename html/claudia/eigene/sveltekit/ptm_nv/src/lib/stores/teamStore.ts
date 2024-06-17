import { writable } from "svelte/store";
// import type { User } from '$lib/stores/userStore';
export interface UserFeedback {
	userID: number;
	feedback: boolean | null; //null if user hasn't reacted yet, then true or false
}

//TODO: eigener Store for dates and tasks?
export interface DateOrTask{
	dateOrTaskID: number;
	teamID: number,
	dueDate: Date; 
	// dueTime: 
	description: string;
	receivedFeedbacks: UserFeedback[];
	isDone: boolean; //in case of date: automatically when date has passed
}
// export interface Task {
// 	taskID: number;
// 	taskName: string;
// 	dueDate: Date;
// 	isDone: boolean;
// }

export interface Team {
    teamID: number;
    teamName: string;
    allMembers: number[];
    allAdmins: number[];
    allDates: number[];
    allTasks: number[];
    allCoaches: number[];
    allDrivers: number[];
    color: string;
}

export const defaultTeam: Team = {
	teamID: 0,
	teamName: "",
	allMembers: [],
	allAdmins: [],
	allDates: [],
	allTasks: [],
	allCoaches: [],
	allDrivers: [],
	color: "#ffffff" // default color white
};
// // Initialize the team store with default value:

export const currentTeam = writable<Team>(defaultTeam);
// export const allTeams = writable <Team[]>([]); //Zuordnung Team <> teamID

export type TeamUpdates = Partial<Team>;