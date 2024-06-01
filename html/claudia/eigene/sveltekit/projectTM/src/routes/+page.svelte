<script lang="ts">
	import Start from "$lib/components/Start.svelte";
	import { setTestData } from "$lib/utils/testdata";

	// export let appName;

	setTestData();

	//TESTDATEN: ////////////////////////////////////////////////////////
	console.log('Start');
	


</script>

<!-- my-sveltekit-app/
// ├── src/
// │   ├── lib/
// │   │   └── components/
// │   │       └── MyComponent.svelte
// │   ├── routes/
// │   │   └── +page.svelte
// │   └── app.html
// ├── static/
// │   └── assets/
// ├── svelte.config.js
// ├── package.json
// └── ... (other config files) -->

<h1>Startseite</h1>
<Start />
