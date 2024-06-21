<script lang="ts">
	import { userIsAdmin } from '$lib/actions/teamHelpers';
	import { currentUser } from '$lib/stores/userStore';
	import { getDateByID, getTeamByID } from '$lib/utils/storageHelpers';
    
	export let teamID: number;

    

	let teamcolor = "FFF321";

	const myTeam = getTeamByID(teamID.toString());

    const myFeedbacks = $currentUser.feedbacks;

    let myTeamFeedbacks = [];

    // for (let i = 0; i < myFeedbacks.length; i++){
    //     const dateID = myFeedbacks[0];
    //     const nextDate = getDateByID(dateID.toString());
    //     const teamIDOFDate = nextDate?.teamID;
    //     if (myFeedbacks[i] )
    // }

    
</script>

Useroverview wie Teamoverview
