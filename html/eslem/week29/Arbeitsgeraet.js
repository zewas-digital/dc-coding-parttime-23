export default class Arbeitsgeraet {                // mit default kann nur eine Klasse aufgerufen werden
  _marke;
  _modell;                                          // Gerät erstellen 
  _id;
  constructor(marke, modell, id) {
    this._marke = marke;
    this._modell = modell;
    this._id = id;
  }

  getDomElement() {
    let div = document.createElement("div");
    div.className = "arbeitsgeraet";
    // div.innerHTML = this._id + ": " + this._marke + " " + this._modell;      //inner HTML erstellt das DOM element 
    div.textContent = `${this._id}: ${this._marke} ${this._modell}`;
    return div;
  }
}
