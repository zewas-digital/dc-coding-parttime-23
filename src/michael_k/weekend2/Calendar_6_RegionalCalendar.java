package michael_k.weekend2;

/*
Aufgabe: RegionalCalendar (Bonus)

Die Leute in Thailand sind traurig, weil die Ausgabe deines Kalenderprogramms aus der vorhergehenden Aufgabe nicht korrekt ist, da ihre Woche am Sonntag beginnt. Ändere dein Programm so ab, dass es Kalenderunabhängig den richtigen Wochenstart verwendet. Verwende dafür CultureInnfo.DateTimeFormat.Calendar und CultureInnfo.DateTimeFormat.FirstDayOfWeek. Teste dein Programm mit verschiedenen CultureInfo in der Start() Methode.

Aufruf

CultureInfo austrian = new CultureInfo("de-AT");
DayOfWeek dow = austrian.DateTimeFormat.FirstDayOfWeek;

//Locale wird auf Thailand gesetzt, hier wird der Buddistische Kalender verwendet
PrintCalendar("th-TH", 2565, 4);

//Locale wird auf Deutschland gesetzt, hier wird der Gregorianische Kalender verwendet
PrintCalendar("de-DE", 2022, 4);

Ausgabe

2022 04
| Mo | Di | Mi | Do | Fr | Sa | So |
|    |    |    |    |  1 |  2 |  3 |
|  4*|  5 |  6 |  7 |  8 |  9 | 10 |
| 11 | 12 | 13 | 14 | 15 | 16 | 17 |
| 18 | 19 | 20 | 21 | 22 | 23 | 24 |
| 25 | 26 | 27 | 28 | 29 | 30 |    |

2565 04
| So | Mo | Di | Mi | Do | Fr | Sa |
|    |    |    |    |    |  1 |  2 |
|  3 |  4*|  5 |  6 |  7 |  8 |  9 |
| 10 | 11 | 12 | 13 | 14 | 15 | 16 |
| 17 | 18 | 19 | 20 | 21 | 22 | 23 |
| 24 | 25 | 26 | 27 | 28 | 29 | 30 |


 */

import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Calendar_6_RegionalCalendar {

    public static void main(String[] args) {


        // Grundlegende deklarationen
        Scanner inputKonsole = new Scanner ( System.in );
        Calendar cal = Calendar.getInstance(/*new Locale ( "th_TH_#Thai" )*/);

        String[][] calendar = new String[7][7];
        String [] firstLine = new String[]{ "  So  ","  Mo  ", "  Di  ", "  Mi  ", "  Do  ", "  Fr  ", "  Sa  "};

        //////////////////////////////////////////////////////////////////////////////////////////////////////

        // input von der Konsole
        String input = userInput ();
        String[] inputArray = input.split ( "\\." );

        int month = Integer.parseInt ( inputArray[0] ) - 1;
        int year = Integer.parseInt ( inputArray[1] );

        ///////////////////////////////////////////////////////////////////////////////////////////////////////

        // Überschreiben des Kalenders mit den Beuntzerdaten
        cal.set ( year, month, 1 );

        int ersterWochentag = cal.getFirstDayOfWeek ( );
        // ermitteln wie viel Tage der Monat hat
        int tageImMonat = cal.getActualMaximum ( Calendar.DAY_OF_MONTH );

        // Ermittlung des Wochentags am Ersten des Monats
        int ersterTagImMonat = cal.get ( Calendar.DAY_OF_WEEK );

        ////////////////////////////////////////////////////////////////////////////////////////////////////////

        fillArray ( calendar, firstLine, ersterTagImMonat, tageImMonat, year, month, ersterWochentag );

        replace ( calendar );

        printCalendar ( calendar);
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
    static String [][] fillArray( String[][] calendar, String[] firstLine, int ersterTagImMonat, int tageImMonat, int year, int month, int ersterWochentag){
        int count=0;
        for (int i = ersterWochentag-1; count <7; i++) {
            calendar[0][count] = firstLine[i];
            if (i== 6){i=-1;}
            count++;
        }

        Calendar cal = Calendar.getInstance ();
        int aktualYear = cal.get ( Calendar.YEAR );
        int aktualMonth = cal.get ( Calendar.MONTH );
        int aktualDay = cal.get ( Calendar.DAY_OF_MONTH);

        int erstesZuBefüllendeArray = ersterTagImMonat-ersterWochentag;
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

