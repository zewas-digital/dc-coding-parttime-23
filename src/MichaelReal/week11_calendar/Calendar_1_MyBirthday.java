package MichaelReal.week11_calendar;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von DateTime.Parse() verarbeitet. Als Ergebnis soll das Programm zurückgeben,
an was für einem Wochentag der Geburtstag des Anwenders war. Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_1_MyBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ihren Geburtstag ein (Format: DD.MM.YYYY.)");

        String input = scanner.next();

        Calendar c = new GregorianCalendar();
        try {
            String[] dataComponents = input.split("\\.");

            int day = Integer.parseInt(dataComponents[0]);
            int month = Integer.parseInt(dataComponents[1]) - 1;
            int year = Integer.parseInt(dataComponents[2]);

            //Datum setzen
            c.set(Calendar.DAY_OF_MONTH, day);
            c.set(Calendar.MONTH, month);
            c.set(Calendar.YEAR, year);

            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

            System.out.println("Ihr Geburtstag war an einem " + getDayOfWeekName(dayOfWeek) + "." + " 👌");
        } catch (Exception e) {
            System.out.println("Ungültiges Datumsformat.");
        }

    }

    public static String getDayOfWeekName(int dayOfWeek) {
        String[] daysOfWeek = {"Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag"};
        return  daysOfWeek[dayOfWeek - 1];
    }


}


  /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie Ihren Geburtstag ein (Format: DD.MM.YYYY):");
        String input = scanner.nextLine();

        // Versuchen, den Benutzereingabe in ein LocalDate-Objekt zu konvertieren
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.uuuu").withResolverStyle(ResolverStyle.STRICT);
            LocalDate birthday = LocalDate.parse(input, formatter);

            // Wochentag des Geburtstags ermitteln
            java.time.DayOfWeek dayOfWeek = birthday.getDayOfWeek();

            System.out.println("Ihr Geburtstag war an einem " + dayOfWeek + ".");
        } catch (DateTimeParseException e) {
            System.out.println("Ungültiges Datumsformat.");
        }
    }
}*/
