package MichaelReal.week10_strings;

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
            Scanner scanner = new Scanner(System.in);

            System.out.println("Willkommen zum Reverseprogramm");

            // Benutzer zur Eingabe des Wortes auffordern
            System.out.print("Geben Sie ein Wort ein: ");
            String inputWord = scanner.nextLine();

            // Wort umdrehen
            String reversedWord = reverseWord(inputWord);

            // Ausgabe des umgedrehten Wortes
            System.out.println("Umgdrehetes Wort: " + reversedWord);

        }

        // Methode zum Umkehren des Wortes
        private static String reverseWord(String word) {
            char[] charArray = word.toCharArray();

            // Umkehren des charArray
            for (int i = 0; i < charArray.length / 2; i++) {
                char temp = charArray[i];
                charArray[i] = charArray[charArray.length - 1 - i];
                charArray[charArray.length - 1 - i] = temp;
            }

            // Erstellen und zurückgeben des umgedrehten Wortes
            return new String(charArray);
        }
    }


