package volkan.week04;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */

import java.util.Random;

public class Arrays_4_CrazyRangeArray {
    public static void main(String[] args) {
        int[] array = new int[10];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(-50, 50);
        }

        for (int number : array) {
            System.out.print(number + "  ");
        }

    }
}
