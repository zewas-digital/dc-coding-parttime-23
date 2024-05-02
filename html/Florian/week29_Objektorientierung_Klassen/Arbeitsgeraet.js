export default class Arbeitsgeraet {
  _marke;
  _modell;
  _id;

  constructor(marke, modell, id) {
    this._marke = marke;
    this._modell = modell;
    this._id = id;
  }

  getDomElement() {
    let div = document.createElement("div");
    div.className = "arbeitsgeraet";
    // div.innerHTML = this._id + ": " + this._marke + " " + this._modell;
    div.textContent = `${this._id}: ${this._marke} ${this._modell}`; // Kurz schreibweise für einen String
    return div;
  }
}
