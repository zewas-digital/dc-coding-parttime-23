package Alpi.Arrays;

/*
Aufgabe: 2D-Array

Erstelle ein Zwei-Dimension-Array int[][] und befülle es mit Zufallszahlen von 0 bis 100.
Frage dazu die Längen der Dimensionen vom Anwender ab.
Gib die Summe pro Zeile oder pro Spalte aus.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_11_2dArray {

    public static void main(String[] args) {

        // Abfrage wie groß das Array sein soll
        Scanner inputKonsole = new Scanner ( System.in );
        System.out.print ("Wie viele Zeilen soll das Array haben? :" );
        int zeilen =inputKonsole.nextInt ();
        System.out.print ("Wie viele spalten soll das Array haben? :" );
        int spalten =inputKonsole.nextInt ();

        // erstellen eines Arrays nach Benutzereingabe und zufallsbefüllung
        int[][] array2D = new int [zeilen][spalten];
        fill2DArray ( array2D );

        // ausgeben der Summe jeder einzelnen Zeile
        for (int i = 0; i < zeilen; i++) {
            System.out.println ( "Zeile " +(i+1)+ ": "+ sumRow ( array2D, i ) );
        }

        // ausgeben der Summe jeder einzelnen Spalte
        for (int i = 0; i < spalten; i++) {
            System.out.println ( "Spalte " +(i+1)+ ": "+sumColumn ( array2D, i ) );
        }

        // ausgeben der Arrayzeilen
        for (int i = 0; i <zeilen; i++) {
            System.out.println ( Arrays.toString ( array2D[i]) );
        }

    }

    static void fill2DArray (int[][] array2D){

        Random randomNumber = new Random ();
        int zeilen = array2D.length;
        int spalten = array2D[0].length;

        for (int i = 0; i <zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                array2D[i][j] = randomNumber.nextInt ( 11);
            }
        }
    }

    static int sumRow(int[][] array2D, int zeile) {
        int sumRow = 0;
        int spalten = array2D[0].length;
        for (int i = 0; i < spalten; i++) {
            sumRow = sumRow + array2D[zeile][i];
        }

        return sumRow;
    }
    static int sumColumn(int[][] array2D, int spalte) {
        int sumColumn = 0;
        int spalten = array2D.length;
        for (int i = 0; i < spalten; i++) {
            sumColumn = sumColumn + array2D[i][spalte];
        }

        return sumColumn;
    }
}
