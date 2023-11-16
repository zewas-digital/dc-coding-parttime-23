package MichaelReal.week10_strings;

import oliver.week10_strings.StringMethods;

public class Strings_0_Example {
    public static void main(String[] args) {
        String text = "Hallo";
        print(text);

        // String von Chars-Array
        char[] chars = {'H','a','l','l','o'};
        String text1 = new String(chars); // Ergebnis: "Hallo"
        print(text1);

        // einzelnes Zeichen an Position
        String text3 = "12.12.2023";
        char charPos3 = text3.charAt(2); // Character '.'
        String stringVonCharacter = String.valueOf(charPos3); // String "."
        print(stringVonCharacter);

        // Zeichenkette an Position
        String text4 = "Hallo Welt!";
        String substring = text4.substring(6);
        String substring2 = text4.substring(6, 10);
        print(substring, false);
        print(substring2);

        // Vergleich
        String prefix = "Vergleich: ";
        boolean stringEquals = text.equals(text1);
        boolean stringIs1 = text == text1;
        boolean stringIs2 = text == "Hallo";
        print(prefix +" "+ text +" equals "+ text1 +" = "+ stringEquals, false);
        print(prefix +" "+ text +" == "+ text1 +" = "+ stringIs1, false);
        print(prefix +" "+ text +" == \"Hallo\" = "+ stringIs2);

        // lexikografischer Vergleich
        String word1 = "Apfel";
        String word2 = "Birne";
        int word1ComparedTo2 = word1.compareTo(word2);
        int word2ComparedTo1 = word2.compareTo(word1);
        print(word1 +" comparedTo "+ word2 +" = "+ word1ComparedTo2);
        print(word2 +" comparedTo "+ word1 +" = "+ word2ComparedTo1);

    }

    static void print(String text) {
        System.out.println(text);
        oliver.week10_strings.StringMethods.printLine(text.length());
    }
    static void print(String text, boolean printLine) {
        System.out.println(text);
        if (printLine) {
            StringMethods.printLine(text.length());
        }
    }

}