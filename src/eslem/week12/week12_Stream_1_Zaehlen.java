package eslem.week12;

/*
Aufgabe: Wörter und Buchstaben zählen
Lies das File mit Hilfe des BufferedReader.

1/ Erstelle eine Methode, welche die Anzahl der Wörter ausgibt. Die Anzahl muss nicht exakt sein.

2/ Erstelle eine Methode, welche nur einen bestimmten Buchstaben des Texts zählt,
welcher als Parameter mitgegeben wird.

3/ Bonus: Frage den Anwender, welches Wort gezählt werden soll
und führe das Zählen über eine Methode aus.

 */
import data.Texts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;
public class week12_Stream_1_Zaehlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Anzahl der Wörter im Text: " + countWords());

        System.out.println("\n2. Anzahl der Buchtaben: ");
        System.out.println("Anzahl der a im Text: " + countLetters('a'));
        System.out.println("Anzahl der e im Text: " + countLetters('e'));
        System.out.println("Anzahl der i im Text: " + countLetters('i'));
        System.out.println("Anzahl der o im Text: " + countLetters('o'));
        System.out.println("Anzahl der A im Text: " + countLetters('A'));
        System.out.println("Anzahl der S im Text: " + countLetters('S'));
        System.out.println("Anzahl der E im Text: " + countLetters('E'));
        System.out.println("Anzahl der M im Text: " + countLetters('M'));

        System.out.println("\n3. Ein Wort soll gezählt werden ");
        System.out.print("\nGeben Sie das Wort ein, welches gezählt werden soll: ");
        String OneWord = scanner.next();
        System.out.println(OneWord + " kommt " + countOneWord(OneWord) + " mal im Text vor! ");
    }

    static int countWords() {
        BufferedReader reader = null;
        int counter = 0;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );

            String input;
            while ((input = reader.readLine()) != null) {
                counter = counter + input.split(" ").length - 1;
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
        return counter;
    }

    static int countLetters(char letter) {
        BufferedReader reader = null;
        int counter = 0;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );
            String input;
            while ((input = reader.readLine()) != null) {
                counter = counter + input.split(String.valueOf(letter)).length - 1;
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
        return counter;
    }

    static int countOneWord(String OneWord) {
        BufferedReader reader = null;
        int counter = 0;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );
            String input;
            while ((input = reader.readLine()) != null) {
                counter = counter + input.split(String.valueOf(OneWord)).length - 1;
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
        return counter;
    }
}
