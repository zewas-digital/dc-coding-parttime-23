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

        int arraySize = 10;
        int[] array = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 99);
        }


        int[] output = insertionSort(array);
        System.out.println(Arrays.toString(output));

        int[] test = array_Methods.createNewRandomArray(10, 1, 10);

    }

    public static int[] insertionSort(int[] array){

            for (int i = 1; i < array.length; i++) {
                int elementToSort = array[i];
                int j = i;
                while (j > 0 && elementToSort < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = elementToSort;
            }
            return array;
        }
}


