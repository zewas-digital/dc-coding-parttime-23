import { writable } from "svelte/store";
import type { Team } from "$lib/stores/teamStore";
// import type { Membership } from "../utils/testdata";
//TODO export mit default value? vgl. teamStore!
// Define the types for the user and other states
export interface User {
    email: string;
    accountCreated: boolean;
    loggedIn: boolean;
    password: string;
    userName: string;
    memberships: Membership[];
    
}

export interface Membership {
    
    team: Team;
    isAdmin: boolean;
}


// Initialize the user store with null or an empty object
export const currentUser = writable<User | null>(null);

export const started = writable<boolean>(false);
