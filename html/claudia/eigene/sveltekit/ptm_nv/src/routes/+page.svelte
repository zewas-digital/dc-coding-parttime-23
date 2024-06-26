<script lang="ts">
	import Start from '$lib/components/Start.svelte';
	// import { currentUser, started } from '$lib/stores/userStore';
	import { setTestData } from '$lib/utils/testdata';
	// import { setTestData } from '$lib/utils/testdata';
	
	
	// console.log('Seite Start');
	function initializeTestData() {
		if (typeof window !== "undefined") {
        const initializedTestData = localStorage.getItem("initializedTestData") === "true";

        if (!initializedTestData ) {
            // console.log("setTestData!");
            setTestData();
            localStorage.setItem("initializedTestData", "true");
            // console.log("setTestData fertig.");
        } else {
            console.log("Testdaten bereits gespeichert, oder window undefined.");
        }
    }}


	// export let appName;
	// console.log('Seite Start');
	// //Testdata calculated only once at very first start of app!
	
	initializeTestData();
	// // setTestData();
	// console.log("Startseite ENDE");
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



<!-- 
<script>
    import { onMount } from 'svelte';

    // Function to handle the popstate event
    function handlePopState(event) {
        console.log('Back button clicked!');
        // Perform the desired action here, such as navigating back
        // You can use SvelteKit's router to navigate to a different page
        // Example: import { goto } from '$app/navigation';
        //          goto('/previous-page');
    }

    // Subscribe to the popstate event when the component mounts
    onMount(() => {
        window.addEventListener('popstate', handlePopState);
        
        // Cleanup the event listener when the component is destroyed
        return () => {
            window.removeEventListener('popstate', handlePopState);
        };
    });
</script>

< Your Svelte component's template -->
<!-- <div>
    Your component's content here -->
<!-- </div>  -->
