package michael_k.weekend2;

/*

Aufgabe: Calendar

Erstelle ein Programm, welches einen Kalender korrekt darstellt. Verwende GregorianCalendar und DateTime dafür, der aktuelle Tag soll speziell markiert werden.

Achte darauf, dass

    Der aktuellen Tag ist mit Stern gekennzeichnet ist
    Nicht jeder Monat am Montag beginnt
    Nicht jeder Monat am Sonntag endet

Zum Testen sollst du verschiedene Tage als "heute" mit der Hilfe von DateTime(year, month, day) verwenden.

Die Ausgabe sollte wie folgt sein:

2022 April
| Mo | Di | Mi | Do | Fr | Sa | So |
|    |    |    |    |  1 |  2 |  3 |
|  4*|  5 |  6 |  7 |  8 |  9 | 10 |
| 11 | 12 | 13 | 14 | 15 | 16 | 17 |
| 18 | 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |    |

 */

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_5_Calendar {

    public static void main(String[] args) {

        // Grundlegende deklarationen
        Scanner inputKonsole = new Scanner ( System.in );
        Calendar cal = Calendar.getInstance ();
        String[][] calendar = new String[7][7];
        calendar[0] = new String[]{"  Mo  ", "  Di  ", "  Mi  ", "  Do  ", "  Fr  ", "  Sa  ", "  So  "};

        //////////////////////////////////////////////////////////////////////////////////////////////////////

        // input von der Konsole
        String input = userInput ();
        String[] inputArray = input.split ( "\\." );

        int month = Integer.parseInt ( inputArray[0] ) - 1;
        int year = Integer.parseInt ( inputArray[1] );

        ///////////////////////////////////////////////////////////////////////////////////////////////////////

        // Überschreiben des Kalenders mit den Beuntzerdaten
        cal.set ( year, month, 1 );

        // ermitteln wie viel Tage der Monat hat
        int tageImMonat = cal.getActualMaximum ( Calendar.DAY_OF_MONTH );

        // Ermittlung des Wochentags am Ersten des Monats
        int ersterTagImMonat = cal.get ( Calendar.DAY_OF_WEEK );

        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        fillArray ( calendar, ersterTagImMonat, tageImMonat, year, month );

        replace ( calendar );
        
        printCalendar ( calendar );
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
    static String [][] fillArray( String[][] calendar, int ersterTagImMonat, int tageImMonat, int year, int month){

        Calendar cal = Calendar.getInstance ();
        int aktualYear = cal.get ( Calendar.YEAR );
        int aktualMonth = cal.get ( Calendar.MONTH );
        int aktualDay = cal.get ( Calendar.DAY_OF_MONTH);

        int erstesZuBefüllendeArray = ersterTagImMonat-2;
        if (erstesZuBefüllendeArray <0){erstesZuBefüllendeArray=6;}

        int day=1;
        for (int i = 1; i <7; i++) {
            for (int j = erstesZuBefüllendeArray; j <7; j++) {

                if(aktualYear == year && aktualMonth == month && aktualDay == day){

                    calendar[i][j] = String.valueOf ( "  " + String.format("%02d", day) + "* " );
                    day++;
                    if (day == tageImMonat + 1) {
                        break;
                    }
                }else {

                    calendar[i][j] = String.valueOf ( "  " + String.format("%02d", day) + "  " );
                    day++;
                    if (day == tageImMonat + 1) {
                        break;
                    }
                }
            }
            if(day == tageImMonat+1){break;}
            erstesZuBefüllendeArray=0;
        }
        return calendar;
    }
    static String[][] replace( String[][] calender){

        for (int i = 1; i <7; i++) {
            for (int j = 0; j <7; j++) {
                if(calender[i][j] == null){
                    calender[i][j]="      ";
                }
            }
        }
        return calender;
    }
    static void printCalendar( String[][] calendar){

        for (int i = 0; i < calendar.length; i++) {
            System.out.print ( "|" );
            for (int j = 0; j < calendar[0].length; j++) {
                System.out.print ( calendar[i][j] );
                System.out.print ("|" );
            }
            System.out.println ( );
        }
    }
}
