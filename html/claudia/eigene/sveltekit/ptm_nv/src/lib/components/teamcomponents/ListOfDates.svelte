<script lang="ts">
    import { getDateByID, getTeamByID } from "$lib/utils/storageHelpers";
    import type { DateOrTask } from "$lib/stores/teamStore";
    import { formatDate } from "$lib/actions/dateOrTaskHelpers";
    import { formatTime } from "$lib/actions/dateOrTaskHelpers";
    export let teamID: number;
	const myTeam = getTeamByID(teamID.toString());
    
    let allDates: DateOrTask[] = [];

$: if (myTeam){
    const allDateIDs = myTeam.allDates;
    allDateIDs.forEach((dateID) => {
        const storedDate = getDateByID(dateID.toString());
        if (storedDate) allDates.push(storedDate);
        
    });
}


</script>

<h3>Nächste Termine:</h3>
<div class="date-list">
    {#each allDates as myDate, dateIndex}
        <div class="date-item">
            
            <h3>
                <!-- dateID: {myDate.dateOrTaskID} -->
                {formatDate(myDate.dueDate)}
                {formatTime(myDate.dueDate)}
                {myDate.description}
            </h3>

           



        </div>
    {/each}
</div>