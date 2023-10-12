package MichaelReal.week4;

import java.util.Arrays;
import java.util.Scanner;

/*
Aufgabe: Number Array
Erstelle ein int[] mit der Dimension von Benutzerangabe und befülle mit 1, 2, 3, usw.

Erstelle ein zweites int[] und befülle mit Zahlen entsprechend der Größe ..., 3, 2, 1.
 */
public class Arrays_1_NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Dimension des Arrays ein: ");
        int dimension = scanner.nextInt();

        int[] firstArray = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            firstArray[i] = i + 1;
        }

        int[] secondArray = new int[dimension];
        for (int i = 0; i < dimension; i++) {
            secondArray[i] = dimension - i;
        }

        System.out.println("Erstes Array: ");
        for (int i : firstArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Zweites Array: ");
        for (int i : secondArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("Andere Möglichkeit");

        int[] userinfo = new int[5];
        int[] size = new int[5];

        userinfo[0] = 1;
        userinfo[1] = 2;
        userinfo[2] = 3;
        userinfo[3] = 4;
        userinfo[4] = 5;
        size[0] = 5;
        size[1] = 4;
        size[2] = 3;
        size[3] = 2;
        size[4] = 1;

        System.out.println(Arrays.toString(userinfo));
        System.out.println(Arrays.toString(size));


    }
}
