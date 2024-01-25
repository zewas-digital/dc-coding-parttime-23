package michael_k.week11;

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
        int counter = 0;

        String[] array = text.split ( " " );
        for (String word: array) {
            if(word.equals ( "Hesse" )){
                counter++;
            }
        }

        /*int counter = 0;
        int index = text.indexOf ( "Hesse" );


        while(index != -1){

            int secondIndex = text.indexOf("Hesse", index +1);


            System.out.println (secondIndex );
            index = secondIndex;
            counter++;

        }*/
        System.out.println (counter );
    }
}
