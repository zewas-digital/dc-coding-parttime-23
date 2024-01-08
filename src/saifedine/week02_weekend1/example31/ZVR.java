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

package saifedine.week02_weekend1.example31;


import java.util.Scanner;

public class ZVR {

    public static void main(String[] args) {

        int zvrNummer = 0;
        String vereinsName = " ";
        String vereinsSitz = " ";

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Bitte geben Sie die ZVR Nummer ein: ");
        zvrNummer = eingabe.nextInt();

        System.out.println("Bitte geben Sie den Vereinsnamen ein: ");
        vereinsName = eingabe.next();

        System.out.println("Bitte geben Sie den Vereinssitze ein: ");
        vereinsSitz = eingabe.next();

        System.out.println("ZVR Nummer: " + zvrNummer);
        System.out.println("Vereinsname: " + vereinsName);
        System.out.println("Vereinssitz: " + vereinsSitz);

        if ((zvrNummer >= 100000000 && zvrNummer <= 999999999) || ((vereinsName.length() > 2 && vereinsSitz.length() > 2))){
            System.out.println("Abfrage erfolgreich!");
        }
        else if ((zvrNummer == -1) || (vereinsName.equals("-1") && vereinsSitz.equals("-1"))) {
            System.out.println("Kein Verein gefunden.");
        }
        else {
            System.out.println("Eingabe ungültig, bitte versuchen Sie es noch einmal: ");
        }
        System.out.println();
    }
}