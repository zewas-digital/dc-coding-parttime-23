package michael_k.week13;
/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen
Dateien nach Größe absteigend
 */
import java.io.File;
import java.util.ArrayList;

public class Stream_4_FileStructure {
    public static void main(String[] args) {

        ArrayList<File> array = new ArrayList<File> ();
        File Ordner1Pfad = new File ( "./src/michael_k" );

        String [] verzeichnisebene2 = Ordner1Pfad.list ();
        if (verzeichnisebene2 != null) {
            for (String Ordner2 : verzeichnisebene2) {

                File Ordner2Pfad = new File ( Ordner1Pfad + "/" + Ordner2 );

                if (Ordner2Pfad.isFile ( )) {
                    array.add ( Ordner2Pfad );
                } else {
                    String[] verzeichnisebene3 = Ordner2Pfad.list ( );

                    if (verzeichnisebene3 != null) {
                        for (String Ordner3 : verzeichnisebene3) {

                            File Ordner3Pfad = new File ( Ordner2Pfad + "/" + Ordner3 );
                            if (Ordner3Pfad.isFile ()) {
                                array.add ( Ordner3Pfad );
                            }else {
                                String[] verzeichnisebene4 = Ordner3Pfad.list ( );

                                if (verzeichnisebene4 != null){
                                    for (String Ordner4: verzeichnisebene4){
                                        File Ordner4Pfad = new File ( Ordner3Pfad + "/" + Ordner4 );
                                        if (Ordner4Pfad.isFile ()) {
                                            array.add ( Ordner4Pfad );
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        sortAndPrint ( array );
    }
    static void sortAndPrint(ArrayList<File> array) {

        int[] arrayByteGroesse = new int[array.size ( )];
        File[] arrayFileName = new File[array.size ( )];
        int length = arrayByteGroesse.length;

        for (int i = 0; i < array.size ( ); i++) {
            arrayByteGroesse[i] = ( (int) array.get ( i ).length ( ) );
            arrayFileName[i] =  array.get ( i );
        }

        int[] arraySortByteGroesse = new int[length];
        File[] arraySortFileName = new File[length];
        int x1;
        int y1;
        File x2;
        File y2;

        int counter = 0;

        for (int i = 0; i < length; i++) {
            arraySortByteGroesse[i] = arrayByteGroesse[i];
            arraySortFileName[i] = arrayFileName[i];
        }

        while ( counter != length - 1 ) {
            counter = 0;
            for (int i = 0; i < length - 1; i++) {

                if (arraySortByteGroesse[i] < arraySortByteGroesse[i + 1] ) {
                    x1 = arraySortByteGroesse[i];
                    y1 = arraySortByteGroesse[i + 1];

                    arraySortByteGroesse[i] = y1;
                    arraySortByteGroesse[i + 1] = x1;

                    x2 = arraySortFileName[i];
                    y2 = arraySortFileName[i + 1];

                    arraySortFileName[i] = y2;
                    arraySortFileName[i + 1] = x2;
                } else {
                    counter++;
                }
            }
        }
        for (int i = 0; i < arrayByteGroesse.length; i++) {
            System.out.println ( arraySortFileName[i]+"         " +arraySortByteGroesse[i]);
        }
    }
}
