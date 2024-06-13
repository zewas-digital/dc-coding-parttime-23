<script lang="ts">
    import { page } from "$app/stores";
	import NewMember from "$lib/components/teamcomponents/NewMember.svelte";
    import { currentTeam } from "$lib/stores/teamStore";
    import EditUser from "$lib/components/usercomponents/EditUser.svelte";
    const { teamname } = $page.params;
</script>

<h1>Edit for Team {$currentTeam.teamName}</h1>


<!--
NUR FÜR ADMINS!
Team an sich bearbeiten (Name, Farbe)
Mitglieder, Mitgliederrechte
-->
<NewMember />