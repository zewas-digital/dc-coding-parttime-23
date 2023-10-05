package Simonsway.Week4;

/*
Aufgabe: Number Array
Erstelle ein int[] mit der Dimension von Benutzerangabe (Scanner) und befülle mit 1, 2, 3, usw.

Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_1_NumberArray {
    public static void main(String[] args) {

        System.out.println("Bitte geben sie eine Zahl ein");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        int [] numbers = new int[userInput];

        for (int i = 0; i < userInput; i++) {
            numbers [i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        for (int j = userInput; j >= 1 ; j--) {
            numbers [userInput - j] = j;
        }
        System.out.println(Arrays.toString(numbers));
    }
}