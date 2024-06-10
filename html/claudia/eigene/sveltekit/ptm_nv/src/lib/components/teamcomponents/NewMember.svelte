<script lang="ts">
    let newEmail = "";
    let isAdmin: boolean;
    let isCoach: boolean;
    let isDriver: boolean;
</script>

<section>
    <h2>neue Mitglieder einladen:</h2>
    <input
        type="email"
        id="emailInput"
        placeholder="name@example.com"
        bind:value={newEmail}
    />
    <!-- <label for="emailInput" class="visually-hidden">neue Emailadresse!</label> -->
    <input type="checkbox" id="isAdmin" />
    <label for="isAdmin">Admin?</label>

    <input type="checkbox" id="isCoach" />
    <label for="isCoach">Coach?</label>

    <input type="checkbox" id="isDriver" />
    <label for="isDriver">Fahrer?</label>
</section>

<style>
    /* .visually-hidden {
        position: absolute;
        width: 1px;
        height: 1px;
        margin: -1px;
        padding: 0;
        overflow: hidden;
        clip: rect(0, 0, 0, 0);
        border: 0;
    } */
</style>

<!-- 
<script>
	export let emailAdresses;
</script>

<section>
	<h2>Liste der Emailadressen:</h2>
	{#each emailAdresses as email, index (email)}
		<p>{index + 1} {email}</p>
	{/each}
	
</section> -->
