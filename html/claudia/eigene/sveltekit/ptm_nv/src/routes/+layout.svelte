<script>

	import LogOutButton from "$lib/components/usercomponents/LogOutButton.svelte";
	import { currentUser } from "$lib/stores/userStore";
  import { currentTeam } from "$lib/stores/teamStore";

  let color = "#123FFF"
  $: if ($currentTeam) color = $currentTeam.color;

</script>

<header style="background-color: {color}">Header</header>
<p>User: {$currentUser?.userName}; eingeloggt? {$currentUser?.loggedIn}</p>

<LogOutButton />

<slot /> <!--Jede einzelne Seite im Pfad wird anstelle von Slot gerendert!-->

<footer style="background-color: {color}">Footer</footer>


<style>






</style>