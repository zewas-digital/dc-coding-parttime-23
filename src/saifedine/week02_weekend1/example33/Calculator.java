/*
Programmiere einen Rechner mit den nachfolgenden Operationen:
1. Addieren
2. Subtrahieren
3. Multiplizieren
4. Dividieren
5. Potenzieren

Der Nutzer kann eine der fünf Operationen auswählen und zwei Zahlen zur Berechnung eingeben.
Gib' den Rechenweg und das Ergebnis auf der Console aus. Zum Beispiel: 5 ^ 2 = 25
 */

// Scanner für die Eingabe der Operation
// Scanner für die Eingabe der Zahlen
// Methoden für die Operationen

package saifedine.week02_weekend1.example33;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte wählen Sie unter folgenden Operationen: 1. Addieren, 2. Subtrahieren, 3. Multiplizieren, 4. Dividieren, 5. Potenzieren.");
        int operation = eingabe.nextInt();

        if (operation < 1 ||  operation > 5){
            System.out.println("Auswahl ungültig! Bitte versuchen Sie es nochmal");
        }
        else {
            System.out.println("Geben Sie die 1. Zahl der Operation ein: ");
            double zahl1 = eingabe.nextDouble();

            System.out.println("Geben Sie die 2. Zahl der Operation ein: ");
            double zahl2 = eingabe.nextDouble();

            while (true) {

                if (operation == 1) {
                    addieren(zahl1, zahl2);
                    break;
                }

                if (operation == 2) {
                    subtrahieren(zahl1, zahl2);
                    break;
                }

                if (operation == 3) {
                    multiplizieren(zahl1, zahl2);
                    break;
                }

                if (operation == 4) {
                    dividieren(zahl1, zahl2);
                    break;
                }

                if (operation == 5) {
                    potenzieren(zahl1, zahl2);
                    break;
                }
            }
        }
    }

    static void addieren (double zahl1, double zahl2){

        double ergebnis = 0;

        ergebnis = zahl1 + zahl2;

        System.out.println("Das Ergebnis ist: " + zahl1 + " + " + zahl2 + " = " + ergebnis);
    }

    static void subtrahieren (double zahl1, double zahl2){

        double ergebnis = 0;

        ergebnis = zahl1 - zahl2;

        System.out.println("Das Ergebnis ist: " + zahl1 + " - " + zahl2 + " = " + ergebnis);
    }

    static void multiplizieren (double zahl1, double zahl2){

        double ergebnis = 0;

        ergebnis = zahl1 * zahl2;

        System.out.println("Das Ergebnis ist: " + zahl1 + " * " + zahl2 + " = " + ergebnis);
    }

    static void dividieren (double zahl1, double zahl2){

        double ergebnis = 0;

        ergebnis = zahl1 / zahl2;

        System.out.println("Das Ergebnis ist: " + zahl1 + " / " + zahl2 + " = " + ergebnis);
    }

    static void potenzieren (double zahl1, double zahl2){

        double ergebnis = 0;

        ergebnis = Math.pow(zahl1, zahl2);

        System.out.println("Das Ergebnis ist: " + zahl1 + " ^ " + zahl2 + " = " + ergebnis);
    }
}