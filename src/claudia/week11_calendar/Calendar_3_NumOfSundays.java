package claudia.week11_calendar;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.
 */

import claudia.BasicFunctions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_3_NumOfSundays {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEEE, dd. LLLL yyyy");
        Calendar calendar = Calendar.getInstance();

        System.out.println("\nBerechne Anzahl der Sonntage in gegebenem Monat! ");
        int year = BasicFunctions.readInt("Welches Jahr? ");
        int month = BasicFunctions.readInt("Welcher Monat? ");

        calendar.set(year, month - 1, 1);
        //System.out.println(dateFormat.format(calendar.getTime()));
        int counter = 0;

        while(calendar.get(Calendar.MONTH) == month - 1) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) counter++;
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }

        System.out.println("Soviele Sonntage im gewählten Monat: " + counter);


    }

}
