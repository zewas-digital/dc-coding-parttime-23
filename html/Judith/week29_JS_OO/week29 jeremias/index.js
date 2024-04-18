
/* In dieser File haben wir alle anderen Klassen imporiert */

import Arbeitsgeraet from "./Arbeitsgeraet.js";
/* hier können mehrere imporiter werden weil in der Klasse "Klasse.js" der export ohne " default" definiert wurde */
import { Klasse, irgendeineVariable } from "./Klasse.js";
import Person from "./Person.js";


/* Array für "klassen" definieren */
let klassen = [];

/* Testausgabe */
console.log(irgendeineVariable);

/* hier werden alle Daten (Personen inkl. Arbeitsgräte) angelegt und der jeweiligen Klasse zugewiesen
mit ".push" wird die gesamte Klasse (z.B. 1a) in das Array "klassen" das oben definiert wurde geschrieben */
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

  /* div erstellung für DOM */
  let div = document.getElementById("klassen");

  /* for each ein DOM Element erstellen */
  for (let klasse of klassen) {
    div.appendChild(klasse.getDomElement());
  }
}

/* Diese Funktion löscht alle Daten aus dem Html und befüllt sie neu also quasi aktualisieren */
export function rerender() {
  let div = document.getElementById("klassen");
  div.innerHTML = "";

  for (let klasse of klassen) {
    div.appendChild(klasse.getDomElement());
  }
}

datenLaden();
