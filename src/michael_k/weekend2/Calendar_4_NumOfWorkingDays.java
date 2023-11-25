package michael_k.weekend2;

/*
Aufgabe 4:

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Arbeitstage zurückgibt (Mo-Fr). Teste diese Methode in der Start() Methode. Wie dieses Problem gelöst wird, steht dir völlig frei.

Aufruf:
Console.WriteLine(GetWorkdays(2021, 6));

Ausgabe:
22

Aufruf:
Console.WriteLine(GetWorkdays(2021, 3));

Ausgabe:
23

Aufruf:
Console.WriteLine(GetWorkdays(2021, 2));

Ausgabe:
20
     */

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_4_NumOfWorkingDays {

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

            //Kalender überschreiben mit dem ersten im Folgemonat
            cal.set ( year, month + 1, 1 );

            //Werktage zählen
            int counter = 0;

            for (int i = 1; i <= tageImMonat; i++) {
                cal.set ( year, month, i );
                if (cal.get ( Calendar.DAY_OF_WEEK ) > 1 && cal.get ( Calendar.DAY_OF_WEEK ) < 7) {
                        counter++;
                }
            }

            //System.out.println (sundays);
            System.out.println ( );
            System.out.println ( counter );
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
