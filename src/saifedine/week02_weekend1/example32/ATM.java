/*
Programmiere einen Bankomaten.
Der Kunde kann zwischen den Funktionen
1. Einzahlen
2. Auszahlen
3. Kontostand anzeigen
4. Beenden
wählen.

Mit der Funktion "Einzahlen" kann die Kundschaft einen bestimmten von der Console eingelesenen Betrag auf das Bankkonto einzahlen.
Anschließend wird der neue Kontostand angezeigt.

Mit der Funktion "Auszahlen" kann die Kundschaft einen bestimmten von der Console eingelesenen Betrag vom Bankkonto abheben.
Anschließend wird der neue Kontostand angezeigt.

Mit der Funktion "Kontostand anzeigen" wird der aktuelle Kontostand angezeigt.

Das Programm wird erst beendet, wann die Kundschaft die Funktion "Beenden" aufruft.

 */

package saifedine.week02_weekend1.example32;

import java.util.Scanner;

public class ATM {
    static int balance = 0;

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        while (true) {

            System.out.println("Wählen Sie eine Funktion:");
            System.out.println("1. Einzahlen");
            System.out.println("2. Auszahlen");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");
            System.out.println("Geben Sie Ihre Auswahl: ");

            int intAuswahl = eingabe.nextInt();

            if (intAuswahl >= 1 && intAuswahl <=4){

                if (intAuswahl == 1) {

                    einzahlen();

                } else if (intAuswahl == 2) {

                    auszahlen();

                } else if (intAuswahl == 3) {

                    System.out.println("Ihr Kontostand ist: " + balance);

                } else {

                    System.out.println("Aufwiedersehen, bis zum nächsten Mal!");
                    break;

                }
            } else {

                System.out.println("Ihre Eingabe ist ungültig! Probieren Sie es nochmal.");
                System.out.println();

            }
        }
    }

    static void einzahlen() {

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Betrag zum Einzahlen ein: ");
        int ein = eingabe.nextInt();

        balance += ein;

        System.out.println("Ihr Kontostand beträgt: " + balance);
    }

    static void auszahlen() {

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie den Betrag zum Auszahlen ein: ");
        int aus = eingabe.nextInt();

        balance -= aus;

        System.out.println("Ihr Kontostand beträgt: " + balance);
    }
}