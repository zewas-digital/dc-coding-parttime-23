package Simonsway.Week11.Calendar;

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
import java.util.Scanner;

public class Calendar_4_NumOfWorkingDays_Refactor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Year");
        int year = scanner.nextInt();

        System.out.println("Please enter the month");
        int month = scanner.nextInt();

        int numOfWorkingDAys = countWorkingDays(year, month);
        System.out.println("Number of Working Days: " + numOfWorkingDAys);


    }

    public static int countWorkingDays(int year, int month) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.DAY_OF_YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, month-1);

        return 0;
    }
}