package oliver.week04;

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

        int lengh = 10;

        int[] numbers = new int[lengh];

        for (int i = 0; i < lengh; i++) {

            Random randomNumber = new Random();
            int value = randomNumber.nextInt(0,100);

            numbers[i] = value;

        }

        System.out.println(Arrays.toString(numbers));

        for (int value : numbers) {
            System.out.print(value + ", ");
        }


        System.out.println();
        System.out.println(numbers[1]);
        System.out.println(numbers[4]);
        System.out.println(numbers[9]);

        System.out.println("////////////////////");
        for (int i = 0; i < lengh; i = i + 2) {
            System.out.println(numbers[i]);

        }
    }

}
