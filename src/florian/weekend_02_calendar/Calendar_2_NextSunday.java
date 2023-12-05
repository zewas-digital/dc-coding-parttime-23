package florian.weekend_02_calendar;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


// 1. Index vom Wochentag holen (Day of Week) ist eine Zahl zwischen 1 und 7
// 2. Differenz aus Wochentag zum Sonntag dazu addieren (1+7)-4 = 3,  29.11.2023 + 3 = 03.12.2023



public class Calendar_2_NextSunday {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE-dd-MM-yyyy");
        Calendar calendar = Calendar.getInstance();

        // User Eingabe
        Scanner userinput = new Scanner(System.in);
        System.out.println("Bitte gib einen Tag ein: ");
        String dayinput = userinput.next();
        System.out.println("Gib ein Monat ein: ");
        String monthinput = userinput.next();
        System.out.println("Bitte gib ein Jahr ein: ");
        String yearinput = userinput.next();

        // Umwandlung des Strings in Integer und Speichert den Wert
        int day = Integer.parseInt(dayinput);
        int month = Integer.parseInt(monthinput);
        int year = Integer.parseInt(yearinput);


        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);

       /* System.out.println(calendar.getTime());
        System.out.println();
        System.out.println("Aktuelles Datum: " + dateFormat.format(calendar.getTime()));*/

        int tmp = 8 - calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(tmp);

        // Meine Variante
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);
        calendar.add(Calendar.DAY_OF_MONTH, tmp);
        System.out.println(dateFormat.format(calendar.getTime()));

        // Matthias Variante

        calendar.set(Calendar.DAY_OF_MONTH, (day+tmp));
        calendar.set(Calendar.MONTH, (month-1));
        calendar.set(Calendar.YEAR, year);
        System.out.println(dateFormat.format( calendar.getTime() ));


    }
}
