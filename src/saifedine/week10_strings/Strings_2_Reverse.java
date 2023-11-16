package saifedine.week10_strings;

import java.util.Arrays;
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

        //String text = "Hallo";

        Scanner userInput = new Scanner(System.in);
        System.out.println("Geben Sie ein Wort ein: ");
        String text = userInput.next();


        // String zu Array konvertiert
        char[] charArray = text.toCharArray();
        System.out.println("Array-Ausgabe: " + Arrays.toString(charArray));

        // Array zu String konvertiert
        text = new String(charArray);
        System.out.println("String-Ausgabe: " + text);

        char exchange;

        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = 0; j < charArray.length - 1 - i; j++) {

                        // exchange
                        exchange = charArray[j];
                        charArray[j] = charArray[j + 1];
                        charArray[j + 1] = exchange;

                //System.out.println("Schleife: " + i + " " + Arrays.toString(charArray));
            }
        }
        System.out.println("Reverse: " + Arrays.toString(charArray));


    }

}