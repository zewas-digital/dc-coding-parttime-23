package solutions.claudia.week3.example35;

import java.util.Random;
import java.util.Scanner;

/*
Erstelle ein Spiel, welche der Spieler herausfordert, eine Zahl zwischen 0 und 9999 zu erraten.

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
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int [] myNumber = {-1, -1, -1, -1}; //Zahl des Computergegners
        int [] yourNumber = new int[]{-1, -1, -1, -1};//Zahl des Nutzers
        int [] hasMineMatch = { -1, -1, -1, -1};
        int [] hasYoursMatch = { -1, -1, -1, -1};

        int rightPlace = 0;//Anzahl der Ziffern, die am richtigen Platz sind
        int notRightPlace; //Anzahl der Ziffern, die am falschen Platz sind
        boolean found = false;
        int numberOfDigits = 0; //Anzahl der Stellen von myNumber;
        int numberOfTries = 0;

        //"Zufalls"zahl, die geraten werden soll
        int numberToGuess = rand.nextInt(10000);
        int temp = numberToGuess;
        //Ziffern der Zahl werden in Array gespeichert

        for (int i = myNumber.length - 1; i >= 0; i--) {
            if (temp != 0) {
                myNumber[i] = temp % 10;
                temp = temp / 10;
                numberOfDigits++;
            }
        }
        //System.out.println("number of digits " + numberOfDigits);

        System.out.println("Rate eine Zahl zwischen 0 und 9999!");
        System.out.println("Du hast 20 Versuche.");

        while (rightPlace != numberOfDigits && numberOfTries < 20) { //solange noch nicht alle Zahlen richtig geraten sind
            rightPlace = 0;
            notRightPlace = 0;
            numberOfTries++;
            System.out.print("Gib Deine Zahl ein: ");
            int numberGuessed = scanner.nextInt();
            int temp2 = numberGuessed;

            //Ziffern der Zahl werden getrennt gespeichert
            for (int i = yourNumber.length - 1; i >= 0; i--) {
                if (temp2 != 0) {
                    yourNumber[i] = temp2 % 10;
                    temp2 = temp2 / 10;
                }
            }

            //Finde alle Zahlen, die am richtigen Platz sind:
            for (int i = 0; i < myNumber.length; i++) {
                if (myNumber[i] != -1 && myNumber[i] == yourNumber[i]){
                    hasMineMatch[i] = i;
                    hasYoursMatch[i] = i;
                    rightPlace++;
                }
            }
            //Finde alle Zahlen, die am falschen Platz sind:
            for (int i = 0; i < myNumber.length; i++) {
                if (hasMineMatch[i] < 0 && myNumber[i] != -1) {
                    for (int j = 0; j < hasYoursMatch.length; j++) {//j < yourNumber.length ?
                        if (hasYoursMatch[j] < 0 && myNumber[i] == yourNumber[j] && !found) {
                            hasMineMatch[i] = j;
                            hasYoursMatch[j] = i;
                            notRightPlace++;
                            found = true;
                        }
                    }
                    found = false;
                }
            }

            System.out.println("Anzahl Versuche: " + numberOfTries);
            System.out.println("Richtige Ziffern am richtigen Platz: " + rightPlace);
            System.out.println("Richtige Ziffern am falschen Platz: " + notRightPlace);
            //System.out.println("Das war meine Zahl: " + numberToGuess);
            //System.out.println("Das war Deine Zahl: " + numberGuessed);

            for (int i = 0; i < hasMineMatch.length; i++) {
                hasMineMatch[i] = -1;
                hasYoursMatch[i] = -1;
                yourNumber[i] = -1;
            }
        }
        if (rightPlace == numberOfDigits) System.out.println("Du hast gewonnen!");
        else System.out.println("Leider verloren");
    }
}
