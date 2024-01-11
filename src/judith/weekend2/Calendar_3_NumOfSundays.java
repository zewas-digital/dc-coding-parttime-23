package judith.weekend2;

/*
Aufgabe: NumOfSundays

Erstelle eine Methode welche als Parameter das Jahr und den Monat nimmt und die Anzahl der Sonntage zurückgibt.
 */


//Eingabe des Jahres und Monats kann, muss aber nicht. Kann genau so fix definiert werden
//Calender erstellen
//Formatierung festlegen
//Berechnung der Sonntage mit Tages Index (hier = 1)
//Berechnung mit einer While - Prüfung ob immer noch der gleiche monat und dann ob der Index von Tag = Index von Sonntag
//Sonntage zählen.

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Scanner;

public class Calendar_3_NumOfSundays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gibe das gewünschte Jahr ein JJJJ");
        int year = sc.nextInt();

        System.out.println("Gib den gewünschten Monat ein MM");
        int month = sc.nextInt();

        int day = 1;
        int sunn = 0;

        Calendar c = Calendar.getInstance();
        c.set(year, month-1, day);

        while(c.get(Calendar.MONTH) == month - 1) {
            if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) sunn++;
            c.add(Calendar.DAY_OF_WEEK, 1);
        }

        // hier wird jeder Tag geprüft ob der den Index eines Sonntags hat. Wenn nicht wird +1 ausgeführt
        //Zusätzlich wird geprüft ob wir immer noch im gleichen Monat sind damit wirklich nur die Sonntage innerhalb des Monats gezählt werden.


        System.out.println("Dieser Monat hat " + sunn + " Sonntage");






       // System.out.println("Der Monat " + month + " im Jahr " + year +" hat ... Sonntage " + Calendar.SUNDAY);










    }

}
