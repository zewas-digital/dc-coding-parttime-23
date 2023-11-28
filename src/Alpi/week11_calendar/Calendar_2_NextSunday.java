package Alpi.week11_calendar;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */

import java.util.Calendar;


public class Calendar_2_NextSunday {
    public static void main(String[] args) {

        //Kalender erstellen
        Calendar calendar = Calendar.getInstance();



        // Tag des nächsten Sonntags ermitteln
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int dayOfWeekOffset = 8 - dayOfWeek;

        // Kalender auf den nächsten Sonntag setzen
        calendar.add(Calendar.DATE, dayOfWeekOffset);

        // Datum des nächsten Sonntags ausgeben
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH) + 1;
        int year = calendar.get(Calendar.YEAR);

        System.out.println("Nächster Sonntag ist: " + day + "." + month + "." + year);
    }
}
