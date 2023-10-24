package saifedine.week05_arrays;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Arrays;
import java.util.Random;

public class Array_6_Summe {

    public static void main(String[] args) {

        int arrayLength = 10;

        int [] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            Random ZufallsZahl = new Random();
            int randomValue = ZufallsZahl.nextInt(1,100);

            numbers[i] = randomValue;

        }

        System.out.println(Arrays.toString(numbers));

        int sum = 0;

        for (int i : numbers) {
            sum = sum + i;
        }
        System.out.println("Summe aller Werte: " + sum);
    }
}
