package Matthias.week13_File;

/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen
Dateien nach Größe absteigend
 */

import java.io.File;
import java.util.Arrays;

public class Stream_4_FileStructure {
    static String relativeFileLink = "./src/Matthias";
    public static void main( String[] args ) {
        File VerzeichnisInhalt= new File(relativeFileLink);
        // Liste aller Dateien und Verzeichnisse im Verzeichnis
        File[] files=VerzeichnisInhalt.listFiles();
        // Dateien und Verzeichnisse in ein Array kopieren
        String[] names = new String[files.length];
        for (int i = 0; i < files.length; i++) {

            names[i] = files[i].getPath();
        }
        // Sortierte Dateien und Verzeichnisse ausgeben
        for (String name : names) {
            System.out.println(name);
        }
        printChildren( names );
    }
    static void printChildren(String[] names){
        for (String name : names) {
            System.out.println( Arrays.toString( name.split( "\\\\" ) ) );
        }

    }
}