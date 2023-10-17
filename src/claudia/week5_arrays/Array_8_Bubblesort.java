package claudia.week5_arrays;

/*
Erstelle ein int[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode.

    Sortiere der Größe nach aufsteigend (Ascending)
    Sortiere der Größe nach absteigend (Descending)

Erklärung Bubblesort: https://www.youtube.com/watch?v=qtXb0QnOceY
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_8_Bubblesort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.print("Wie lang? ");
        int[] vector = new int[scanner.nextInt()];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(1, 101);
        }
        System.out.println("Originalvektor: ");
        System.out.println(Arrays.toString(vector));
        System.out.println("Bubblesort aufsteigend: ");
        System.out.println(Arrays.toString(bubbleSortAscending(vector)));
        System.out.println("Bubblesort absteigend: ");
        System.out.println(Arrays.toString(bubbleSortDescending(vector)));
    }

    public static int[] bubbleSortAscending(int[] vector) {
        int counter = 0;
        for (int j = 0; j < vector.length - 1; j++) {
            for (int i = 0; i < vector.length - j - 1; i++) {
                counter ++;
                if (vector[i] > vector[i + 1]) swapElements(vector, i, i + 1);
            }
        }
        System.out.println("Counter: " + counter);
        return vector;
    }

    public static int[] bubbleSortDescending(int[] vector) {
        int counter = 0;
        for (int j = 0; j < vector.length - 1; j++) {
            for (int i = 0; i < vector.length - j - 1; i++) {
                counter++;
                if (vector[i] < vector[i + 1]) swapElements(vector, i, i + 1);
            }
        }
        System.out.println("Counter: " + counter);
        return vector;
    }
    public static void swapElements(int [] vector, int i, int j){
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }
}
