package marcelsimma.week22;

/*
Eine Datei mit dem namen Array.txt wird eingelesen.
Jede Zeile in der Datei enthält einen Wert, der als int in eine ArrayList abgespeichert wird.
Anschließend werden die ersten 10 Werte im Array auf der Konsole ausgegeben.
Da es passieren kann, dass das Array kürzer als 10 ist, soll ein Exception Handling mit try, catch und final bei der Ausgabe angewendet werden.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {

        // Hier werden die eingelesenen Werte gespeichert.‚
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Datei einlesen und Werte in ArrayList speichern
        try (FileReader fr = new FileReader("Array.txt"); BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                int value = Integer.parseInt(line.trim());
                arrayList.add(value);
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
            return; // Programm beenden, da nicht weitergearbeitet werden kann
        }

        // Erste 10 Werte ausgeben mit Exception Handling
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(arrayList.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Das Array ist kürzer als 10 Elemente.");
        } finally {
            // Hier könnten aufräumende Aktionen erfolgen, falls nötig
        }
    }
}
