<script lang="ts">
	import { showTemporaryMessage } from "$lib/actions/showHelpers.js";

//TODO: Neues Interface Team mit Liste der Nutzer
//erforderliche Daten? Name (erforderlich), Liste der Mitglieder(erforderlich), Admins(erforderlich), Trainer, Fahrer...

    let showMessage = false; //to display message
    const duration = 3000; //in milliseconds

    function setShowMessage(value: boolean): void { //boolean value
        showMessage = value;
    }

  
    // let password;
    // let userName;
    // let userCreated = false;
    let teamCreated = false;
    let teamName: string;
 

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

{#if !teamCreated}
    <h2>Leg jetzt ein neues Team an!</h2>
    <form on:submit={handleSubmit}>
        <label>
            Name:
            <input type="text" bind:value={teamName} required />
        </label>


        <button type="submit">Team anlegen!</button>
    </form>
{:else if showMessage}
    Neues Team angelegt!
{/if}
