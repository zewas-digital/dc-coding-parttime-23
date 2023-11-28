package saifedine.week11_weekend2_calendar.marcel;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */

import java.util.Calendar;

public class Calendar_2_NextSunday {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        c.add(Calendar.DAY_OF_MONTH, 2);

        System.out.println(c.getTime());
    }
}
