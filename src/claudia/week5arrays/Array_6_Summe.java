package claudia.week5arrays;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_6_Summe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Wie lang? ");
        int[] randomArray = new int[scanner.nextInt()];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1, 100);
        }
        System.out.println("Array = " + Arrays.toString(randomArray));
        System.out.println("Summe der Elemente = " + sumOfArray(randomArray));

    }

    public static int sumOfArray(int[] vector){
        int sum = 0;
        for (int elem : vector) {
            sum = sum + elem;
        }
        return sum;
    }

}
