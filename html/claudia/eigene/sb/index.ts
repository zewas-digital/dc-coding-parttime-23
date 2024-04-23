// import { Player } from './Player';
// import { Positions } from './Positions';

// let player1 = new Player("Anni", true, true);

//////////////////////// CLASSES /////////////////////////////////

class Player {
    private _playerName: string;
    private _isCoach: boolean;
    private _isDriver: boolean;
    private _positions: Positions;

    constructor(playername: string, isCoach: boolean, isDriver: boolean, positions?: Positions) {
       console.log("Konstruktor"!)
        this._playerName = playername;
        this._isCoach = isCoach;
        this._isDriver = isDriver;
        this._positions = positions || new Positions(false, false, false, false, false, false, false, false, false);
        console.log(this._positions, "Positionen?");
    }
    
  

    public get playerName(): string {
        return this._playerName;
    }

    public get isCoach(): boolean {
        return this._isCoach;
    }
    public get isDriver(): boolean {
        return this._isDriver;
    }

    public get positions(): Positions {
        return this._positions;
    }
}

////////////////////////////////////////////////

class Positions {
    private _pitcher: boolean;
    private _catcher: boolean;
    private _firstbase: boolean;
    private _secondbase: boolean;
    private _thirdbase: boolean;
    private _shortstop: boolean;
    private _leftfield: boolean;
    private _centerfield: boolean;
    private _rightfield: boolean;


    constructor(pitcher: boolean,
        catcher: boolean,
        firstbase: boolean,
        secondbase: boolean,
        thirdbase: boolean,
        shortstop: boolean,
        leftfield: boolean,
        centerfield: boolean,
        rightfield: boolean) {
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

    public get pitcher(){
        return this._pitcher;
    }
    public get catcher(){
        return this._catcher;
    }
    public get firstbase(){
        return this._firstbase;
    }
}





//////////////////////////////////////////////////////////////////////////
let players: Player[] = [];
let player1 = new Player("Anni", true, true);
players.push(player1);
let player2positions = new Positions(true, false, false, false, false, false, true, true, true);
let player2 = new Player("Betti", true, true, player2positions);
players.push(player2);
console.log(player1.isCoach, player1.playerName);
console.log(player1);
console.log("Spielerin catcht?", player1.positions.catcher);
console.log(player1.positions.pitcher);

let list = document.querySelector("#listOfPlayers")!; //"!"" tells ts that I'm convince list is not null.. 
// console.log("Liste", list);

for (let p of players){
    console.log(p.playerName);
    let articleDOM = document.createElement("article");
    articleDOM.textContent =  p.playerName;

    list.append(articleDOM);
}