package MichaelReal.week10_strings;

public class Strings_0_Example {
    public static void main(String[] args) {
        String text = "Hallo Welt!";
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
    }

    static void print(String text) {
        System.out.println(text);
        StringMethods.printLine(text.length());
    }
    static void print(String text, boolean printLine) {
        System.out.println(text);
        if (printLine) {
            StringMethods.printLine(text.length());
        }
    }

}