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
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class week12_Stream_1_Zaehlen {
    public static void main(String[] args) {

        String text = getSimpleText();

        printTextWithParagraphs(text);

        int wordCount = countWords(text);
        System.out.println("Anzahl der Wörter: " + wordCount + " 👌");

        char letterToCount = promptForLetter();
        int letterCount = countLetter(text, letterToCount);
        System.out.println("Anzahl des Buchstabens '" + letterToCount + "': " + letterCount + " 😖");

        String wordToCount = promptForWord();
        int wordOccurrences = countWord(text, wordToCount);
        System.out.println("Anzahl des Wortes '" + wordToCount + "': " + wordOccurrences + " 😮");
    }

    private static void printTextWithParagraphs(String text) {
        // Teile den Text an jedem Punkt und füge einen Absatz hinzu
        String[] sentences = text.split("\\.");
        for (String sentence : sentences) {
            System.out.println(sentence.trim() + ". 🤓\n");
        }
    }

    private static String getSimpleText() {
        StringBuilder textBuilder = new StringBuilder();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    week12_Stream_1_Zaehlen.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );

            String input;
            while ((input = reader.readLine()) != null) {
                textBuilder.append(input).append(" ");
            }

        } catch (IOException exc) {
            throw new RuntimeException(exc);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return textBuilder.toString();
    }

    private static char promptForLetter() {
        System.out.print("Geben Sie den Buchstaben ein, den Sie zählen möchten: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    private static String promptForWord() {
        System.out.print("Geben Sie das Wort ein, das Sie zählen möchten: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static int countLetter(String text, char letter) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return count;
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



