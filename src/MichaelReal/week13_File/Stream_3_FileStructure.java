package MichaelReal.week13_File;

/*
Aufgabe: Verzeichnis auflisten
Mit der Hilfe von java.io.File soll der Inhalt eines bestimmten Verzeichnisses ausgegeben werden.
Gib hierfür eine Liste aller Dateien aus.

Verwende hierfür dein aktuelles Package dieser Klasse.

Dokumentation von File
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/File.html
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Stream_3_FileStructure {
        public static void main(String[] args) {
            // Passe den Pfad zum gewünschten Verzeichnis an
            String verzeichnisPfad = "./src/MichaelReal";

            printChilds(verzeichnisPfad);
        }

        public static void printChilds(String verzeichnisPfad) {
            // Erstelle ein File-Objekt mit dem Verzeichnispfad
            File verzeichnis = new File(verzeichnisPfad);

            // Überprüfe, ob das Verzeichnis existiert
            if (verzeichnis.exists() && verzeichnis.isDirectory()) {
                // Erhalte eine Liste der Dateien im Verzeichnis
                File[] unterverzeichnisse = verzeichnis.listFiles();

                // Überprüfe, ob Dateien vorhanden sind
                if (unterverzeichnisse != null) {
                    // Iteriere durch die Unterverzeichnisse
                    for (File unterverzeichnis : unterverzeichnisse) {
                        if (unterverzeichnis.isDirectory()) {
                            // Hier wird nur der letzte Teil des Verzeichnisses ausgegeben
                            String verzeichnisName = unterverzeichnis.getName();

                            // Ausgabe des Verzeichnisses und seiner Größe
                            System.out.println("Verzeichnis: " + verzeichnisName);
                            System.out.println("Größe: " + getDirectorySize(unterverzeichnis) + " Bytes\n");
                        }
                    }
                } else {
                    System.out.println("Das Verzeichnis ist leer.");
                }
            } else {
                System.out.println("Das Verzeichnis existiert nicht oder ist kein Verzeichnis.");
            }
        }

        public static long getDirectorySize(File directory) {
            long size = 0;

            if (directory.isDirectory()) {
                File[] files = directory.listFiles();
                if (files != null) {
                    for (File file : files) {
                        size += getDirectorySize(file);
                    }
                }
            } else {
                size = directory.length();
            }

            return size;
        }
    }







   /* public static void main(String[] args) {

        String direcrtoryPath = "./src/MichaelReal/week13_File";

        File directory = new File(direcrtoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            if (files != null) {
                // Erstelle einen Zeitstempel für die Ausgabedatei
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String timeStamp = dateFormat.format(new Date());

                // Definiere den Namen der Ausgabedatei mit Zeitstempel
                String ausgabedateiName = "./src/MichaelReal/week13_File/verzeichnis_inhalt_.txt";

                try {
                    // Erstelle FileWriter für die Ausgabedatei
                    FileWriter writer = new FileWriter(ausgabedateiName, true);
                    PrintWriter printWriter = new PrintWriter(writer);

                    // Iteriere durch die Dateien und schreibe ihre Namen in die Ausgabedatei
                    for (File datei : files) {
                        String verzeichnisName = datei.getParentFile().getCanonicalPath();
                        String format = String.format("%s  \n %s", timeStamp, verzeichnisName);
                        printWriter.println(format + " 🤓");
                        printWriter.println("🤓" + datei.getName() + " 🤓");
                    }

                    // Schließe den FileWriter
                    writer.close();

                    System.out.println("Dateien erfolgreich in 😎 " + ausgabedateiName + " 😎 geschrieben.");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Fehler beim Schreiben der Ausgabedatei.");
                }
            } else {
                System.out.println("Das Verzeichnis ist leer. 🍀");
            }
        } else {
            System.out.println("Das Verzeichnis existiert nicht. 🦄");
        }
    }
} */
