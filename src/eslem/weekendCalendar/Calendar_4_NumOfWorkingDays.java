package eslem.weekendCalendar;

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

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_4_NumOfWorkingDays {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, yyyy.MM ");

        System.out.println("Geben Sie das Jahr ein:");
        int year = scanner.nextInt();
        System.out.println("Geben Sie den Monat ein:");
        int month = scanner.nextInt();

        int counter = 0;
        int DaysinMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("-".repeat(35));

        for (int i = 1; i <DaysinMonth; i++) {
            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY)
                ;
            {
                counter++;
                System.out.println(calendar.getTime());
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        System.out.println(DaysinMonth);
    }
}
