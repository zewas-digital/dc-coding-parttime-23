package claudia.week10_strings;

import claudia.BasicFunctions;

import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

/*
Aufgabe: Reverse
Es soll ein Wort über die Kommandozeile eingelesen werden,
dieses Wort soll umgedreht und anschließend ausgegeben werden.

Verwende hierfür text.toCharArray() für das Aufsplitten und new String(charArray) zum Zusammenfügen.

Ausgabe
Willkommen zum Reverseprogramm
>>>Hallo
ollaH

 */
public class Strings_2_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welches Wort soll umgedreht werden? Bitte Eingabe! ");
        String word = sc.next();

        char[] letters = word.toCharArray();
        int size = letters.length;

        char[] srettel = new char[size];
        for (int i = 0; i < size; i++) {
            srettel[i] = letters[size -1 - i];
        }

        String drow = new String(srettel);
        System.out.println("Hier ist Dein Ergebnis: " + drow);
    }

}