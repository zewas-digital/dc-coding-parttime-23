// damit die rerender - Funktion innerhalb dieser Klasse ("Klasse") funktioniert, muss diese Funktion im index.js exportiert und hier importiert werden (siehe index.js)
import { rerender } from "./05_index.js";

// damit auf diese  Klasse ("Klasse") zugegriffen werden kann und Objekte ("Klasse") in index.js erstellt werden können, muss es exportiert werden (siehe index.js)
export class Klasse {

  // Klassenattribut
  _name;                                            // Attribut für Klassen-Name (z.B. 1a, 1b usw.)

  _personen = [];                                   // Array-Liste für die erstellten Personen-Objekt aus der Person-Klasse

  // Konstruktor 
  constructor(name) {
    this._name = name;
  }

  // Methode zum Hinzufügen einer Person
  addPerson(person) {
    this._personen.push(person);
  }

  // Methode zum Enfernen einer Person
  removePerson(index) {
    this._personen.splice(index, 1);
  }

  // Methode zum Erstellen der DOM - Elemente
  getDomElement() {

    // Variable div, in der das DOM-Element "div" zugewiesen ist
    let div = document.createElement("div");

    // zum Befüllen des DOM-Element "div"
    div.innerHTML = this._name;

    // Varialble ul (unordered list), in der das DOM-Element "ul" zugewiesen ist
    let ul = document.createElement("ul");

    // For Each Loop, wo die Personen-Objekte aus der Array-Liste in die Variable "person" geschrieben werdne
    for (let person of this._personen) {

      // Variable li (list item), in der das DOM-Element "li" zugewiesen ist
      let li = document.createElement("li");

      // Standard-Methode (appendChild) zum Anhängen der Personen über die Methode getDomElement() ins list item "li"
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
