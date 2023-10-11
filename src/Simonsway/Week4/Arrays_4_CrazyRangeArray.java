package Simonsway.Week4;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */

import java.util.Arrays;
import java.util.Random;
public class Arrays_4_CrazyRangeArray {
    public static void main(String[] args) {

        int arrayLength = 20;
        Random rand = new Random();
        int [] randomArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int randomValue = rand.nextInt(101) - 50;
            randomArray[i] = randomValue;
        }

        for (int value : randomArray){
            System.out.println(value + " ");
        }
    }
}

