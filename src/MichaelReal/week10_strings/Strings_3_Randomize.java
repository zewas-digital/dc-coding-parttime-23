package MichaelReal.week10_strings;

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
            Scanner scanner = new Scanner(System.in);

            System.out.println("Willkommen zum Zufallsshuffle Programm");

            // Wort von der Kommandozeile einlesen
            String inputWord = scanner.nextLine();

            // Buchstaben des Wortes in ein char-Array aufsplitten
            char[] charArray = inputWord.toCharArray();

            // char-Array zufällig vertauschen
            shuffleArray(charArray);

            // Zufällig vertauschtes Wort ausgeben
            String shuffledWord = new String(charArray);
            System.out.println(shuffledWord);
        }

        // Methode zum Zufällig Vertauschen eines char-Arrays
        private static void shuffleArray(char[] array) {
            Random random = new Random();
            for (int i = array.length - 1; i > 0; i--) {
                int index = random.nextInt(i + 1);
                // Vertauschen
                char temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }
