import { writable } from "svelte/store";
// import type { User } from '$lib/stores/userStore';


//TODO: eigener Store?
export interface Task {
	taskID: number;
	taskName: string;
	dueDate: Date;
	isDone: boolean;
}

export interface Team {
    teamID: number;
    teamName: string;
    allMembers: number[];
    allAdmins: number[];
    allDates: Date[];
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
	color: "#ffffff" // default color, e.g., white
};
// // Initialize the team store with default value:

export const currentTeam = writable<Team>(defaultTeam);
// export const allTeams = writable <Team[]>([]); //Zuordnung Team <> teamID

