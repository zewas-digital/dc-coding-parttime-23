package florian.week_13_File;

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
    static String relativeFileLink = "src/florian/week13_File";

    public static void main(String[] args) {

        // prüft ob file eine Datei (.isfile()) ist und zeigt welche Überordner (.getParents()) es gibt.
        File file = new File(relativeFileLink);
        System.out.println(file.getName() + " " + file.isFile() + " " + file.getParent());

        // prüft ob file ein Verzeichnis (.isDirectory()) ist und zeigt an welche Überordner (.getParents()) es gibt
        System.out.println(file.getName() + " " + file.isDirectory() + " " + file.getParent());

        // Prüft ob directory eine Datei (.isfile())oder ein Verzeichnis ist und gibt die Überordner des angegeben Pfades an
        File directory = new File("src/florian/week13_File");
        System.out.println(directory.getName() +" "+ directory.isFile() +" "+ directory.isDirectory() +" "+ directory.getParent());

    }
}
