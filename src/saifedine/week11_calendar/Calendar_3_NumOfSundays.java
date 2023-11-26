package saifedine.week11_calendar;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.
 */

// Eingabe Jahr --> Int
// Eingabe Monat --> Int
// übergabe Jahr & Monat in Datentyp DATUM
// fori mit Sonntage des jeweiligen Monat im Jahr


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar_3_NumOfSundays {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie das gewünschte Jahr in folgendem Format: yyyy");
        int jahr = input.nextInt();
        //System.out.println(jahr);

        System.out.println("Geben Sie den gewünschte Monat in folgendem Format: MM");
        int monat = input.nextInt();
        //System.out.println(monat);

        System.out.println("-------------------------------------");

        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.YEAR,jahr);
        cal.set(Calendar.MONTH,monat-1);
        cal.set(Calendar.DATE,1);
        //System.out.println("Resultat: " + cal.get(Calendar.MONTH) + "." + cal.get(Calendar.YEAR));

        int sum1 = 0;

        int currentDay = 1; // Zählvariable vom 1. bis letzten Tag des Monats
        int maxNumberOfDaysInMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Ergebnis: " + maxNumberOfDaysInMonth);

        while (currentDay <= maxNumberOfDaysInMonth){
            cal.add(Calendar.DAY_OF_MONTH,1);

            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                sum1++;
            }
            currentDay++;
        }

        System.out.println("Variante1 - Die Anzahl Sonntage: " + sum1);

// TODO FORI anstatt WHILE

        int sum2 = 0;

        for (int i = currentDay; i <= maxNumberOfDaysInMonth; i++) {

            if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
                sum2++;
            }
            currentDay++;
        }
        System.out.println("Variante2 - Die Anzahl Sonntage: " + sum2);
    }

}
