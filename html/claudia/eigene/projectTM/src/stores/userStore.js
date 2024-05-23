import { writable } from "svelte/store";

// Initialize the user store with null or an empty object
export const actualUser = writable(null);


// $: actualUser = userExists ? JSON.parse(localStorage.getItem(email)) : null;
