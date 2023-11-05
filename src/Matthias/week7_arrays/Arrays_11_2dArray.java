package Matthias.week7_arrays;

/*
Aufgabe: 2D-Array

Erstelle ein Zwei-Dimension-Array int[][] und befülle es mit Zufallszahlen von 0 bis 100.
Frage dazu die Längen der Dimensionen vom Anwender ab.
Gib die Summe pro Zeile oder pro Spalte aus.
 */

import Matthias.week8_arrays.ArrayMethods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_11_2dArray {

    //Klassen Deklaration
    public static Random rand = new Random( );
    public static Scanner scanner = new Scanner( System.in );
    public static ArrayMethods arrayMethods=new ArrayMethods();

    // Start Main
    public static void main( String[] args ) {
       //Deklaration der Variabeln
        System.out.println( "Eingabe von i für das Befüllen des zwei dimensionalen Arrays:" );
        int i = scanner.nextInt( );
        System.out.println( "Eingabe von j für das Befüllen des zwei dimensionalen Arrays:" );
        int j= scanner.nextInt();
        int [][]array=createRandomArray( i,j );
        print2dArray(array);

    }
    //Dyamisch Array erzeugen
    public static int[][] createRandomArray(int xLength, int yLength) {
        int[][] newArray= new int[xLength][yLength];
        for (int i=0; i < newArray.length; i++) {
            for (int j = 0;j < newArray[i].length; j++) {
                 newArray[i][j] = rand.nextInt( 100 );
            }
        }
        return newArray;
    }
    public static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}