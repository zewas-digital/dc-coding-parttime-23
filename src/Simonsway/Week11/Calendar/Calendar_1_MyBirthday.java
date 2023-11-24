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

        Scanner scanner = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();

        System.out.println("Enter your Birthday dd/mm/yyyy");

        String birthday = scanner.next();

        SimpleDateFormat birthdayNew = new SimpleDateFormat("dd/MM/yyyy");


    }

}
