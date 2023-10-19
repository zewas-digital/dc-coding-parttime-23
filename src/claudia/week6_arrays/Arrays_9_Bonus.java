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
        int[] vector4 = Arrays.copyOf(vector1, vector1.length);

        System.out.println("Originalvektor: ");
        System.out.println(Arrays.toString(vector1));
        cocktailSortAscending(vector1);
        System.out.println("Cocktailsort: ");
        System.out.println(Arrays.toString(vector1));
        bubbleSortAscending(vector2);
        System.out.println("Bubblesort: ");
        System.out.println(Arrays.toString(vector2));
        insertionSortAscending(vector3);
        System.out.println("Insertionsort: ");
        System.out.println(Arrays.toString(vector3));
        quicksort(vector4);
        System.out.println("Quicksort: ");
        System.out.println(Arrays.toString(vector4));
    }


    public static void quicksort(int[] vector) {
        qsort(vector, 0, vector.length - 1);
    }

    public static void qsort(int[] vector, int lowest, int highest) {
        if (lowest < highest) {//=> vector.length > 1
            int indexPivot = partition(vector, lowest, highest); //then pivot at position indexPivot
            qsort(vector, lowest, indexPivot - 1);
            qsort(vector, indexPivot + 1, highest);
        }

    }

    public static int partition(int[] vector, int lowest, int highest) {
        int pivot = vector[highest]; //TODO improve choice of pivot
        int i = lowest;
        for (int j = lowest; j < highest; j++) {
            if (vector[j] < pivot) {
                swapElements(vector, i, j);
                i++; //i is only incremented if vector[j] < pivot!
            }
        }
        swapElements(vector, i, highest);//pivot is moved into its final position
        return i;
    }
    public static void insertionSortAscending(int[] vector) {
        for (int i = 1; i < vector.length; i++) {
            int valueToBeInserted = vector[i];
            int j = i;
            while (j > 0 && vector[j - 1] > valueToBeInserted) {
                vector[j] = vector[j - 1];
                j--;
            }
            vector[j] = valueToBeInserted;
        }
    }

    public static void cocktailSortAscending(int[] vector) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < vector.length - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    swapElements(vector, i, i + 1);
                    swapped = true;
                }
            }
            //System.out.println("nach erster For-Schleife " + Arrays.toString(vector));
            if (swapped) { //wenn oben nichts mehr geändert wurde, sind wir fertig
                swapped = false;
                for (int i = vector.length - 1; i > 0; i--) {
                    if (vector[i] < vector[i - 1]) {
                        swapElements(vector, i, i - 1);
                        swapped = true;
                    }
                }
            }
        }
    }

    public static void bubbleSortAscending(int[] vector) {
        for (int j = 0; j < vector.length - 1; j++) {
            for (int i = 0; i < vector.length - j - 1; i++) {
                if (vector[i] > vector[i + 1]) {
                    swapElements(vector, i, i + 1);
                }
            }
        }
    }

    public static void swapElements(int[] vector, int i, int j) {
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }

    public static int[] createRandomArray(int size) {
        Random random = new Random();
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(1, 101);
        }
        return vector;
    }
}
