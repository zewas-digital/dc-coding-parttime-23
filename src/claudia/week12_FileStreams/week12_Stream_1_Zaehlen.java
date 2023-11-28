package claudia.week12_FileStreams;

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
import java.util.Objects;
import java.util.Scanner;

public class week12_Stream_1_Zaehlen {

    public static void main(String[] args) {

        System.out.println("\nAufgabe 1, Anzahl der Wörter im Text: " + countWords());

        System.out.println("\nAufgabe 2, Buchstaben zählen: ");
        System.out.println("Anzahl der a's im Text: " + countLetter('a'));
        System.out.println("Anzahl der A's im Text: " + countLetter('A'));
        System.out.println("Anzahl der m's im Text: " + countLetter('m'));
        System.out.println("Anzahl der M's im Text: " + countLetter('M'));
        System.out.println("Anzahl der ł's im Text: " + countLetter('ł'));

        System.out.println("\nAufgabe 3, ein Wort zählen.");
        System.out.print("Welches Wort soll gezählt werden? Bitte eingeben! ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println("Anzahl des Worts " + word + " im Text: " + countWord(word));
    }

    public static int countWord(String word) {
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
                counter = counter + input.split(String.valueOf(word)).length - 1; //Anzahl word = Anzahl der Lücken = Anzanl der Abschnitte - 1
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

    public static int countLetter(char letter) {
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
                counter = counter + input.split(String.valueOf(letter)).length - 1; //Anzahl letter = Anzahl der Lücken = Anzanl der Abschnitte - 1
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
    public static int countWords() {
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
                counter = counter + input.split(" ").length - 1; //ziehe Zeilenumbruch ab!
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