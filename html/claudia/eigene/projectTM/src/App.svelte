<script>
	// import ListOfEmails from "./components/ListOfEmails.svelte";
	// import NewMember from "./components/NewMember.svelte";
	import Login from "./components/Login.svelte";
	import Test from "./components/Test.svelte";

	// let emailAdresses = ["a@a.com", "b@b.com"];
	// let emailAdresses = [];
	// let newEmail = "";

	//TESTDATEN: ////////////////////////////////////////////////////////
	let members = [];

	const member1 = {
		email: "a@a.com",
		password: "aaa",
		teams: [
			{ name: "Team A", isAdmin: true },
			{ name: "Team B", isAdmin: false },
		],
	};
	
	const member2 = {
		email: "b@b.com",
		password: "bbb",
		teams: [
			{ name: "Team A", isAdmin: false },
			{ name: "Team B", isAdmin: true },
		],
	};
	const member3 = {
		email: "c@c.com",
		password: "ccc",
		teams: [
			{ name: "Team A", isAdmin: false },
			{ name: "Team B", isAdmin: false },
		],
	};
	members.push(member1, member2, member3);
	console.log("Testdaten: ", members);
	members.forEach(member => {localStorage.setItem(member.email, JSON.stringify(member))}); //andersrum: JSON.parse()

//////////////////////////////////////////////////////////////////////////



	const isAdminOfTeamA = member1.teams.find(
		(team) => team.name === "Team A",
	)?.isAdmin;
	console.log(member1.email, " ist Admin von TEam A?", isAdminOfTeamA); // Outputs: true (if admin), undefined (if not admin or not member of Team A)

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
		
		<Login />
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
