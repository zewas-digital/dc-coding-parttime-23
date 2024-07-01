import { currentUser } from "$lib/stores/userStore";

// Define the User type
interface User {
    email: string;
    accountCreated: boolean;
    loggedIn: boolean;
    password: string;
    userName: string;
    teams: any[];
}

export function updateUser(updates: Partial<User>) {
    let user: User | null = null;

    const unsubscribe = currentUser.subscribe(value => {
        user = value || null; // Handle case when value is undefined
    });

    unsubscribe();

    if (user) {
        const updatedUser: User = { ...user, ...updates };

        // Save the updated user object to localStorage
        console.log("****** UpdateUser writes to Local Storage! **************");
        localStorage.setItem(user.email, JSON.stringify(updatedUser));

        // Update the Svelte store with the new user object
        currentUser.set(updatedUser);

        // Log the updated user for debugging purposes
        console.log("UpdateUser completed, updatedUser: ", updatedUser);

        return updatedUser;
    } else {
        console.error("User data is null or undefined");
        return null;
    }
}

export async function initializeUser(email: string) {
    const userData = JSON.parse(localStorage.getItem(email) || "null");

    if (userData) {
        currentUser.set({ ...userData, loggedIn: false }); // Set loggedIn within set
    } else {
        const emptyUser: User = {
            email: email,
            accountCreated: false,
            loggedIn: false,
            password: "",
            userName: "",
            teams: [],
        };
        currentUser.set(emptyUser);
    }
}
