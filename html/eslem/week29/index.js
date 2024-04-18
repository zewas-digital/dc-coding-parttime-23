import Arbeitsgeraet from "./Arbeitsgeraet.js";                  // mit default kann nur eine Klasse importiert werden                              //alle Klassen importieren, Personen erstellen und im HTML aufrufen
import { Klasse, irgendeineVariable } from "./Klasse.js";       //ohne default könnnen mehrere Klassen importiert werden 
import Person from "./Person.js";                               // mit default kann nur eine Klasse importiert werden

let klassen = [];             //Klasse außerhalb der function (global) erstellen! nicht in der Function, somit kann man sie in anderen funtions (im rerender) aufrufen!

console.log(irgendeineVariable);

function datenLaden() {
  let max = new Person("Max", "Mustermann");                                //Person erstellen, Artbeitesgerät hinzufügen + Index
  max.setArbeitsgeraet(new Arbeitsgeraet("Apple", "MacBook Pro", 1));

  let erika = new Person("Erika", "Mustermann");
  erika.setArbeitsgeraet(new Arbeitsgeraet("HP", "Elitebok 1", 2));

  let marco = new Person("Marco", "Musterfrau");
  marco.setArbeitsgeraet(new Arbeitsgeraet("Apple", "MacBook Air", 3));

  let jenny = new Person("Jenny", "Musterfrau");
  jenny.setArbeitsgeraet(new Arbeitsgeraet("HP", "Elitebok 2", 4));

  let jens = new Person("Jens", "Musterfrau");
  jens.setArbeitsgeraet(new Arbeitsgeraet("Apple", "MacBook Pro", 5));

  let klasse1a = new Klasse("1a");                                       //Personen der Klasse zuordnen
  klasse1a.addPerson(max);
  klasse1a.addPerson(erika);
  klasse1a.addPerson(marco);

  let klasse1b = new Klasse("1b");
  klasse1b.addPerson(jenny);
  klasse1b.addPerson(jens);

  klassen.push(klasse1a);                                           //Klassen werden gepusht und einem Array hinzugefügt --> let = klassen[];
  klassen.push(klasse1b);

  let div = document.getElementById("klassen");         

  for (let klasse of klassen) {
    div.appendChild(klasse.getDomElement());
  }
}

export function rerender() {                                      //Aktualisiert die Elemente im DOM 
  let div = document.getElementById("klassen");
  div.innerHTML = "";

  for (let klasse of klassen) {
    div.appendChild(klasse.getDomElement());
  }
}
datenLaden();
