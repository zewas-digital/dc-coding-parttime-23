/*
package marcelsimma.week11_calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_1_MyBirthday_Calendar {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Eingabe des Geburtsdatums im deutschen Format (DD.MM.YYYY)
            System.out.println("Geben Sie das Geburtsdatum im deutschen Format (TT.MM.JJJJ) ein:");
            String inputDate = scanner.nextLine();

            // Trennen des Datums in Tag, Monat und Jahr
            String[] parts = inputDate.split("\\.");
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            // Erstellen eines Calendar-Objekts und Setzen des Datums
            Calendar calendar = Calendar.getInstance();

            // Month ist 0-basiert, daher wird 1 abgezogen

            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month - 1);
            calendar.set(Calendar.DATE, day);

            // Ermittlung des Wochentags
            int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            // Mapping der Wochentagsnummer zum entsprechenden Wochentag-Namen
            String[] weekDays = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
            String wochentag = weekDays[dayOfWeek - 1];

            System.out.println("Der Wochentag des Geburtsdatums " + inputDate + " ist: " + wochentag);
        }
    }
}
*/
