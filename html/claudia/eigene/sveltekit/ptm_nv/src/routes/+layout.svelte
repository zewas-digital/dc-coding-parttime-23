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
  font-family: Arial, Helvetica, sans-serif;
}
body {
  margin: 100px 0 0 0;
}
header, footer {
  background-color: lightgrey;
  width: 100%;
  height: 50px;
}

header {
  position: fixed;
  top: 0;
}





</style>