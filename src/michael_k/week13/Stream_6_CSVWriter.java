package michael_k.week13;

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
    static String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    static String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    static int[] age = {40, 78, 5, 18, 81};
    static String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    static float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    public static void main(String[] args) {

        int datasets = firstName.length;
        String dataset = "";
        File f = new File("./src/michael_k/week13/CSV_write");

        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            PrintStream ps = new PrintStream(fos);

            for (int i = 0; i < datasets; i++) {
                dataset = firstName[i]+","+lastName[i]+","+age[i]+","+place[i]+","+distanceFromCapital[i];
                ps.println(dataset);
            }

            ps.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Datei wurde nicht gefunden.");
        } finally {
            System.out.println("+--- wrote file successfully");
        }

    }
}
