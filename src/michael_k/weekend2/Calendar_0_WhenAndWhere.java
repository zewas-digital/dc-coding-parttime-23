package michael_k.weekend2;

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

        //Erstellung und formatierung der Datumsvariabeln
        String strDay = formatierung0 ( c.get(Calendar.DAY_OF_MONTH) );
        String strMonth = formatierung0 (c.get (Calendar.MONTH)+1);
        String strYear = formatierung0 (c.get (Calendar.YEAR));

        //Erstellung und formatierung der Zeitvariabeln
        String strHour = formatierung0 (c.get (Calendar.HOUR_OF_DAY));
        String strMinute = formatierung0 (c.get (Calendar.MINUTE));
        String strSecond = formatierung0 (c.get ( Calendar.SECOND ));
        String strMillisecond = formatierung00 (c.get ( Calendar.MILLISECOND ));

        //Ausgabe
        System.out.println ( );
        System.out.println (c );
        System.out.println ( );
        System.out.println ( );
        System.out.println ( "Datum:             "+strDay+"."+strMonth+"."+strYear);
        System.out.println ( "Zeit:              " +strHour+":"+strMinute+":"+strSecond+":"+strMillisecond);
        System.out.println ( "Datum und Zeit:    "+strDay+"."+strMonth+"."+strYear+", "+strHour+":"+strMinute+":"+strSecond+":"+strMillisecond);

    }
    static String formatierung0(int var){
        String str = String.valueOf ( var);
        if ( var<10) {
            str = "0" + var;
        }
            return str;
    }
    static String formatierung00(int var){
        String str = String.valueOf ( var);
        if ( var<10){
            str = "00"+var;
        } else if (var<100) {
            str = "0"+var;
        }
        return str;
    }
}
