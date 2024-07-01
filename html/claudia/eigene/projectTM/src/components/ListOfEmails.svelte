<script>
	export let emailAdresses;
</script>

<section>
	<h2>Liste der Emailadressen:</h2>
	{#each emailAdresses as email, index (email)}
		<p>{index + 1} {email}</p>
	{/each}
	
</section>
