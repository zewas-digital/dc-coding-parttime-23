package Matthias.week12_FileStreams;

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
import java.util.Arrays;
import java.util.Objects;

public class week12_Stream_1_Zaehlen {
    public static void main( String[] args ) {
        //Zählt die Wörter im Text
    getSimpleText();
        //Zählt einen Buchstabe im Text
    getSimpleText('a');
        //Zählt ein Wort
    getSimpleText("sie");
    }
    //Methode 1: Gibt die Anzahl der Wörter aus
    public static void getSimpleText() {
        BufferedReader reader = null; // Zuweisung: BufferReader ist eine Spezialiserung der Klasse Reader
        // Buffer neue Instanz und reader der Veriable
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
            int Summe= 0;
            while ((input = reader.readLine()) != null) {
                System.out.println("Zeile " + lineNumber + ": " + input);
                int length=input.split(" ").length;
                lineNumber++;
                Summe=(Summe+length)-1;
            }
            System.out.println( "Anzahl der Wörter:" +Summe );
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

    //Methode 2: Gibt einen Bestimmten Buchstaben im Text, der als Parameter mitgegeben wird
    public static void getSimpleText(char Buchstabe) {
        BufferedReader reader = null; // Zuweisung: BufferReader ist eine Spezialiserung der Klasse Reader
        // Buffer neue Instanz und reader der Veriable
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );

            int input;
            int Summe= 0;
            int userInput=(int)Buchstabe;
            while ((input = reader.read()) != -1) {
                if ( input==userInput) {
                    Summe++;
                }
            }
            System.out.println( "Das Wort : " + Buchstabe +":" +"kommt" +Summe+ "vor");
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

    public static void getSimpleText(String Wort) {
        BufferedReader reader = null; // Zuweisung: BufferReader ist eine Spezialiserung der Klasse Reader
        // Buffer neue Instanz und reader der Veriable
        try {
            reader = new BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                            )
                    )
            );

            int input;
            int Summe= 0;
            while ((input = reader.read()) != -1) {
               //
            }
            System.out.println( "Das Wort : " + Wort +":" +"kommt" +Summe+ "vor");
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
