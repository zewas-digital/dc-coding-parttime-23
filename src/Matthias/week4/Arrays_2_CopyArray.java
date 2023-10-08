package Matthias.week4;

/*
Aufgabe: Kopie
Erstelle eine Funktion, die aus dem Parameter-Array eine Kopie erstellt.

public static int[] makeACopy(int[] original){
}
 */

import java.util.Arrays;

public class Arrays_2_CopyArray {

    public static int[] makeACopy( int[] original ) {
        int[] copy = new int[original.length];
        for (int i = 0; i <original.length ; i++) {
            copy[i]=original[i];
        }
        return copy;
    }

    public static void main( String[] args ) {
        int[] number = new int[5];
        number= new int[]{1, 2, 3, 4, 5};
        System.out.println( Arrays.toString( number) );
        System.out.println( Arrays.toString( makeACopy( number )) );
    }
}