package judith.weekend2;

/*

Aufgabe: When and Where
Erstelle ein Programm, das das aktuelle Datum und Uhrzeit ausgibt. Verwende 3 verschiedene ToString() und erstelle eine 3 Zeilige Ausgabe:

    . Zeile --> Nur das Datum
    . Zeile --> Nur die Uhrzeit
    . Zeile --> Datum und Uhrzeit
 */

import java.sql.Time;
import java.util.Calendar;
import java.util.Locale;



public class Calendar_0_WhenAndWhere {



    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is:" + c.getTime());
        System.out.println("Year " + c.get(Calendar.YEAR));
        System.out.println("Datum " + c.get(Calendar.DATE) + "."+ (c.get(Calendar.MONTH) + 1) + "." + c.get(Calendar.YEAR));
        System.out.println("Uhrzeit " + c.get(Calendar.HOUR_OF_DAY) +":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + ":" + c.get(Calendar.MILLISECOND));
        System.out.println("Datum und Uhrzeit " + c.get(Calendar.DATE) + "."+ (c.get(Calendar.MONTH)+1) + "." + c.get(Calendar.YEAR) + " " + c.get(Calendar.HOUR_OF_DAY) +":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + ":" + c.get(Calendar.MILLISECOND));
    }

// hier fehlt noch die Formatierung bezüglich der führenden "0"
}
