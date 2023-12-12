package Matthias.week13_File;

/*
Aufgabe: Read and Display
-----------------
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.
 */

import data.Texts;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class Stream_5_CSVReader {
    static String ressourceFileLink = "csv/sales_100.csv";

    public static void main( String[] args ) {
        int[] lineNumber=countZeilenUSpalten( ressourceFileLink );
        int[] spaltenanzahl=countZeilenUSpalten( ressourceFileLink );
        String[][] daten = new String[lineNumber[0]][spaltenanzahl[1]];
        getspalten( daten );
        printfomated( daten );

        // Daten formatiert ausgeben


    }

    public static int[] countZeilenUSpalten( String ressourceFileLink ) {
        java.io.BufferedReader reader = null;
        try {
            reader = new java.io.BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader( ).getResourceAsStream( ressourceFileLink )
                            )
                    )
            );

            String input;
            int lineNumber = 0;
            int spaltenanzahl = 0;
            while ( (input = reader.readLine( )) != null ) {
                spaltenanzahl = input.split( "," ).length;
                lineNumber++;

            }
            int[] returnvalue = {lineNumber, spaltenanzahl};
            return returnvalue;

        } catch (IOException exc) {
            throw new RuntimeException( exc );
        } finally {
            if ( reader != null ) {
                try {
                    reader.close( );
                } catch (IOException e) {
                    e.printStackTrace( );
                }
            }
        }
    }

    public static void getspalten(String[][] daten){

        java.io.BufferedReader reader = null;
        try {
            reader = new java.io.BufferedReader(
                    new InputStreamReader(
                            Objects.requireNonNull(
                                    Texts.class.getClassLoader().getResourceAsStream(ressourceFileLink)
                            )
                    )
            );
            String input;
            int linenumber=0;
            while ((input = reader.readLine()) != null) {
                    daten [linenumber]= input.split( "," );
                    linenumber++;
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

    public static void printfomated(String[][] daten){
        for (String[] zeile : daten) {
            System.out.println( "| " + String.join( " | ", zeile ) );
        }
    }
}
