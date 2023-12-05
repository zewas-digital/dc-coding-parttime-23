package saifedine.week13_File;

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

    static String relativeDirectory = "./src/saifedine/week13_File/findFile";

    public static void main(String[] args) {

        File f = new File("./src/saifedine/week13_File/findFile");
        System.out.println(f);


    }
}
