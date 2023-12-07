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
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


public class Stream_3_FileStructure {

    public static void main(String[] args) {
        // Pfad zum gewünschten Verzeichnis
        String verzeichnisPfad = "./src/MichaelReal";

        // Erstelle ein File-Objekt für das Verzeichnis
        File verzeichnis = new File(verzeichnisPfad);

        // Überprüfe, ob es sich um ein Verzeichnis handelt
        if (verzeichnis.isDirectory()) {
            zeigeDateienImVerzeichnis(verzeichnis);
        } else {
            System.out.println(verzeichnisPfad + " ist kein Verzeichnis.");
        }
    }

    private static void zeigeDateienImVerzeichnis(File verzeichnis) {
        // Erhalte eine Liste der Dateien im aktuellen Verzeichnis
        File[] dateien = verzeichnis.listFiles();

        // Überprüfe, ob die Liste nicht leer ist
        if (dateien != null && dateien.length > 0) {
            // Filtere nur Dateien (keine Verzeichnisse)
            File[] nurDateien = Arrays.stream(dateien)
                    .filter(File::isFile)
                    .toArray(File[]::new);

            // Sortiere die Dateien nach ihrer Größe
            Arrays.sort(nurDateien, Comparator.comparingLong(File::length));

            // Gib die sortierte Liste der Dateien im Verzeichnis aus
            System.out.println("\nListe der Dateien im Verzeichnis " + "💕 " + verzeichnis.getName() + " 💕" + ", sortiert nach Größe:");

            for (File datei : nurDateien) {
                System.out.println("🍀 " + datei.getName() + " - Größe: " + datei.length() + " Bytes 🍀");
            }

            // Rufe die Methode rekursiv für jedes Unterverzeichnis auf
            for (File unterverzeichnis : dateien) {
                if (unterverzeichnis.isDirectory()) {
                    zeigeDateienImVerzeichnis(unterverzeichnis);
                }
            }
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

      /*  private static void zeigeDateienImVerzeichnis(File verzeichnis) {
            // Erhalte eine Liste der Dateien und Verzeichnisse im aktuellen Verzeichnis
            File[] dateien = verzeichnis.listFiles();

            // Überprüfe, ob die Liste nicht leer ist
            if (dateien != null && dateien.length > 0) {
                // Sortiere die Dateien nach ihrer Größe
                Arrays.sort(dateien, Comparator.comparingLong(File::length));

                // Gib die sortierte Liste der Dateien im Verzeichnis aus
                System.out.println("Liste der Dateien im Verzeichnis " + verzeichnis.getAbsolutePath() + ", sortiert nach Größe:");

                for (File datei : dateien) {
                    System.out.println("🍀 " + datei.getName() + " - Größe: " + datei.length() + " Bytes" + " 🍀");

                    // Überprüfe, ob es sich um ein Unterverzeichnis handelt, und rufe die Methode rekursiv auf
                    if (datei.isDirectory()) {
                        zeigeDateienImVerzeichnis(datei);
                    }
                }
            }
        }
    }*/
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


      /*  public static void main(String[] args) {
            // Pfad zum gewünschten Verzeichnis
            String verzeichnisPfad = "./src/MichaelReal";

            // Erstelle ein File-Objekt für das Verzeichnis
            File verzeichnis = new File(verzeichnisPfad);

            // Überprüfe, ob es sich um ein Verzeichnis handelt
            if (verzeichnis.isDirectory()) {
                // Erhalte eine Liste aller Dateien im Verzeichnis und seinen Unterverzeichnissen
                File[] dateien = getAllFiles(verzeichnis);

                // Sortiere die Dateien nach ihrer Größe
                Arrays.sort(dateien, Comparator.comparingLong(File::length));

                // Gib die sortierte Liste der Dateien aus
                System.out.println("Liste der Dateien im Verzeichnis " + verzeichnisPfad + ", sortiert nach Größe:");

                for (File datei : dateien) {
                    System.out.println(datei.getPath() + " - Größe: " + datei.length() + " Bytes");
                }
            } else {
                System.out.println(verzeichnisPfad + " ist kein Verzeichnis.");
            }
        }

        private static File[] getAllFiles(File verzeichnis) {
            // Liste aller Dateien im aktuellen Verzeichnis
            File[] dateien = verzeichnis.listFiles();

            // Liste für alle Dateien, einschließlich Unterverzeichnisse
            File[] alleDateien = new File[0];

            if (dateien != null) {
                for (File datei : dateien) {
                    // Füge die aktuelle Datei zur Liste hinzu
                    alleDateien = Arrays.copyOf(alleDateien, alleDateien.length + 1);
                    alleDateien[alleDateien.length - 1] = datei;

                    // Falls die aktuelle Datei ein Verzeichnis ist, rekursiv alle Dateien darin hinzufügen
                    if (datei.isDirectory()) {
                        alleDateien = concat(alleDateien, getAllFiles(datei));
                    }
                }
            }

            return alleDateien;
        }

        private static File[] concat(File[] a, File[] b) {
            int aLen = a.length;
            int bLen = b.length;
            File[] result = Arrays.copyOf(a, aLen + bLen);
            System.arraycopy(b, 0, result, aLen, bLen);
            return result;
        }
    }*/








  /*  public static void main(String[] args) {
            // Passe den Pfad zum gewünschten Verzeichnis an
            String verzeichnisPfad = "./src/MichaelReal";

            printChilds(verzeichnisPfad);
        }

        public static void printChilds(String verzeichnisPfad) {
            // Erstelle ein File-Objekt mit dem Verzeichnispfad
            File verzeichnis = new File(verzeichnisPfad);

            // Überprüfe, ob das Verzeichnis existiert
            if (verzeichnis.exists() && verzeichnis.isDirectory()) {
                printChildsRecursive(verzeichnis, 0);
            } else {
                System.out.println("Das Verzeichnis existiert nicht oder ist kein Verzeichnis.");
            }
        }

        private static void printChildsRecursive(File verzeichnis, int depth) {
            // Erhalte eine Liste der Dateien im Verzeichnis
            File[] unterverzeichnisse = verzeichnis.listFiles();

            // Überprüfe, ob Dateien vorhanden sind
            if (unterverzeichnisse != null) {
                //Sortiere die Unterverzeichnisse nach Namen (anpassbar)
                Arrays.sort(unterverzeichnisse, Comparator.comparingLong(file -> getDirectorySize((File) file)).reversed());


                // Iteriere durch die Unterverzeichnisse
                for (File unterverzeichnis : unterverzeichnisse) {
                    if (unterverzeichnis.isDirectory()) {
                        // Hier wird nur der letzte Teil des Verzeichnisses ausgegeben
                        String verzeichnisName = unterverzeichnis.getName();

                        // Einrückung für die Darstellung der Hierarchie
                        for (int i = 0; i < depth; i++) {
                            System.out.print("  ");
                        }

                        // Ausgabe des Verzeichnisses und seiner Größe
                        System.out.println("Verzeichnis: " + verzeichnisName);
                        System.out.println("Größe: " + getDirectorySize(unterverzeichnis) + " Bytes\n");

                        // Rekursiver Aufruf für die Unterverzeichnisse
                        printChildsRecursive(unterverzeichnis, depth + 1);
                    }
                }
            } else {
                System.out.println("Das Verzeichnis ist leer.");
            }
        }

        private static long getDirectorySize(File directory) {
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
    }*/









    /*    public static void main(String[] args) {
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
    }*/







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
