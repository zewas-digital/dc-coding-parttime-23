package Matthias.week5;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Arrays;
import java.util.Random;
// Methode 1

public class Array_6_Summe {

    public static void main( String[] args ) {

        int arraysize = 100;
        int[] Arrayradomnumbers = new int[arraysize];
      System.out.println( Arrays.toString( Arrayradomnumbers=befuellen( Arrayradomnumbers, 1, 100 )));

    }
    //Methode 1: Befüllen Sinn: macht eine Kopie vom Array und befüllt diesen und gibt die Werte Zurück
    public static int[] befuellen( int[] original, int min, int max ) {
        int[] copy = new int[original.length];
        Random random = new Random( );
        int countervolume=0;
        for (int i = 0; i < original.length; i++) {
            copy[i] = random.nextInt( min, max );
            countervolume=i;
        }
        System.out.println( "Array Werte: " countervolume ); // Ausgabe von 1-100 enspricht 99 Werten, die Zufallszahlen gehen von 1-100 und werden durch Random erzeugt.
        return copy;
    }
}