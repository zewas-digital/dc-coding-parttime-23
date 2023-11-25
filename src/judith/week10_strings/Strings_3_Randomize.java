package judith.week10_strings;

/*
Aufgabe: Randomize
Es soll ein Wort über die Kommandozeile eingelesen werden,
dieses die Buchstaben des Wortes sollen zufällig vertauscht werden und anschließend ausgegeben werden. Verwende hierfür text.toCharArray() für das Aufsplitten, erstelle ein neues char[], befülle es zufällig mit den Buchstaben des Wortes, füge es mittels new String(charArray) zusammen und gib es aus.

Ausgabe

Willkommen zum Zufallsshuffle Programm
>>>Hallo
lolHa
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import static java.util.Collections.shuffle;

public class Strings_3_Randomize {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput= scan.next();

        char[] convert = userInput.toCharArray();





      /*  Random random = new Random();
        char random  (char) random.nextInt(convert.length);
        System.out.println(random);


       */
    }
}
