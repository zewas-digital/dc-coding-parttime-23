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

package Matthias.week2.weekend1.example31;

import java.util.Scanner;

public class ZVR {
        // Überprüft die ZVR und gibt eine Status zurück
        static boolean statusZVR(int minZVRnumber, int maxZVRnumber) {

            //Variabeln der Methode

            int intNumber = 0;            // lokaler Speicher für ZVR Zahl des Benutzers
            boolean statusZVR = false;     // Status als Rückgabeparameter für Fehler handling

            //Aufruf von Scanner und Implimentierung von Klasse im Java Projekt
            Scanner scanner = new Scanner(System.in);

            //Benutzer Hinweis zur Eingabe
            System.out.println("Tippen Sie das Clientnummer ein: ");

            // Benutzer Abfrage und Speichern in eine Variable
            intNumber = scanner.nextInt();

            if (intNumber >= maxZVRnumber || intNumber < minZVRnumber) {
                statusZVR = true;
            } else if (intNumber == -1) {
                statusZVR = true;
            }
            return statusZVR;
        }

        static boolean statusVerein() {
            String Vereinsname;     // lokaler Speicher für Verreinsname des Benutzers
            String Vereinssitz;     // lokaler Speicher für Vereinssitz des Benutzers

            boolean statusVerein = false;     // Status als Rückgabeparameter für Fehler handling

            //Aufruf von Scanner und Implimentierung von Klasse im Java Projekt
            Scanner scanner = new Scanner(System.in);

            //Benutzer Hinweis zur Eingabe
            System.out.println("Geben Sie den Vereinsname ein ");

            // Benutzer Abfrage und Speichern in eine Variable
            Vereinsname = scanner.next();
            // Prüfen des Vereinsnamen
            if (Vereinsname.length()!=0) {
                statusVerein = true;
            } else if (Vereinsname.equals("-1")) {
                statusVerein = true;
            }
            System.out.println("Geben Sie den Vereinssitz ein ");
            Vereinssitz = scanner.next();
            // Prüfen des Vereinsnamen
            if (Vereinssitz.length()!=0) {
                statusVerein = false;
            } else if (Vereinssitz.equals("1")){
                statusVerein = false;
            }
            return statusVerein;
        }

        public static void main(String[] args) {
            // Gültigkeitsbereich des Clientenbereich

            int iMinClientnumber = 100000000;
            int iMaxClientnumber = 999999999;
            boolean bStatus = true;
            while (bStatus) {

                if (statusZVR(iMinClientnumber, iMaxClientnumber)) {
                    System.out.println("Sie müssen entweder den ZVR namen eingeben ");
                    bStatus = false;
                }else if (statusVerein()) {
                    System.out.println("Kein Verein gefunden.");
                    bStatus = false;
                }
                System.out.println("Abfrage erfolgreich!");
            }


        }
}

