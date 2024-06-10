<script lang="ts">
    import { page } from "$app/stores";
	import NewMember from "$lib/components/teamcomponents/NewMember.svelte";
    import { currentTeam } from "$lib/stores/teamStore";

    const { teamname } = $page.params;
</script>

<h1>Edit for Team {$currentTeam.teamName}</h1>


<!--
Team selber bearbeiten (Name, Farbe)
Mitglieder, Mitgliederrechte
-->
<NewMember />