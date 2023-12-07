package Simonsway.Week13;

/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen
Dateien nach Größe absteigend
 */

import java.io.File;
import java.util.Objects;

public class Stream_4_FileStructure {
    public static void main(String[] args) {

        printChilds("./src/Simonsway");

    }

    public static void printChilds (String path){

        File folder = new File(path);

        try {
            File [] children = Objects.requireNonNull(folder.listFiles());

            for (File child : children){
                printChilds(child.getAbsolutePath());

                if (child.isDirectory()){
                    System.out.println("    Directory >>> " + child.getName());
                } else if (child.isFile()) {
                    System.out.println("Files >>> " + child.getName());
                }
            }
        } catch (NullPointerException e){
        }
    }
}