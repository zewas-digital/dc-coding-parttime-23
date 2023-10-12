package florian.week4;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */


import java.util.Random;

public class Arrays_4_CrazyRangeArray {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-50, 50);
        }

        for (int value : array) {
            System.out.println(value);
        }

    }
}
