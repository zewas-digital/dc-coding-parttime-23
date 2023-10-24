package MichaelReal.week3;

import java.util.Random;
import java.util.Scanner;

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
public class Game {

        public static void main(String[] args) {
            Random rand = new Random();
            int secretNumber = rand.nextInt(10000);
            int attempts = 0;

            System.out.println("Willkommen zum Zahlenraten-Spiel!");
            System.out.println("Der Computer hat sich eine Zahl zwischen 0 und 9999 ausgedacht.");

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Gib deine Vermutung ein (0-9999): ");
                int userGuess = scanner.nextInt();

                if (userGuess < 0 || userGuess > 9999) {
                    System.out.println("Ungültige Eingabe. Bitte gib eine Zahl zwischen 0 und 9999 ein.");
                    continue;
                }

                attempts++;

                if (userGuess == secretNumber) {
                    System.out.println("Herzlichen Glückwunsch! Du hast die richtige Zahl erraten: " + secretNumber);
                    break;
                } else {
                    String result = checkGuess(userGuess, secretNumber);
                    System.out.println(result);

                    if (attempts >= 20) {
                        System.out.println("Du hast keine Versuche mehr. Die richtige Zahl war: " + secretNumber);
                        break;
                    }
                }
            }

            scanner.close();
        }

        public static String checkGuess(int guess, int secretNumber) {
            String guessStr = Integer.toString(guess);
            String secretStr = Integer.toString(secretNumber);
            int correctDigits = 0;
            int misplacedDigits = 0;

            for (int i = 0; i < 4; i++) {
                if (guessStr.charAt(i) == secretStr.charAt(i)) {
                    correctDigits++;
                } else if (secretStr.contains(String.valueOf(guessStr.charAt(i)))) {
                    misplacedDigits++;
                }
            }

            return correctDigits + " Ziffern sind korrekt, weitere " + misplacedDigits + " Ziffern sind vorhanden.";
        }
    }


