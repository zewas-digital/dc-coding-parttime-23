function typescriptFunction() {
    let aufgaben = [];
    const aufgabe1 = {
        title: "Projekt aufsetzen",
        description: "Projekt aufsetzen und Teilnehmer im Repository einladen",
        dueDate: "heute",
    };
    aufgaben.push(aufgabe1);
    const aufgabe2 = {
        title: "Arbeitspaket 1 erledigen",
        description: "Erstellen der ersten Komponente für den Taschenrechner",
        dueDate: "morgen",
    };
    aufgaben.push(aufgabe2);
    const aufgabe3 = {
        title: "Arbeitspaket 2 erledigen",
        description: "Testen der + - * / Funktionen",
        dueDate: "27.03.2024",
    };
    aufgaben.push(aufgabe3);
    const aufgabe4 = {
        title: "Arbeitspaket 3 erledigen",
        description: "Ergebnis beim ausgeben formatieren. Auf 5 Kommastellen runden",
        dueDate: "2024-03-26T09:41:28.838Z",
    };
    aufgaben.push(aufgabe4);
    const aufgabe5 = {
        title: "Arbeitspaket 4 erledigen",
        description: "Ergebnis dem Projektleiter präsentieren.",
        dueDate: 1711446088838,
        remindDate: "Fri Mar 29 2024",
    };
    aufgaben.push(aufgabe5);
    for (let i = 0; i < aufgaben.length; i++) {
        sendNotification(aufgaben[i].remindDate, aufgaben[i].title);
    }
    function sendNotification(remindDate, title) {
        // Überprüfen wenn das Erinnerungsdatum in der Vergangenheit liegt
        if (remindDate < new Date()) {
            console.log("Deine Aufgabe: " + title + "  ist jetzt fällig!!");
        }
    }
}
typescriptFunction();
