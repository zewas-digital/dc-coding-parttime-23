package Matthias.week7_arrays;

/*
Aufgabe: Pascal Dreieck
Frage den Anwender nach der gewünschten Größe und erstelle ein Pascal-Dreieck mit der entsprechenden Dimension.

Regel: Jede Zahl in der Matrix ist gleich die Summe der Nachbarzahlen nach Links und nach Oben.
Beispiel-Bild in Slack
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_12_PascalDreieck {
//Methoden Aufruf:
    //TODO Feritg Programmieren
    //rand aus der Klasse Random
    public static Random rand = new Random( );
    //scanner aus der Klasse Random
    public static Scanner scanner = new Scanner( System.in );

    //Start Main Programm
    public static void main( String[] args ) {

        //Deklaration der Variabeln
        System.out.println( "Eingabe von j für das Befüllen des zwei dimensionalen Arrays:" );
        int i = scanner.nextInt( );
        System.out.println( "Eingabe von i für das Befüllen des zwei dimensionalen Arrays:" );
        int j = scanner.nextInt( );
        System.out.println( "Eingabe von k für das Befüllen des zwei dimensionalen Arrays:" );
        int k = scanner.nextInt( );
        System.out.println( "Eingabe von n für das Befüllen des zwei dimensionalen Arrays:" );
        int n = scanner.nextInt( );

        int[][] array = createBinomialArray( i, j,n,k );
        print2dArray( array );
        System.out.println( binomialCoefficient( 5, 2 ) ); // 10
        System.out.println( binomialCoefficient( 10, 5 ) ); // 252

    }

    // Google Bard als Unterstüztung ansonsten zu kompliziert, gedacht
    public static int binomialCoefficient( int n, int k ) {

        if ( k > n ) {
            System.out.println( "k muss kleiner oder gleich n sein." );
        }
        if ( k == 0 || k == n ) {
            return 1;
        } else {
            return binomialCoefficient( n - 1, k - 1 ) + binomialCoefficient( n - 1, k );
        }
    }

    //Dyamisch Array erzeugen muss man noch umschreiben mit dem oberen Hinweis
    public static int[][] createBinomialArray( int xLength, int yLength ,int n, int k) {
        int[][] newArray = new int[xLength][yLength];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = binomialCoefficient( n, k );
            }
        }
        return newArray;
    }

    public static void print2dArray( int[][] array ) {
        for (int i = 0; i < array.length; i++) {
            System.out.println( Arrays.toString( array[i] ) );
        }
    }
}
