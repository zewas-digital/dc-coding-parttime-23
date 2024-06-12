<script lang="ts">
	import { goto } from '$app/navigation';
	import { page } from '$app/stores';
	import TeamOverview from '$lib/components/teamcomponents/TeamOverview.svelte';
	import { currentTeam } from '$lib/stores/teamStore';
	import { currentUser } from "$lib/stores/userStore";
	import { onMount } from "svelte";
	import { userIsAdmin } from '$lib/actions/teamHelpers';
	
    
    onMount(() => {
		if (!$currentUser?.loggedIn) goto(`/`); 
	});

	const { teamname } = $page.params;

	$: isAdmin = userIsAdmin($currentUser, $currentTeam);

</script>

<!-- <h1>Team {teamname}</h1> -->




 

<p> Alle Admins: {$currentTeam.allAdmins}</p>

 <p>{$currentUser?.userName} ist Admin dieses Teams?: {isAdmin}</p>


<!-- currentTeam ist von ListOfTeams gesetzt -->
<TeamOverview teamID = {$currentTeam.teamID}/>


<!-- 
<button on:click={() => goto(`/myteams/teamname/edit`)}>
    Team und Mitglieder
</button>
<button on:click={() => goto("/myteams/teamname/tasklist")}>
    Aufgaben
</button>
<button on:click={() => goto("/myteams/teamname/calendar")}>
    Kalender
</button> -->

<!--
1. Define Load-Function:
<script context="module">
	export async function load({ params }) {
	  const { page } = params;
	  const formattedPage = page.replace(/_/g, ' ');  // Replace underscores with spaces
	  return { page: formattedPage };
	}
  </script>
  
  <script>
	export let page;
  </script>
  
  <main>
	<h1>Page: {page}</h1>
	<--Render content based on the page value -->
  <!-- </main>
  2. Update Navigation Links
  <script>
	const pages = ["Home Page", "About Us", "Contact Us"];
	function formatPageName(page) {
	  return page.replace(/ /g, '_');  // Replace spaces with underscores
	}
  </script>
  
  <ul>
	{#each pages as page}
	  <li>
		<a href="/{formatPageName(page)}">{page}</a>
	  </li>
	{/each}
  </ul> -->
  

<!-- -->