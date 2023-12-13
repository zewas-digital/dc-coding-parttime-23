package eslem.week13;

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
    static String relativeFileLink = ("/.src/eslem/week13");
    public static void main(String[] args) {

        File f = new File(relativeFileLink);
        System.out.println(f.getName() +" "+ f.isFile() +" "+ f.isDirectory() +" "+ f.getParent());

        File parent = f.getParentFile();
        System.out.println(parent.getName() +" "+ parent.isFile() +" "+ parent.isDirectory() +" "+ parent.getParent());

        File dir = new File("./src/eslem/week13");
        System.out.println(dir.getName() +" "+ dir.isFile() +" "+ dir.isDirectory() +" "+ dir.getParent());

    }
    }

