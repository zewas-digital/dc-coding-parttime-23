package saifedine.week10_strings;

/*
Aufgabe: Randomize
Es soll ein Wort über die Kommandozeile eingelesen werden,
dieses die Buchstaben des Wortes sollen zufällig vertauscht werden und anschließend ausgegeben werden. Verwende hierfür text.toCharArray() für das Aufsplitten, erstelle ein neues char[], befülle es zufällig mit den Buchstaben des Wortes, füge es mittels new String(charArray) zusammen und gib es aus.

Ausgabe

Willkommen zum Zufallsshuffle Programm
>>>Hallo
lolHa

Gemeinsam mit Oliver die Version von Matthias bearbeitet!
 */

import java.util.Arrays;
import java.util.Scanner;

public class Strings_3_Randomize {

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


    }
}
