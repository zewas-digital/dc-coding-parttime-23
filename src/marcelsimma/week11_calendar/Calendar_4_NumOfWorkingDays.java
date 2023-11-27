package marcelsimma.week11_calendar;

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

import java.util.Calendar;

public class Calendar_4_NumOfWorkingDays {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance(); // 25.11.2023

        c.set(Calendar.YEAR, 2021); // 25.11.2024

        c.set(Calendar.MONTH, 1); // 25.01.2024

        c.set(Calendar.DAY_OF_MONTH, 1); // 1.01.2024

        System.out.println(c.getTime());

        int numberOfDaysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);

        int numberOfWorkingDays = 0;

        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            if (c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && c.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
                numberOfWorkingDays++;
                System.out.println(c.getTime());

            }

            c.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println(numberOfWorkingDays);


    }

}
