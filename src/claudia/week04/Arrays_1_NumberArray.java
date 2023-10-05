package claudia.week04;

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
        System.out.print("Array richtigrum; wie lang? ");
        int size1 = scanner.nextInt();
        int[] numbers1 = new int[size1];
        for (int i = 0; i < size1; i++) {
            numbers1[i] = i +1;
        }
        System.out.println(Arrays.toString(numbers1));

        System.out.print("Array falschrum; wie lang? ");
        int size2 = scanner.nextInt();
        int[] numbers2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            numbers2[i] = size2 - i;
        }
        System.out.println(Arrays.toString(numbers2));

    }

}