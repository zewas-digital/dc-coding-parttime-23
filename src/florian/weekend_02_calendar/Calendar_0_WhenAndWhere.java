package florian.weekend_02_calendar;

/*

Aufgabe: When and Where
Erstelle ein Programm, das das aktuelle Datum und Uhrzeit ausgibt. Verwende 3 verschiedene ToString() und erstelle eine 3 Zeilige Ausgabe:

    . Zeile --> Nur das Datum
    . Zeile --> Nur die Uhrzeit
    . Zeile --> Datum und Uhrzeit
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Calendar_0_WhenAndWhere {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is: " + c.getTime());
        System.out.println("Year: " + c.get(Calendar.YEAR));

        System.out.println("The Current Date is: " + dateFormat.format(c.getTime()));

        System.out.println("The Current Time is: " + timeFormat.format(c.getTime()));

        System.out.println("The Current Date and Time: " + dateFormat.format(c.getTime()) + " " + timeFormat.format(c.getTime()));


    }


}
