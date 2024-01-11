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
    //rand aus der Klasse Random
    public static Random rand = new Random( );
    //scanner aus der Klasse Random
    public static Scanner scanner = new Scanner( System.in );

    //Start Main Programm
    public static void main( String[] args ) {
        System.out.print( "Wie groß soll das Pascal-Dreieck sein? :" );
        int demension = getUserInputForDemension();
        int[][] pascalArray=getcreatedBinomialArray( demension );
        print2dArray( pascalArray );

    }

    //Schritt 1: User Eingabe über die Dimension des Paskalschen Dreiecks
    public static int getUserInputForDemension() {
        Scanner scanner1= new Scanner( System.in );
        int eingabe = scanner1.nextInt( );
        return eingabe;
    }

    //Dyamisch Array erzeugen muss man noch umschreiben mit dem oberen Hinweis
    public static int[][] getcreatedBinomialArray( int demension) {
        int[][] pascalDreieck = new int[demension][demension];
        //Hinweis: https://miro.medium.com/v2/resize:fit:1200/1*e2MXyQCS28jQghVLZumLsA.png
        // 1. m-rows -> 1.spalte mit 1 befüllen -> i changes -> j=0 bei aij Matrix
        for (int i = 0; i < demension; i++) {
            pascalDreieck[i][0] = 1;
        }
        //2. n-colums -> Spalten 1 befüllen aij
        for (int j = 0; j < demension; j++) {
            pascalDreieck[0][j] = 1;
        }
        //Achtung: a11,a21,a31,a21 -> Spalte für Spalte -> Sinn -> kei Problem auf dem darüberlingenden Wert zrückzugreifen und aud den daneben
        for (int i = 1; i < demension; i++) {
            for (int j = 1; j < demension; j++) {
                pascalDreieck[j][i] = pascalDreieck[j][i - 1] + pascalDreieck[j - 1][i];
            }
        }
        return pascalDreieck;
    }
    public static void print2dArray( int[][] array ) {
        for (int[] ints : array) {
            //Druckt die Zeilen des jeweiligen Arrays
            System.out.println( Arrays.toString( ints ) );
        }
    }
}
