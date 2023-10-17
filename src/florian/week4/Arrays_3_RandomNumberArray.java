package florian.week4;

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
        Random random = new Random();
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.println(array[1] + " " + array[4] + " " + array[9]);

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100) + 2 + i++;
            System.out.print(array[i] + " ");
        }

    }
}
