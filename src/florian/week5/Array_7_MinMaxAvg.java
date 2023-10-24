package florian.week5;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt. Die Methoden sollen jeweils
den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.

Erstelle zwei weitere Funktionen, die den Index des Minimums und des Maximums zurückgeben.
 */


import java.util.Arrays;
import java.util.Random;

public class Array_7_MinMaxAvg {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int min = minimum(array);
        System.out.println(min);

        int maxi = maximum(array);
        System.out.println(maxi);

        int durch = durchschnitt(array);
        System.out.println(durch);
    }

    public static int minimum(int[] array) {
        int min = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    static int maximum(int[] array) {
        int maxi = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxi) {
                maxi = array[i];
            }
        }

        return maxi;
    }

    static int durchschnitt(int[] array) {
        int durchschnitt = 0;

        int summe = 0;

        for (int i = 0; i < array.length; i++) {
            summe = summe + array[i];

        }

        durchschnitt = summe / array.length;


        return durchschnitt;
    }
}
