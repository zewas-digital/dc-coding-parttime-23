package saifedine.week13_File;

/*
Aufgabe: Write CSV-File

Füge die Werte aus den einzelnen Arrays in einzelne Datensätze zusammen
und schreibe die Datensätze im CSV-Format in eine neue Datei (in dein aktuelles Package).

Verwende als Separator (Trennzeichen) ;
Schreibe auch eine Titelzeile
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Stream_6_CSVWriter {
    static String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    static String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    static int[] age = {40, 78, 5, 18, 81};
    static String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    static float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    static String relativeFileLink = "./src/saifedine/week13_File/Content.csv";
    public static void main(String[] args) {

        // initial: dimensionen bestimmen
        // --> anzahl zeilen und spalten

// alle Spalten der einzelnen Arrays herauslesen
// alle Spalten der einzelnen Arrays zusammenfügen
// alle Spalten der einzelnen Arrays ausgeben in csv

        System.out.println("Anzahl Spalten: " + firstName.length);

        String[] headline = {"Vorname" + ";" + "Nachname" + ";" + "Alter" + ";" + "Ort" + ";" + "km bis Wien"};

        System.out.println(Arrays.toString(headline));

        String[] row = getStrings();

        writeToFile(headline, row);


    }

    private static String[] getStrings() {
        String[] row = new String[firstName.length];
        for (int i = 0; i < firstName.length; i++) {
            row = new String[]
                    {firstName[i] + ";" + lastName[i] + ";" + Integer.toString(age[i]) + ";" + place[i] + ";" + Float.toString(distanceFromCapital[i])};
            System.out.println(Arrays.toString(row));
        }
        return row;
    }

    private static void writeToFile(String[] headline, String[] row) {

        File f = new File(relativeFileLink);
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);

            ps.println(Arrays.toString(headline));

            ps.println(Arrays.toString(row));

            ps.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden.");
        } finally {
            System.out.println("+--- wrote file successfully");
        }
    }
}


