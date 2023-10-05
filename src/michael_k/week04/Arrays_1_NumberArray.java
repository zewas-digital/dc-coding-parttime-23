package michael_k.week04;

/*
Aufgabe: Number Array
Erstelle ein int[] mit der Dimension von Benutzerangabe und befülle mit 1, 2, 3, usw.

Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_1_NumberArray {

    public static void main(String[] args) {
        Scanner inputkonsole = new Scanner ( System.in );

        System.out.println ("Wie groß soll das Array sein" );
        int size = inputkonsole.nextInt ();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int length = size;

        for (int i = 0; i <size; i++) {
            array1[i] = i+1;
        }

        for (int j = 0; j < size; j++) {
            array2[j] = length;
            length--;
        }


        System.out.println ( Arrays.toString ( array1) );
        System.out.println ( Arrays.toString ( array2) );
    }

}