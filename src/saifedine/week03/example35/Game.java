package saifedine.week03.example35;

/*
Erstelle ein Spiel, welche der Spieler fordert heraus eine Zahl zwischen 0 und 9999 zu erraten.

Ablauf:

    Der Computer denkt sich eine Zahl aus.

Code-Zeile:
Random rand = new Random();
int value = rand.nextInt(10000);

    Der Benutzer muss durch Konsole eine Zahl eingeben
    Das Spiel antwortet
        So viele Ziffern sind korrekt und auf dem richtigen Platz
        So viele Ziffern sind vorhanden, aber stehen auf dem falschen Platz


Ausgabe:
( Der Computer hat die Zahl: 1234 )
Der Spieler wählt die 2354
Die Antwort lautet: 1 Ziffer ist korrekt, weitere 2 Ziffern sind vorhanden

Das Spiel endet, wenn:

    der Spieler die richtige Zahl erraten hat
    der Spieler hat nach 20 Versuchen immer noch kein Erfolg
 */

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        // Hinweis: diverse Erklärungen finden sich unter V04_Zeichenkette im Udemy Kurs "Java-leicht-gemacht"!!!

// Erzeugt eine Instanz der Random-Klasse, die zur Generierung von Zufallszahlen verwendet wird
        Random rand = new Random();

// Generiert eine Zufallszahl zwischen 0 und 9999 und speichert sie in der Variable "value"
        int value = rand.nextInt(10000);
        System.out.println("Computerzahl: " + value);

// Gibt eine Nachricht aus, die den Benutzer darüber informiert, dass der Computer eine Zahl ausgedacht hat
        System.out.println("Der Computer hat eine Zahl zwischen 0 und 9999 ausgedacht.");
        System.out.println("Versuche diese Zahl zu erraten!");

// Erzeugt eine Instanz der Scanner-Klasse, die zur Eingabe von Benutzereingaben verwendet wird
        Scanner scanner = new Scanner(System.in);

// Initialisiert die Anzahl der Versuche auf 0
        int attempts = 0;

// Startet eine Schleife, die solange läuft, wie die Anzahl der Versuche kleiner als 20 ist
        while (attempts < 20) {
// Fordert den Benutzer auf, eine Vermutung einzugeben und speichert sie in der Variablen "guess"
            System.out.print("Gib deine Vermutung ein: ");
            int guess = scanner.nextInt();

// Überprüft, ob die Vermutung des Benutzers mit der generierten Zahl übereinstimmt
            if (guess == value) {
// Gibt eine Erfolgsmeldung aus und beendet die Schleife, wenn die Vermutung korrekt ist
                System.out.println("Herzlichen Glückwunsch! Du hast die Zahl richtig erraten!");
                break;
            }

// Initialisiert Variablen, um die Anzahl der korrekten Ziffern und die Anzahl der Ziffern an der falschen Position zu speichern
            int correctDigits = 0;
            int incorrectPosition = 0;

// Konvertiert die Zufallszahl und die Vermutung des Benutzers in Zeichenketten
            String valueString = String.valueOf(value);
            //System.out.println("Zeichenkette Computerzahl: " + valueString);

            String guessString = String.valueOf(guess);
            //System.out.println("Zeichenkette Vermuttung: " + guessString);

// Startet eine Schleife, um die Ziffern der Vermutung des Benutzers zu überprüfen
            for (int i = 0; i < guessString.length(); i++) {
// Holt sich die Ziffer an der aktuellen Position der Vermutung des Benutzers
                char guessDigit = guessString.charAt(i);

// Überprüft, ob die Ziffer in der generierten Zahl enthalten ist
                if (valueString.indexOf(guessDigit) != -1) {
// Überprüft, ob die Ziffer an der richtigen Position ist und erhöht die entsprechenden Zähler
                    if (guessDigit == valueString.charAt(i)) {
                        correctDigits++;
                    } else if (valueString.contains(String.valueOf(guessString.charAt(i)))) {
                        incorrectPosition++;
                    }
                }
            }

// Gibt die Anzahl der korrekten Ziffern und die Anzahl der Ziffern an der falschen Position aus
            System.out.println(correctDigits + " Ziffer(n) ist/sind korrekt, " + "weitere " + incorrectPosition + " Ziffer(n) ist/sind vorhanden.");

// Erhöht die Anzahl der Versuche
            attempts++;
        }

// Überprüft, ob der Benutzer die Zahl nicht innerhalb von 20 Versuchen erraten hat und gibt die geheime Zahl aus
        if (attempts == 20) {
            System.out.println("Leider hast du die Zahl nicht innerhalb der 20 Versuche erraten.");
            System.out.println("Die geheime Zahl war " + value);
        }
    }
}