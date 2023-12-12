package MichaelReal.week13_File;

/*
Aufgabe: Read and Display
-----------------
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Stream_5_CSVReader {
    public static void main(String[] args) {
        String filePath = "./resources/csv/sales_100.csv";

        int rows = 0;
        int columns = 0;

        // Erster Durchlauf, um die Anzahl der Zeilen und Spalten zu zählen
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                rows++;
                if (columns == 0) {
                    columns = line.split(",").length;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[][] data = new String[rows][columns];

        // Zweiter Durchlauf, um das Array zu füllen
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int rowIndex = 0;
            while ((line = br.readLine()) != null) {
                data[rowIndex++] = line.split(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ausgabe zur Überprüfung
        for (String[] row : data) {
            System.out.println("-".repeat(300));
            System.out.printf("| %-40s 🤓| %-40s| %-18s| %-15s| %-15s| %-15s| %-15s| %-15s| %-15s| %-15s| %-15s| %-15s| %-15s| %-15s| \n",
                    row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12], row[13]);

            System.out.println("-".repeat(300));

        }
    }
}