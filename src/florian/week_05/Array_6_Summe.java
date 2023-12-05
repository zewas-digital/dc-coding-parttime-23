package florian.week_05;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Random;

public class Array_6_Summe {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[10];
        int summe = 0;

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(1,100);
            summe = summe + array[i];
        }
        System.out.println(summe);
    }
}
