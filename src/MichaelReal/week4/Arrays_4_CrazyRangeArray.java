package MichaelReal.week4;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */

import java.util.Random;

public class Arrays_4_CrazyRangeArray {
    public static void main(String[] args) {
        int[] crazyArray = new int[20];
        Random random = new Random();

        for (int i = 0; i < crazyArray.length; i++) {
            crazyArray[i] = random.nextInt(101) - 50;
        }


        for (int nummer : crazyArray); {
            System.out.print(crazyArray + " ");
        }
    }
}
