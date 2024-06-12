<script lang="ts">
	import { goto } from "$app/navigation";
	import { updateUser } from "$lib/actions/userHelpers.js";
	import { currentTeam, defaultTeam } from "$lib/stores/teamStore";
	import { currentUser, defaultUser, started } from "$lib/stores/userStore.js";
    
    
   function logOut(){
        // console.log("Logout...");
        // currentUser.set(null);
       
        const updates = {loggedIn: false};
        // console.log("function logOut, updates: ", updates);
        // console.log("currentUser: ", currentUser);
        
        updateUser(updates);
        started.set(false);
        currentUser.set(defaultUser);
        currentTeam.set(defaultTeam);
        // console.log("logout beendet, currentUser: ", currentUser);
        // console.log("logout beendet, currentTeam: ", currentTeam);
         goto("/");
        // console.log("... beendet!");
    }


</script>


<button on:click={logOut}>LOGOUT!</button>