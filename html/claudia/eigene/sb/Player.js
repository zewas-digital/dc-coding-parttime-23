export class Player {
    // constructor(playername: string, isCoach: boolean, isDriver: boolean, positions?: Positions) {
    //    console.log("Konstruktor"!)
    //     this._playerName = playername;
    //     this._isCoach = isCoach;
    //     this._isDriver = isDriver;
    //     this._positions = positions || new Positions(false, false, false, false, false, false, false, false, false);
    //     console.log(this._positions, "Positionen?");
    // }
    constructor(playername, isCoach, isDriver) {
        console.log("Konstruktor");
        this._playerName = playername;
        this._isCoach = isCoach;
        this._isDriver = isDriver;
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
}
