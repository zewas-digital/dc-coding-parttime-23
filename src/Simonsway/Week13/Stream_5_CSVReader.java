package Simonsway.Week13;

/*
Aufgabe: Read and Display
-----------------
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.
 */

import data.Texts;

import javax.swing.*;
import java.io.*;

public class Stream_5_CSVReader {
    public static void main(String[] args) {

        String filePath = "./resources/csv/sales_100.csv";

        int rows = 0;
        int cols = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                rows++;                                     // Hier werden solange rows increment bis oben null erreich ist somit kenn wir Anzahl Zeilen
                if (cols == 0) {
                    cols = line.split(",").length;   // Mit split teilen wir den String bei jedem Komma / Wort mit lenght bekommen wir die spalten Anzahl
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        String[][] table = new String[rows][cols]; // Neues Arrray mit der größe errechnet durch die obere Schleife mit rows und cols

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int rowIndex = 0;
            while ((line = reader.readLine()) != null) {
                table[rowIndex++] = line.split(","); // In das Array table mit dem rowIndex 0 increment jede Zeile wird geschrieben
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        int columnWidth = 35; // Kann je nach Bedarf angepasst werden

        for (String[] row : table) {

            System.out.println("-".repeat(columnWidth * row.length)); // Trennzeichen zwischen den Zeilen

            for (String cell : row) {                                       // Durchlaufen aller Spalten in der Zeile
                System.out.printf("| %-" + columnWidth + "s", cell);        // Formatierung und Ausgabe jeder Zelle
            }

            System.out.println("|"); // Zeilenende
            System.out.println("-".repeat(columnWidth * row.length)); // Trennzeichen am Ende der Zeile
        }

    }
}