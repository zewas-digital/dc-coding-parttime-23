package saifedine.week13_File;

/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen
Dateien nach Größe absteigend
 */

import java.io.File;

public class Stream_4_FileStructure {

    static String relativeDirectory = "./src/saifedine";

    public static void main(String[] args) {

    // while oder foreach
        // jede Ebene wird berücksichtigt ohne unterebene
        // Anzahl Ordner für fori array (index)
        // methode --> get children mit namensverzeichnis
        // sortierung an bitegröße

        // Ausgabe Ordner in Form von String array
        // Ausgeben des ersten Orders in eine Varialbe --> in die Methode übergeben und ausführen
        // if & else wegen problem mit file, kann nicht weiter runter absteigen

        getChildren(relativeDirectory,0);

    }

    private static void getChildren(String children,int level) {

        File dir = new File(children);

        boolean isdir = dir.isDirectory();

        //System.out.println(children + " " + dir.getName() + " " + isdir);

        if(isdir){
            String[] content = dir.list();
            level ++;

            for (String output : content) {

                System.out.println(" ".repeat(level) + "Content: " + output);

                getChildren(dir.getPath() + "/" + output,level);
            }
        }
    }
}