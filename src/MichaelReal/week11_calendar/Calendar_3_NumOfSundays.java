package MichaelReal.week11_calendar;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.

https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html


 */

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_3_NumOfSundays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie das Jahr ein:🔢 ");
        int year = scanner.nextInt();

        System.out.println("Geben Sie den Monat ein:🔢 ");
        int month = scanner.nextInt();

        int numberOfSundays = countSundays(year, month);
        System.out.println("🍀Anzahl der Sonntage im🍀" + month + "/" + year + "🍀: " + numberOfSundays);
    }

    public static int countSundays(int year, int month) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, 1);

        int maxDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        int sundayCount = 0;

        for (int day = 1; day <= maxDay ; day++) {
            c.set(year, month - 1, day);
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

            if (dayOfWeek == Calendar.SUNDAY) {
                sundayCount++;
            }
        }
        return sundayCount;
    }

}
