package eslem.weekend2;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_2_NextSunday {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Date im Format tt.mm.yyyy:");

        String[] datum = scanner.next().split("\\.");                                       //Split: "\\." abteilung jeweils am . = String
        int day = Integer.parseInt(datum[0]);
        int month = Integer.parseInt(datum[1]) - 1;
        int year = Integer.parseInt(datum[2]);

        calendar.set(year,month,day);

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, dd.MM.yyyy");

        System.out.println(dateFormat.format(calendar.getTime()));

        while(calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY){
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }
        System.out.println("das Datum des nächsten Sonntags:");
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
