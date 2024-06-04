<script lang="ts">
	import { page } from '$app/stores';
	const { teamname } = $page.params;
	console.log($page.params.slug); //String with all segments after "docs"
	const slugArr = $page.params.slug.split('/');
</script>

<h1>Team {teamname}</h1>


<!--CATCH-ALL-ROUTES-->
<!-- <script>
	import { page } from '$app/stores';
	console.log($page.params.slug); //String with all segments after "docs"
	const slugArr = $page.params.slug.split('/');
</script>

{#if slugArr.length === 1}
	<h1>Viewing docs for feature {slugArr[0]}</h1>
{:else if slugArr.length === 2}
	<h1>Viewing docs for {slugArr[0]} and concept {slugArr[1]}</h1>
{/if} -->
