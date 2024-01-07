package claudia.week10_strings;

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

//ASCII 0 bis 255


import java.util.Arrays;

public class Strings_4_Zaehlen {
    public static void main(String[] args) {

        String text = data.Texts.getSimpleText();
        //find maximum ascii-code of all letters in text
        int maxIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            if ((int) text.charAt(i) > maxIndex) maxIndex = (int) text.charAt(i);
        }
        //create int[] with index = ascii-code of letter to contain number of appearances of this letter in text
        int[] lettersAscii = new int[maxIndex + 1];
        Arrays.fill(lettersAscii, -1); //set entries to -1

        for (int i = 0; i < text.length(); i++) {
            //count each letter of text only once
            char buchstabe = text.charAt(i);
            int buchstabeAscii = (int) buchstabe;
            //if entry in lettersAscii[] == -1, it hasn't been counted yet
            //set entry to number of appearances of buchstabe in text
            if (lettersAscii[buchstabeAscii] == -1) {
                lettersAscii[buchstabeAscii] = countOfChar(text, buchstabe);
            }
        }
        //counter is needed to break lines after 4 entries
        int counter = 0;
        for (int i = 0; i < maxIndex; i++) {
            if (lettersAscii[i] > 0) {
                System.out.print("Anz. " + (char) i + ": " + lettersAscii[i]+"\t\t\t");
                if (counter % 4 == 0) System.out.println();
                counter++;
            }
        }
}


    static int countOfChar(String text, char letter) {
        char[] letters = text.toCharArray();
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (letters[i] == letter) counter++;
        }
        return counter;
    }
}
