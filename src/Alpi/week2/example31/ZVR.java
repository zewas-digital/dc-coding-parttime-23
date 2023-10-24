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

package Alpi.week2.example31;

import java.util.Scanner;

public class ZVR {
    public static void main(String[] args) {
        // Tipp zur Validierung von Vereinsname und -sitz

        Scanner Eingabe = new Scanner(System.in);


        System.out.println("Geben Sie die ZVR Nummer ein: ");
        long longZVRNummer = Eingabe.nextLong();
        System.out.println("Geben Sie den ersten Teil des Vereinsname ein - ohne Abstand: ");
        String stringVereinsname = Eingabe.next();
        System.out.println("Geben Sie den Vereinssitze ein: ");
        String stringVereinssitz = Eingabe.next();

        if (longZVRNummer >= 100000000 && longZVRNummer <= 999999999) {

            System.out.println("Hier die Vereinsdaten: ");

        } else if (longZVRNummer == -1) {
            if (stringVereinsname.length() >= 3 && stringVereinssitz.length() >= 3) {

                System.out.println("Abfrage erfolgreich!");

            }
        }

    }


    //System.out.println("Beispiel".length());
}
