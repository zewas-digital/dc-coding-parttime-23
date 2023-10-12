package volkan.week04;

/*
Aufgabe: Number Array
Erstelle ein int[] mit der Dimension von Benutzerangabe und befülle mit 1, 2, 3, usw.

Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_1_NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Dimension des Arrays an: ");
        int dimension = scanner.nextInt();
        System.out.print("Bitte geben Sie die Zahlen des Arrays an: ");
        int zahleneingabe = scanner.nextInt();
        int lange = zahleneingabe;

        int[] benutzerangabe = new int[dimension];
        int[] zahlen = new int[zahleneingabe];

        for (int i = 0; i < dimension; i++) {
            benutzerangabe[i] = i+1;
        }
        for (int i = zahleneingabe; i >= 1; i--) {
            zahlen[zahleneingabe-i] = i;
        }


        System.out.println(Arrays.toString(benutzerangabe));
        System.out.println(Arrays.toString(zahlen));
        System.out.println("länge von zahlen; " + zahleneingabe);

    }


}