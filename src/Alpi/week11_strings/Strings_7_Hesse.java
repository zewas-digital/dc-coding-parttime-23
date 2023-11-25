package Alpi.week11_strings;

/*
Aufgabe: Suche nach "Hesse"
Verwende für folgende Aufgabe den Text in data.Texts.HESSE.

Wie oft kommt das Wort "Hesse" in folgendem Text vor? An welchen Stellen?

Knobelaufgabe: Gibt es eine einfache Lösung die Anzahl der Vorkommnisse in einer Zeile ermittelt?

Bonus:
Bei der Ausgabe des Texts sollen alle Vorkommnisse von Hesse auf Uppercase (HESSE) gestellt werden.
Verwende die replace() Funktion.
 */

import data.Texts;

public class Strings_7_Hesse {
   static String text = Texts.HESSE;

    public static void main(String[] args) {

        int firstindex = text.indexOf ("Hesse");
        int secondindex = text.indexOf("Hesse" , firstindex +1);

        System.out.println("Die ersten beiden Vorkomnisse sind:" + firstindex + " und " + secondindex);


       String[] parts = text.split("Hesse");
       System.out.println("Anzahl Parts:" + parts.length);








    }
}
