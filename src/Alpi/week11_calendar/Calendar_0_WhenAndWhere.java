package Alpi.week11_calendar;

/*

Aufgabe: When and Where
Erstelle ein Programm, das das aktuelle Datum und Uhrzeit ausgibt. Verwende 3 verschiedene ToString() und erstelle eine 3 Zeilige Ausgabe:

// SimpleDateFormat; Documentation: https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
// String.format(); Documentation: https://hellocoding.de/blog/coding-language/java/strings-formatieren

    . Zeile --> Nur das Datum
    . Zeile --> Nur die Uhrzeit
    . Zeile --> Datum und Uhrzeit
 */

import java.util.Calendar;


public class Calendar_0_WhenAndWhere {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();

        int seconds = c.get(Calendar.SECOND);
        int minute = c.get(Calendar.MINUTE);
        int hour = c.get(Calendar.HOUR_OF_DAY);


        String formattedSeconds = String.format("%02d", seconds);
        String formattedMinutes = String.format("%02d" , minute );
        String formattedHour = String.format("%02d" , hour );


        System.out.println("The Current Date is:" + c.getTime());
        System.out.println("Year " + c.get(Calendar.YEAR));
        System.out.println("Datum: " + c.get(Calendar.DATE) + "." + (c.get(Calendar.MONTH)  + "." + c.get(Calendar.YEAR)));


        System.out.println("Uhrzeit: " + c.get(Calendar.HOUR_OF_DAY) + "." + formattedMinutes + "." + (formattedSeconds));



        System.out.println("Datum und Uhrzeit: " + c.get(Calendar.DATE) + "." + (c.get(Calendar.MONTH)  + "." + c.get(Calendar.YEAR) + " / " + formattedHour + "." + formattedMinutes + "." + (formattedSeconds)));

    }
}
