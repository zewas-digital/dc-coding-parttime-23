package Matthias.week11_strings;

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
        String sampleText = "Die ersten ersten beiden Vorkommnisse sind.";
        System.out.println(sampleText.indexOf("ersten"));
        System.out.println(sampleText.indexOf("ersten", 4));
        System.out.println(sampleText.indexOf("ersten", 4+1));

        // ansatz 1 .. an welchen stellen
        int firstIndex = text.indexOf("Hesse");
        int secondIndex = text.indexOf("Hesse", firstIndex +1);

        System.out.println("Die ersten beiden Vorkommnisse sind: "+ firstIndex +" und "+ secondIndex);
    }
}