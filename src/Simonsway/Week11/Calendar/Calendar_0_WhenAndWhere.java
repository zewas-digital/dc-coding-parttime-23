package Simonsway.Week11.Calendar;

/*

Aufgabe: When and Where
Erstelle ein Programm, das das aktuelle Datum und Uhrzeit ausgibt. Verwende 3 verschiedene ToString() und erstelle eine 3 Zeilige Ausgabe:

    . Zeile --> Nur das Datum
    . Zeile --> Nur die Uhrzeit
    . Zeile --> Datum und Uhrzeit

    String Format
    %: Zeigt an, dass das Folgende ein Formatierungsspezifikator ist.
    0: Dies bedeutet, dass die Ausgabe mit Nullen aufgefüllt werden soll.
    2: Dies gibt die Mindestbreite der Zahl an. Ist die Zahl kleiner als diese Breite, wird sie mit Nullen aufgefüllt, um sicherzustellen, dass sie mindestens so viele Ziffern hat.
    d: Dies bedeutet, dass die Eingabenummer als dezimale (Basis-10) Ganzzahl behandelt wird.

 */

import java.util.Calendar;

public class Calendar_0_WhenAndWhere {

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println("The Current Date is: " + c.getTime());

        int minutes = c.get(Calendar.MINUTE);
        int seconds = c.get(Calendar.SECOND);

        System.out.println("Year " + c.get(Calendar.YEAR));

        System.out.println("Date " + c.get(Calendar.DATE) + "." + (c.get(Calendar.MONTH)+1));

        System.out.println("Hour " + c.get(Calendar.HOUR_OF_DAY) + ":" + String.format("%02d", minutes) + ":" + String.format("%02d", seconds));

        System.out.println("Date " + c.get(Calendar.DATE) + " Time " + c.get(Calendar.HOUR_OF_DAY) + ":" + String.format("%02d", minutes));


    }


}
