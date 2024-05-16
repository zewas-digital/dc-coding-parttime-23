<!-- const member1 = {
    email: "a@a.com",
    password: "aaa",
    name: "Anna",
    teams: [
        { name: "Team A", isAdmin: true },
        { name: "Team B", isAdmin: false },
    ],
}; -->

<!--TODO: Emailadresse übernehmen aus Start.svelte und bereits ausfüllen!-->

<script>
//get all users from local storage:
export let email; 
console.log("Erhaltene Email:", email);   
let allUsers = [];

    for (let i = 0; i < localStorage.length; i++) {
         let key = localStorage.key(i);
         let user = JSON.parse(localStorage.getItem(key));
         allUsers.push(user);
     }
    console.log(allUsers);

    // let email = "";
    let password = "";
    let name = "";

    function handleSubmit(event) {
        console.log("Event", event);
        const actualUser = JSON.parse(localStorage.getItem(email));
        const allTeams = actualUser.teams;
        console.log("neuer User", actualUser);
        console.log("allTeams", allTeams);

        event.preventDefault();
        const newUser = {
            email,
            password,
            name,
        };
        console.log(newUser);
        
    }
</script>

<h2>Leg jetzt einen neuen Account an!</h2>
<form on:submit={handleSubmit}>
    <!-- <label>
        Email:
        <input type="email" bind:value={email} placeholder="Email" required />
        
    </label> -->

    <label>
        Password:
        <!-- TODO: Type ersetzen für Passwort! -->
        <!-- <input type="password" bind:value={password} required /> -->
        <input type="text" bind:value={password} required />

    </label>

    <label>
        Name:
        <input type="text" bind:value={name} required />
    </label>

    <button type="submit">Account anlegen!</button>
</form>

<!-- 
    Communication: Pass Email-Adress from Start to NewAccount?
<script>
    import ChildComponent from './ChildComponent.svelte';
  
    let dataToSend = "Hello from ParentComponent!";
  </script>
  
  <ChildComponent {receivedData} />

  <script>
    export let receivedData;
  </script>
  
  <p>{receivedData}</p>
   -->
  