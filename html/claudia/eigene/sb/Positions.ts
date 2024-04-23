export class Positions {
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

