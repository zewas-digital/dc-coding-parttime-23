package michael_k.week13;

/*
Aufgabe: Read and Display
-----------------
****** wie Stream_5_CSVReader:
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.

****** Bonus:
+ eruiere die jeweils notwendige/optimale Spaltenbreite und benutze sie für die Ausgabe
+ formatiere die Spalten je nach Datentyp
+ Frage den User nach welcher Spalte sortiert werden soll und sortiere die Ausgabe
 */

import data.Texts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class Stream_5_CSVReader_Bonus {

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
        sortByColumn ( table, 7 );
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
            sizes[i] = columnSize+2;
        }
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
            System.out.print (" " + table[0][i] );

            for (int j = 0; j < sizes[i] - 1 -table[0][i].length (); j++) {
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

                if(printRightLeft ( table[j][i] )){

                    System.out.print ( " " + table[j][i] + " ");

                    for (int k = 0; k < sizes[i]-2 - table[j][i].length ( ); k++) {
                        System.out.print ( " " );
                    }

                }else {

                    for (int k = 0; k < sizes[i]-2 - table[j][i].length ( ); k++) {
                        System.out.print ( " " );
                    }

                    System.out.print ( " " + table[j][i] + " " );

                }
                System.out.print ( "|" );
            }
            System.out.println ( );
        }
    }
    static boolean printRightLeft (String text){

        boolean rightLeft = false;

        try {
            Integer.parseInt(text);

        } catch (NumberFormatException nfe) {
            try {
                Double.parseDouble (text);

            } catch (NumberFormatException nfe1) {

                rightLeft = true;
            }
        }

        return rightLeft;
    }
    static void sortByColumn (String[][] table, int column){

        if (table[1][column].matches ( "\\d+" )  ) {

            String[] x;
            String[] y;
            int counter = 0;

            while ( counter != table.length - 1 ) {
                counter = 1;
                for (int i = 1; i < table.length - 1; i++) {

                    if (Integer.parseInt ( table[i][column] ) > Integer.parseInt ( table[i + 1][column] )) {
                        x = table[i];
                        y = table[i + 1];

                        table[i] = y;
                        table[i + 1] = x;
                    } else {
                        counter++;
                    }
                }
            }

        } else if (table[1][column].matches ( "-?\\d+([.]{1}\\d+){1}" )  ) {

            String[] x;
            String[] y;
            int counter = 0;

            while ( counter != table.length - 1 ) {
                counter = 1;
                for (int i = 1; i < table.length - 1; i++) {

                    if (Double.parseDouble ( table[i][column] ) > Double.parseDouble ( table[i + 1][column] )) {
                        x = table[i];
                        y = table[i + 1];

                        table[i] = y;
                        table[i + 1] = x;
                    } else {
                        counter++;
                    }
                }
            }

        } else {

            String[] x;
            String[] y;
            int z;
            int counter = 0;

            while ( counter != table.length - 1 ) {
                counter = 1;
                for (int i = 1; i < table.length - 1; i++) {
                    z = table[i][column].compareTo ( table[i + 1][column] );
                    if (z > 0) {
                        x = table[i];
                        y = table[i + 1];

                        table[i] = y;
                        table[i + 1] = x;
                    } else {
                        counter++;
                    }
                }
            }
        }
    }
}