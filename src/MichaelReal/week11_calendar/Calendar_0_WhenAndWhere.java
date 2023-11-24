package MichaelReal.week11_calendar;

/*

Aufgabe: When and Where
Erstelle ein Programm, das das aktuelle Datum und Uhrzeit ausgibt. Verwende 3 verschiedene ToString() und erstelle eine 3 Zeilige Ausgabe:

    . Zeile --> Nur das Datum
    . Zeile --> Nur die Uhrzeit
    . Zeile --> Datum und Uhrzeit
 */

import java.util.Calendar;

public class Calendar_0_WhenAndWhere {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is:" + c.getTime());
        System.out.println("Year " + c.get(Calendar.YEAR));

        System.out.println("--------------------------------------------------------------");

        System.out.println("Nur das Datum");
        String date = String.format("%04d-%02d-%02d", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH));
        System.out.println(date + " 😖");
        System.out.println("--------------------------------------------------------------");

        System.out.println("Nur die Uhrzeit");
        String time = String.format("%02d:%02d:%02d", c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
        System.out.println(time + " 😮");
        System.out.println("--------------------------------------------------------------");

        System.out.println("Datum und Uhrzeit:");
        String dateTime = String.format("%04d-%02d-%02d %02d:%02d:%02d",
                c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH),
                c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND));
        System.out.println(dateTime + " 😊");
        System.out.println("--------------------------------------------------------------");
    }
}
