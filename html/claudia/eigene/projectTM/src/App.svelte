<script>
	// import ListOfEmails from "./components/ListOfEmails.svelte";
	// import NewMember from "./components/NewMember.svelte";
	import Start from "./components/Start.svelte";
	import NewAccount from "./components/NewAccount.svelte";
	import Test from "./components/Test.svelte";

	// let emailAdresses = ["a@a.com", "b@b.com"];
	// let emailAdresses = [];
	// let newEmail = "";

	//TESTDATEN: ////////////////////////////////////////////////////////
	// localStorage.clear();
	// let members = [];

	// const member1 = {
	// 	email: "a@a.com",
	// 	password: "aaa",
	// 	userName: "Anna",
	// 	teams: [
	// 		{ teamName: "Team A", isAdmin: true },
	// 		{ teamName: "Team B", isAdmin: false },
	// 	],
	// };
	
	// const member2 = {
	// 	email: "b@b.com",
	// 	password: "bbb",
	// 	userName: "Betti",
	// 	teams: [
	// 		{ teamName: "Team A", isAdmin: false },
	// 		{ teamName: "Team B", isAdmin: true },
	// 	],
	// };
	// const member3 = {
	// 	email: "c@c.com",
	// 	password: "ccc",
	// 	userName: "Conni",
	// 	teams: [
	// 		{ teamName: "Team A", isAdmin: false },
	// 		{ teamName: "Team B", isAdmin: false },
	// 		{ teamName: "Team C", isAdmin: true },
	// 		{ teamName: "Team D", isAdmin: true },
	// 	],
	// };

	// const member4 = {
	// 	email: "d@d.com",
	// 	password: "",
	// 	userName: "",
	// 	teams: [
	// 		{teamName: "Team C", isAdmin: false},
	// 		{teamName: "Team D", isAdmin: false},
	// 	]
	// }
	// members.push(member1, member2, member3, member4);
	// console.log("Testdaten: ", members);
	// members.forEach(member => {localStorage.setItem(member.email, JSON.stringify(member))}); //andersrum: JSON.parse()
	// console.log("Finde den Fehler", members[0].userName, members[1].teams);
	// console.log("Teamname: ", members[2].teams[0].teamName)

   //get all users from local storage:
   let allUsers = [];
   const member4 = {
		email: "d@d.com",
		password: "",
		userName: "",
		teams: [
			{teamName: "Team C", isAdmin: false},
			{teamName: "Team D", isAdmin: false},
		]
	}
	localStorage.setItem(member4.email, JSON.stringify(member4));
	
   for (let i = 0; i < localStorage.length; i++) {
        let key = localStorage.key(i);
        let user = JSON.parse(localStorage.getItem(key));
        allUsers.push(user);
    }
	
    console.log("Local Storage am Anfang: ", allUsers);

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
