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

public class week12_Stream_1_Zaehlen {

    public static void main(String[] args) {

        countWords ();
        countChars ();
        countSpecificWords ( "und" );
        countSpecificChar ( 'a' );
    }

    static void countWords(){

        BufferedReader fileScan = new BufferedReader (
                new InputStreamReader(
                        Objects.requireNonNull(
                                Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                        )
                )
        );

        String line;
        int wordCount = 0;

        while ( true ) {

            try {
                if (( line = fileScan.readLine ( ) ) == null) break;

                String[] words = line.split(" ");

                for (String word : words) {
                    wordCount++;
                }
            } catch (IOException e) {
                throw new RuntimeException ( e );
            }

        }
        System.out.println ("Der Text hat "+wordCount+" Wörter" );

    }
    static void countChars(){
        BufferedReader fileScan = new BufferedReader (
                new InputStreamReader(
                        Objects.requireNonNull(
                                Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                        )
                )
        );

        String line = "";
        int charCount = 0;

        try {
            while ( ( line = fileScan.readLine() ) != null){

                    for (int i = 0; i < line.length ( ); i++) {
                        charCount++;
                    }
            }
            System.out.println ( "Der Text hat "+charCount+" Zeichen" );

        } catch (IOException e) {
            throw new RuntimeException ( e );
        }
    }
    static void countSpecificWords(String specificWord){
        BufferedReader fileScan = new BufferedReader (
                new InputStreamReader(
                        Objects.requireNonNull(
                                Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                        )
                )
        );

        String line;
        int wordCount = 0;

        while ( true ) {

            try {
                if (( line = fileScan.readLine ( ) ) == null) break;

                String[] words = line.split(" ");

                for (String word : words) {
                    if (word.equals ( specificWord )){wordCount++;}
                }
            } catch (IOException e) {
                throw new RuntimeException ( e );
            }

        }
        System.out.println ("Der Text hat "+wordCount+" das Wort "+"\""+specificWord+"\""+" enthalten" );

    }
    static void countSpecificChar(char c){
        BufferedReader fileScan = new BufferedReader (
                new InputStreamReader(
                        Objects.requireNonNull(
                                Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                        )
                )
        );

        String line = "";
        int charCount = 0;

        try {
            while ( ( line = fileScan.readLine() ) != null){

                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == c) {
                        charCount++;
                    }
                }
            }
            System.out.println ( "Der Text hat "+charCount+" \""+c+"\""+" Zeichen" );

        } catch (IOException e) {
            throw new RuntimeException ( e );
        }

    }

}
