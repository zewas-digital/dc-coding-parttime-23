package michael_k.week5;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Arrays;
import java.util.Random;

public class Array_6_Summe {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random randomnumber = new Random();
        int lenght = array.length;
        int summe = 0;


        for (int i = 0; i <lenght; i++) {
            int value =randomnumber.nextInt ( 100 );
            array[i] = value +1;
        }

        for (int i = 0; i < lenght; i++) {
            summe = summe + array[i];
        }

        System.out.println ( Arrays.toString ( array) );
        System.out.println (summe );

    }
}
