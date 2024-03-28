function typescriptFunctionSolution2() {
  let aufgaben: any[] = [];
  const aufgabe1 = {
    title: "Projekt aufsetzen",
    description: "Projekt aufsetzen und Teilnehmer im Repository einladen",
    dueDate: new Date("2024-03-26T15:00:00.000"),
  };
  aufgaben.push(aufgabe1);
  const aufgabe2 = {
    title: "Arbeitspaket 1 erledigen",
    description: "Erstellen der ersten Komponente für den Taschenrechner",
    dueDate: new Date("2024-03-27T15:00:00.000"),
  };
  aufgaben.push(aufgabe2);
  const aufgabe3 = {
    title: "Arbeitspaket 2 erledigen",
    description: "Testen der + - * / Funktionen",
    dueDate: new Date("2024-03-27T00:00:00.000"),
  };
  aufgaben.push(aufgabe3);
  const aufgabe4 = {
    title: "Arbeitspaket 3 erledigen",
    description:
      "Ergebnis beim ausgeben formatieren. Auf 5 Kommastellen runden",
    dueDate: new Date("2024-03-26T09:41:28.838Z"),
  };
  aufgaben.push(aufgabe4);
  const aufgabe5 = {
    title: "Arbeitspaket 4 erledigen",
    description: "Ergebnis dem Projektleiter präsentieren.",
    dueDate: new Date(1711446088838),
    remindDate: new Date("2024-03-29T15:00:00.000"),
  };
  auf;
  aufgaben.push(aufgabe5);
  for (let i = 0; i < aufgaben.length; i++) {
    console.log(
      aufgaben[i].title +
        ": \n" +
        aufgaben[i].description +
        "\nFertigstellungsdatum: " +
        aufgaben[i].dueDate +
        " verbleibende Tage: " +
        (aufgaben[i].dueDate.getDate() - new Date().getDate())
    );
    if (!aufgaben[i].remindDate?.getTime()) {
      aufgaben[i].remindDate = new Date();
    }
    // sendNotification(aufgaben[i]?.remindDate, aufgaben[i].title);
  }
  function sendNotification(remindDate, title) {
    // Überprüfen wenn das Erinnerungsdatum in der Vergangenheit liegt
    if (remindDate < new Date()) {
      console.log("Deine Aufgabe: " + title + "  ist jetzt fällig!!");
    }
  }
}
typescriptFunctionSolution2();

class Zoo {
  public static title: string;
  private helfer: number;

  constructor() {}

  private method1(name: string, age: number): Person {
    this.helfer;
  }
}

interface Interface1 {}

abstract class AbstrakteClasse {}
