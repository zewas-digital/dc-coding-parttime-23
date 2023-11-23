package Simonsway.Week9;

/*
Aufgabe: Randomize
Es soll ein Wort über die Kommandozeile eingelesen werden,
dieses die Buchstaben des Wortes sollen zufällig vertauscht werden und anschließend ausgegeben werden. Verwende hierfür text.toCharArray() für das Aufsplitten, erstelle ein neues char[], befülle es zufällig mit den Buchstaben des Wortes, füge es mittels new String(charArray) zusammen und gib es aus.

Ausgabe

Willkommen zum Zufallsshuffle Programm
>>>Hallo
lolHa
 */

import java.util.Random;
import java.util.Scanner;

public class Strings_3_Randomize {
    public static void main(String[] args) {

        System.out.println("Bitte ihr eingabe");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String input;
        input = scanner.next();

        char[] characters = input.toCharArray();

        for (int i = characters.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);

            char temp = characters[index];
            characters[index] = characters[i];
            characters[i] = temp;
        }

        System.out.println(new String(characters));
    }
}
