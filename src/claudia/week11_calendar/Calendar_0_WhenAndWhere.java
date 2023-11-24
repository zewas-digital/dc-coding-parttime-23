package claudia.week11_calendar;

/*

Aufgabe: When and Where
Erstelle ein Programm, das das aktuelle Datum und Uhrzeit ausgibt. Verwende 3 verschiedene ToString() und erstelle eine 3 Zeilige Ausgabe:

    . Zeile --> Nur das Datum
    . Zeile --> Nur die Uhrzeit
    . Zeile --> Datum und Uhrzeit
 */

import claudia.BasicFunctions;

import java.util.Calendar;

public class Calendar_0_WhenAndWhere {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        //System.out.println(c.toString());

        System.out.println("\nHeutiges Datum: " + convertNumberToDoubleDigit(c.get(Calendar.DAY_OF_MONTH)) + "." + convertNumberToDoubleDigit(c.get(Calendar.MONTH) + 1) + "." + c.get(Calendar.YEAR));
        System.out.println("Aktuelle Uhrzeit: " + convertNumberToDoubleDigit(c.get(Calendar.HOUR_OF_DAY)) + ":" + convertNumberToDoubleDigit(c.get(Calendar.MINUTE)) + ":" + convertNumberToDoubleDigit(c.get(Calendar.SECOND)) + " h");
        System.out.println("Alles zusammen: " + convertNumberToDoubleDigit(c.get(Calendar.DAY_OF_MONTH)) + "." + convertNumberToDoubleDigit(c.get(Calendar.MONTH) + 1) + "." + c.get(Calendar.YEAR) + ", " + convertNumberToDoubleDigit(c.get(Calendar.HOUR_OF_DAY)) + ":" + convertNumberToDoubleDigit(c.get(Calendar.MINUTE)) + ":" + convertNumberToDoubleDigit(c.get(Calendar.SECOND)) + " h");
        System.out.println("Zeit mit Millisekunden: " + convertNumberToDoubleDigit(c.get(Calendar.HOUR_OF_DAY)) + ":" + convertNumberToDoubleDigit(c.get(Calendar.MINUTE)) + ":" + convertNumberToDoubleDigit(c.get(Calendar.SECOND)) + ":" + convertNumberTripleDigit(c.get(Calendar.MILLISECOND)) + " h" ) ;


        for (int i = 0; i < 10; i++) {
            System.out.println("Zeit mit Millisekunden: " + convertNumberToDoubleDigit(c.get(Calendar.HOUR_OF_DAY)) + ":" + convertNumberToDoubleDigit(c.get(Calendar.MINUTE)) + ":" + convertNumberToDoubleDigit(c.get(Calendar.SECOND)) + ":" + convertNumberTripleDigit(c.get(Calendar.MILLISECOND)) + " h" ) ;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static String convertNumberToDoubleDigit(int number) {
        if (number < 10) return ("0" + number);
        else return String.valueOf(number);
    }
    public static String convertNumberTripleDigit(int number) {
        if (number < 10) return ("00" + number);
        if (number < 100) return ("0" + number);
        else return String.valueOf(number);
    }
}
