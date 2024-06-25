<script>

	import LogOutButton from "$lib/components/usercomponents/LogOutButton.svelte";
	import { currentUser } from "$lib/stores/userStore";
  import { currentTeam } from "$lib/stores/teamStore";
	import MyTeamsButton from "$lib/components/usercomponents/MyTeamsButton.svelte";
  

  // let color = "#123FFF"
  // $: if ($currentTeam) color = $currentTeam.color;

</script>
<div class="grid">

<!-- <header style="background-color: {color}"> -->
 <header>
  Header
{#if $currentUser?.loggedIn}
<MyTeamsButton />
<LogOutButton />
{/if}

</header>

<body>
  

<p>User: {$currentUser?.userName}; eingeloggt? {$currentUser?.loggedIn}</p>




<slot /> <!--Jede einzelne Seite im Pfad wird anstelle von Slot gerendert!-->

</body>

<!-- <footer style="background-color: {color}">Footer</footer> -->
<footer>Footer</footer>

</div>

<style>

body, header, footer {
  font-family: Arial, Helvetica, sans-serif}
header, footer {
  background-color: lightgrey;
}

.grid {
  display: grid;
  grid-template-rows: 100px minmax(300px, auto) 100px;
}



</style>