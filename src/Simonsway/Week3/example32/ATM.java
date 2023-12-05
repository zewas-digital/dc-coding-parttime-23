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

package solutions.Simon.example32;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        int balance = 0;

        while (true) {

            System.out.println("Herzlich Willkommen Simon Eiler");
            System.out.println("1.Einzahlen");
            System.out.println("2.Auszahlen");
            System.out.println("3.Kontostand");
            System.out.println("4.Beenden");


            Scanner scanValue = new Scanner(System.in);

            int value = scanValue.nextInt();


            if (value == 1) {
                System.out.println("Bitte Betrag Eingeben");
                value = scanValue.nextInt();
                System.out.println("Ihr aktueller Kontostand ist");
                System.out.println(balance = balance + value);
            } else if (value == 2) {
                System.out.println("Welchen Betrag wollen sie abheben?");
                value = scanValue.nextInt();
                System.out.println("Ihr aktueller Kontostand ist");
                System.out.println(balance = balance - value);
            } else if (value == 3) {
                System.out.println("Ihr aktueller Kontostand ist" + balance);
            } else if (value == 4) {
                System.out.println("Auf wiedersehen");
            } else {
                System.out.println("Danke");
            }
        }
    }
    }
