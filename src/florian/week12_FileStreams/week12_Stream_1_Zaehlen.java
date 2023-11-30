package florian.week12_FileStreams;

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

import java.awt.geom.Arc2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class week12_Stream_1_Zaehlen {
    public static void main(String[] args) {
        getSimpleText();
    }

    public static void getSimpleText() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );
            int wordCounter = wordReader(reader);

            String input;
            int lineNumber = 1;
            while ((input = reader.readLine()) != null) {
                 System.out.println("Zeile " + lineNumber + ": " + input);

                lineNumber++;

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
    }




    static int wordReader (BufferedReader reader){
        int counter = 0;


        try{
            String input;

            int lineNumber = 1;
            while ((input = reader.readLine()) != null) {
               // System.out.println("Zeile " + lineNumber + ": " + input);
                lineNumber++;


                String [] arraywords = input.split(" ");




                System.out.println(Arrays.toString(arraywords));
            }

        }catch (IOException exc) {
            System.out.println("Fehler");
        }


        return counter;
    }

}
