export default class Person {       // mit default kann nur eine Klasse aufgerufen werden
  _vorname;
  _nachname;
  _alter;
  _geschlecht;
  _arbeitsgeraet;

  constructor(vorname, nachname, alter, geschlecht) {
    this._vorname = vorname;
    this._nachname = nachname;
    this._alter = alter;
    this._geschlecht = geschlecht;
  }

  get vorname() {
    return this._vorname;
  }
  get nachname() {
    return this._nachname;
  }

  setArbeitsgeraet(value) {
    this._arbeitsgeraet = value;
  }

  getDomElement() {
    let div = document.createElement("div");
    div.innerHTML = `${this._vorname} ${this._nachname}`;
    div.appendChild(this._arbeitsgeraet.getDomElement());       //arbeitsgerät ist childelement von der Person
    return div;
  }
}
