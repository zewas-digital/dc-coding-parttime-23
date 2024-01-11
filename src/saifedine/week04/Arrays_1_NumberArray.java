package saifedine.week04;

/*
Aufgabe: Number Array
Erstelle ein int[] mit der Dimension von Benutzerangabe und befülle mit 1, 2, 3, usw.

Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.
 */

// Scanner mit Eingabe der Array-Dimension = arrayDim
// fori für int [] numbersUp
// fori für int [] numbersDown

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_1_NumberArray {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Geben Sie die Dimension des Arrays ein: ");
        int arrayDim = eingabe.nextInt();

        int [] numbersUp = new int[arrayDim];

        for (int i = 0; i < arrayDim; i++) {
            numbersUp[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbersUp));


        int [] numbersDown = new int[arrayDim];

        for (int i = arrayDim; i >= 1; i--) {
            numbersDown[arrayDim - i] = i;
        }
        System.out.println(Arrays.toString(numbersDown));
    }
}