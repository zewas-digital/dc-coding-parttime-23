package michael_k.weekend2;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.
 */

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_3_NumOfSundays {

    public static void main(String[] args) {

        Scanner inputKonsole = new Scanner ( System.in );
        Calendar cal = Calendar.getInstance ();
        int tageImMonat;

        while ( true ) {
            // Ermitteln der Benutzereingaben
            System.out.print ( "Jahr:" );
            int year = inputKonsole.nextInt ( );
            System.out.print ( "Monat:" );
            int month = inputKonsole.nextInt ( ) - 1;

            // Überschreiben des Kalenders mit den Buntzerdaten
            cal.set ( year, month, 1 );

            //Erster Wochentag und Jahrestag des ausgewähleten Monats ermitteln
            int ersterWochentagImMonat = cal.get ( Calendar.DAY_OF_WEEK );
            int ersterJahrestagImMonat = cal.get ( Calendar.DAY_OF_YEAR );

            //Kalender überschreiben mit dem ersten im Folgemonat
            cal.set ( year, month + 1, 1 );

            // erster Jahrestag im Folgemoant ermitteln
            int ersterJahrestagImFolgemonat = cal.get ( Calendar.DAY_OF_YEAR );

            // Kalender überschreiben mit dem letzten Tag im Jahr (31.12.XXXX)
            cal.set ( year, 11, 31 );

            // letzter Jahrestag ermitteln im Jahr (wegen Schaltjahr unterschiedlich
            int letzterJahrestag = cal.get ( Calendar.DAY_OF_YEAR );

            // ermitteln wie viel Tage der Monat hat
            if (ersterJahrestagImMonat < ersterJahrestagImFolgemonat) {
                tageImMonat = ersterJahrestagImFolgemonat - ersterJahrestagImMonat;
            } else {
                tageImMonat = letzterJahrestag - ersterJahrestagImMonat + ersterJahrestagImFolgemonat;
            }

            //ermitteln wie viele Sonntage der jeweilige Monat hat
            //int sundays = ( tageImMonat - ( 8 - ersterWochentagImMonat ) ) / 7 + 1;
            int counter = 0;
            for (int i = 1; i <=tageImMonat; i++) {
                cal.set ( year, month , i );
                if (cal.get ( Calendar.DAY_OF_WEEK ) == 1) {
                    counter++;
                }
            }

            System.out.println ( counter );
            System.out.println ( );
            System.out.println ( "Tage im Monat: " + tageImMonat );
            System.out.println ( "erster Wochentag: " + ersterWochentagImMonat );
            System.out.println ( "erster Jahrestag im Monat: " + ersterJahrestagImMonat );
            System.out.println ( "erster Jahrestag im Folgemonat: " + ersterJahrestagImFolgemonat );
            System.out.println ( "letzter jahrestag: " + letzterJahrestag );
        }

    }

}
