<script lang="ts">
	import { goto } from "$app/navigation";
	import { currentUser } from "$lib/stores/userStore";
  import { currentTeam, defaultTeam } from "$lib/stores/teamStore";
    
	
    

    function goToMyTeams() {
   console.log("Fct goto my Teams: ******************************")
   console.log("currentUser: ", $currentUser);
currentTeam.set(defaultTeam);
    goto(`/myteams`);
 
  }


</script>


<button on:click={goToMyTeams}>Zur Übersicht!</button>