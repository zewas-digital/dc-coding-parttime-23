package Matthias.week4;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays_4_CrazyRangeArray {
    //Methode 1
    public static int[] makeACopy0( int[] original,int min, int max ) {
        int[] copy = new int[original.length];
        Random random = new Random();
        for (int i = 0; i <original.length ; i++) {
            copy[i]= random.nextInt(min, max);
        }
        return copy;
    }
    //Methode 2
    public static void makeACopy1( int[] original) {
        int[] copy=makeACopy0( original, -50,50);;
        for (int number: copy) {
            System.out.print(number + ","+ " ");
        }
    }

    public static void main( String[] args ) {

        int [] Arrayradomnumbers= new int[100];

        makeACopy1(Arrayradomnumbers);

    }
}
