package judith.week13_File;

/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen
Dateien nach Größe absteigend
 */

import java.io.File;
import java.util.Arrays;

public class Stream_4_FileStructure {
    static String relativeFileLink = "C://Users//DCV//Github//dc-coding-parttime-23//src//judith";
    public static void main(String[] args) {

        File f = new File("C://Users//DCV//Github//dc-coding-parttime-23//src//judith");
        System.out.println(f.getName() +" "+ f.isFile() +" "+ f.isDirectory() +" "+ f.getParent());
        File[] failArray = f.listFiles();
        System.out.println(Arrays.toString(failArray));






    }

}