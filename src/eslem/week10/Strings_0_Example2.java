package eslem.week10;

/*
Übersicht der String-Methoden:
https://www.w3schools.com/java/java_ref_string.asp
 */

import oliver.week10_strings.StringMethods;

import java.util.Arrays;

public class Strings_0_Example2 {

    public static void main(String[] args) {
        print(" ");

        // String von Chars-Array
        char[] chars = {'H', 'a', 'l', 'l', 'o'};
        String text1 = new String(chars); // Ergebnis: "Hallo"
        print(text1);

        // Chars-Array von String
        char[] characterArray = text1.toCharArray();
        for (char c : characterArray) {
            System.out.println(c);
        }
        print("   ");

        //char Char = characterArray[0]; // H
        char Char = '*'; // H
        System.out.println(
                Char + " ist..."
                        + "\n • als int des Unicode-Zeichens: "
                        + Character.getNumericValue(Char)
                        + "\n • umgewandelt in ASCII int: "
                        + (int) Char
        );
        print("   ");

        // Der Backslash in einem String \ ist ein Special-Character
        // das darauf folgende Zeichen wird nicht als normales Zeichen interpretiert
        print(
                "Häufig verwendete Special-Characters sind für Zeilenumbrüche \n"+
                        "\t\tfür Tabulatoren und \" und \' für Anführungszeichen."
        );

        // Chars-Array um ein Zeichen verlängern
        int newLength = characterArray.length + 1;
        char[] extendedArray = Arrays.copyOf(
                characterArray,
                newLength
        );
        extendedArray[newLength - 1] = '!';
        System.out.println(new String(extendedArray));
    }

    static void print(String text) {
        System.out.println(text);
        StringMethods.printLine(text.length());
    }
}