package Simonsway.Week5;

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

        int arraySize = 10;
        int[] array = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 10);
        }

        int[] ascending = bubblesortAscending(array);
        System.out.println(Arrays.toString(ascending));

        int[] descending = bubblesortDescending(array);
        System.out.println(Arrays.toString(descending));

    }

    public static int[] bubblesortAscending (int[] array) { // Diese Methode nimmt ein Array von Ganzzahlen als Parameter und gibt ein Array von Ganzzahlen zurück. Sie sieht so aus, als würde sie das übergebene Array nach aufsteigenden Werten sortieren und ein neues sortiertes Array zurückgeben.
        int sort;                                          // wird verwendet um, Werte im Array vorübergehend zu speichern, während sie vertauscht werden.

        for (int i = 0; i < array.length - 1; i++) {       // Diese Schleife durchläuft das Array und vergleicht benachbarte Elemente.
            for (int j = 0; j < array.length - 1 - i; j++) {   // Diese Schleife vergleicht das Element an der Position J mit dem Element an der Poistion J+1
                if (array[j] > array[j + 1]) {             // Hier wird überprüft ob j größer ist das das Element auf Position J+1 Wenn dies der Fall ist bedeuted das die zwei Elemente in der falschen Reihenfolge sind und müssen vertauscht werden.
                    sort = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sort;
                }
            }
        }
        return array;
    }

    public static int[] bubblesortDescending(int[] array) {
        int sort;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) { // Im ersten Durchlauf ist i 0 somit wird nichts abgezogen, im zweiten Durchlauf ist i 1 somit wird ein abgezogen
                if (array[j] < array[j + 1]) {
                    sort = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sort;
                }
            }
        }
        return array;
    }
}