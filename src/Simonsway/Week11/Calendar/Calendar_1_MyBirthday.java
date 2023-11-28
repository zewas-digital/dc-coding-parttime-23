package Simonsway.Week11.Calendar;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von DateTime.Parse() verarbeitet. Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war. Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_1_MyBirthday {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Birthay");
        int day = scanner.nextInt();
        System.out.println("Enter your BirthMonth");
        int month = scanner.nextInt();
        System.out.println("Enter your BirthYear");
        int year = scanner.nextInt();

        // Hier werden alle Werte vom Input in den calender geschrieben
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month -1);
        calendar.set(Calendar.YEAR, year);

        // Dies ist nur für die Formatierung
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE/MM/yyyy");
        // Hier wird dann dateFormat mit den Daten vom Calender gerechnet.
        System.out.println(dateFormat.format(calendar.getTime()));

    }

}
