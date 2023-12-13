package eslem.week13;

/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen
Dateien nach Größe absteigend
 */
import java.io.File;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Objects;

public class Stream_4_FileStructure {
    public static void main(String[] args) {
        printChilds("./src/eslem", 0);
    }

    static void printChilds(String path, int level) {
        File f = new File(path);
        String fileSymbol = f.isDirectory() ? "---" : Character.toString(8970);

        if (f.getName().charAt(0) != '.') {
            // Ausgabe Name
            System.out.println(
                    " ".repeat(level) +
                            fileSymbol +
                            " " +
                            f.getName() + " " + f.length());

            try {
                // Dateien und Unterverzeichnisse lesen
                File[] children = Objects.requireNonNull(f.listFiles());
                //children = sortChildren(children);

                for (File child : children) {
                    printChilds(child.getAbsolutePath(), level + 1);
                }
            } catch (NullPointerException e) {
                // end
            }
        }
    }

    static File[] sortChildren(File[] children) {
        File[] sortedChildren = new File[children.length];
        File[] sortedFiles = new File[0];
        int index = 0;

        // ABC-Sortierung für Verzeichnisse
        Arrays.sort(children);

        for (File child : children) {
            if (child.isDirectory()) {
                // Verzeichnisse direkt einfügen
                sortedChildren[index] = child;
                index++;
            } else {
                if (child.getName().charAt(0) == '.')
                    continue;

                // Dateien nach Größe sortieren
                int fileSize = (int) child.length();

                if (sortedFiles.length + 1 < fileSize) {
                    sortedFiles = Arrays.copyOf(sortedFiles, fileSize + 1);
                }
                while (sortedFiles[fileSize] != null) {
                    fileSize++;
                }
                sortedFiles[fileSize] = child;
            }
        }

        // alternative Dateisortierung: long[] mit Dateigrößen und Arrays.sort
        // alternative Dateisortierung: BubbleSort nach Dateigrößen

        // Dateien aufsteigend einfügen
        for (File child : sortedFiles) {
            if (child != null) {
                sortedChildren[index] = child;
                index++;
            }
        }
        // Absteigend mit for-Schleife

        return sortedChildren;
    }
}