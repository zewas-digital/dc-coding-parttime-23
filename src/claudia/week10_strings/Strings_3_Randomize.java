package claudia.week10_strings;

/*
Aufgabe: Randomize
Es soll ein Wort über die Kommandozeile eingelesen werden,
dieses die Buchstaben des Wortes sollen zufällig vertauscht werden und anschließend ausgegeben werden. Verwende hierfür text.toCharArray() für das Aufsplitten, erstelle ein neues char[],
befülle es zufällig mit den Buchstaben des Wortes, füge es mittels new String(charArray) zusammen und gib es aus.

Ausgabe

Willkommen zum Zufallsshuffle Programm
>>>Hallo
lolHa
 */

import claudia.BasicFunctions;

import java.util.Random;
import java.util.Scanner;

public class Strings_3_Randomize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welches Wort soll geshuffelt werden? Bitte Eingabe! ");
        String word = sc.next();
        System.out.println("Hier ist Dein Ergebnis: " + shuffleWord(word));
    }

    static String shuffleWord(String word){
        //conversion from string to array of chars
        char[] letters = word.toCharArray();
        int size = letters.length;
        char[] shuffle = new char[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int j = random.nextInt(0, size);
            while(letters[j] == ' ') j = (j + 1) % size;
            shuffle[i] = letters[j];
            letters[j] = ' ';
        }
        //conversion from array of chars to string
        return new String(shuffle);
    }
}
