<script lang="ts">
    import { page } from "$app/stores";
	import NewMember from "$lib/components/teamcomponents/NewMember.svelte";
    import NewTeamDate from "$lib/components/teamcomponents/NewTeamDate.svelte";
    import { currentTeam } from "$lib/stores/teamStore";
    import EditUser from "$lib/components/usercomponents/EditUser.svelte";
    const { teamname } = $page.params;
    
</script>

<!--
NUR FÜR ADMINS!
Team an sich bearbeiten (Name, Farbe)
Mitglieder, Mitgliederrechte
-->

<section>
<h2>Neue Mitglieder zu Team {$currentTeam.teamName} hinzufügen: </h2>
<NewMember />
</section>

<section>
    <h2>Neue Ereignisse hinzufügen:</h2>
    <NewTeamDate />
</section>


