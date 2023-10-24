package MichaelReal.week6;

/*
Bonusaufgabe: 15 verschiedene Sortieralgorithmen
Implementiere 3 unterschiedliche Algorithmen deiner Wahl auf folgendem Video:

https://www.youtube.com/watch?v=kPRA0W1kECg
Den Pseudo-Code der Algorithmen findest du unter:

https://panthema.net/2013/sound-of-sorting/SoS-CheatSheet.pdf
 */

import java.util.Arrays;

public class Arrays_9_Bonus {
    public static void main(String[] args) {

        int[] unsorted = Methods.createRandomArray(10);
        int[] sorted = selectionsort(unsorted);

        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + ", ");
        }

    }

    public static int[] selectionsort(int[] sort) {
        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = i + 1; j < sort.length; j++) {
                if (sort[i] > sort[j]) {
                    int temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }
        return sort;
    }
}