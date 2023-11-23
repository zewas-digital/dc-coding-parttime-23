package volkan.Arrays;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Random;

public class Array_6_Summe {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }

        int sum = calculateSum(numbers);

        System.out.println("Die Summe der Zahlen ist " + sum);
    }

    public static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }
}
