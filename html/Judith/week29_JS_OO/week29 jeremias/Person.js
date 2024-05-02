export default class Person {
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

  /* Funktion */
  setArbeitsgeraet(value) {
    this._arbeitsgeraet = value;
  }

  /* div für Dom erstellen und Element hinzufügen Hier wird aber nicht nur die Person sondern auch das ihr zugewiesene Arbeitsgeärt hinzugefügt */
  getDomElement() {
    let div = document.createElement("div");
    div.innerHTML = `${this._vorname} ${this._nachname}`;
    div.appendChild(this._arbeitsgeraet.getDomElement());
    return div;
  }
}
