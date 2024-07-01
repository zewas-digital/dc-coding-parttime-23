import { Positions } from './Positions';

export class Player {
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
//Setter-Methods necessary?

}
