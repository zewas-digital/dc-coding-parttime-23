package eslem.weekendCalendar;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_3_NumOfSundays {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM");

        System.out.println("Geben Sie das Jahr ein:");
        int year = scanner.nextInt();
        System.out.println("Geben Sie den Monat ein:");
        int month = scanner.nextInt();
        //int day = 1;

        calendar.set(year, month - 1, 1);

        int counter = 0;
        while (calendar.get(Calendar.MONTH) == month - 1){
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) counter++;
        calendar.add(Calendar.DAY_OF_WEEK, 1);
    }

        System.out.println("Anzahl der Sonntage im Monat:" + counter);
    }
}
