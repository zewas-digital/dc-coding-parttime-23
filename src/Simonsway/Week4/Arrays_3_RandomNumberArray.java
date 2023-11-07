package Simonsway.Week4;

/*
Aufgabe: Random Number Array
Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 100.

Random random = new Random();
...
int randomNumber = random.nextInt([Upper bound]);
Gib es mit Hilfe einer foreach-Schleife aus.
Gib es mit Hilfe einer fori-Schleife aus. Das Ziel ist eine identische Ausgabe, wie Arrays.toString()
Gib den zweiten, fünften und zehnten Wert des Arrays aus.
Gib jeden zweiten Wert des int[] mit Hilfe einer Schleife aus.
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays_3_RandomNumberArray {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomValue = rand.nextInt(0, 100);
        int [] numbers = new int[randomValue];

        for (int i = 0; i < randomValue ; i++) {
            numbers [i] = i + 1;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("//////////////////////////////////////////////////////");
        System.out.println(numbers[2]);
        System.out.println(numbers[5]);
        System.out.println(numbers[10]);
        System.out.println("//////////////////////////////////////////////////////");

        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }
    }
}