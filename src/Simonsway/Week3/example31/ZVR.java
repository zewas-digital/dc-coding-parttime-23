/*
Diese Aufgabe orientiert sich an der Onlineoberfläche für Abfragen aus dem zentralen Vereinsregister des BMI.
Die Website kann hier abgerufen werden: https://citizen.bmi.gv.at/at.gv.bmi.fnsweb-p/zvn/public/Registerauszug

Das besondere ist, dass eine Abfrage auf zwei Art und Weisen möglich ist:
1. Eingabe einer gültigen ZVR Nummer zwischen 100000000 und 999999999.
2. Eingabe des Vereinsnamens UND des Vereinssitzes.

Der Nutzer wird nacheinander aufgefordert die drei Werte einzugeben. Möchte er keinen angeben, kann er den Input -1 geben.

Nachdem alle drei Werte erhoben sind, soll geprüft werden, ob eine der beiden Bedingungen erfüllt wurde.
Wenn ja, soll ausgegeben werden "Abfrage erfolgreich!". Wenn nicht, soll ausgegeben werden "Kein Verein gefunden."

 Tipp zur Validierung von Vereinsname und -sitz System.out.println("Beispiel".length());

 */

package solutions.Simon.example31;

import java.util.Scanner;

public class ZVR {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("ZVR Nummer: ");
        int zvr = scan.nextInt();

        System.out.println("Vereinsname: ");
        String vereinsName = scan.next();

        System.out.println("Vereinssitz: ");
        String vereinsSitz = scan.next();

        if (zvr >= 100000000 && zvr <= 999999999) {
            System.out.println("Abfrage erfolgreich!");
        }
        else if (vereinsName.length() >= 5 && vereinsSitz.length() >= 5) {
            System.out.println("Abfrage erfolgreich!");
        }
        else {
            System.out.println("Kein Verein gefunden.");
        }
    }
}
