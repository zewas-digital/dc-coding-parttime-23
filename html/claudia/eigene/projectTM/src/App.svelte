<script>
	// import ListOfEmails from "./components/ListOfEmails.svelte";
	// import NewMember from "./components/NewMember.svelte";
	import Start from "./components/Start.svelte";
	import { setTestData } from "./utils/testdata.js";
	// import NewAccount from "./components/NewAccount.svelte";
	// import Test from "./components/Test.svelte";

	// import {setContext} from "svelte";

// let email = "";

//setContext("emailAddressFromContext", email);

	// let emailAdresses = ["a@a.com", "b@b.com"];
	// let emailAdresses = [];
	// let newEmail = "";

	setTestData();
	

//////////////////////////////////////////////////////////////////////////



	// const isAdminOfTeamA = member1.teams.find(
	// 	(team) => team.teamName === "Team A",
	// )?.isAdmin;
	// console.log(member1.email, " ist Admin von TEam A?", isAdminOfTeamA); // Outputs: true (if admin), undefined (if not admin or not member of Team A)

	// function addEmail() {
	// 	const newEmail = document.querySelector("#emailInput").value;
	// 	// console.log("neue Adresse", newEmail);
	// 	if (!newEmail=="" && !emailAdresses.includes(newEmail)) {
	// 		emailAdresses = [...emailAdresses, newEmail];
	// 	} else console.log("schon enthalten oder leerer String!");
	// }
</script>

<main>
	<section>
		
		<Start />

		<!-- <NewAccount /> -->


		<!-- <NewMember/>

		<button type="button" on:click|preventDefault={addEmail}
			>Erfassen!</button
		>

		<ListOfEmails emailAdresses={emailAdresses}/>

		<button type="button">ALLE EINLADEN</button>  -->
	</section>
</main>

<style>
</style>
