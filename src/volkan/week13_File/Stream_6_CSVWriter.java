package volkan.week13_File;

/*
Aufgabe: Write CSV-File

Füge die Werte aus den einzelnen Arrays in einzelne Datensätze zusammen
und schreibe die Datensätze im CSV-Format in eine neue Datei (in dein aktuelles Package).

Verwende als Separator (Trennzeichen) ;
Schreibe auch eine Titelzeile
 */

public class Stream_6_CSVWriter {
    static String[] firstName = {"Alfonso", "Beatrix-Eleonor", "Cecil", "Daniel", "Elmar"};
    static String[] lastName = {"Klein", "Kinderdorfer", "Al Elmenar", "Schmidt", "Simma"};
    static int[] age = {40, 78, 5, 18, 81};
    static String[] place = {"Wien", "Schwarzach", "Wiener Neudorf", "Sankt Pölten", "Sankt Pölten"};
    static float[] distanceFromCapital = {0f, 654.4f, 12.457634366f, 120.0f, 119.9999f};

    public static void main(String[] args) {
        // initial: anzahl datensätze bestimmen
        // --> eindimensionales Array

        // 1. Daten zusammen führen
        // in einen String verketten mit Trennzeichen ;
        // --> in eindim. Array speichern

        // 2. in Datei schreiben
        // --> csv Datei
    }
}
