package Simonsway.Week9;

import java.util.Arrays;
import java.util.Collections;
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

        System.out.println("Bitte ihre Eingabe");

        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.next();

        char[] converted = input.toCharArray();
        new String(converted);

        char exchange;

        for (int i = 0; i < converted.length -1; i++) {
            for (int j = 0; j < converted.length -1 - i; j++) {
                exchange = converted[j];
                converted[j] = converted[j + 1];
                converted[j + 1] = exchange;
                System.out.println(converted);
            }
        }



    }

}