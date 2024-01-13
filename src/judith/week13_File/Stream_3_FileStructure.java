package judith.week13_File;

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

    static String relativeFileLink = "./src/judith/week13_File";
    public static void main(String[] args) {

        File f = new File(relativeFileLink);
        // Hier wird nur die Datei geöffnet, wenn vorhanden,
        // wenn nicht wird nur Ablage Dateipfand geöffnet aber noch nichts erstellt
        System.out.println(f.getName() +" "+ f.isFile() +" "+ f.isDirectory() +" "+ f.getParent());
        // in der Ausgabe wird der Dateiname abgefragt, geprüft ob es ein File ist (existiert),
        // geprüft ob es ein Verzeichnis ist, und die übergeordneten Ordner aus gegeben.

        File parent = f.getParentFile();
        System.out.println(parent.getName() +" "+ parent.isFile() +" "+ parent.isDirectory() +" "+ parent.getParent());
        //hier wird im Prinzip das gleiche geprüft nur mit dem Übergeordneten Objekt des Verzeichnisses

        File dir = new File("./src/judith/week13_File");
        System.out.println(dir.getName() +" "+ dir.isFile() +" "+ dir.isDirectory() +" "+ dir.getParent());
        //hier wird wie beim geprüft nur hier nicht die File sondern das Verzeichnis
        // Name des Ordners / ist es eine Datei? / ist es ein Ordner? / was ist das übergeordnete Objekt / Ordner...




    }
}
/*
Infos:
.listFiles(); gibt die Inhalte Verzeichnisses des angegebenen Dateipfades aus
 */