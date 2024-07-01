<script>
    import { page } from "$app/stores";
    // const { teamname } = $page.params;
    import { currentTeam } from "$lib/stores/teamStore";
</script>

<h1>Tasklist for Team {$currentTeam.teamName}</h1>