<script>
	import ListOfEmails from './ListOfEmails.svelte';
	// let emailAdresses = ["a@a.com", "b@b.com"];
	let emailAdresses = [];
	let newEmail = "";

	// function submitForm(event) {
	// 	event.preventDefault();
	// 	console.log("SUBMIT");
	// 	// console.log(emailAdresses);
	// }
	function addEmail() {
		const newEmail = document.querySelector("#emailInput").value;
		console.log("neue Adresse", newEmail);
		if (!newEmail=="" && !emailAdresses.includes(newEmail)) {
			emailAdresses = [...emailAdresses, newEmail];
		} else console.log("schon enthalten oder leerer String!");
	}
</script>

<!-- 
<input type="email" bind:value={email} placeholder="Email" />
    <input type="password" bind:value={password} placeholder="Password" />
    <button on:click={login}>Login</button> -->

<main>
	<section id="newMembers">
	<h2>neue Mitglieder einladen:</h2>
	<!-- <form> -->
		
		<input
			type="email"
			id="emailInput"
			placeholder="name@example.com"
			bind:value={newEmail}
			
		/>
		<label for="emailInput" class="visually-hidden">neue Emailadresse!</label>
		<input type="checkbox" id="isAdmin" />
		<label for="isAdmin">Adminrechte?</label>
		<button type="button" on:click|preventDefault={addEmail}
			>Erfassen!</button
		>

		<ListOfEmails emailAdresses={emailAdresses}/>

		<!-- <h2>Liste der Emailadressen:</h2>
		{#each emailAdresses as email, index (email)}
			<p>{index + 1} {email}</p>
		{/each}-->
		<button type="button">ALLE EINLADEN</button> 
	</section>
	<!-- </form> -->
</main>

<!-- 
<script>
    let email = '';
    let password = '';

    function login() {
        // Your login logic here
        console.log("Logging in with email:", email, "and password:", password);
    }
</script>

<div>
    <input type="email" bind:value={email} placeholder="Email" />
    <input type="password" bind:value={password} placeholder="Password" />
    <button on:click={login}>Login</button>
</div> -->

<style>
	main {
		text-align: center;
		padding: 1em;
		max-width: 240px;
		margin: 0 auto;
	}
	.visually-hidden {
    position: absolute;
    width: 1px;
    height: 1px;
    margin: -1px;
    padding: 0;
    overflow: hidden;
    clip: rect(0, 0, 0, 0);
    border: 0;
  }
	/* h1 {
		color: #ff3e00;
		text-transform: uppercase;
		font-size: 4em;
		font-weight: 100;
	} */

	/* @media (min-width: 640px) {
		main {
			max-width: none;
		}
	} */
</style>
