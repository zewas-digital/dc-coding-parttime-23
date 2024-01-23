package volkan.week12_FileStreams;

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

import java.io.*;
import java.util.Objects;

public class week12_Stream_1_Zaehlen {

    public static void main(String[] args) throws IOException {
        // Datei öffnen
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        Objects.requireNonNull(
                                Texts.class.getClassLoader().getResourceAsStream("txt/simpleText.txt")
                        )
                )
        );

        // Wort eingeben
        System.out.print("Wort eingeben: ");
        String wort = reader.readLine();

        // Wort zählen
        int anzahlWorte = 0;
        String gelesenesWort = "";
        while ((gelesenesWort = reader.readLine()) != null) {
            if (gelesenesWort.equals(wort)) {
                anzahlWorte++;
            }
        }

        // Ausgabe
        System.out.println("Anzahl Vorkommen des Wortes '" + wort + "': " + anzahlWorte);
    }
}