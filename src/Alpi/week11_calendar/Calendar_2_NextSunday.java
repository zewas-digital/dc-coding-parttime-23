package Alpi.week11_calendar;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */

import java.util.Calendar;

public class Calendar_2_NextSunday {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        while (calendar.get(Calendar.DAY_OF_WEEK)  != Calendar.SUNDAY){
            calendar.add(Calendar.DATE, 1);
        }

        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int month = calendar.get(Calendar.MONTH) +2 ;
        int year = calendar.get(Calendar.YEAR);


        System.out.println("Nächster Sonntag ist: " + day + " . " + month + " . " + year);

    }
}
