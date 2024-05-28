// import { Player } from './Player';
// import { Positions } from './Positions';

// let player1 = new Player("Anni", true, true);


const loginButton = document.querySelector("#login") as HTMLButtonElement; //Typeassertion

loginButton.addEventListener("click", function(event){
    event.preventDefault();//kein Submit des Formulars
    login();
});

localStorage.setItem("d@d.com", "TEST");

function login() {
    
    const emailInput = document.querySelector("#email") as HTMLInputElement;
    const email = emailInput.value;
    console.log("Eingegebene Mail: ", email);

    //Suche im LocalStorage, ob Email schon vorhanden
    if (localStorage.getItem(email) === null) {
        console.log("Email noch nicht vorhanden");
        window.location.href = "register.html";
    }
    else {
        console.log("Email gibt's schon.");
        window.location.href = "chooseteam.html";
    }
    //wenn nein -> Anmeldeseite
    //möglicher Fall: Emailadresse bereits "vorgemerkt" zu Team, aber noch kein User angelegt
    //wenn ja -> Zeigen, welche Teams verbunden sind
    
}





















//////////////////////////////////////////////////////////////////////////
// let players: Player[] = [];
// let player1 = new Player("Anni", true, true);
// players.push(player1);
// let player2positions = new Positions(true, false, false, false, false, false, true, true, true);
// let player2 = new Player("Betti", true, true, player2positions);
// players.push(player2);
// console.log(player1.isCoach, player1.playerName);
// console.log(player1);
// console.log("Spielerin catcht?", player1.positions.catcher);
// console.log(player1.positions.pitcher);

// let list = document.querySelector("#listOfPlayers")!; //"!"" tells ts that I'm convince list is not null.. 
// // console.log("Liste", list);

// for (let p of players){
//     console.log(p.playerName);
//     let articleDOM = document.createElement("article");
//     articleDOM.textContent =  p.playerName;

//     list.append(articleDOM);
// }