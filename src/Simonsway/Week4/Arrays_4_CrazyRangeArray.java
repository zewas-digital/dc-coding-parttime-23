package Simonsway.Week4;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */

import java.util.Arrays;
import java.util.Random;
public class Arrays_4_CrazyRangeArray {
    public static void main(String[] args) {

        int randomResult = randomCounter();

        int [] numbers = new int[randomResult];

    }
    static int randomCounter() {
        Random rand = new Random();
        int anzahlZahlen = 50;
        int randomValue = 0;

        for (int i = 0; i < anzahlZahlen; i++) {
            randomValue = rand.nextInt(100) - 50;
        }
        return randomValue;
    }
}

