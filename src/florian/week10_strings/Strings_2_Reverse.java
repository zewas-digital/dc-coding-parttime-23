package florian.week10_strings;

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
        Scanner userinput = new  Scanner (System.in);
        System.out.println("Willkommen zum Reverseprogramm");
        System.out.println("Bitte gib ein Wort ein: ");
        String text = userinput.next();
        char [] characterArray = text.toCharArray();

        for (char c: characterArray) {
            System.out.println(c);
            for (int i = 0; i < characterArray.length; i++) {
                for (int j = 0; j < characterArray.length; j++) {

                }
            }
        }




    }

}