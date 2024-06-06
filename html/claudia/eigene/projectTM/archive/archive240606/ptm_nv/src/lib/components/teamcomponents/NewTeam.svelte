<script lang="ts">
	import { showTemporaryMessage } from "$lib/actions/showHelpers.js";
    import type { Team } from "$lib/stores/teamStore";

    let showMessage = false; //to display message
    const duration = 3000; //in milliseconds

    function setShowMessage(value: boolean): void { //boolean value
        showMessage = value;
    }

//     export interface Team {
    //teamID: number;
//     teamName: string;
//     allMembers: User[];
//     allAdmins: User[];
//     allDates: Date[];
//     allTasks: {taskName: string, dueDate: Date, done: boolean}; //TODO: Interface, Store?
//     allCoaches: User[];
//     allDrivers: User[];
//     color: string;
// }
 

    function handleSubmit(event:Event):void {
        event.preventDefault();
        const newTeam = {
            teamName: "",
            allAdmins: [],
            allMembers: [],

        }

            
        showTemporaryMessage(setShowMessage, duration);
    }

 
</script>
<!-- 
{#if !teamCreated}
    <h2>Leg jetzt ein neues Team an!</h2>
    <form on:submit={handleSubmit}>
        <label>
            Name:
            <input type="text" bind:value={teamName} required />
        </label> -->

<!-- 
        <button type="submit">Team anlegen!</button>
    </form>
{:else if showMessage}
    Neues Team angelegt!
{/if} -->
