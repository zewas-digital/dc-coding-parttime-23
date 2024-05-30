<script>
    // export let allTeams;
    import { currentUser } from "../stores/userStore";
    import NewTeam from "./NewTeam.svelte";

    function handleTeamClick(team) {
        // Handle click logic here
        console.log("Clicked on team:", team);
    }
</script>

{#each $currentUser.teams as team, index}
    <button on:click={() => handleTeamClick(team)}>{team.teamName}</button
        
    >{/each}
<!-- <NewTeamButton /> -->