<script>
	import { hasNullFeedback } from "$lib/actions/userHelpers";
    import EditUser from "$lib/components/usercomponents/EditUser.svelte";
    import { currentUser } from "$lib/stores/userStore";
    
    const isFeedbackMissing = hasNullFeedback($currentUser);

</script>


<h1>Edit User - Page</h1>
<EditUser />

<!-- Achtung: Hier currentUser.accountCreated auf true setzen! -->

Userdaten unterschiedlich für verschiedene Teams!

{#if isFeedbackMissing}
<p>
Du hast noch nicht für alle Termine zu- oder abgesagt!
</p>
{/if}