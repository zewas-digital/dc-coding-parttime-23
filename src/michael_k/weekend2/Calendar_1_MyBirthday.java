package michael_k.weekend2;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von DateTime.Parse() verarbeitet. Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war. Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Calendar_1_MyBirthday {

    public static void main(String[] args) {
        Scanner inputKonsole = new Scanner ( System.in );
        Calendar c = Calendar.getInstance();

        while( true) {

            System.out.println ( "Geben sie Geburtsdatum ein! Format [tt.mm.jjjj]" );
            String birthday = inputKonsole.next ();

            if (!birthday.matches ( "^[0-9]{2,2}.[0-9]{2,2}.[0-9]{4,4}" )) {
                System.out.println ( "Falsches Datumsformat" );
            }else {


                String[] birth = birthday.split ( "\\." );

                String Year = birth[2];
                int year = Integer.parseInt ( Year );
                String Month = birth[1];
                int month = Integer.parseInt ( Month ) - 1;
                String Day = birth[0];
                int day = Integer.parseInt ( Day );

                c.set ( year, month, day );

                SimpleDateFormat days = new SimpleDateFormat ( "EEEE" );
                System.out.println ( days.format ( c.getTime ( ) ) );
            }
        }

    }

}
