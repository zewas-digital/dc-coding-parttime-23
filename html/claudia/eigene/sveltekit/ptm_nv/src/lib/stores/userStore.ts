import { writable } from "svelte/store";
import type { Team } from "../utils/testdata";

// Define the types for the user and other states
export interface User {
    email: string;
    accountCreated: boolean;
    loggedIn: boolean;
    password: string;
    userName: string;
    teams: Team[];
    // teams: { teamName: string; isAdmin: boolean }[];
}

// Initialize the user store with null or an empty object
export const currentUser = writable<User | null>(null);

export const started = writable<boolean>(false);
