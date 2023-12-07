package Alpi.week13;

/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen
Dateien nach Größe absteigend
 */

import java.io.File;
import java.io.IOException;

public class Stream_4_FileStructure {
    public static void main(String[] args) throws IOException {
        // Das Verzeichnis, das aufgelistet werden soll
        File directory = new File("./src/alpi/");

        // Alle Dateien und Ordner in dem Verzeichnis durchlaufen
        for (File file : directory.listFiles()) {
            // Dateien ausgeben
            if (file.isDirectory()) {
                System.out.println(file.getName());
            }

            // Ordner ausgeben
            else if (file.isDirectory()) {
                System.out.println(" " + file.getName());
            }



        }

    }
}