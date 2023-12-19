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
import java.util.Arrays;

public class Stream_3_FileStructure {

    static String relativeDirectory = "./src/saifedine/week13_File/findFile";

    public static void main(String[] args) {

        File f = new File(relativeDirectory);
        System.out.println(f.getName() +" "+ f.isFile() +" "+ f.isDirectory() +" "+ f.getParent());

        File parent = f.getParentFile();
        System.out.println(parent.getName() +" "+ parent.isFile() +" "+ parent.isDirectory() +" "+ parent.getParent());

        File dir = new File("./src/saifedine/week13_File");
        System.out.println(dir.getName() +" "+ dir.isFile() +" "+ dir.isDirectory() +" "+ dir.getParent());

        System.out.println("Version1: " + Arrays.toString(dir.listFiles()));

        for (String directories: dir.list()) {
            System.out.println("Version2: " + directories);
        }
    }
}
