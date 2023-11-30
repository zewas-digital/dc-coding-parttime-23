package Simonsway.Week12;

/*
Aufgabe: Wörter und Buchstaben zählen
Lies das File mit Hilfe des BufferedReader.

1/ Erstelle eine Methode, welche die Anzahl der Wörter ausgibt. Die Anzahl muss nicht exakt sein.

2/ Erstelle eine Methode, welche nur einen bestimmten Buchstaben des Texts zählt,
welcher als Parameter mitgegeben wird.

3/ Bonus: Frage den Anwender, welches Wort gezählt werden soll
und führe das Zählen über eine Methode aus.

 */

import Simonsway.methods.Reader;
import data.Texts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class week12_Stream_1_Zaehlen {
    public static void main(String[] args) {


        String text = getSimpleText();
        int countWords = text.split("\\s").length;
        System.out.println(countWords);

    }

    public static String getSimpleText() {


        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );

            String input;
            int lineNumber = 1;
            while ((input = reader.readLine()) != null) {
                System.out.println("Zeile " + lineNumber + ": " + input);

                int countWords = input.split("\\s").length;
                System.out.println(countWords);


                lineNumber++;

            }
            return input;



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
    }
}