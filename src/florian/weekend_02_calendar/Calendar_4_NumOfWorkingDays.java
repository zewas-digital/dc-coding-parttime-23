package florian.weekend_02_calendar;

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
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE.dd.MM.yyyy");


        Scanner userinput = new Scanner(System.in);
        System.out.println("Gib den Monat und das Jahr ein: ");
        int month = userinput.nextInt();
        int year = userinput.nextInt();

        int numofWorkingDays= 0;
        int maximumdaysofmonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_MONTH, 1);



        System.out.println("Volle Datum: " + dateFormat.format(calendar.getTime()));


        for (int i = 1; i <= maximumdaysofmonth ; i++) {
            if (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && calendar.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY){
                numofWorkingDays++;
            }
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        System.out.println(numofWorkingDays);
    }
}



