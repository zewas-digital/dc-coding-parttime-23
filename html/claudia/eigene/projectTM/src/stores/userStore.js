import { writable } from "svelte/store";

// Initialize the user store with null or an empty object
export const currentUser = writable(null);
// export const started = writable(false);

// $: actualUser = userExists ? JSON.parse(localStorage.getItem(email)) : null;



export const started = writable(false);



