package claudia.week13_File;

/*
Aufgabe: Write CSV-File

Füge die Werte aus den einzelnen Arrays in einzelne Datensätze zusammen
und schreibe die Datensätze im CSV-Format in eine neue Datei (in dein aktuelles Package).

Verwende als Separator (Trennzeichen) ;
Schreibe auch eine Titelzeile
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Stream_6_CSVWriter {
    //Columns
    static String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    static String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    static int[] age = {40, 78, 5, 18, 81};
    static String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    static float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    //additional row for header:
    static String[] header = {"Vorname", "Nachname", "Alter", "Wohnort", "Entfernung zur Hauptstadt"};

    static String path = "./src/claudia/week13_File/personen.csv";

    public static void main(String[] args) {

        File file2 = new File(path);
        int numberOfEntries = 5; //Anzahl der Datensätze

        //Überschrift
        writeToFile(file2, String.join(";", header));

        //Einträge
        for (int i = 0; i < numberOfEntries; i++) {
            String entry = firstName[i] + ";" + lastName[i] + ";" + age[i] + ";" + place[i] + ";" + distanceFromCapital[i];
            writeToFile(file2, entry);
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
        }
    }

}

