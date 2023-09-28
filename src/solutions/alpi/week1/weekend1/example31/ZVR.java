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

package solutions.alpi.week1.weekend1.example31;
import java.util.Scanner;
public class ZVR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Eingabe des ZVR Zahl
        System.out.print("ZVR-Zahl:");
        int ZVR  = scanner.nextInt();
        if (ZVR < 100000000 || ZVR < 999999999) {



        }
        // Eingabe Vereinsname
        System.out.print("Vereinsname: ");
        String Vereinsname = scanner.next();

        // Eingabe Vereinssitz
        System.out.print("Vereinssitz: ");
        String Vereinssitz = scanner.next();

        // Überprüfung von Vereinsname und Sitz
        if (Vereinsname.equals("Direktech") && Vereinssitz.equals("Wolfurt")) {
            System.out.println("Abfrage erfolgreich!");
        } else {
            System.out.println("Kein Verein gefunden");
        }
        // Scanner schließen
        scanner.close();




    }
}
