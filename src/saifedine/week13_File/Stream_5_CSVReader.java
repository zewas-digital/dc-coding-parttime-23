package saifedine.week13_File;

/*
Aufgabe: Read and Display
-----------------
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Stream_5_CSVReader {

    static String relativeFileLink = "./resources/csv/sales_100.csv";

    public static void main(String[] args) {
        // initial: dimensionen bestimmen
        // --> anzahl zeilen und spalten

        // 1. zeilen aus csv-datei lesen
        // --> eindimensionales Array
                                                        // fillInputArray (Schritt 1. & 2.)
        // 2. datensätze im Array splitten
        // --> zweidimensionales Array

        // 3. formatierte Ausgabe erzeugen             // printInputArray



        int[] dimensions = readDimensionsInFile();

        System.out.println("Zeilenanzahl: " + dimensions[0] + " | Spaltenanzahl: " + dimensions[1]);

        String[][] inputArray = createInputArray();

        fillInputArray(inputArray);

        int[] maxColumnSize = getColumnSizes(inputArray,dimensions[1]);

        pintInputArray(inputArray, dimensions, maxColumnSize);

    }



    static int [] readDimensionsInFile(){

        int lineNumber = 0;
        int countColumns = 0;

        try {
            FileInputStream fis = new FileInputStream(relativeFileLink);
            Scanner sc = new Scanner(fis);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                //System.out.println("| " + lineNumber + " " + line);

                lineNumber++;

                countColumns = line.split(",").length;

            }
            //System.out.println(lineNumber);
            //System.out.println(countColumns);

            sc.close();
        } catch (SecurityException e) {
            System.out.println("Kein Zugriff auf die Datei.");
        } catch (FileNotFoundException fnf) {
            System.out.println("Datei wurde nicht gefunden.");
        }

        //System.out.println("Anzahl Spalten: " + countColumns);
        //System.out.println("Anzahl Zeilen: " + lineNumber);

        return new int[]{lineNumber, countColumns};

    }

    static String[][] createInputArray() {

        int lineNumber = 0;
        int countColumns = 0;

        try {
            FileInputStream fis = new FileInputStream(relativeFileLink);
            Scanner sc = new Scanner(fis);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                //System.out.println("| " + lineNumber + " " + line);

                lineNumber++;

                countColumns = line.split(",").length;

            }
            //System.out.println(lineNumber);
            //System.out.println(countColumns);

            sc.close();
        } catch (SecurityException e) {
            System.out.println("Kein Zugriff auf die Datei.");
        } catch (FileNotFoundException fnf) {
            System.out.println("Datei wurde nicht gefunden.");
        }

        //System.out.println("Anzahl Spalten: " + countColumns);
        //System.out.println("Anzahl Zeilen: " + lineNumber);

        String[][] inputArray = new String[lineNumber][countColumns];
        return inputArray;
    }

    static void fillInputArray(String[][] inputArray){

        String[][] dataArray = inputArray;
        int lineNumber = 0;

        try {
            FileInputStream fis = new FileInputStream(relativeFileLink);
            Scanner sc = new Scanner(fis);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                dataArray[lineNumber] = line.split(",");
                lineNumber++;
            }
            //System.out.println(lineNumber);

            sc.close();
        } catch (SecurityException e) {
            System.out.println("Kein Zugriff auf die Datei.");
        } catch (FileNotFoundException fnf) {
            System.out.println("Datei wurde nicht gefunden.");
        }
/*
        for (String[] zeile : dataArray) {
            System.out.println("| " + String.join(" | ", zeile));
        }
 */
    }

    static int[] getColumnSizes(String[][] inputArray, int countColumns) {
        int[] columnSizes = new int[countColumns];

        for (String[] line: inputArray) {

            // option 1: längenvergleich mit foreach
            int j = 0;
            for (String column: line) {
                if (column.length() > columnSizes[j]) {
                    columnSizes[j] = column.length();
                }
                j++;
            }
            // option 2: längenvergleich mit for i
            for (int i = 0; i < countColumns; i++) {
                String column = line[i];
                if (column.length() > columnSizes[i]) {
                    columnSizes[i] = column.length();
                }
            }
        }
        return columnSizes;
    }

    private static void pintInputArray(String[][] inputArray, int[] dimensions, int[] maxColumnSize) {
        for (String[] zeile : inputArray) {

            for (int i = 0; i < dimensions[1]; i++) {

                int columnsSizeDiff = maxColumnSize[i] - zeile[i].length();
                System.out.print(zeile[i] + " ".repeat(columnsSizeDiff + 3));
            }
            System.out.println();

        }
    }
}