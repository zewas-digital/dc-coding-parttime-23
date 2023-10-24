package Simonsway.Week5;

/*
Bonusaufgabe: 15 verschiedene Sortieralgorithmen
Implementiere 3 unterschiedliche Algorithmen deiner Wahl auf folgendem Video:

https://www.youtube.com/watch?v=kPRA0W1kECg
Den Pseudo-Code der Algorithmen findest du unter:

https://panthema.net/2013/sound-of-sorting/SoS-CheatSheet.pdf
 */

import Simonsway.methods.array_Methods;

import java.util.Arrays;
import java.util.Random;

public class Arrays_9_Bonus {
    public static void main(String[] args) {

        int[] array = array_Methods.createNewRandomArray(10, 1, 99);

        int[] output = insertionSort(array);
        System.out.println(Arrays.toString(output));

    }

    public static int[] insertionSort (int[] array){


            // [5, 2, 9, 3, 6]
            for (int i = 1; i < array.length; i++) {
                int temp = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > temp) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = temp;
            }
            return array;
    }
}


