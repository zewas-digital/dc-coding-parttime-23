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

public class Game_ohne_Erklärung {
    public static void main(String[] args) {

        Random rand = new Random();
        int value = rand.nextInt(10000);
        //System.out.println("Computerzahl: " + value);

        System.out.println("Der Computer hat eine Zahl zwischen 0 und 9999 ausgedacht.");
        System.out.println("Versuche diese Zahl zu erraten!");
        Scanner scanner = new Scanner(System.in);

        int attempts = 0;

        while (attempts < 20) {

            System.out.print("Gib deine Vermutung ein: ");
            int guess = scanner.nextInt();

            if (guess == value) {
                System.out.println("Herzlichen Glückwunsch! Du hast die Zahl richtig erraten!");
                break;
            }

            int correctDigits = 0;
            int incorrectPosition = 0;

            String valueString = String.valueOf(value);
            String guessString = String.valueOf(guess);

            for (int i = 0; i < guessString.length(); i++) {

                char guessDigit = guessString.charAt(i);

                if (valueString.indexOf(guessDigit) != -1) {

                    if (guessDigit == valueString.charAt(i)) {
                        correctDigits++;
                    }
                    else if (valueString.contains(String.valueOf(guessString.charAt(i)))) {
                        incorrectPosition++;
                    }
                }
            }

            System.out.println(correctDigits + " Ziffer(n) ist/sind korrekt, " + "weitere " + incorrectPosition + " Ziffer(n) ist/sind vorhanden.");
            attempts++;
        }

        if (attempts == 20) {
            System.out.println("Leider hast du die Zahl nicht innerhalb der 20 Versuche erraten.");
            System.out.println("Die geheime Zahl war " + value);
        }
    }
}