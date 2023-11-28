package Alpi.week11_calendar;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.
 */

import java.util.Calendar;

public class Calendar_3_NumOfSundays {

    public static void main(String[] args) {

        //Kalender erstellen
        Calendar calendar = Calendar.getInstance(); // 25.11.2023
        calendar.set(Calendar.MONTH, 11); // 25.12.2023
        calendar.set(Calendar.DAY_OF_MONTH, 1); //1.12.2023
        System.out.println(calendar.getTime());



        int maximumNumberOfDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int numberOfSundays = 0;
        System.out.println("Anzahl Tage im aktuellen Monat: " + maximumNumberOfDays);

        for(int i = 1; i <= maximumNumberOfDays; i++) {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                numberOfSundays++;

            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println("Anzahl Sonntage im aktuellen Monat: " + numberOfSundays);


    }

}
