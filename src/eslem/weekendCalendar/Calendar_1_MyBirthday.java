package eslem.weekendCalendar;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von DateTime.Parse() verarbeitet. Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war.
Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_1_MyBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day you were born (dd):");
        int day = scanner.nextInt();

        System.out.println("Enter the month you were born (mm):");
        int month = scanner.nextInt();

        System.out.println("Enter the year you were born (yyyy):");
        int year = scanner.nextInt();

        System.out.println("Your birthday:" + day + "." + month + "." + year);

        Calendar  calendar = Calendar.getInstance();
        calendar.set(year,(month-1),day);       //zuerst das Jahr!

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        System.out.println("Day of the week:" + dateFormat.format(calendar.getTime()));
    }
}
