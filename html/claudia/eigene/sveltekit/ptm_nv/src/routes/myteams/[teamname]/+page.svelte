<script lang="ts">
	import { goto } from '$app/navigation';
	import { page } from '$app/stores';
	import TeamOverview from '$lib/components/teamcomponents/TeamOverview.svelte';
	import { currentTeam } from '$lib/stores/teamStore';
	import { currentUser } from "$lib/stores/userStore";
	import { onMount } from "svelte";
	
	
    
    onMount(() => {
		if (!$currentUser?.loggedIn) goto(`/`); 
	});

	const { teamname } = $page.params;

</script>

<!-- <h1>Team {teamname}</h1> -->



<!-- TODO: Teamobjekt (?) oder ID übergeben;
 currentTeam ist von ListOfTeams gesetzt-->
<TeamOverview teamID = {$currentTeam.teamID}/>



<button on:click={() => goto(`/myteams/teamname/edit`)}>
    Team und Mitglieder
</button>
<button on:click={() => goto("/myteams/teamname/tasklist")}>
    Aufgaben
</button>
<button on:click={() => goto("/myteams/teamname/calendar")}>
    Kalender
</button>


