package Matthias.week4;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */

import java.util.Random;

public class Arrays_4_CrazyRangeArray {

    public static void main( String[] args ) {

        int [] Arrayradomnumbers= new int[100];

        printRandomArrayWithMinMax(Arrayradomnumbers);

    }

    //Methode 1: Befüllt einen Array mit min bis max Randomzahlen
    public static int[] createRandomArray( int[] original, int min, int max ) {
        int[] Array = new int[original.length];
        Random random = new Random();
        for (int i = 0; i <original.length ; i++) {
            Array[i]= random.nextInt(min, max);
        }
        return Array;
    }

    //Methode 2: Druckt den Array mit einer for-each Schleife aus von min bis max Randomzahlen
    public static void printRandomArrayWithMinMax( int[] original) {
        int[] copy= createRandomArray( original, -50,50);;
        for (int number: copy) {
            System.out.print(number + ","+ " ");
        }
    }
}
