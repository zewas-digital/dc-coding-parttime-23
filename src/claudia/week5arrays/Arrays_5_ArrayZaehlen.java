package claudia.week5arrays;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Arrays_5_ArrayZaehlen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int counter = 0;

        System.out.print("Wie lang? ");
        int[] randomArray = new int[scanner.nextInt()];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1, 100);
        }

        for (int elem : randomArray) {
            if (elem > 30) counter++;
        }
        System.out.println(Arrays.toString(randomArray));
        System.out.println("Anzahl der Werte größer als 30: " + counter);

    }
}
