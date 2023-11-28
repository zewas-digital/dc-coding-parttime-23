package saifedine.week11_weekend2_calendar.marcel;

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

        // String.format(); Documentation: https://hellocoding.de/blog/coding-language/java/strings-formatieren
        System.out.println(String.format("%td.%<tm.%<tj %<tH:%<tM:%<tS.%<tL", c.getTime()));



        // SimpleDateFormat; Documentation: https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE, d.MM.yy HH:mm:ss Z");
        System.out.println(dateFormat.format(c.getTime()));

        dateFormat = new SimpleDateFormat("EEEE, d. MMMM yyyy HH:mm:ss.S z");
        System.out.println(dateFormat.format(c.getTime()));
    }


}
