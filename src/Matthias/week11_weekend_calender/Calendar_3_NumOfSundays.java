package Matthias.week11_weekend_calender;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_3_NumOfSundays {
    public static void main( String[] args ) {


        Calendar calendar = Calendar.getInstance( );
        SimpleDateFormat dateFormat = new SimpleDateFormat( "EEEE.dd.MM.yyyy" );


        Scanner userinput = new Scanner( System.in );
        System.out.println( "Gib den Monat und das Jahr ein ein: " );
        int month = userinput.nextInt( );
        int year = userinput.nextInt( );

        calendar.set( Calendar.MONTH, month - 1 );
        calendar.set( Calendar.YEAR, year );

        System.out.println( dateFormat.format( calendar.getTime( ) ) );

        calendar.get( Calendar.DAY_OF_MONTH );
        /*
        if ( calendar.getTime( ) == ) {

        }

        System.out.println( calendar.get( Calendar.DAY_OF_WEEK_IN_MONTH ) );

        if ( Calendar.DAY_OF_MONTH == ) {

        }
        */
    }



}