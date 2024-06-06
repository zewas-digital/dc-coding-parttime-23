<script lang="ts">
	import { showTemporaryMessage } from "$lib/actions/showHelpers.js";
	import { updateTeam } from "$lib/actions/teamHelpers";
    import type { Team } from "$lib/stores/teamStore";
    

    // let showMessage = false; //to display message
    // const duration = 3000; //in milliseconds

    // function setShowMessage(value: boolean): void { //boolean value
    //     showMessage = value;
    // }

    // let teamName: string;
    // // let color: "#ffffff";

    // function handleSubmit(event:Event):void {
    //     event.preventDefault();
    //     const newTeam = {
    //         teamName: "",
    //         allAdmins: [],
    //         allMembers: [],

    //     }

            
    //     // showTemporaryMessage(setShowMessage, duration);
    // }
    console.log("Component NewTeam");
 
</script>
<!--the for-atrribute of the label-tab should beequal to the id attribute of the inut-element for binding-->

<!-- {#if !teamCreated} -->



    <h2>Leg jetzt ein neues Team an!</h2>
    <!-- <form on:submit={handleSubmit}>
                    <input type="text" bind:value={teamName} required />
       
        </form> -->







<!-- 
        <button type="submit">Team anlegen!</button>
    </form>

{:else if showMessage}
    Neues Team angelegt!
{/if} -->
