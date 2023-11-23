package oliver.week10_strings;

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
        // Eingabe
        System.out.println("Willkommen zum Reverseprogramm");
        System.out.print(">>> ");
        String text = new Scanner(System.in).nextLine();

        // Umdrehen
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        // Ausgabe
        System.out.println("Das umgedrehte Wort lautet: " + new String(chars));
    }
}

