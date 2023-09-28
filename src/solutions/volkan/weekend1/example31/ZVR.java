/*
Diese Aufgabe orientiert sich an der Onlineoberfläche für Abfragen aus dem zentralen Vereinsregister des BMI.
Die Website kann hier abgerufen werden: https://citizen.bmi.gv.at/at.gv.bmi.fnsweb-p/zvn/public/Registerauszug

Das besondere ist, dass eine Abfrage auf zwei Art und Weisen möglich ist:
1. Eingabe einer gültigen ZVR Nummer zwischen 100000000 und 999999999.
2. Eingabe des Vereinsnamens UND des Vereinssitzes.

Der Nutzer wird nacheinander aufgefordert die drei Werte einzugeben. Möchte er keinen angeben, kann er den Input -1 geben.

Nachdem alle drei Werte erhoben sind, soll geprüft werden, ob eine der beiden Bedingungen erfüllt wurde.
Wenn ja, soll ausgegeben werden "Abfrage erfolgreich!". Wenn nicht, soll ausgegeben werden "Kein Verein gefunden."


 */

package solutions.volkan.weekend1.example31;

import java.util.Scanner;

public class ZVR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. ZVR-Zahl ");
        System.out.println("2. Vereinsname ");
        System.out.println("3. Vereinssitz ");
        int abfrageArt = scanner.nextInt();

        switch (abfrageArt) {
            case 1:
                // ZVR-Zahl abfragen
                System.out.println("Geben Sie die ZVR-Zahl ein: ");
                int zvrNummer = scanner.nextInt();
                // ZVR-Zahl prüfen
                if (zvrNummer < 100000000 || zvrNummer > 999999999) {
                    System.out.println("Die ZVR-Nummer ist ungültig.");
                    return;
                }
                // Abfrage durchführen
                System.out.println("Der Verein mit der ZVR-Nummer " + zvrNummer + " wurde gefunden.");
                break;
            case 2:
                // Vereinsnamen und Vereinssitz abfragen
                System.out.println("Geben Sie den Vereinsnamen ein: ");
                String vereinName = scanner.next();
                System.out.println("Geben Sie den Vereinssitz ein: ");
                String vereinSitz = scanner.next();
                // Abfrage durchführen
                System.out.println("Der Verein mit dem Namen " + vereinName + " und dem Sitz in " + vereinSitz + " wurde gefunden.");
                break;
            default:
                System.out.println("Ungültige Abfrageart.");
        }

    }
}