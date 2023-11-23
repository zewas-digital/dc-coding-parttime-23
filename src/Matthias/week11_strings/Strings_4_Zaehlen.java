package Matthias.week11_strings;

/*
Aufgabe: Buchstaben zählen
In der folgenden Aufgabe sollen alle Buchstaben und Zeichen eines Texts gezählt werden.
Den Text erhältst du vom Package data: data.Texts.getSimpleText().

Um die einzelnen Buchstaben und Zeichen zu zählen soll ein int[] verwendet werden.
Der entsprechende char kann für das Array als Index verwendet werden.
Gib am Schluss die Anzahl der einzelnen Zeichen (zb. A,a,ä,.) aus.

Ausgabe

A: 10
B: 20
C: 1
...
 */

import java.util.Arrays;

public class Strings_4_Zaehlen {
    public static void main(String[] args) {
        String text = data.Texts.getSimpleText();
        // text in character-Array umwandeln
        char[] charArray = text.toCharArray();

        // option: höchsten character Int ermitteln

        int[] charCounts = new int[1];

        // alternativ
        StringBuilder alreadyChecked = new StringBuilder();

        // gehe alle Zeichen von text durch und zähle die Anzahl
        for (char c : charArray) {
            int cInt = (int)c;

            try {
                // produziere Fehler bei zu kleinem Array
                int value = charCounts[cInt];
            } catch(ArrayIndexOutOfBoundsException exception) {
                System.out.println("catched Execption. new length "+ (cInt+1));
                // erzeuge Array mit erweiterter Länge
                charCounts = Arrays.copyOf(charCounts, cInt+1);
            }

            // überprüfe, ob schon gezählt wurde
            if (charCounts[cInt] == 0 ) {
            //if (alreadyChecked.indexOf(String.valueOf(c)) == -1) {
                charCounts[cInt] = countOfChar(charArray, c);

                // alternativ
                alreadyChecked.append(c);

                System.out.println(c + ": int " + cInt + " count:" + charCounts[cInt]);
            }
        }

        System.out.println(alreadyChecked.length() +" Gefundene Zeichen :"+ alreadyChecked);
    }

    static int countOfChar(char[] charArray, char Char) {
        int count = 0;

        // ascii int von Char
        int charInt = (int) Char;

        // wie oft kommt ascii int im text vor?
        // gehe alle Zeichen von text durch
        for (char c : charArray) {
            // vergleiche ascii int
            if ((int) c == charInt) {
                // zähle counter hoch
                count++;
            }
        }

        return count;
    }
}
