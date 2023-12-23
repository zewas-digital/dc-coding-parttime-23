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

package Matthias.week2_weekend_Scanner;

import java.util.Scanner;

public class example_32_ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Kontostand=200;
        int EingezahltesGeld=0;
        int AbgehobenesGeld=0;
        int Menüabfrage =0;
        boolean stateprogramm=true;
        System.out.println("Willkomen am Bankautomat");
        while (stateprogramm) {

            System.out.println("Folgende Funktionen bieten wir an: ");
            System.out.println("1. Einzahlen");
            System.out.println("2. Auszahlen");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");
            System.out.println("Tippen Sie 1-4 ein um dem Menü Punkt auszuwählen ");


            Menüabfrage = scanner.nextInt();
            //Einzahlen
            if (Menüabfrage == 1) {
                System.out.println("1. Einzahlen: Geben Sie die Einzahlsumme ein");
                EingezahltesGeld = scanner.nextInt();
                System.out.println("Neuer Kontostand: " + (Kontostand+EingezahltesGeld));
            }

            //Auszahlen
            if (Menüabfrage == 2) {
                System.out.println("2. Auszahlen");
                AbgehobenesGeld= scanner.nextInt();
                System.out.println("Ihr Kontostand ist: " + (Kontostand-AbgehobenesGeld));

            }

            //Kontostand
            if (Menüabfrage == 3) {
                System.out.println("3. Kontostand anzeigen");
                System.out.println("Ihr Kontostand ist: " + Kontostand);
            }

            //Beenden
            if (Menüabfrage == 4) {
                System.out.println("4. Beenden");
                stateprogramm=false;
            }

        }

    }
}
