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
        int[] columnsmaxsizes=getColumnSizes( daten,spaltenanzahl[1] );
        printarray(daten, spaltenanzahl[1], columnsmaxsizes );;

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

    public static int[] getColumnSizes(String[][] daten, int maxcountofcolomsofdata){
        int [] columnSizes= new int [maxcountofcolomsofdata];
        for (String[] line: daten) {
            // option 2: längenvergleich mit for i
            for (int i = 0; i < maxcountofcolomsofdata; i++) {
                String column = line[i];
                if ( column.length( ) > columnSizes[i] ) {
                    columnSizes[i] = column.length( );
                }
            }
        }
        return columnSizes;
    }

    public static void printarray(String[][] daten, int columns,int[] columnsmaxsizes) {
        for (String[] line : daten) {
            // option 2: längenvergleich mit for i
            for (int i = 0; i < columns; i++) {
                int wordlenthmax= columnsmaxsizes[i]-line[i].length();
                System.out.print( line[i]+ " ".repeat( wordlenthmax+4 ));
            }
            System.out.println(  );
        }

    }
}
