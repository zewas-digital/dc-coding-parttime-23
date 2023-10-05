/*
Diese Aufgabe orientiert sich an der Onlineoberfläche für Abfragen aus dem zentralen Vereinsregister des BMI.
Die Website kann hier abgerufen werden: https://citizen.bmi.gv.at/at.gv.bmi.fnsweb-p/zvn/public/Registerauszug

Das besondere ist, dass eine Abfrage auf zwei Arten und Weisen möglich ist:
1. Eingabe einer gültigen ZVR Nummer zwischen 100000000 und 999999999.
2. Eingabe des Vereinsnamens UND des Vereinssitzes.

Der Nutzer wird nacheinander aufgefordert die drei Werte einzugeben. Möchte er keinen angeben, kann er den Input -1 geben.

Nachdem alle drei Werte erhoben sind, soll geprüft werden, ob eine der beiden Bedingungen erfüllt wurde.
Wenn ja, soll ausgegeben werden "Abfrage erfolgreich!". Wenn nicht, soll ausgegeben werden "Kein Verein gefunden."


 */

package solutions.claudia.weekend1.example31;
import java.util.Scanner;
public class ZVR {
    public static void main(String[] args) {
        // Tipp zur Validierung von Vereinsname und -sitz
        System.out.println("Beispiel".length());
        int zvr = 0;
        String name = "-1";
        String sitz = "-1";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Falls ZVR-Nr. bekannt, diese eingeben; sonst -1: ");
        zvr = scanner.nextInt();
        System.out.print("Falls Vereinsname bekannt, diesen eingeben; sonst -1: ");
        name = scanner.next();
        System.out.print("Falls Vereinssitz bekannt, diesen eingeben; sonst -1: ");
        sitz = scanner.next();

        if ((zvr >= 100000000 && zvr <= 999999999) || (!name.equals("-1") && !sitz.equals("-1") && sitz.length() > 1)){
            System.out.println("Abfrage erfolgreich!");
        }
        else System.out.println("Kein Verein gefunden!");
    }
}
