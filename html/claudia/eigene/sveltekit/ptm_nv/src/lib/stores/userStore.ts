import { writable } from "svelte/store";

// Define the types for the user and other states

export interface Membership {
    teamID: number;
    isAdmin: boolean;
}

export interface User {
    userID: number;
    email: string;
    accountCreated: boolean;
    loggedIn: boolean;
    password: string;
    userName: string;
    memberships: Membership[];
    
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
// export const currentUser = writable<User | null>(null); // !!!!!!!!!!!!!!12.06.!!!
export const currentUser = writable<User>(defaultUser);

export const started = writable<boolean>(false);
//https://www.typescriptlang.org/docs/handbook/utility-types.html
//Partial <Type> constructs a type with all properties of Type set to optional;
//returns a type that represents all subsets of given type
export type UserUpdates = Partial<User>;
