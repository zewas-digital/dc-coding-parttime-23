# Neue Inhalte

## Arrow Function

Bisher wurden Functions immer in voller Länge geschrieben z.B.

```javascript
function printOutput(output) {
  console.log(output);
}
```

Die neue Schreibweise (Arrow Function zu Deutsch: Pfeilfunktion) ermöglicht es, Funktionen kürzer darzustellen und nicht immer einen Namen zu vergeben. Man kann auch anonyme Funktion dazu sagen.

```javascript
const printOutput = (output) => {
  console.log(output);
};
```

## Fetch Funktion

Um externe API Schnittstellen abzugreifen, verwenden wir die Fetch Funktion. Mit dieser kann ein HTTP Request abgesetzt werden.

HTTP ist das Standardprotokoll im Internet, in dem der Browser kommuniziert.

Beispiel:

```javascript
fetch("https://google.com")
  .then((response) => {
    if (!response.ok) {
      throw new Error("Netzwerkfehler");
    }
    return response.json(); // Konvertiert die Antwort in JSON-Format
  })
  .then(function (data) {
    console.log("Daten vom Server erhalten:", data);
  })
  .catch((error) => {
    console.error("Fehler beim Abrufen der Daten:", error);
  });
```

## Asynchrone Programmierung

In Javascript unterscheidet man zwischen asynchroner und synchroner Programmierung.

Beispiel:
Webseiten Besuch.

Angenommen, du hast eine Webseite, die mehrere Bilder von einem Server laden muss, um sie anzuzeigen. Wenn die Bilder synchron geladen würden, würde jede Bildanforderung nacheinander verarbeitet werden. Das bedeutet, dass die Seite blockiert würde, bis jedes Bild vollständig geladen ist. Dies kann zu einer schlechten Benutzererfahrung führen, insbesondere wenn es sich um eine Seite mit vielen Bildern handelt, da die Benutzer gezwungen wären, lange zu warten, bis alle Bilder angezeigt werden.

```javascript
// Synchroner Code
console.log("1. Start");

// Annahme: Eine Funktion fetchData synchronisiert Daten vom Server
function fetchData() {
  return "Daten vom Server";
}

// Daten synchron abrufen
const data = fetchData();
console.log("2. Daten erhalten:", data);

console.log("3. Ende");
```

```javascript
// Asynchroner Code
console.log("1. Start");

// Annahme: Eine asynchrone Funktion fetchDataAsync, die Daten vom Server abruft
function fetchDataAsync() {
  setTimeout(() => {
    console.log("Daten vom Server erhalten");
  }, 2000); // Annahme: 2 Sekunden Verzögerung für die Serverantwort
}

// Daten asynchron abrufen
fetchDataAsync();

console.log("2. Ende");
```

Erklärung:

Um in Javascript eine Funktion asynchron zu machen, muss einfach bei der Funktiondefinition ein async vor die Funktion geschrieben werden. Um dann auf eine asynchrone Funktion zu warten, wird das keyword `await` verwendet;

Beispiel:

```javascript
async function getData(data) {
  const data = await fetch("https://google.com");
  return data;
}

const getData = async (data) => {
  const data = await fetch("https://google.com");
  return data;
};
```
