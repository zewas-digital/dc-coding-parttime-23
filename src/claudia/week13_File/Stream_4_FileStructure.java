package claudia.week13_File;

/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen
Dateien nach Größe absteigend
 */

import java.io.File;
import java.util.Objects;

public class Stream_4_FileStructure {
    static String relativeFileLink = "./src/claudia";

    public static void main(String[] args) {
        File f = new File(relativeFileLink);
        System.out.println("\nInhalt des Verzeichnisses: \n" + f.getName());

        File [] content = f.listFiles();
        printContent(content, 1);



    }

    public static void printContent(File[] content, int counter){
        for (File elem : content){
            if (!elem.isDirectory()) System.out.println("\t".repeat(counter) + elem.getName());
            else {
                System.out.println("\t".repeat(counter) + elem.getName());
                File [] vector = elem.listFiles();
                bubbleSortDescending(vector);
                printContent(vector, counter + 1);
            }
        }
    }


    public static void bubbleSortDescending(File[] vector) {
        for (int j = 0; j < vector.length - 1; j++) {
            for (int i = 0; i < vector.length - j - 1; i++) {
                if (vector[i].length() < vector[i + 1].length()) {
                    swapElements(vector, i, i + 1);
                }
            }
        }
    }
    public static void swapElements(File[] vector, int i, int j) {
        if (i != j) {
            File temp = vector[i];
            vector[i] = vector[j];
            vector[j] = temp;
        }
    }

}