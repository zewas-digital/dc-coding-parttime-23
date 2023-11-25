package claudia.week11_calendar;

/*

Aufgabe: NextSunday

Erstelle eine neue GregorianCalendar Instanz und gib das Datum des nächsten Sonntags aus.

 */

import claudia.BasicFunctions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_2_NextSunday {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE, dd. LLLL yyyy");

        Scanner sc = new Scanner(System.in);
        System.out.print("Berechne den nächsten Sonntag; gib Dein Datum in folgendem Format ein: dd.mm.yyyy ");
        String[] date = sc.next().split("\\.");
        calendar.set(Integer.parseInt(date[2]), Integer.parseInt(date[1]) - 1, Integer.parseInt(date[0]));

        System.out.println(dateFormat.format(calendar.getTime()));

        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }

        System.out.println("Nächster Sonntag ist am: ");
        System.out.println(dateFormat.format(calendar.getTime()));

    }
}
