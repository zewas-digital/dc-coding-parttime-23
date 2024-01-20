package volkan.week13_File;

/*
Aufgabe: Read and Display
-----------------
Lies die CSV Datei ein und speichere diese in einem String.
Zerlege den String zuerst nach Zeilen, dann nach Spalten und erstelle somit ein String[][],
ein zweidimensionales Array.

Gib nun mit Hilfe des String[][], die Daten schön formatiert aus.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Stream_5_CSVReader {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("resources/csv/sales_100.csv");
        Scanner scanner = new Scanner(file);


        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] data = line.split(",");
            for (String cell : data) {
                System.out.printf("%15s", cell);
            }
            System.out.println();
        }
    }
}
