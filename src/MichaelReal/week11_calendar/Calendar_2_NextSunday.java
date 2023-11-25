package MichaelReal.week11_calendar;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

Meine Quellen:
https://www.geeksforgeeks.org/calendar-add-method-in-java-with-examples/

 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_2_NextSunday {
    public static void main(String[] args) {

        Calendar c = new GregorianCalendar();

        // Das Datum auf den nächsten Sonntag setzen
        setToNextSunday(c);


        System.out.println("------------------------------------\n" +"Datum des nächsten Sonntags:\n " + "------------------------------------\n" + c.getTime() + " 😎\n" + "------------------------------------");
        System.out.println("👈(ﾟヮﾟ👈)👈(⌒▽⌒)👉(👉ﾟヮﾟ)👉");
    }

    // Methode, um das Datum auf den nächsten Sonntag zu setzen
    public static void setToNextSunday(Calendar calendar) {
        int currentDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int daysUntilNextSunday = Calendar.SUNDAY - currentDayOfWeek + 7;
        calendar.add(Calendar.DAY_OF_MONTH, daysUntilNextSunday);
    }
}


