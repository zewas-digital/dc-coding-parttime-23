package florian.week5;

/*
Erstelle ein int[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode.

    Sortiere der Größe nach aufsteigend (Ascending)
    Sortiere der Größe nach absteigend (Descending)

Erklärung Bubblesort: https://www.youtube.com/watch?v=qtXb0QnOceY
 */

import java.util.Arrays;
import java.util.Random;

public class Array_8_Bubblesort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] ascending = bubblesortascending(array);
        System.out.println(Arrays.toString(ascending));
        int [] descending = bubblesortdescending(array);
        System.out.println(Arrays.toString(descending));
    }

    static int[] bubblesortascending(int[] ascending) {
        int sortieren;

        for (int i = 0; i < ascending.length - 1; i++) {
            for (int j = 0; j < ascending.length - 1; j++) {
                if (ascending[j] > ascending[j + 1]) {
                    sortieren = ascending[j];
                    ascending[j] = ascending[j + 1];
                    ascending[j + 1] = sortieren;
                }
            }
        }
        return ascending;
    }
    static int[] bubblesortdescending(int []descending){
        int sortieren;

        for (int i = 0; i < descending.length - 1; i++) {
            for (int j = 0; j < descending.length - 1; j++) {
                if (descending[j] < descending[j + 1]) {
                    sortieren = descending[j];
                    descending[j] = descending[j + 1];
                    descending[j + 1] = sortieren;
                }
            }
        }
        return descending;
    }


}
