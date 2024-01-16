package judith.weekend2;

/*
Aufgabe 4:

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Arbeitstage zurückgibt (Mo-Fr).
Teste diese Methode in der Start() Methode. Wie dieses Problem gelöst wird, steht dir völlig frei.

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

public class Calendar_4_NumOfWorkingDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gibe das gewünschte Jahr ein JJJJ");
        int year = sc.nextInt();

        System.out.println("Gib den gewünschten Monat ein MM");
        int month = sc.nextInt();

        int day = 1;
        int arbeitstage = 0;

        Calendar c = Calendar.getInstance();
        c.set(year,month,day);

        while (c.get(Calendar.MONTH) == month - 1){
            if(c.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY && Calendar.DAY_OF_WEEK != Calendar.SATURDAY) arbeitstage++;
                    c.add(Calendar.DAY_OF_WEEK,1);
        }

        System.out.println(arbeitstage);





    }

}
