<script lang="ts">
	import { getDateByID, getTeamByID } from '$lib/utils/storageHelpers';
	import type { DateOrTask } from '$lib/stores/teamStore';
	import { countFeedback, formatDate } from '$lib/actions/dateOrTaskHelpers';
	import { formatTime } from '$lib/actions/dateOrTaskHelpers';
	export let teamID: number;
	const myTeam = getTeamByID(teamID.toString());

	let allDates: DateOrTask[] = [];

	$: if (myTeam) {
		const allDateIDs = myTeam.allDates;
		allDateIDs.forEach((dateID) => {
			const storedDate = getDateByID(dateID.toString());
			if (storedDate) allDates.push(storedDate);
		});
	}
</script>

<table>
	{#each allDates as myDate, dateIndex}
		<tr>
			<td class="date">
				{formatDate(myDate.dueDate)}
				{formatTime(myDate.dueDate)}
			</td>
			<td class="description">{myDate.description}</td>
			<td class="feedback">
				<ul>
					<li>Zugesagt: {countFeedback(myDate.dateOrTaskID, 'yes')}</li>
					<li>Abgesagt: {countFeedback(myDate.dateOrTaskID, 'no')}</li>
					<li>Keine Rückmeldung: {countFeedback(myDate.dateOrTaskID, 'none')}</li>
				</ul>
			</td>
		</tr>
	{/each}
</table>
<!-- </div> -->

<!--TODO: Nur für ADMIN? -->
<!-- <p>
		// 	Zugesagt: {countFeedback(myDate.dateOrTaskID, 'yes')}, Abgesagt: {countFeedback(
		// 		myDate.dateOrTaskID,
		// 		'no'
		// 	)}, keine Rückmeldung: {countFeedback(myDate.dateOrTaskID, 'none')}
		// </p> -->
<style>
    table {
		width: 100%;
		table-layout: fixed;
	}
	td {
		border: 1px solid #ccc; /* Optional: Add borders for better visibility */
	}
	td.date {
		width: 150px;
	}
	td.description {
		width: 300px;
	}
	td.feedback {
		width: 200px;
	}
</style>