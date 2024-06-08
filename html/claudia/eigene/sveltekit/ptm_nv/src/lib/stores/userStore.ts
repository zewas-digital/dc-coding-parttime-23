import { writable } from "svelte/store";
// import type { Team } from "$lib/stores/teamStore";
// import type { Membership } from "../utils/testdata";
//TODO export mit default value? vgl. teamStore!
// Define the types for the user and other states
export interface User {
    userID: number;
    email: string;
    accountCreated: boolean;
    loggedIn: boolean;
    password: string;
    userName: string;
    memberships: Membership[];
    
}

export interface Membership {
    teamID: number;
    isAdmin: boolean;
}

export const defaultUser: User = {
    userID: 0,
    email: "",
    accountCreated: false,
    loggedIn: false,
    password: "",
    userName: "",
    memberships: [],
}

// Initialize the user store with null or an empty object
export const currentUser = writable<User | null>(null);

export const started = writable<boolean>(false);
