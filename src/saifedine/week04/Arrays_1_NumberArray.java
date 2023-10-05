package saifedine.week04;

/*
Aufgabe: Number Array
Erstelle ein int[] mit der Dimension von Benutzerangabe und befülle mit 1, 2, 3, usw.

Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_1_NumberArray {

    public static void main(String[] args) {

        Scanner arrayanzahl = new Scanner(System.in);
        System.out.println("Geben Sie die Anzahl der Array: ");
        int eingabe = arrayanzahl.nextInt();

        int[] numbers = new int[eingabe];

        //System.out.println(eingabe);

        for (int i = 0; i < eingabe; i++) {

            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));

        for (int i = eingabe; i >= 1; i--) {

            numbers[eingabe-i] = i;

        }
        System.out.println(Arrays.toString(numbers));
    }

}