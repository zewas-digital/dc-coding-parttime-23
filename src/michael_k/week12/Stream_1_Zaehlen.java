package michael_k.week12;

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

public class Stream_1_Zaehlen {
    public static void main(String[] args) {

        String filePath = "txt/simpleText.txt";
        String specificWord = "zu";
        char specificChar = '1';

        System.out.println ( countWords ( filePath ));
        System.out.println (countSpecificWord ( filePath, specificWord ) );
        System.out.println (countChar ( filePath ) );
        System.out.println (countSpecificChar ( filePath, specificChar ) );

    }
    static int countWords (String text){

        int count = 0;
        String line;

        BufferedReader reader = openStream(text);

        try {

            while ( (line = reader.readLine ( )) != null) {

                String[] splitLine = line.split ( " " );
                count = count + splitLine.length;
            }

        } catch (IOException e) {
            throw new RuntimeException ( e );
        }

        return count;
    }
    static int countSpecificWord (String text, String specificWord){

        int count = 0;
        String line;

        BufferedReader reader = openStream(text);

        try {

            while ( (line = reader.readLine ( )) != null) {

                String[] splitLine = line.split ( " " );

                for ( String word : splitLine ) {
                    if(word.equals ( specificWord )){
                        count++;
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException ( e );
        }
        return count;
    }
    static int countChar (String text){

        int count = 0;
        String line;

        BufferedReader reader = openStream(text);

        try {

            while ( (line = reader.readLine ( )) != null) {

                count = count + line.length ();

            }

        } catch (IOException e) {
            throw new RuntimeException ( e );
        }
        return count;
    }
    static int countSpecificChar(String text, char character) {
        int count = 0;
        int charInt = (int)character;

        try {
            BufferedReader reader = openStream(text);

            // Einzelnes Zeichen lesen
            int readCharInt;
            while ((readCharInt = reader.read()) > -1) {
                // Zeichen vergleichen
                if (charInt == readCharInt)
                    count++;
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("IOExeption");
        }

        return count;
    }
    static BufferedReader openStream(String fileLink) throws RuntimeException {
        try {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream(fileLink)
                            )
                    )
            );
            return reader;

        } catch (Exception exc) {
            throw new RuntimeException(exc);
        }
    }
}
