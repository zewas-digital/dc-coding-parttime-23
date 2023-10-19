package florian.week3.example35;

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
        int value = rand.nextInt(10000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib eine Zahl zwischen 0 und 9999 ein: ");
        int inputuser = scanner.nextInt();

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < value; j++) {

            }
        }



    }
}
