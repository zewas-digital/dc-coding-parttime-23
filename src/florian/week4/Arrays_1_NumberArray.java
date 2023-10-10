package florian.week4;

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
        System.out.println("Bitte gib die Länge des Arrays ein: ");
        int  numbers = scanner.nextInt();
        System.out.println("Bitte gib die Länge des zweiten Arrays ein: ");
        int numbers2 = scanner.nextInt();

        int [] number = new int [numbers];
        int [] number2 = new int [numbers2];

        for (int i = 0; i < numbers; i++) {
            number [i]= i + 1;
        }
        System.out.println(Arrays.toString(number));

        for (int i = numbers2 ; i >= 1  ; i--) {
            number2 [numbers2 - i ] = i;
        }




        System.out.println(Arrays.toString(number2));


    }

}