<script>
	import ListOfTeams from "$lib/components/teamcomponents/ListOfTeams.svelte";
	import { currentUser } from "$lib/stores/userStore";
    
    
</script>

{#if $currentUser}
<h2>Hallo {$currentUser.userName}!</h2>
{/if}

<h1>My Teams</h1>
<ListOfTeams />