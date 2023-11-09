package eslem.week05;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Array_6_Summe {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        int summe = 0;

        System.out.println("Wie viele Zufallszahlen?: ");
        int[] nummer = new int[scanner.nextInt()];


        for (int i = 0; i < nummer.length; i++) {
            nummer[i] = random.nextInt(1, 100);
        }

        for (int i = 0; i < nummer.length; i++) {
            summe = summe + nummer[i];
        }
        System.out.println(Arrays.toString(nummer));
        System.out.println(summe);
    }
}
