<script lang="ts">
	import Start from '$lib/components/Start.svelte';
	// import { currentUser, started } from '$lib/stores/userStore';
	import { setTestData } from '$lib/utils/testdata';
	// import { setTestData } from '$lib/utils/testdata';
	
	
	console.log('Seite Start');
	function initializeTestData() {
		if (typeof window !== "undefined") {
        const initializedTestData = localStorage.getItem("initializedTestData") === "true";

        if (!initializedTestData ) {
            console.log("setTestData!");
            setTestData();
            localStorage.setItem("initializedTestData", "true");
            console.log("setTestData fertig.");
        } else {
            console.log("Testdaten bereits gespeichert, oder window undefined.");
        }
    }}


	// export let appName;
	// console.log('Seite Start');
	// //Testdata calculated only once at very first start of app!
	
	initializeTestData();
	// // setTestData();
	console.log("Startseite ENDE");
</script>


<h1>Startseite</h1>
<Start />




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