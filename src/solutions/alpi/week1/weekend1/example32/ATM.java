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

package solutions.alpi.week1.weekend1.example32;

import java.util.Scanner;

public class ATM {
    private static int kontostand = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    einzahlen(scanner);
                    break;
                case 2:
                    auszahlen(scanner);
                    break;
                case 3:
                    kontostandAnzeigen();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Ungültige Auswahl.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("1. Einzahlen");
        System.out.println("2. Auszahlen");
        System.out.println("3. Kontostand anzeigen");
        System.out.println("4. Beenden");
        System.out.print("Wählen Sie eine Funktion: ");
    }

    private static void einzahlen(Scanner scanner) {
        System.out.print("Betrag einzahlen: ");
        int einzahlung = scanner.nextInt();
        kontostand += einzahlung;
        System.out.println("Neuer Kontostand: " + kontostand);
    }

    private static void auszahlen(Scanner scanner) {
        System.out.print("Betrag auszahlen: ");
        int auszahlung = scanner.nextInt();
        if (auszahlung > kontostand) {
            System.out.println("Auszahlungsbetrag zu hoch.");
        } else {
            kontostand -= auszahlung;
            System.out.println("Neuer Kontostand: " + kontostand);
        }
    }

    private static void kontostandAnzeigen() {
        System.out.println("Kontostand: " + kontostand);
    }
}