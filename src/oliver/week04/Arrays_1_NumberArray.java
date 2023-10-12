package oliver.week04;

import java.util.Arrays;
import java.util.Scanner;

/*
Aufgabe: Number Array
Erstelle ein int[] mit der Dimension von Benutzerangabe und befülle mit 1, 2, 3, usw.


[1,2,3]
[1,2,3,4,5]

Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.
 */

public class Arrays_1_NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("in welcher Länge soll ein Array erzeugt werden?");
        int[] topDown = createTopDownArray(sc.nextInt());
        System.out.println(Arrays.toString(topDown));

        System.out.println("in welcher Länge soll ein zweites Array erzeugt werden?");
        int length = sc.nextInt();
        int[] topDown2 = createTopDownArrayWithWhile(length);
        System.out.println(Arrays.toString(topDown2));
    }

    public static int[] createTopDownArray(int length) {
        int[] numbers = new int[length];

        for (int i = length; i > 0; i--) {
            numbers[length - i] = i;
            System.out.println(Arrays.toString(numbers));
        }

        return numbers;
    }

    public static int[] createTopDownArrayWithWhile(int length) {
        int[] numbers = new int[length];

        while (length > 0) {
            numbers[numbers.length - length] = length;
            length--;
        }

        return numbers;
    }
}