import { writable } from "svelte/store";
import type { User } from '$lib/stores/userStore';

//TODO: eigener Store?
export interface Task {
	taskName: string;
	dueDate: Date;
	isDone: boolean;
}

export interface Team {
    teamID: number;
    teamName: string;
    allMembers: User[];
    allAdmins: User[];
    allDates: Date[];
    allTasks: Task[];
    allCoaches: User[];
    allDrivers: User[];
    color: string;
}

const defaultTeam: Team = {
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


// export const started = writable<boolean>(false);
