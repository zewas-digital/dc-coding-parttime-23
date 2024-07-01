<script lang="ts">
	import { goto } from "$app/navigation";
	import { updateTeam } from "$lib/actions/teamHelpers";
	import { currentTeam } from "$lib/stores/teamStore";
    import { defaultTeam } from "$lib/stores/teamStore";
	import { currentUser } from "$lib/stores/userStore";
    

    
    function handleClick(): void{
       currentTeam.set(defaultTeam);//??? oder beim Seitenaufruf?
       console.log("vor goto newteam, currentUser: ", $currentUser);
        goto("/newteam");

    }
</script>

<button on:click={handleClick}>Neues Team anlegen?</button>
