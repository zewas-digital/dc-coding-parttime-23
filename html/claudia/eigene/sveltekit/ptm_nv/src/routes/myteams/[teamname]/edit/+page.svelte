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

HiER LISTE VON ALLEN MiTGLIEDERN!


<section>
    <h2>Neue Ereignisse hinzufügen:</h2>
    <NewTeamDate />
</section>

HIER LISTE VON ALLEN DATEN

		<!--TODO: Nur für ADMIN? -->
				<!-- <p>
		// 	Zugesagt: {countFeedback(myDate.dateOrTaskID, 'yes')}, Abgesagt: {countFeedback(
		// 		myDate.dateOrTaskID,
		// 		'no'
		// 	)}, keine Rückmeldung: {countFeedback(myDate.dateOrTaskID, 'none')}
		// </p> -->