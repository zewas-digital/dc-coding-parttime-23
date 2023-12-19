package Alpi.week13;

/*
Aufgabe: Read and Display
-----------------
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Stream_5_CSVReader {

    public static void main(String[] args) throws IOException {

        File file = new File("resources/csv/sales_100.csv");

        FileReader reader = new FileReader(file);

        String csvData = "";
        int c;
        while ((c = reader.read()) != -1) {
            csvData += (char) c;
        }


        reader.close();

        String[] rows = csvData.split("\n");
        String[][] spalten = new String[rows.length][];
        for (int i = 0; i < rows.length; i++) {
            spalten[i] = rows[i].split(" ; ");
        }

        for (int i = 0; i < spalten.length; i++) {


            for (int j = 0; j < spalten[i].length; j++) {
                System.out.printf("%15s", spalten[i][j]);
            }
            System.out.println();
        }
    }
}