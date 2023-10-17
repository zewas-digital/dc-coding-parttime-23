package claudia.week6_arrays;

import java.util.Arrays;
import java.util.Random;

/*
Bonusaufgabe: 15 verschiedene Sortieralgorithmen
Implementiere 3 unterschiedliche Algorithmen deiner Wahl auf folgendem Video:

https://www.youtube.com/watch?v=kPRA0W1kECg
Den Pseudo-Code der Algorithmen findest du unter:

https://panthema.net/2013/sound-of-sorting/SoS-CheatSheet.pdf
 */


public class Arrays_9_Bonus {

    public static void main(String[] args) {

        int[] vector1 = createRandomArray(50);
        int[] vector2 = Arrays.copyOf(vector1, vector1.length);
        int[] vector3 = Arrays.copyOf(vector1, vector1.length);

        System.out.println("Originalvektor: ");
        System.out.println(Arrays.toString(vector1));
        cocktailSortAscending(vector1);
        System.out.println(Arrays.toString(vector1));
        bubbleSortAscending(vector2);
        System.out.println(Arrays.toString(vector2));
        insertionSortAscending(vector3);
        System.out.println(Arrays.toString(vector3));
    }


    public static void insertionSortAscending(int[] vector) {
        int counterLoop = 0;
        int counterSwap = 0;
        for (int i = 1; i < vector.length; i++) {
            int valueToBeInserted = vector[i];
            int j = i;
            while (j > 0 && vector[j - 1] > valueToBeInserted) {
                counterSwap++;
                vector[j] = vector[j - 1];
                j--;
            }
            vector[j] = valueToBeInserted;
        }
        System.out.println("Insertionsort, Anzahl vorgenommene Swaps: " + counterSwap);
    }

    public static void cocktailSortAscending(int[] vector) {
        int counterLoop = 0;
        int counterSwap = 0;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < vector.length - 1; i++) {
                counterLoop++;
                if (vector[i] > vector[i + 1]) {
                    swapElements(vector, i, i + 1);
                    counterSwap++;
                    swapped = true;
                }
            }
            //System.out.println("nach erster For-Schleife " + Arrays.toString(vector));
            if (swapped) { //wenn oben nichts mehr geändert wurde, sind wir fertig
                swapped = false;
                for (int i = vector.length - 1; i > 0; i--) {
                    counterLoop++;
                    if (vector[i] < vector[i - 1]) {
                        swapElements(vector, i, i - 1);
                        counterSwap++;
                        swapped = true;
                    }
                }
                //System.out.println("nach zweiter For-Schleife " + Arrays.toString(vector));
            }
        }
        System.out.println("Cocktailsort, Anzahl Ausführung Schleife " + counterLoop);
        System.out.println("Cocktailsort, Anzahl vorgenommene Swaps: " + counterSwap);
    }

    public static void bubbleSortAscending(int[] vector) {
        int counterLoop = 0;
        int counterSwap = 0;
        for (int j = 0; j < vector.length - 1; j++) {
            for (int i = 0; i < vector.length - j - 1; i++) {
                counterLoop++;
                if (vector[i] > vector[i + 1]) {
                    swapElements(vector, i, i + 1);
                    counterSwap++;
                }
            }
        }
        System.out.println("Bubblesort, Anzahl Ausführung Schleife: " + counterLoop);
        System.out.println("Bubblesort, Anzahl vorgenommene Swaps: " + counterSwap);
    }

    public static void swapElements(int[] vector, int i, int j) {
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }

    private static int[] createRandomArray(int size) {
        Random random = new Random();
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(1, 101);
        }
        return vector;
    }
}
