package michael_k.weekend2;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_2_NextSunday {

    public static void main(String[] args) {

        //aktuelle Zeit einholen
        Calendar cal = Calendar.getInstance();

        // Aktueller Wochentag und Jahrestag einholen
        int dayOfWeek = cal.get ( Calendar.DAY_OF_WEEK );
        int dayOfYear = cal.get ( Calendar.DAY_OF_YEAR );

        // den Jahrestag auf den nächsten Sonntag hochrechnen
        int sunday = dayOfYear + 8- dayOfWeek;

        // den errechneten Jahrestag in den Kalender schreiben
        cal.set ( Calendar.DAY_OF_YEAR, sunday );

        // Formatierung und ausgeben des gesuchten Datums
        SimpleDateFormat days = new SimpleDateFormat ( " d.MM.yy, EEEE" );
        System.out.println ( days.format ( cal.getTime ( ) ) );
    }
}
