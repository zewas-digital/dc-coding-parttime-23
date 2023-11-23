package claudia.week11_strings;

/*
Aufgabe: Suche nach "Hesse"
Verwende für folgende Aufgabe den Text in data.Texts.HESSE.

Wie oft kommt das Wort "Hesse" in folgendem Text vor? An welchen Stellen?

Knobelaufgabe: Gibt es eine einfache Lösung die Anzahl der Vorkommnisse in einer Zeile ermittelt?

Bonus:
Bei der Ausgabe des Texts sollen alle Vorkommnisse von Hesse auf Uppercase (HESSE) gestellt werden.
Verwende die replace() Funktion.
 */

import claudia.BasicFunctions;
import data.Texts;

public class Strings_7_Hesse {
    static String text = Texts.HESSE;

    public static void main(String[] args) {
        //How many occurrences of "Hesse"?
        String test = "*".repeat(10);
        System.out.println(test);
        int counter = 0;
        int index = 0;
        System.out.println("\n\nDas Wort \"Hesse\" erscheint an folgenden Stellen: ");

        while (index >= 0) {
            index = text.indexOf("Hesse", index + 1);

            if (index >= 0) {
                System.out.print(index + ", ");
                counter++;
            }
        }
        System.out.println("insgesamt " + counter + " mal.");


        //Number of occurrences per line?
        //replace "Hesse" by "HESSE" and print on console
        System.out.println("Ersetze \"Hesse\" durch \"HESSE\":");
        System.out.println(text.replaceAll("Hesse", "HESSE"));


    }
}
