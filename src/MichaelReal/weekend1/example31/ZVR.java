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

package solutions.michaelreal.weekend1.example31;

import java.util.Scanner;

public class ZVR {
    public static void main(String[] args) {
        // Tipp zur Validierung von Vereinsname und -sitz
        System.out.println("Beispiel".length());

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die ZVR-Nummer ein (-1 um zu überspringen): ");
        long zvrNummer = scanner.nextLong();

        if (zvrNummer != -1) {
            if (zvrNummer >= 100000000 && zvrNummer <= 999999999) {
                System.out.println("Abfrage erfolgreich");
            } else {
                System.out.println("Kein Verein gefunden");
            }
        } else {
            scanner.nextLine();
            System.out.print("Gib den Vereinsnamen ein: ");
            String vereinsname = scanner.nextLine();

            System.out.print("Gib den Vereinssitz ein: ");
            String vereinssitz = scanner.nextLine();

            if (vereinsname.length() > 0 && vereinssitz.length() > 0) {
                System.out.println("Abfrage erfolgreich");
            } else {
                System.out.println("Kein Verein gefunden");
            }

        }
    }
}
