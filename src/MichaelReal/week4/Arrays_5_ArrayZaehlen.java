package MichaelReal.week4;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */

import java.util.Random;

public class Arrays_5_ArrayZaehlen {
    public static void main(String[] args) {
        int[] randomArray = new int[20];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100) + 1;
        }

        for (int num : randomArray) {
            System.out.print(num + " ");
        }

        System.out.println();

        int count = countValuesGreaterThen30(randomArray);
        System.out.println("Anzahl der Werte grösser als 30: " + count);
    }

    public static int countValuesGreaterThen30(int[] array) {
        int count = 0;
        for (int value : array) {
            if (value > 30) {
                count++;
            }
        }
        return count;
    }
}