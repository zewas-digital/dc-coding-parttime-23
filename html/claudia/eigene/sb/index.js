// import { Player } from './Player';
// import { Positions } from './Positions';
// let player1 = new Player("Anni", true, true);
//////////////////////// CLASSES /////////////////////////////////
class Player {
    constructor(playername, isCoach, isDriver, positions) {
        console.log("Konstruktor");
        this._playerName = playername;
        this._isCoach = isCoach;
        this._isDriver = isDriver;
        this._positions = positions || new Positions(false, false, false, false, false, false, false, false, false);
        console.log(this._positions, "Positionen?");
    }
    get playerName() {
        return this._playerName;
    }
    get isCoach() {
        return this._isCoach;
    }
    get isDriver() {
        return this._isDriver;
    }
    get positions() {
        return this._positions;
    }
}
////////////////////////////////////////////////
class Positions {
    constructor(pitcher, catcher, firstbase, secondbase, thirdbase, shortstop, leftfield, centerfield, rightfield) {
        this._pitcher = pitcher;
        this._catcher = catcher;
        this._firstbase = firstbase;
        this._secondbase = secondbase;
        this._thirdbase = thirdbase;
        this._shortstop = shortstop;
        this._leftfield = leftfield;
        this._centerfield = centerfield;
        this._rightfield = rightfield;
    }
    get pitcher() {
        return this._pitcher;
    }
    get catcher() {
        return this._catcher;
    }
    get firstbase() {
        return this._firstbase;
    }
}
//////////////////////////////////////////////////////////////////////////
let players = [];
let player1 = new Player("Anni", true, true);
players.push(player1);
let player2positions = new Positions(true, false, false, false, false, false, true, true, true);
let player2 = new Player("Betti", true, true, player2positions);
players.push(player2);
console.log(player1.isCoach, player1.playerName);
console.log(player1);
console.log("Spielerin catcht?", player1.positions.catcher);
console.log(player1.positions.pitcher);
let list = document.querySelector("#listOfPlayers");
// console.log("Liste", list);
for (let p of players) {
    console.log(p.playerName);
    let articleDOM = document.createElement("article");
    articleDOM.textContent = p.playerName;
    list.append(articleDOM);
}
