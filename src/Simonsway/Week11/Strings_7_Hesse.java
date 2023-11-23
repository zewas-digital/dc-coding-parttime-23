package Simonsway.Week11;

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
    static String findSubstring = "Hesse";

    public static void main(String[] args) {

        System.out.println("Anzahl der Vorkommnisse von Hesse " + count(text, findSubstring));

        String upperCase = text.replace(findSubstring, findSubstring.toUpperCase());
        System.out.println(upperCase);

    }

    public static int count(String text, String findSubstring){
        int index = 0, count = 0, length = findSubstring.length();

        while ((index = text.indexOf(findSubstring, index)) != -1){
                index += length;
                count++;
        }
        return count;
    }
}
