package saifedine.week13_File;

/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen
Dateien nach Größe absteigend
 */

import java.io.File;
import java.util.Arrays;

public class Stream_4_FileStructure {

    static String relativeDirectory = "./src/saifedine";

    public static void main(String[] args) {

    // while oder foreach
        // jede Ebene wird berücksichtigt ohne unterebene
        // Anzahl Ordner für fori array (index)
        // methode --> get children mit namensverzeichnis
        // sortierung an bitegröße


        /*
        String

        getChildren();



        /*
            String[] directoryResult = new String[]{Arrays.toString(dir.listFiles())};
            //System.out.println(Arrays.toString(directoryResult));
            System.out.println("Anzahl der Ordner: " + directoryResult.length);

         */


    }

    private static void getChildren(String children, int level) {

        children = " ";
        level = 0;

        File dir = new File("./src/saifedine/" + children + "\"");

        System.out.println("Ausgabe files: " + Arrays.toString(dir.listFiles())); // String array
        //System.out.println(dir.getName());

        //return children;
    }

                /*
            String[] folder = new String[]{Arrays.toString(dir.listFiles())};
            File subfolder = new File(folder);
            */
            //Arrays.sort(entries);

}