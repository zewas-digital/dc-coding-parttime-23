package judith.weekend2;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */


// Ausgangsdatum z.b. 29.11.2023
// Welcher Wochentag ist es c.get(DayofWeek) INDEX im Beispiel 4
//Differenz zwischen Wochentag und Sonntag (index) im Beispiel (1-7) - 4
// 29.11.2023 + 3 = 03.12.2023





import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_2_NextSunday {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("Datum " + c.get(Calendar.DATE) + "."+ (c.get(Calendar.MONTH) + 1) + "." + c.get(Calendar.YEAR));
        int dayOfWeek = Calendar.DAY_OF_WEEK;
        int nextSunnday = (1+7) - dayOfWeek;

        c.add(Calendar.DAY_OF_MONTH, nextSunnday);


        //  SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        System.out.println(c.getTime());

    }
}
