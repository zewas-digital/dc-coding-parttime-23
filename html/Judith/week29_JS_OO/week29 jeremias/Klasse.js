import { rerender } from "./index.js";

export class Klasse {
  _name;
  _personen = [];

  constructor(name) {
    this._name = name;
  }
/* Funktion */
  addPerson(person) {
    this._personen.push(person);
  }
/* Funktion */
  removePerson(index) {
    this._personen.splice(index, 1);
  }
/* div für DOM anlegen und auch eine ul erstellen */
  getDomElement() {
    let div = document.createElement("div");
    div.innerHTML = this._name;
    let ul = document.createElement("ul");

    /* Die For each erstellt für jedes Element also Person ein Listen Element und fügt dies der Unsortieren Liste hinzu, diese Liste wird dann wiederum in das Div gespeichert
    das Div mit dem gesamten Inhalt wird dann zurück gegeben */
    // For Each Loop
    for (let person of this._personen) {
      let li = document.createElement("li");
      li.appendChild(person.getDomElement());
      li.onclick = () => {
        /* mit der Funktion ist es möglich mein klicken eine Person aus der Liste zu entfernen */
        console.log("click");
        this.removePerson(this._personen.indexOf(person));
        rerender();
      };
      ul.appendChild(li);
    }
    div.appendChild(ul);
    return div;
  }

  get name() {
    return this._name;
  }
}

export const irgendeineVariable = "irgendein Wert";
