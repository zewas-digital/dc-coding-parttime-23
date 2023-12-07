package michael_k.week13;

/*
Aufgabe: Read and Display
-----------------
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.
 */

import data.Texts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class Stream_5_CSVReader {

    public static void main(String[] args) {

        String line;
        int[] csvSize = csvSize ();
        String[][] table = new String[csvSize[1]][csvSize[0]];

        BufferedReader reader = new java.io.BufferedReader(
                new InputStreamReader (
                        Objects.requireNonNull(
                                Texts.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")
                        )
                )
        );

        try {
            int i=0;
            while((line = reader.readLine ( )) != null) {

                String[] splitLine = line.split ( "," );

                for (int j = 0; j < csvSize[0]; j++) {
                    table[i][j] = splitLine[j];
                }

                i++;
            }

        } catch (IOException e) {
            throw new RuntimeException ( e );
        }
        int[] sizes = columnSize ( table );
        printTable ( table, sizes );

    }

    static int[] csvSize(){

        BufferedReader reader = new java.io.BufferedReader(
                new InputStreamReader (
                        Objects.requireNonNull(
                                Texts.class.getClassLoader().getResourceAsStream("csv/sales_100.csv")
                        )
                )
        );

        int[] size = new int[2];
        String line;
        int csvlength = 0;
        int csvwidht = 0;

        try {

            while ( (line = reader.readLine ( )) != null ) {
                String[] splitLine = line.split ( "," );
                csvwidht = splitLine.length;
                csvlength++;
            }

        }catch (IOException e) {
            throw new RuntimeException ( e );
        }


        size[0] = csvwidht;
        size[1] = csvlength;

        return size;
    }
    static  int[] columnSize(String[][] table){

        int[] sizes = new int[table[0].length];

        for (int i = 0; i < table[0].length; i++) {
            int columnSize=0;
            for (int j = 0; j < table.length; j++) {

                if(columnSize < table[j][i].length()){
                    columnSize = table[j][i].length();
                }
            }
            sizes[i] = columnSize+3;
        }
        System.out.println (Arrays.toString ( sizes ) );
        return sizes;
    }
    static void printTable(String[][] table, int[] sizes ){

        int tablewidht=1;
        for (int i = 0; i < sizes.length; i++) {
            tablewidht = tablewidht + sizes[i]+1;
        }

        for (int i = 0; i < (tablewidht); i++) {
            System.out.print ("_" );
        }
        System.out.println ( );

        // Header
        System.out.print ( "|" );
        for (int i = 0; i < table[0].length; i++) {
            System.out.print ( table[0][i] );

            for (int j = 0; j < sizes[i]-table[0][i].length (); j++) {
                System.out.print (" " );
            }
            System.out.print ("|" );
        }
        System.out.println ( );
        for (int i = 0; i < (tablewidht); i++) {
            System.out.print ("_" );
        }
        System.out.println ( );



        // Datensätze
        for (int j = 1; j < table.length-1; j++) {

            System.out.print ( "|" );
            for (int i = 0; i < table[0].length; i++) {
                System.out.print ( table[j][i] );

                for (int k = 0; k < sizes[i] - table[j][i].length ( ); k++) {
                    System.out.print ( " " );
                }
                System.out.print ( "|" );
            }
            System.out.println ( );

        }
    }
}