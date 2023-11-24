package michael_k.weekend2;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */

import java.util.Calendar;

public class Calendar_2_NextSunday {

    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        int dayOfWeek = cal.get ( Calendar.DAY_OF_WEEK );
        int dayOfYear = cal.get ( Calendar.DAY_OF_YEAR );
        int sunday = dayOfYear + 8- dayOfWeek;

        cal.set ( Calendar.DAY_OF_YEAR, sunday );
        System.out.println (cal.getTime () );
    }
}
