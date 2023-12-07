package Matthias.week13_File;

/*
Aufgabe: Verzeichnis auflisten
Mit der Hilfe von java.io.File soll der Inhalt eines bestimmten Verzeichnisses ausgegeben werden.
Gib hierfür eine Liste aller Dateien aus.

Verwende hierfür dein aktuelles Package dieser Klasse.

Dokumentation von File
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/File.html
 */

import java.io.File;

public class Stream_3_FileStructure {
    static String relativeFileLink = "./src/Matthias/week13_File";
    public static void main(String[] args) {
        File VerzeichnisInhalt= new File(relativeFileLink);
        File[] list=VerzeichnisInhalt.listFiles();
        System.out.println( list.toString());
        for (File temp:list) {
            System.out.println(temp.getName());
        };
    }

}

















