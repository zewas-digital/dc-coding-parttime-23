package claudia.week11_calendar;

/*
Aufgabe 4:

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Arbeitstage zurückgibt (Mo-Fr). Teste diese Methode in der Start() Methode. Wie dieses Problem gelöst wird, steht dir völlig frei.

Aufruf:
Console.WriteLine(GetWorkdays(2021, 6));

Ausgabe:
22

Aufruf:
Console.WriteLine(GetWorkdays(2021, 3));

Ausgabe:
23

Aufruf:
Console.WriteLine(GetWorkdays(2021, 2));

Ausgabe:
20
     */

import claudia.BasicFunctions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendar_4_NumOfWorkingDays {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        System.out.println("\nBerechne Anzahl der Arbeitstage in gegebenem Monat! ");
        int year = BasicFunctions.readInt("Welches Jahr? ");
        int month = BasicFunctions.readInt("Welcher Monat? ");
        calendar.set(year, month - 1, 1);

        System.out.println("Anzahl der Arbeitstage: " + numberOfWorkingDays(calendar));

        SimpleDateFormat dateFormat = new SimpleDateFormat("LLLL yyyy");
        year = BasicFunctions.readInt("Test ganzes Jahr, welches Jahr? ");
        for (int i = 0; i < 12; i++) {
            calendar.set(year, i, 1);
            System.out.println("Anzahl der Arbeitstage im " + (dateFormat.format(calendar.getTime())) + ": " + numberOfWorkingDays(calendar));
        }
    }

    static int numberOfWorkingDays(Calendar calendar) {
        int counter = 0;
        int month = calendar.get(Calendar.MONTH);
        while (calendar.get(Calendar.MONTH) == month) {
            if (!(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
                counter++;
            }
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }
        return counter;
    }




}
