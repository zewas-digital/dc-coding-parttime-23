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

package solutions.saifedine.weekend1.example32;

import java.util.Scanner;

public class ATM {
    static int balance = 0;

    public static void main(String[] args) {

        Scanner Eingabe = new Scanner(System.in);

        while (true) {

            System.out.println("Wählen Sie eine Funktion:");
            System.out.println("1. Einzahlen");
            System.out.println("2. Auszahlen");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");
            System.out.println("Geben Sie Ihre Auswahl: ");


            int intAuswahl = Eingabe.nextInt();

            if (intAuswahl == 1) {

                Einzahlen();

            } else if (intAuswahl == 2) {

                Auszahlen();

            } else if (intAuswahl == 3) {

                System.out.println("Ihr Kontostand ist: " + balance);

            } else if (intAuswahl == 4) {

                System.out.println("Aufwiedersehen, bis zum nächsten Mal!");
                break;


            }

        }
    }


    static void Einzahlen() {

        Scanner Eingabe = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Betrag zum Einzahlen ein: ");
        int Ein = Eingabe.nextInt();

        balance += Ein;

        System.out.println("Ihr Kontostand beträgt: " + balance);

    }

    static void Auszahlen() {

        Scanner Eingabe = new Scanner(System.in);

        System.out.println("Bitte geben Sie den Betrag zum Auszahlen ein: ");
        int Aus = Eingabe.nextInt();

        balance -= Aus;

        System.out.println("Ihr Kontostand beträgt: " + balance);

    }

}


