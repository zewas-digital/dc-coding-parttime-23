package judith.week13_File;

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

public class Stream_5_CSVReader_Bonus {
    public static void main(String[] args) {
        String text = "Australia";
        String integerText = "9925";
        String doubleText = "255.28";

        String testText = doubleText;

        try {
            Integer.parseInt(testText);
            System.out.println("Der String "+ testText +" ist ein Integer.");

        } catch (NumberFormatException nfe) {
            try {
                Double.parseDouble(testText);
                System.out.println("Der String "+ testText +" ist ein Double.");
            } catch (NumberFormatException nfe2) {
                System.out.println("Der String ist ein Text, Datum, etc.");
            }
        }
    }
}









