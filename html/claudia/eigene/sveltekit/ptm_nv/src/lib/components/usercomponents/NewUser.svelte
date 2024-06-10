<script lang="ts">
    //use this component when user's not in local storage => no team set for user

    import { showTemporaryMessage } from '$lib/actions/showHelpers';
    import { updateUser } from '$lib/actions/userHelpers.js';
	import { getNextID } from '$lib/utils/storageHelpers';
	import NewTeam from '../teamcomponents/NewTeam.svelte';
	import { currentUser } from '$lib/stores/userStore.js';
	import { goto } from '$app/navigation';
    

    export let email: string;

    // let showMessage = false; //to display message
    // const duration = 3000; //in milliseconds

    // function setShowMessage(value: boolean): void { //boolean value
    //     showMessage = value;
    // }

  
    let password: string;
    let userName: string;
    let userCreated = false;
 console.log("Component New User, start: ");

    function handleSubmit(event:Event): void {
        event.preventDefault();

        const newUser = {
            userID: getNextID("user"),
            email: email,
            accountCreated: false,
            loggedIn: true,
            password: password,
            userName: userName,
            memberships: [],
        };
        
        console.log("Neuer Nutzer in NewUser ", newUser);
        currentUser.set(newUser); //10.06. -> für Comp. NewTeam erforderlich
        //updateUser(newUser);//10.06. User erst anlegen, wenn auch Team dazu besteht!
        //accountCreated = false, userID = 0;
        userCreated = true;
        // showTemporaryMessage(setShowMessage, duration);
        
    }

 $: if ($currentUser && $currentUser.memberships.length > 0) goto(`/edituser`);
//  if($currentUser && $currentUser.userID === 0) goto(`/edituser`);
 console.log($currentUser);
 console.log("Component New User, Ende. ");

</script>

{#if !userCreated}
    <h2>Leg jetzt ein Nutzerkonto an!</h2>
    <form on:submit={handleSubmit}>
        <label>
            Name:
            <input type="text" bind:value={userName} required />
        </label>

        <label>
            Password:
            <!-- TODO: Type ersetzen für Passwort! -->
            <!-- <input type="password" bind:value={password} required /> -->
            <!-- PW wiederholen -->
            <input type="text" bind:value={password} required />
        </label>

        <button type="submit">Nutzer anlegen!</button>
    </form>
    {:else}
    <NewTeam />
<!-- {:else if showMessage}
    Neuer Nutzer angelegt! -->
{/if}
