package Matthias.week11_weekend_calender;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_3_NumOfSundays {
    public static void main( String[] args ) {
        Calendar calendar = Calendar.getInstance();

        Scanner userinput = new Scanner(System.in);
        System.out.println("Gib den Monat und das Jahr ein ein: ");
        int month = userinput.nextInt();
        int year = userinput.nextInt();

        int numofSunday = 0;

        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);

        System.out.println("Anzahl der Tage im Monat: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        int maxDayOfMonth = calendar.getMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <=maxDayOfMonth; i++) {
            if (calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)+i!= Calendar.SUNDAY){
                calendar.add(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
            }
            else {
                numofSunday++;
                System.out.println(numofSunday);
            }
        }


    }
}