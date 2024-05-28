export class Positions {
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
