<script lang="ts">
    import { page } from "$app/stores";
	import NewMember from "$lib/components/teamcomponents/NewMember.svelte";
    import NewTeamDate from "$lib/components/teamcomponents/NewTeamDate.svelte";
    import { currentTeam } from "$lib/stores/teamStore";
    import EditUser from "$lib/components/usercomponents/EditUser.svelte";
	import ListOfMembers from "$lib/components/teamcomponents/ListOfMembers.svelte";
    const { teamname } = $page.params;
	const teamID = $currentTeam.teamID;
	import ListOfDates from "$lib/components/teamcomponents/ListOfDates.svelte";

    
</script>

<!--
NUR FÜR ADMINS!
Team an sich bearbeiten (Name, Farbe)
Mitglieder, Mitgliederrechte
-->
<ListOfMembers teamID={teamID} />

<details>
<summary>Neue Mitglieder zu Team {$currentTeam.teamName} hinzufügen: </summary>
<NewMember />
</details>



<ListOfDates teamID={teamID}/>


<details>
    <summary>Neue Ereignisse hinzufügen:</summary>
    <NewTeamDate />
</details>



		<!--TODO: Nur für ADMIN? -->
				<!-- <p>
		// 	Zugesagt: {countFeedback(myDate.dateOrTaskID, 'yes')}, Abgesagt: {countFeedback(
		// 		myDate.dateOrTaskID,
		// 		'no'
		// 	)}, keine Rückmeldung: {countFeedback(myDate.dateOrTaskID, 'none')}
		// </p> -->


<style>
	summary {
		font-size:larger;
		font-weight: bold;
	}

	
</style>