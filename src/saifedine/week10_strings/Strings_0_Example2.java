package saifedine.week10_strings;

/*
Übersicht der String-Methoden:
https://www.w3schools.com/java/java_ref_string.asp
 */

//import data.Texts;

import oliver.week10_strings.StringMethods;

public class Strings_0_Example2 {

    public static void main(String[] args) {
        print(" ");

        // String von Chars-Array
        char[] chars = {'H','a','l','l','o'};
        String text1 = new String(chars); // Ergebnis: "Hallo"
        print(text1);

        // Chars-Array von String
        char[] characterArray = text1.toCharArray();
        for (char c : characterArray) {
            System.out.println(c);
        }
        print(" ");
        System.out.println(characterArray[0]);

        //String text = Texts.getSimpleText();
        //print(text);
    }

    static void print(String text) {
        System.out.println(text);
        StringMethods.printLine(text.length());
    }
}