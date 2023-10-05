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

package solutions.volkan.weekend1.example32;
import java.util.Scanner;
public class ATM {
    private static int kontostand = 1000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen.");

        while (true) {
            System.out.println("Bitte wählen Sie eine Option: ");
            System.out.println("1. Einzahlen");
            System.out.println("2. Auszahlen");
            System.out.println("3. Kontostand anzeigen");
            System.out.println("4. Beenden");

            int option = scanner.nextInt();

            // Option ausführen
            switch (option) {
                case 1:
                    // Einzahlen
                    System.out.println("Wie viel möchten Sie einzahlen?");
                    int einzahlung = scanner.nextInt();
                    kontostand += einzahlung;
                    System.out.println("Der neue Kontostand beträgt " + kontostand + " Euro.");
                    break;
                case 2:
                    // Auszahlen
                    System.out.println("Wie viel möchten Sie auszahlen?");
                    int auszahlung = scanner.nextInt();
                    if (auszahlung > kontostand) {
                        System.out.println("Sie haben nicht genug Geld auf dem Konto.");
                        break;
                    }
                    kontostand -= auszahlung;
                    System.out.println("Sie haben " + auszahlung + " Euro abgehoben. Der neue Kontostand beträgt " + kontostand + " Euro.");
                    break;
                case 3:
                    // Kontostand anzeigen
                    System.out.println("Der aktuelle Kontostand beträgt " + kontostand + " Euro.");
                    break;
                case 4:
                    // Beenden
                    System.out.println("Vielen Dank für Ihre Nutzung.");
                    return;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        }
    }
}