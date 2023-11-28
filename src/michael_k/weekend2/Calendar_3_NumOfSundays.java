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

        while(true) {

            // input von der Konsole
            String input = userInput ();
            String[] inputArray = input.split ( "\\." );

            int month = Integer.parseInt ( inputArray[0] ) - 1;
            int year = Integer.parseInt ( inputArray[1] );

            // Überschreiben des Kalenders mit den Buntzerdaten
            cal.set ( year, month, 1 );

            // ermitteln wie viel Tage der Monat hat
            int tageImMonat = cal.getActualMaximum ( Calendar.DAY_OF_MONTH );

            //Erster Wochentag und Jahrestag des ausgewähleten Monats ermitteln
            int ersterWochentagImMonat = cal.get ( Calendar.DAY_OF_WEEK );
            int ersterJahrestagImMonat = cal.get ( Calendar.DAY_OF_YEAR );

            //Werktage zählen
            int counter = 0;
            for (int i = 1; i <=tageImMonat; i++) {
                cal.set ( year, month , i );
                if (cal.get ( Calendar.DAY_OF_WEEK ) == 1) {
                    counter++;
                }
            }

            //System.out.println (sundays);
            System.out.println ( );
            System.out.println ( counter );
            System.out.println ( year);
            System.out.println ( month);
            System.out.println ( tageImMonat);
            System.out.println ( );

        }


    }
    static String userInput( ) {

        Scanner inputKonsole = new Scanner ( System.in );
        boolean inputCorrect = false;
        String input = null;

        while ( !inputCorrect ) {

            System.out.print ( "Geben sie das Jahr und den Monat im folgendem Format ein. [mm.jjjj]" );
            input = inputKonsole.next ( );

            if (!input.matches ( "^[0-9]{2,2}.[0-9]{4,4}" )) {
                System.out.println ( "Falsches Datumsformat" );
            } else {
                inputCorrect = true;
            }
        }
        return input;
    }

}
