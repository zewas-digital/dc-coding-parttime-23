import Arbeitsgeraet from "./04_Arbeitsgeraet.js";
import { Klasse, irgendeineVariable } from "./02_Klasse.js";
import Person from "./03_Person.js";

let klassen = [];

console.log(irgendeineVariable);
function datenLaden() {
  let max = new Person("Max", "Mustermann");
  max.setArbeitsgeraet(new Arbeitsgeraet("Apple", "MacBook Pro", 1));

  let erika = new Person("Erika", "Mustermann");
  erika.setArbeitsgeraet(new Arbeitsgeraet("HP", "Elitebok 1", 2));

  let marco = new Person("Marco", "Musterfrau");
  marco.setArbeitsgeraet(new Arbeitsgeraet("Apple", "MacBook Air", 3));

  let jenny = new Person("Jenny", "Musterfrau");
  jenny.setArbeitsgeraet(new Arbeitsgeraet("HP", "Elitebok 2", 4));

  let jens = new Person("Jens", "Musterfrau");
  jens.setArbeitsgeraet(new Arbeitsgeraet("Apple", "MacBook Pro", 5));

  let klasse1a = new Klasse("1a");
  klasse1a.addPerson(max);
  klasse1a.addPerson(erika);
  klasse1a.addPerson(marco);

  let klasse1b = new Klasse("1b");
  klasse1b.addPerson(jenny);
  klasse1b.addPerson(jens);

  klassen.push(klasse1a);
  klassen.push(klasse1b);

  let div = document.getElementById("klassen");

  for (let klasse of klassen) {
    div.appendChild(klasse.getDomElement());
  }
}

export function rerender() {
  let div = document.getElementById("klassen");
  div.innerHTML = "";

  for (let klasse of klassen) {
    div.appendChild(klasse.getDomElement());
  }
}

datenLaden();
