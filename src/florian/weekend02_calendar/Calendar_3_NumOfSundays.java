package florian.weekend02_calendar;

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
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE.dd.MM.yyyy");


        Scanner userinput = new Scanner(System.in);
        System.out.println("Gib den Monat und das Jahr ein: ");
        int month = userinput.nextInt();
        int year = userinput.nextInt();

        int numofSunday = 0;
        int maximumdaysofmonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, 1);



        System.out.println("Volle Datum: " + dateFormat.format(calendar.getTime()));


        for (int i = 0; i <= maximumdaysofmonth ; i++) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                numofSunday++;
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println(numofSunday);
    }

}
