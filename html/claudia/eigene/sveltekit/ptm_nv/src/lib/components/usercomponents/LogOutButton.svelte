<script lang="ts">
	import { goto } from "$app/navigation";
	import { updateCurrentUser } from "$lib/actions/userHelpers.js";
	import { currentTeam, defaultTeam } from "$lib/stores/teamStore";
	import { currentUser, defaultUser, started } from "$lib/stores/userStore.js";
	import { get } from "svelte/store";
    

    function logOut() {
    // console.log("Logout...........................................");
    const currUser = get(currentUser);
    const userFeedbacks = currUser.feedbacks;
    // console.log("userFeedbacks: ", userFeedbacks);
    const updates = { loggedIn: false };
    
    // console.log("currUser before update: ", currUser);

    updateCurrentUser(updates);

    // console.log("currentUser after update: ", get(currentUser).feedbacks);
    
    started.set(false);
    currentUser.set(defaultUser); // Ensure defaultUser has the correct structure
    currentTeam.set(defaultTeam);

    goto("/");
    
    // console.log("Logout complete!....................................");
  }

    
//    function logOut(){
//         console.log("Logout...........................................");
//         // currentUser.set(null);
//         const currUser = get(currentUser);       
//         const updates = {loggedIn: false};
//         // console.log("function logOut, updates: ", updates);
//         console.log("currUser: ", currUser);
        
//         updateCurrentUser(updates);
//         console.log("currentUser hinterher: ", get(currentUser));
//         started.set(false);
//         currentUser.set(defaultUser);
//         currentTeam.set(defaultTeam);
//         // console.log("logout beendet, currentUser: ", currentUser);
//         // console.log("logout beendet, currentTeam: ", currentTeam);
//          goto("/");
//         console.log("Logout beendet!....................................");
//     }


</script>


<button on:click={logOut}>LOGOUT!</button>