import { rerender } from "./index.js";

export class Klasse {
  _name;
  _personen = [];

  constructor(name) {
    this._name = name;
  }

  addPerson(person) {
    this._personen.push(person); // fügt Personen hinzu
  }

  removePerson(index) {
    this._personen.splice(index, 1); // entfernt Personen
  }

  getDomElement() {
    let div = document.createElement("div");
    div.innerHTML = this._name;
    let ul = document.createElement("ul"); // erstellt eine Unorderd List

    // For Each Loop
    for (let person of this._personen) {
      let li = document.createElement("li"); 
      li.appendChild(person.getDomElement());
      li.onclick = () => {
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
