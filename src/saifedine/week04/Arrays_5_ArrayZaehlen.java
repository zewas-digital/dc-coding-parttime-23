package saifedine.week04;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays_5_ArrayZaehlen {

    public static void main(String[] args) {

        int length = 10;

        int[] numbers = new int[length];

        for (int i = 0; i < length; i++) {

            Random zufallsZahl = new Random();
            int value = zufallsZahl.nextInt(1,100);

            numbers[i] = value;
        }

        System.out.println(Arrays.toString(numbers));

        for (int value : numbers) {
            if (value > 30) {
            System.out.print(value + " ");

        }





        }

    }
}
