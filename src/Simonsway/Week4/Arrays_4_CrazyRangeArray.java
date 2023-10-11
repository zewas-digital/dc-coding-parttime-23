package Simonsway.Week4;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */

import java.util.Arrays;
import java.util.Random;
public class Arrays_4_CrazyRangeArray {
    public static void main(String[] args) {

        int arrayLength = 10;
        Random rand = new Random();
        int [] randomArray = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int randomValue = rand.nextInt(-50, 50);
            randomArray[i] = randomValue;
            /*
            In dieser Zeile wird der Wert randomValue in das Array randomArray an der Stelle i gespeichert.
            Das bedeutet, dass die aktuelle Zufallszahl, die zuvor in der Variable randomValue generiert wurde, in das Array randomArray an der Position i eingefügt wird.
            Dies wird in einer Schleife wiederholt, um das gesamte Array mit Zufallszahlen zu füllen.
            */
        }

        for (int value : randomArray){
            System.out.print(value + " ");
        }
    }
}

