import { rerender } from "./index.js";

export class Klasse {         //ohne default könnnen mehrere Klassen aufgerufen werden 
  _name;
  _personen = [];              //Personen als Array speichern für die Liste der Personen

  constructor(name) {
    this._name = name;
  }

  addPerson(person) {
    this._personen.push(person);
  }

  removePerson(index) {
    this._personen.splice(index, 1);      //splice = remove, 1 = anzahl der ausgelöschten Elemente
  }

  getDomElement() {
    let div = document.createElement("div");
    div.innerHTML = this._name;
    let ul = document.createElement("ul");        //Liste der Personen erstellen - unorderedList

    // For Each Loop
    for (let person of this._personen) {             //Für alle Personen aus Klasse Personen...
      let li = document.createElement("li");         //Listeelement erstellen - listItem 
      li.appendChild(person.getDomElement());        //Person ist child element von der Klasse 
      li.onclick = () => {                           //Person kann durch klicken aus der Liste ausgelöscht werden
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
