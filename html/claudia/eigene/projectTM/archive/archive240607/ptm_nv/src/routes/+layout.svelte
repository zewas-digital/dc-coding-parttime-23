<script>

	import LogOutButton from "$lib/components/usercomponents/LogOutButton.svelte";

</script>

<!-- <header class="layout-header">Header</header> -->
<LogOutButton />
<slot /> <!--Jede einzelne Seite im Pfad wird anstelle von Slot gerendert!-->
<!-- <footer class="layout-footer">Footer</footer> -->

<style>



/* 
.layout-header {
  background-color: black;
  color: orange;
  text-align: center;
  padding: 1rem;
}



.layout-footer {
  background-color: orange;
  color: black;
  text-align: center;
  padding: 1rem;
} */


</style>