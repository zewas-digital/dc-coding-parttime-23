package claudia.week5arrays;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */

import java.util.Random;
import java.util.Scanner;

public class Arrays_4_CrazyRangeArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Wie lang? ");
        int[] randomArray = new int[scanner.nextInt()];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(-50, 50);
        }

        for (int elem : randomArray) {
            System.out.print(elem + " ");

        }
    }
}
