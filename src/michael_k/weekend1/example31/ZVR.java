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

package solutions.michael_k.weekend1.example31;

import java.util.Scanner;

public class ZVR {
    public static void main(String[] args) {
        // Tipp zur Validierung von Vereinsname und -sitz
      while(true) { //System.out.println("Beispiel".length());
          boolean ZVRabfrage = false;
          boolean NameSitzabfrage = true;


          Scanner inputKonsole = new Scanner ( System.in );

          System.out.println ( "Geben sie die ZVR-Zahl oder den Vereinsnamen und Sitz an:" );
          System.out.println ( );

          System.out.print ( "ZVR-Zahl: " );
          int ZVR = inputKonsole.nextInt ( );

          System.out.print ( "Vereinsname: " );
          String Name = inputKonsole.next ( );

          System.out.print ( "Vereinsitz: " );
          String Sitz = inputKonsole.next ( );

          if (ZVR >= 100000000 && ZVR <= 999999999) {
              ZVRabfrage = true;
          }
          if (Name.equals ( "-1" )  || Sitz.equals ( "-1" )) {
              NameSitzabfrage = false;
          }


          if (ZVRabfrage || NameSitzabfrage) {
              System.out.println ( "Login ist erfolgreich" );
          } else {
              System.out.println ( "Login fehlgeschlagen" );
          }
      }
    }
}
