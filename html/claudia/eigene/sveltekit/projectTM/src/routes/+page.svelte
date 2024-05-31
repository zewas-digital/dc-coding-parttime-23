<script lang="ts">
    import Start from "$lib/components/Start.svelte";
	import { setTestData } from "$lib/utils/testdata";

	export let appName;
	
	setTestData();
	


</script>

<main>
	<h1>Welcome to {appName}!</h1>
	<section>
		
		<Start />
		
	</section>
</main>

<style>
</style>




<!-- my-sveltekit-app/
├── src/
│   ├── lib/
│   │   └── components/
│   │       └── MyComponent.svelte
│   ├── routes/
│   │   └── +page.svelte
│   └── app.html
├── static/
│   └── assets/
├── svelte.config.js
├── package.json
└── ... (other config files) -->