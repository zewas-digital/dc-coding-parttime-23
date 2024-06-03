import { currentUser } from "$lib/stores/userStore.js";
/**
 * @typedef {Object} Team
 * @property {string} teamname - The name of the team
 * @property {boolean} isAdmin - Indicates if the user is an admin of the team
 */
/**
 * @typedef {Object} User
 * @property {string} email
 * @property {boolean} accountCreated
 * @property {boolean} loggedIn
 * @property {string} password
 * @property {string} userName
 * @property {Team[]} teams
 */

/**
 * Function to update the user
 * @param {Partial<User>} updates - Partial user object containing updates
 * @returns {User} - The updated user object
 */
export function updateUser(updates) {
    /** @type {User} */
    let user;

    // Use a subscription to get the current user value
    currentUser.subscribe(value => {
        user = value;
    })();

    // Create a new updated user object
    const updatedUser = { ...user, ...updates };
    
    // Save the updated user object to localStorage
    console.log("****** UpdateUser schreibt in Local Storage! **************");
    localStorage.setItem(user.email, JSON.stringify(updatedUser));

    // Update the Svelte store with the new user object
    currentUser.set(updatedUser);

    // Log the updated user for debugging purposes
    // console.log("UpdateUser beendet, updatedUser: ", updatedUser);

    return updatedUser;
}

/**
 * Function to initialize the user
 * @param {string} email - User's email
 * @returns {Promise<void>}
 */
export async function initializeUser(email) {
    // console.log("Initialize USER! ---------------");

    const userData = JSON.parse(localStorage.getItem(email));
    if (userData) {
        currentUser.set({ ...userData, loggedIn: false }); // Set loggedIn within set
    } else {
        /** @type {User} */
        const emptyUser = {
            email: email,
            accountCreated: false,
            loggedIn: false,
            password: "",
            userName: "",
            teams: [],
        };
        currentUser.set(emptyUser);
    }
    // console.log("currentUser: ", currentUser);
}
