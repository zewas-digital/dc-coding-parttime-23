package Simonsway.Week5;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Arrays;
import java.util.Random;

public class Array_6_Summe {
    public static void main(String[] args) {

        int arrayLength = 10;

        Random random = new Random();
        int [] randomArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int randomValue = random.nextInt(1, 100);
            randomArray[i] = randomValue;
        }
        System.out.println("Array mit Zufallszahlen von 1 - 100");
        System.out.println(Arrays.toString(randomArray));
        System.out.println();


        int sum = 0;

        for (int i : randomArray){
            sum = sum + i;

        }
        System.out.println("Summe aller Werte " + sum);
        
    }
}

