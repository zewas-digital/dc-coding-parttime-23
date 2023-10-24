package saifedine.week06_arrays;

/*
Bonusaufgabe: 15 verschiedene Sortieralgorithmen
Implementiere 3 unterschiedliche Algorithmen deiner Wahl auf folgendem Video:

https://www.youtube.com/watch?v=kPRA0W1kECg
Den Pseudo-Code der Algorithmen findest du unter:

https://panthema.net/2013/sound-of-sorting/SoS-CheatSheet.pdf = Pseudo Code
 */

import saifedine.week05_arrays.Array_7_MinMaxAvg;

import java.util.Arrays;

public class Arrays_9_Bonus_insertionSort_Aufgabe01 {

    //insertionSort = Bubblesort umgekehrt, d.h. von rechts nach links....
    //https://www.happycoders.eu/de/algorithmen/insertion-sort/
    public static void main(String[] args) {

        int[] elements = Array_7_MinMaxAvg.getZufallsZahlen();
        int[] sortiert = sort(elements);

    }


    static int[] sort(int[] elements) {

        for (int i = 1; i < elements.length; i++) {

            int elementToSort = elements[i];

            // Move element to the left until it's at the right position
            int j = i;

            while (j > 0 && elementToSort < elements[j - 1]) {
                elements[j] = elements[j - 1];
                j--;
            }
            elements[j] = elementToSort;
        }
        System.out.println("Aufgabe - Insertion Sort:");

        System.out.println("Ergebnis: " + Arrays.toString(elements));

        return elements;
    }


}

