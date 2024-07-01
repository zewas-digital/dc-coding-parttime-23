<script>
	import { goto } from "$app/navigation";


    import NewTeam from "$lib/components/teamcomponents/NewTeam.svelte";
	import { currentTeam, defaultTeam } from "$lib/stores/teamStore";

    import { currentUser } from "$lib/stores/userStore";
	import { onMount } from "svelte";
    
	
    
    onMount(() => {
		if (!$currentUser?.loggedIn) goto(`/`); 
	});

    
    currentTeam.set(defaultTeam);

</script>


<!-- <h1>new Team</h1> -->


<NewTeam />