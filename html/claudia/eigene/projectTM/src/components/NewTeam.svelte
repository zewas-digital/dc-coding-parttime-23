<script>
    // export let email;
    import { showTemporaryMessage } from "../actions/showHelpers.js";
    // import { currentUser } from "../stores/userStore.js";
    // import { updateUser } from "../actions/userHelpers.js";

    let showMessage = false; //to display message
    const duration = 3000; //in milliseconds

    function setShowMessage(value) { //boolean value
        showMessage = value;
    }

  
    // let password;
    // let userName;
    // let userCreated = false;
    let teamCreated = false;
    let teamName;
 

    function handleSubmit(event) {
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
