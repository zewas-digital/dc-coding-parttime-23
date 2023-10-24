package Matthias.week4;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays_5_ArrayZaehlen {
    //Methode 1
    public static int[] makeACopy0( int[] original, int min, int max ) {
        int[] copy = new int[original.length];
        Random random = new Random( );
        for (int i = 0; i < original.length; i++) {
            copy[i] = random.nextInt( min, max );
        }

        return copy;
    }
    //Methode 2
    public static void countoverthirty(int[] original) {
      int counter = 0;
        for (int number: original) {
            if ( number > 30 ) {
                counter++;
            }
        }
        System.out.println( " Anzahl > 30 =" + counter );
    }


    public static void main( String[] args ) {
        int arraysize= 100;
        int [] Arrayradomnumbers= new int[arraysize];
        System.out.println( Arrays.toString(Arrayradomnumbers=makeACopy0(Arrayradomnumbers, 1,100)));
        countoverthirty( Arrayradomnumbers);
    }
}
