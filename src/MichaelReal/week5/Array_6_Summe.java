package MichaelReal.week5;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Random;

public class Array_6_Summe {
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

        int sum = calculateSum(randomArray);
        System.out.println("Die Summe der Werte im Array: " + sum);

    }

    public  static  int calculateSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
