import { rerender } from "./index.js";

export class Klasse {         //ohne default könnnen mehrere Klassen aufgerufen werden 
  _name;
  _personen = [];              //Personen als Array speichern für die Liste (ul) der Personen

  constructor(name) {
    this._name = name;         // ._ --> simuliert eine "private" Instanzvariable oder Methode, nicht außerhalb der Klasse zugreifbar
  }
  }

  addPerson(person) {
    this._personen.push(person);            //Personen in die ArrayList pushen         

  removePerson(index) {
    this._personen.splice(index, 1);      //splice = remove, 1 = anzahl der ausgelöschten Elemente
  }

  getDomElement() {
    let div = document.createElement("div");
    div.innerHTML = this._name;
    let ul = document.createElement("ul");        //Liste der Personen erstellen - unorderedList

    // For Each Loop
    for (let person of this._personen) {             //Für alle Personen aus Klasse Person...
      let li = document.createElement("li");         //Listelement erstellen - listItem (li)
      li.appendChild(person.getDomElement());        //Person ist ein child element von der Klasse 
      li.onclick = () => {                           //Person kann durch klicken aus der Liste ausgelöscht werden, wird durch den rerender wieder neu aktualisiert
        console.log("click");
        this.removePerson(this._personen.indexOf(person));        //Person wird aus der Liste entfernt mit dem Index der Person
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
