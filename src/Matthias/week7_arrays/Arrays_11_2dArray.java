package Matthias.week7_arrays;

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

    //Klassen Deklaration
    public static Random rand = new Random( );
    public static Scanner scanner = new Scanner( System.in );

    // Start Main
    public static void main( String[] args ) {
       //Deklaration der Variabeln


        System.out.println( "Eingabe von i für das Befüllen des zwei dimensionalen Arrays:" );
        int i = scanner.nextInt( );
        System.out.println( "Eingabe von j für das Befüllen des zwei dimensionalen Arrays:" );
        int j= scanner.nextInt();
        int [][] array= createRandomArray( i,j );
        System.out.println( Arrays.toString( array ));

    }
    //While schleife mit 1 handling Dimensionen 1 2 und 3 implementieren!
    public static int[][] createRandomArray(int i, int j) {
        int[][] result = new int[i][j];
        for (int a = 0; a < result.length; i++) {
            for (int b = 0; ; j++) {
                result[i][j] = rand.nextInt( 101 );
            }
        }

        return result;
    }
}