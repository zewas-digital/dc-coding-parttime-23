package claudia.week13_File;

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

import claudia.BasicFunctions;

public class Stream_5_CSVReader_Bonus {
    static String resourceFileLink = "csv/sales_100.csv";

    public static void main(String[] args) {

        String[][] data = Stream_5_CSVReader.vectorToMatrix(Stream_5_CSVReader.csvToVector(resourceFileLink));
        int rows = data.length;
        int columns = data[0].length;
        int[] widthOfColumn = new int[columns];
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

        //Format left- or right-aligned, depending on if entry is word or number
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                try {
                    Integer.parseInt(data[i][j]);
                    System.out.printf("%" + widthOfColumn[j] + "s  ", data[i][j]);
                } catch (NumberFormatException nfe){
                    try{
                        Double.parseDouble(data[i][j]);
                        System.out.printf("%" + widthOfColumn[j] + "s  ", data[i][j]);
                    } catch (NumberFormatException nfe2){
                        System.out.printf("%-" + widthOfColumn[j] + "s  ", data[i][j]);
                    }
                }
           }
            System.out.println();
        }
        System.out.println("*".repeat(totalWidth));

////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Sort by column - leave out first line (header!)
        //TODO Sortieren nach den Datumsangaben oder Zahlen funktioniert so nicht!

        String[][] dataToSort = new String[rows - 1][columns];
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns; j++) {
                dataToSort[i][j] = data[i + 1][j];
            }
        }

        int input = -1;
        while (input < 0 || input > 14) {
            System.out.println("Nach welcher Spalte soll sortiert werden?");
            input = BasicFunctions.readInt("1- Region, 2 - Country, 3 - Item Type, 4 - Sales Channel, 5 - Order Priority, 6 - Order Date, 7 - Order ID, 8 - Ship Date, 9 - Units Sold, 10 - Unit Price, 11 - Unit Cost, 12 - Total Revenue, 13 - Total Cost, 14 - Total Profit: ");
        }

        bubbleSortRegardingAlphabet(dataToSort, input-1);
        System.out.println("Daten sortiert nach" + input +"-ter Spalte: ");
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

    /*
         String text = "Australia";
        String integerText = "9925";
        String doubleText = "255.28";

        String testText = doubleText;

        try {
            Integer.parseInt(testText);
            System.out.println("Der String " + testText + " ist ein Integer.");

        } catch (NumberFormatException nfe) {
            try {
                Double.parseDouble(testText);
                System.out.println("Der String " + testText + " ist ein Double.");
            } catch (NumberFormatException nfe2) {
                System.out.println("Der String ist ein Text, Datum, etc.");
            }
        }

     */


}
