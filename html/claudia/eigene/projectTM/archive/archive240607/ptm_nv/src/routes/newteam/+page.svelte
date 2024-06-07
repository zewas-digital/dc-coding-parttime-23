<script>

    import NewTeam from "$lib/components/teamcomponents/NewTeam.svelte";
	import { currentTeam, defaultTeam } from "$lib/stores/teamStore";
    
    currentTeam.set(defaultTeam);

</script>


<!-- <h1>new Team</h1> -->


<NewTeam />