package Alpi.week10;

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
        char[] array = text.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Ausgabe

        System.out.println("Das umgedrehte Wort lautet: " + new String(array));


    }
}