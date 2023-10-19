package saifedine.week04;

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

        int length = 10;

        int[] numbers = new int[length];


        for (int i = 0; i < length; i++) {

            Random zufallszahl = new Random();
            int randomNumber = zufallszahl.nextInt(0,100);
            //System.out.println(randomNumber);

            numbers[i] = randomNumber;
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[1]);
        System.out.println(numbers[4]);
        System.out.println(numbers[9]);

        System.out.println("////////////////////");

        for (int value:numbers) {
            System.out.print(value + " ");
        }


        for (int i = 0; i < length; i= i + 2) {
            System.out.println(numbers[i] + " ");
        }


        int i = 0;
        while (i < length){
            System.out.print(numbers[i] + " ");
            i = i + 2;
        }

    }

}
