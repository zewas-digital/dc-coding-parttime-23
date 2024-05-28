<script> 
export let allTeams;

function handleTeamClick(team) {
        // Handle click logic here
        console.log("Clicked on team:", team);
    }
</script>

{#each allTeams as team, index}
                    <button on:click={() => handleTeamClick(team)}
                        >{team.teamName}</button
                    >{/each}