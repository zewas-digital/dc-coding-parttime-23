package eslem04;

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

        System.out.println("Wie lang soll diese Liste sein?:");
        int antwort = scanner.nextInt();

        int[] number = new int[antwort];

        for (int i = 0; i < antwort; i++) {
            number[i] = i + 1;
        }
        System.out.println(Arrays.toString(number));


        System.out.println("Wie lang soll diese Liste sein?:");
        int antwort2 = scanner.nextInt();

        int[] number2 = new int[antwort2];

        for (int j = antwort2; j >= 1; j--) {
            number2[antwort2-j] = j;
        }
        System.out.println(Arrays.toString(number2));

    }
}