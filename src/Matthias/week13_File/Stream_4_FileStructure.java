package Matthias.week13_File;

/*
Verzeichnis auflisten in Reihenfolge
Liste die Dateien in deinem Namensverzeichnis sortiert auf.

Alle Unterverzeichnisse und Dateien in allen Verzeichnissen
Dateien nach Größe absteigend
 */

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

public class Stream_4_FileStructure {
    static String relativeFileLink = "./src/Matthias";

    public static void main( String[] args ) {

        printChildren( relativeFileLink,0 );

    }
    static void printChildren( String path, int level){
        File Verzeichnis = new File(path); // ->// erzeugen eines neuen File Objektes
        File[] files = Verzeichnis.listFiles();
        String[] childs= new String[files.length];
        String[] classes = new String[files.length];

        //Children holen

        for (int i = 0; i < files.length; i++) {
            if ( files[i].isDirectory()!=false ) {
                childs[i]=files[i].getName();
                if ( level == 0 ) {
                    System.out.println("Verzeichnis: "+files[i].getName());
                }else {
                    System.out.println("\t".repeat( level )+"Unterverzeichnis: "+files[i].getName());
                }

                printChildren( files[i].getAbsolutePath(),level+1);
            }else{
                classes[i]=files[i].getName();
            }
        }
        for (String temp: classes) {
            if ( temp != null ) {
                System.out.println("\t".repeat( level )+"File: "+temp);
            }
        }
    }
    static String[] sortChildren(File[] children, String[] arr1){
        int[] child= new int[children.length];
        for (int i = 0; i <children.length ; i++) {
                child[i]= child.length;
        }
        bubbleSort1( child,arr1);

        return arr1;
    }

    public static void bubbleSort1( int[] arr, String[] arr1 ) {
        // 1. Bubblephase Prüfen der Arrays 9,4 - 4,9
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr1, arr, j, j + 1);
                }
            }
        }
    }

    static void swap(String arr1[], int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        String temp1 = arr1[i];
        arr1[i] = arr1[j];
        arr1[j] = temp1;
    }
}