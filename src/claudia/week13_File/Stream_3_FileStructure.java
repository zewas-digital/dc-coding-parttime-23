package claudia.week13_File;

/*
Aufgabe: Verzeichnis auflisten
Mit der Hilfe von java.io.File soll der Inhalt eines bestimmten Verzeichnisses ausgegeben werden.
Gib hierfür eine Liste aller Dateien aus.

Verwende hierfür dein aktuelles Package dieser Klasse.

Dokumentation von File
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/File.html
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Stream_3_FileStructure {

    static String relativeFileLink = "./src/claudia/week13_File/test-file.txt";
    public static void main(String[] args) {

        File f = new File(relativeFileLink);
        File p = f.getParentFile();

        /*
        //.txt-Datei anlegen:
        try {
            f.createNewFile();
        } catch (Exception e){
            System.out.println("Etwas ist schiefgegangen!");
        }

         */


        System.out.println("\n" + "* - ".repeat(10) + "*");
        System.out.print("Directory, String: ");
        System.out.println(f.getParent()); //String!
        System.out.print("Directory, File: ");
        System.out.println(p); //File

        System.out.print("Inhalt des Verzeichnisses mit .list: ");
        System.out.println(Arrays.toString(p.list()));
        System.out.print("Inhalt des Verzeichnisses mit .listFiles: ");
        System.out.println(Arrays.toString(p.listFiles()));

        System.out.println("\nParent vom Parent: " + p.getParent());
        System.out.println("Inhalt: " + Arrays.toString(p.getParentFile().list()));

        //printFileInputStream();

    }

    static void printFileInputStream() {
        System.out.println("Inhalt der Datei test-file.txt: ");
        try {
            FileInputStream fis = new FileInputStream(relativeFileLink);
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("| " + line);
            }
            sc.close();
        } catch (SecurityException e) {
            System.out.println("Kein Zugriff auf die Datei.");
        } catch (FileNotFoundException fnf) {
            System.out.println("Datei wurde nicht gefunden.");
        }
    }
}
