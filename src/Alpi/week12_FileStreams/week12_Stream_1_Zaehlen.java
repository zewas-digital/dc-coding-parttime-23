package Alpi.week12_FileStreams;

/*
Aufgabe: Wörter und Buchstaben zählen
Lies das File mit Hilfe des BufferedReader.

1/ Erstelle eine Methode, welche die Anzahl der Wörter ausgibt. Die Anzahl muss nicht exakt sein.

2/ Erstelle eine Methode, welche nur einen bestimmten Buchstaben des Texts zählt,
welcher als Parameter mitgegeben wird.

3/ Bonus: Frage den Anwender, welches Wort gezählt werden soll
und führe das Zählen über eine Methode aus.

 */

import data.Texts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*public class week12_Stream_1_Zaehlen {

    public static int zaehleWoerter(String dateiname) throws IOException {
        // Datei öffnen
        BufferedReader reader = new BufferedReader(new FileReader(dateiname));

        // Wörter zählen
        int anzahl = 0;
        String zeile;
        while ((zeile = reader.readLine()) != null) {
            anzahl += zeile.split(" ").length;
        }

        // Datei schließen
        reader.close();

        return anzahl;
    }

    public static void main(String[] args) throws IOException {
        // Anzahl der Wörter ausgeben
        System.out.println("Anzahl der Wörter: " + zaehleWoerter("txt/simpleText.txt"));
    }
}
*/