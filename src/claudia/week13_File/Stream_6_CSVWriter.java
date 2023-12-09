package claudia.week13_File;

/*
Aufgabe: Write CSV-File

Füge die Werte aus den einzelnen Arrays in einzelne Datensätze zusammen
und schreibe die Datensätze im CSV-Format in eine neue Datei (in dein aktuelles Package).

Verwende als Separator (Trennzeichen) ;
Schreibe auch eine Titelzeile
 */

import claudia.BasicFunctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Stream_6_CSVWriter {
    //Columns
    static String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    static String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    static int[] age = {40, 78, 5, 18, 81};
    static String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    static float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    //additional rows for header:
    static String[] header1 = {"Vorname", "Nachname", "Alter", "Wohnort", "Entfernung"};
    static String[] header2 = {"","","","","zur Hauptstadt"};
    static String path = "./src/claudia/week13_File/personen.csv";

    public static void main(String[] args) {

        File file = new File(path);
        int numberOfEntries = 5; //Anzahl der Datensätze
        int numberOfColumns = header1.length;

        //change Arrays of int and float to String-Arrays:
        //TODO: Notwendig? z.B. wandelt sich . in , bei Floats
        String[] distanceFromCapitalString = new String[distanceFromCapital.length];
        String[] ageString = new String[age.length];

        for (int i = 0; i < distanceFromCapital.length; i++) {
            distanceFromCapitalString[i] = String.format("%.3f", distanceFromCapital[i]);
            //TODO Formatierung? Informationsverlust?
            ageString[i] = String.format("%d", age[i]);
        }

        String[][] entriesTransposed = new String[numberOfColumns][numberOfEntries];
        entriesTransposed[0] = firstName;
        entriesTransposed[1] = lastName;
        entriesTransposed[2] = ageString;
        entriesTransposed[3] = place;
        entriesTransposed[4] = distanceFromCapitalString;

        String[][] entries = transposeMatrix(entriesTransposed);

        //Write header1 into file
        String entry = "";
        for (int j = 0; j < numberOfColumns; j++) {
            if (j < numberOfColumns - 1) entry = entry.concat(header1[j] + ";");
            else entry = entry.concat(header1[j]);
        }
        writeToFile(file, entry);

        //Write header2 into file
        entry = "";
        for (int j = 0; j < numberOfColumns; j++) {
            if (j < numberOfColumns - 1) entry = entry.concat(header2[j] + ";");
            else entry = entry.concat(header2[j]);
        }
        writeToFile(file, entry);

        //Write all entries into file
        for (int i = 0; i < numberOfEntries; i++) {

            entry = "";
            for (int j = 0; j < numberOfColumns; j++) {
                if (j < numberOfColumns - 1) entry = entry.concat(entries[i][j] + ";");
                else entry = entry.concat(entries[i][j]);
            }
            writeToFile(file, entry);
        }
    }

    static void writeToFile(File file, String content) {

        try {
            FileOutputStream fos = new FileOutputStream(file, true);
            PrintStream ps = new PrintStream(fos);
            ps.println(content);
            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden.");
        } finally {
            System.out.println("+--- wrote file successfully");
        }
    }

    static String[][] transposeMatrix (String[][] matrix){
        int originalRows = matrix.length;
        int originalCols = matrix[0].length;
        String[][] transposedMatrix = new String[originalCols][originalRows];

        for (int i = 0; i < originalCols; i++) {
            for (int j = 0; j < originalRows; j++) {
                transposedMatrix[i][j ] = matrix[j][i];
                }
            }
        return transposedMatrix;
    }
}

