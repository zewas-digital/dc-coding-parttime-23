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
import java.util.Scanner;

public class Stream_5_CSVReader {

    static String relativeFileLink = "./resources/csv/sales_100.csv";

    public static void main(String[] args) {
        // initial: dimensionen bestimmen
        // --> anzahl zeilen und spalten

        // 1. zeilen aus csv-datei lesen
        // --> eindimensionales Array

        // 2. datensätze im Array splitten
        // --> zweidimensionales Array

        // 3. formatierte Ausgabe erzeugen

        String[][] inputArray = createInputArray();

        // fillInputArray (Schritt 1. & 2.)
        // printInputArray




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

        System.out.println("Anzahl Spalten: " + countColumns);
        System.out.println("Anzahl Zeilen: " + lineNumber);

        String[][] inputArray = new String[lineNumber][countColumns];
        return inputArray;
    }

    static void fillInputArray(String[][] inputArray){

        try {
            FileInputStream fis = new FileInputStream(relativeFileLink);
            Scanner sc = new Scanner(fis);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                //System.out.println("| " + lineNumber + " " + line);

                //lineNumber++;

                //countColumns = line.split(",").length;
            }
            //System.out.println(lineNumber);
            //System.out.println(countColumns);


            sc.close();
        } catch (SecurityException e) {
            System.out.println("Kein Zugriff auf die Datei.");
        } catch (FileNotFoundException fnf) {
            System.out.println("Datei wurde nicht gefunden.");
        }

    }
}