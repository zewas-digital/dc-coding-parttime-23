package Alpi.week11_calendar;

/*
Aufgabe 11: My Birthday

Erstelle ein Programm, das den Anwender nach seinem Geburtstag fragt und mit Hilfe von DateTime.Parse() verarbeitet.
Als Ergebnis soll das Programm zurückgeben, an was für einem Wochentag der Geburtstag des Anwenders war.
Du kannst dafür auch die GregorianCalendar.GetDayOfWeek() Methode verwenden.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_1_MyBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihr Geburtsdatum im Format dd.MM.yyyy ein: ");
        String input = scanner.next();

        String[] inputString = input.split("\\.");

        int year = Integer.parseInt(inputString[2]);
        int day = Integer.parseInt(inputString[0]);
        int month = Integer.parseInt(inputString[1]);



        System.out.println(year);
        System.out.println(day);
        System.out.println(month);

        Calendar c = Calendar.getInstance();

        c.set(year, month - 1, day);

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        System.out.println(dateFormat.format(c.getTime()));




    }
}



