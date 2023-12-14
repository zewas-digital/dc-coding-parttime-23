package oliver.week13_File;

/*
Aufgabe: Read and Display
-----------------
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.
 */

import oliver.week12_FileStreams.Stream_1_Zaehlen;

import java.io.BufferedReader;

public class Stream_5_CSVReader {
    public static void main(String[] args) {
        // initial: dimensionen bestimmen
        // --> anzahl zeilen und spalten
        String ressourceFileLink = "csv/sales_100.csv";
        int[] dimensions = readDimensionsInFile(ressourceFileLink);

        System.out.println("rows: " + dimensions[1] +", cols: "+ dimensions[0]);

        String[][] inputArray = new String[dimensions[1]][dimensions[0]]; // String[101][14]

        for (String[] zeile : inputArray) {
            System.out.println( "| " + String.join( " | ", zeile ) );
        }

        // 1. zeilen aus csv-datei lesen
        // --> eindimensionales Array

        // 2. datensätze im Array splitten
        // --> zweidimensionales Array

        // 3. formatierte Ausgabe erzeugen
    }

    public static int[] readDimensionsInFile(String ressourceFileLink) {
        int xCount = 0; // anzahl Spalten
        int yCount = 0; // anzahl Zeilen
        try {
            BufferedReader reader = Stream_1_Zaehlen.openStream(ressourceFileLink);
            String line;
            while ((line = reader.readLine()) != null) {
                if (xCount == 0)
                    xCount = line.split(",").length;
                yCount++;
            }
        } catch (Exception e) {
        }

        return new int[]{xCount, yCount};
    }

    static int[] getColumnSizes(String[][] inputArray, int columnCount) {
        int[] columnSizes = new int[columnCount];

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
            for (int i = 0; i < columnCount; i++) {
                String column = line[i];
                if (column.length() > columnSizes[i]) {
                    columnSizes[i] = column.length();
                }
            }
        }

        return columnSizes;
    }
}