package Matthias.week11_weekend_calender;

/*

Aufgabe: When and Where
Erstelle ein Programm, das das aktuelle Datum und Uhrzeit ausgibt.
Verwende 3 verschiedene ToString() und erstelle eine 3 Zeilige Ausgabe:

    . Zeile --> Nur das Datum
    . Zeile --> Nur die Uhrzeit
    . Zeile --> Datum und Uhrzeit
 */

import java.util.Calendar;
import java.util.Date;

public class Calendar_0_WhenAndWhere {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is:" + c.getTime());
        System.out.println("Year " + c.get(Calendar.YEAR));

        //Ausgabe NUR das Datum
        System.out.println( "Akuelle Datum: " +c.get(Calendar.DAY_OF_MONTH)+"."+(c.get(Calendar.MONTH )+1) +"."+ c.get(Calendar.YEAR));
        //Ausgabe NUR die Uhrzeit
        System.out.println( "Akuelle Uhrzeit: " +c.get( Calendar.HOUR_OF_DAY )+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND) +":"+c.get(Calendar.MILLISECOND));
        // Datum und Uhrzeit zusammen
        System.out.println( "Datum: " +c.get(Calendar.DAY_OF_MONTH)+"."+(c.get(Calendar.MONTH )+1) +"."+ c.get(Calendar.YEAR)+" " +
                            "Uhrzeit:"+ c.get( Calendar.HOUR_OF_DAY )+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND) +":"+c.get(Calendar.MILLISECOND));
    }


}
