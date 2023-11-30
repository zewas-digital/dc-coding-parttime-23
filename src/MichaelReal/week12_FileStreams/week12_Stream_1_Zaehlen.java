package MichaelReal.week12_FileStreams;

/*
Aufgabe: Wörter und Buchstaben zählen
Lies das File mit Hilfe des BufferedReader.

1/ Erstelle eine Methode, welche die Anzahl der Wörter ausgibt. Die Anzahl muss nicht exakt sein.

2/ Erstelle eine Methode, welche nur einen bestimmten Buchstaben des Texts zählt,
welcher als Parameter mitgegeben wird.

3/ Bonus: Frage den Anwender, welches Wort gezählt werden soll
und führe das Zählen über eine Methode aus.

 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class week12_Stream_1_Zaehlen {
    public static void main(String[] args) {

        String filePath =

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String text = readTextFromFile(reader);

            // 1. Anzahl der Wörter ausgeben
            int wordCount = countWords(text);
            System.out.println("Anzahl der Wörter: " + wordCount);

            // 2. Einen bestimmten Buchstaben zählen
            char letterToCount = promptForLetter();
            int letterCount = countLetter(text, letterToCount);
            System.out.println("Anzahl des Buchstabens '" + letterToCount + "': " + letterCount);

            // 3. Bonus: Benutzer nach einem Wort fragen und zählen
            String wordToCount = promptForWord();
            int wordOccurrences = countWord(text, wordToCount);
            System.out.println("Anzahl des Wortes '" + wordToCount + "': " + wordOccurrences);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readTextFromFile(BufferedReader reader) throws IOException {
        StringBuilder textBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            textBuilder.append(line).append(" ");
        }
        return textBuilder.toString();
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static char promptForLetter() {
        System.out.print("Geben Sie den Buchstaben ein, den Sie zählen möchten: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    private static int countLetter(String text, char letter) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (Character.toLowerCase(c) == Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    }

    private static String promptForWord() {
        System.out.print("Geben Sie das Wort ein, das Sie zählen möchten: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static int countWord(String text, String word) {
        int count = 0;
        String[] words = text.split("\\s+");
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }

    }


