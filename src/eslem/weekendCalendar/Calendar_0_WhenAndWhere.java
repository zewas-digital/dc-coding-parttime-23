package eslem.weekendCalendar;

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

        Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is:" + c.getTime());

        System.out.println("Year:" + c.get(Calendar.YEAR));
        System.out.println("Date:" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("TIme:" + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        System.out.println("Date&Time:" + c.get(Calendar.DAY_OF_MONTH) + "." + (c.get(Calendar.MONTH)+1) + "." + c.get(Calendar.YEAR) + "." + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        if (c.get(Calendar.SECOND) < 10) {
            System.out.println("0" + c.get(Calendar.SECOND));}
        else {
            System.out.println("Second:" + c.get(Calendar.SECOND));
        }
        System.out.println("-".repeat(35));

        // String.format(); Documentation: https://hellocoding.de/blog/coding-language/java/strings-formatieren
        // System.out.println(String.format("%td.%<tm.%<tj %<tH:%<tM:%<tS.%<tL", c.getTime()));


        // alternative:
        // SimpleDateFormat; Documentation: https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        // dateFormat = new SimpleDateFormat("EEEE, d. MMMM yyyy HH:mm:ss.S z");
        //System.out.println(dateFormat.format(c.getTime()));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yyyy HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println("Date&Time:" + dateFormat.format(calendar.getTime()));
    }
}
