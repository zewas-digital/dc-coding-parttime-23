<script lang="ts">
	import { goto } from "$app/navigation";
	import { currentUser } from "$lib/stores/userStore";
    
	
    

    function goToMyTeams() {
   console.log("Fct goto my Teams: ******************************")
   console.log("currentUser: ", $currentUser);

    goto(`/myteams`);
 
  }


</script>


<button on:click={goToMyTeams}>Zur Übersicht!</button>