package Simonsway.Week13;

/*
Aufgabe: Verzeichnis auflisten
Mit der Hilfe von java.io.File soll der Inhalt eines bestimmten Verzeichnisses ausgegeben werden.
Gib hierfür eine Liste aller Dateien aus.

Verwende hierfür dein aktuelles Package dieser Klasse.

Dokumentation von File
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/File.html
 */

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Stream_3_FileStructure {
    public static void main(String[] args) {

        File folder = new File("./src/Simonsway/Week13/files");

        File[] list = folder.listFiles();

        for (int i = 0; i < list.length; i++) {
            if (list[i].isFile()){
                System.out.println("File... " + list[i].getName());
            } else if (list[i].isDirectory()) {
                System.out.println("Directory... " + list[i].getName());
            }
        }

    }

}
