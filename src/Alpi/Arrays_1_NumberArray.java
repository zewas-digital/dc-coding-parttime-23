package Alpi;

/*
Aufgabe: Number Array
Erstelle ein int[] mit der Dimension von Benutzerangabe und befülle mit 1, 2, 3, usw.

Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.
 */


import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_1_NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dimension: ");
        int dimension1 = scanner.nextInt();

        System.out.println("Zahlen: ");
        int zahleneingabe = scanner.nextInt();



        int[] benutzerangabe = new int[dimension1];
        int[] zahlen =  new int [zahleneingabe];

        for (int i = 0; i < dimension1; i++) {
            benutzerangabe[i] = i+1;

        }


        for (int i = zahleneingabe; i >= 1 ; i--) {
            zahlen[zahleneingabe -i] = i;

        }



        System.out.println(Arrays.toString(benutzerangabe));
        System.out.println(Arrays.toString(zahlen));

        System.out.println("Länge von Zahlen: " + zahleneingabe);













    }
}
