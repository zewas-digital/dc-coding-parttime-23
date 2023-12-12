package claudia.week13_File;

/*
Aufgabe: Read and Display
-----------------
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][] die Daten schön formatiert aus.
 */

import claudia.BasicFunctions;
import data.Texts;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Stream_5_CSVReader {
    static String resourceFileLink = "csv/sales_100.csv";

    public static void main(String[] args) {

       String[][] data = vectorToMatrix(csvToVector(resourceFileLink));
        int rows = data.length;
        int columns = data[0].length;
        int [] widthOfColumn = new int[columns];
        int totalWidth = -2; //because +2 is added for each column, which is unnecessary for last one

        //Find max width for each column:
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                if (data[i][j].length() > widthOfColumn[j]) widthOfColumn[j] = data[i][j].length();
            }
        }

        //Calculate total width of table
        for (int j = 0; j < columns; j++) {
            totalWidth = totalWidth + widthOfColumn[j] + 2;
        }

        System.out.println("\nInhalt des Files " + resourceFileLink + ":");
        System.out.println("*".repeat(totalWidth));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (data[i][j].charAt(0) >= 48 && data[i][j].charAt(0) <= 57) //Ascii-Values of numbers between 48 (for 0) and 57 (for 9)
                    System.out.printf("%" + widthOfColumn[j] + "s  ", data[i][j]);
                else System.out.printf("%-" + widthOfColumn[j] + "s  ", data[i][j]);
            }
            System.out.println();
        }
        System.out.println("*".repeat(totalWidth));

////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Sortieren einer Spalte nach Alphabet - erste Zeile auslassen!

       String[][] dataToSort = new String[rows-1][columns];

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns; j++) {
                dataToSort[i][j] = data[i + 1][j];
            }
        }

        bubbleSortRegardingAlphabet(dataToSort, 0);
        System.out.println("Daten sortiert nach erster Spalte: ");
        System.out.println("*".repeat(totalWidth));
        //Überschriftszeile
        for (int j = 0; j < columns; j++) {
            System.out.printf("%-" + widthOfColumn[j] + "s  ", data[0][j]);
        }
        System.out.println();

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns; j++) {
                if (dataToSort[i][j].charAt(0) >= 48 && dataToSort[i][j].charAt(0) <= 57) //Ascii-Values of numbers between 48 (for 0) and 57 (for 9)
                    System.out.printf("%" + widthOfColumn[j] + "s  ", dataToSort[i][j]);
                else System.out.printf("%-" + widthOfColumn[j] + "s  ", dataToSort[i][j]);
            }
            System.out.println();
        }
        System.out.println("*".repeat(totalWidth));

       ////////
        bubbleSortRegardingAlphabet(dataToSort, 2);
        System.out.println("Daten sortiert nach dritter Spalte: ");
        System.out.println("*".repeat(totalWidth));
        //Überschriftszeile
        for (int j = 0; j < columns; j++) {
            System.out.printf("%-" + widthOfColumn[j] + "s  ", data[0][j]);
        }
        System.out.println();

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns; j++) {
                if (dataToSort[i][j].charAt(0) >= 48 && dataToSort[i][j].charAt(0) <= 57) //Ascii-Values of numbers between 48 (for 0) and 57 (for 9)
                    System.out.printf("%" + widthOfColumn[j] + "s  ", dataToSort[i][j]);
                else System.out.printf("%-" + widthOfColumn[j] + "s  ", dataToSort[i][j]);
            }
            System.out.println();
        }
        System.out.println("*".repeat(totalWidth));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////



    }

    public static void bubbleSortRegardingAlphabet(String[][] data, int col) {
        int rows = data.length;
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                if (data[j][col].compareTo(data[j + 1][col]) > 0) {
                    swapElements(data, j, j + 1);
                }
            }
        }
    }

    public static void swapElements(String[][] data, int i1, int i2) {
        if (i1 != i2) {
            String[] temp = data[i1];
            data[i1] = data[i2];
            data[i2] = temp;
        }
    }

    static String[][] vectorToMatrix(String[] vector){
        int numberOfEntries = vector[0].split(",").length;
        int numberOfLines = vector.length;
        String[][] data = new String[numberOfLines][numberOfEntries];

        for (int i = 0; i < numberOfLines; i++) {
            data[i] = vector[i].split(",");
        }
        return data;
    }
    static String[] csvToVector(String link) {
        int numberOfLines = 0;
        String[] lines = new String[numberOfLines];

        try {
            InputStream inputStream = Objects.requireNonNull(
                    Texts.class.getClassLoader().getResourceAsStream(link)
            );
            Scanner sc = new Scanner(inputStream);

            while (sc.hasNextLine()) {
                numberOfLines++;
                lines = Arrays.copyOf(lines, numberOfLines);
                lines[numberOfLines-1] = sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println("Fehler beim Laden der Datei." + e);
            e.printStackTrace();
        }
        return lines;
    }
}