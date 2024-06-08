<script>
	import { goto } from "$app/navigation";
	import ListOfTeams from "$lib/components/teamcomponents/ListOfTeams.svelte";
	import { currentUser } from "$lib/stores/userStore";
	import { onMount } from "svelte";
	
    
    onMount(() => {
		if (!$currentUser?.loggedIn) goto(`/`); 
	});
</script>

{#if $currentUser}
<h2>Hallo {$currentUser.userName}!</h2>
{/if}

<h1>My Teams</h1>
<ListOfTeams />