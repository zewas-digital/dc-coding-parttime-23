package Simonsway.Week11.Calendar;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_3_NumOfSundays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Year");
        int year = scanner.nextInt();

        System.out.println("Please enter the Month");
        int month = scanner.nextInt() - 1;

        int numOfSundays = countSundays(year, month);
        System.out.println("Number of Sundays: " + numOfSundays);
    }

    public static int countSundays(int year, int month){

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, month);


        int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // Holle mir die maximale Anzahl der Tage im Monat
        int count = 0;

        for (int day = 1; day <= daysInMonth; day++) {
            calendar.set(Calendar.DAY_OF_MONTH, day); // 
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                count++;
            }
        }

        return count;
    }

}