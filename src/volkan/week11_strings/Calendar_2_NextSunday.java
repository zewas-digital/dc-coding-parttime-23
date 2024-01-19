package volkan.week11_strings;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_2_NextSunday {

    public static void main(String[] args) {

        // GregorianCalendar erstellen
        Calendar calendar = new GregorianCalendar();

        // Tag des nächsten Sonntags ermitteln
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Solange der aktuelle Tag nicht Sonntag ist, den Tag um einen Tag erhöhen
        while (dayOfWeek != Calendar.SUNDAY) {
            calendar.add(Calendar.DAY_OF_WEEK, 1);
            dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        }

        // Datum des nächsten Sonntags ausgeben
        System.out.println(calendar.getTime());
    }
}
