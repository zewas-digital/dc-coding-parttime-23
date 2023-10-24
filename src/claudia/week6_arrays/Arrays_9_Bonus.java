package claudia.week6_arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Bonusaufgabe: 15 verschiedene Sortieralgorithmen
Implementiere 3 unterschiedliche Algorithmen deiner Wahl auf folgendem Video:

https://www.youtube.com/watch?v=kPRA0W1kECg
Den Pseudo-Code der Algorithmen findest du unter:

https://panthema.net/2013/sound-of-sorting/SoS-CheatSheet.pdf
 */


public class Arrays_9_Bonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Verschiedene Sortierverfahren; wie groß soll das Array sein? ");
        int size = scanner.nextInt();
        int[] vector1 = createRandomArray(size);
        int[] vector2 = Arrays.copyOf(vector1, vector1.length);
        int[] vector3 = Arrays.copyOf(vector1, vector1.length);
        int[] vector4 = Arrays.copyOf(vector1, vector1.length);
        int[] vector5 = Arrays.copyOf(vector1, vector1.length);
        int[] vector6 = Arrays.copyOf(vector1, vector1.length);
        int[] vector7 = Arrays.copyOf(vector1, vector1.length);


        long start = System.nanoTime(); //time in nano-seconds; nano = 10 ^(-9)
        cocktailSortAscending(vector1);
        long finish = System.nanoTime();
        long timeElapsedCocktail = finish - start;

        start = System.nanoTime();
        bubbleSortAscending(vector2);
        finish = System.nanoTime();
        long timeElapsedBubble = finish - start;

        start = System.nanoTime();
        insertionSortAscending(vector3);
        finish = System.nanoTime();
        long timeElapsedInsertion = finish - start;

        start = System.nanoTime();
        quicksort(vector4);
        finish = System.nanoTime();
        long timeElapsedQuick = finish - start;

        start = System.nanoTime();
        mergeSort(vector5);
        finish = System.nanoTime();
        long timeElapsedMerge = finish - start;

        start = System.nanoTime();
        selectionSortAscending(vector6);
        finish = System.nanoTime();
        long timeElapsedSelection = finish - start;

        start = System.nanoTime();
        radixSort(vector7);
        finish = System.nanoTime();
        long timeElapsedRadix = finish - start;
       /*
        System.out.println("Originalvektor: ");
        System.out.println(Arrays.toString(vector1));
        System.out.println("Cocktailsort: ");
        System.out.println(Arrays.toString(vector1));
        System.out.println("Bubblesort: ");
        System.out.println(Arrays.toString(vector2));
        System.out.println("Insertionsort: ");
        System.out.println(Arrays.toString(vector3));
        System.out.println("Quicksort: ");
        System.out.println(Arrays.toString(vector4));
        System.out.println("Mergesort: ");
        System.out.println(Arrays.toString(vector5));
        System.out.println("Selectionsort: ");
        System.out.println(Arrays.toString(vector6));
        System.out.println("Radixsort: ");
        System.out.println(Arrays.toString(vector7));*/

        System.out.println("Time elapsed in nano seconds: ");
       /* System.out.println("Cocktail  \t\t" + timeElapsedCocktail);
        System.out.println("Bubble    \t\t" + timeElapsedBubble);
        System.out.println("Insertion  \t\t" + timeElapsedInsertion);
        System.out.println("Quick      \t\t" + timeElapsedQuick);
        System.out.println("Merge     \t\t" + timeElapsedMerge);
        System.out.println("Selection \t\t" + timeElapsedSelection);*/
        System.out.println(String.format("Bubble   %20d", timeElapsedBubble));
        System.out.println(String.format("Cocktail %20d", timeElapsedCocktail));
        System.out.println(String.format("Insertion%20d", timeElapsedInsertion));
        System.out.println(String.format("Merge    %20d", timeElapsedMerge));
        System.out.printf("Quick    %20d%n", timeElapsedQuick);
        System.out.printf("Radix    %20d%n", timeElapsedRadix);
        System.out.printf("Selection%20d%n", timeElapsedSelection);
    }

    public static void radixSort(int[] vector) {

        int n = vector.length;
        int[] sorted = new int[n];

        for (int i = 1; i <= 3; i++) {
            int[] buckets = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int elem : vector) {
                buckets[(int) ((elem % (Math.pow(10,i))) / Math.pow(10, i - 1))] ++;
            }

            for (int j = 1; j < 10; j++) {
                buckets[j] = buckets[j] + buckets[j - 1];
            }

            for (int j = n - 1; j >= 0; j--) {
                int digit = (int) ((vector[j] % Math.pow(10, i)) / Math.pow(10,i - 1));

                sorted[buckets[digit] - 1] = vector[j];
                buckets[digit]--;
            }
            System.arraycopy(sorted, 0, vector, 0, vector.length);
        }
    }
    public static void selectionSortAscending(int[] vector) {
        int n = vector.length;
        int half = n/2;
        for (int j = 0; j <= half; j++) {
            int min = vector[j];
            int indexMin = j;
            int max = vector[j];
            int indexMax = j;
            for (int i = j + 1; i < n - j; i++) {
                if (vector[i] > max) {
                    max = vector[i];
                    indexMax = i;
                }
                if (vector[i] < min) {
                    min = vector[i];
                    indexMin = i;
                }
            }
            if (indexMax != j) {
                swapElements(vector, j, indexMin);
                swapElements(vector, n - 1 - j, indexMax);
            } else { //d.h. indexMax = j
                swapElements(vector, n - 1 - j, indexMax);
                swapElements(vector, j, indexMin);
            }
        }
    }
    public static void mergeSort(int[] vector){
        int n = vector.length;
        int[] sorted = new int[n];
        msort(vector, 0, n-1, sorted);
    }
    public static void msort(int[] vector, int lowest, int highest, int[] sorted){
        if (lowest < highest){ //else vector.length = 1 and vector is sorted by definition
            int middle = (lowest + highest)/2; //integer-division!
            msort(vector, lowest, middle, sorted);
            msort(vector, middle + 1, highest, sorted);
            mergeArray(vector, lowest, middle, highest, sorted);
        }
    }
    public static void mergeArray (int[] vector, int lowest, int middle, int highest, int[] sorted){
        //merge two sorted subarrays into one (sorted) array
        //subarrays must be sorted ascendingly
        //System.out.println("Starte mergeArray, lowest, middle, highest " + lowest + " " + middle + " " + highest);
        int indexA = lowest;
        int indexB = middle + 1;
        int indexSorted;
        for (indexSorted = lowest; indexSorted < vector.length; indexSorted++) { //befüllt den Hilfsarray temp
            if (indexA <= middle && indexB <= highest) { //beide Indizes befinden sich im gültigen Bereich
                if (vector[indexA] <= vector[indexB]) {
                    sorted[indexSorted] = vector[indexA];
                    indexA++;
                } else {
                    sorted[indexSorted] = vector[indexB];
                    indexB++;
                }
            } else if (indexA > middle ) {//d.h. indexA ist zu groß, d.h. linke Hälfte des Arrays ist fertig && indexB <= highest
                sorted[indexSorted] = vector[indexB];
                indexB++;
            } else  {//d.h. rechte Hälfte des Arrays ist fertig if (indexB > highest && indexA <= middle)
                sorted[indexSorted] = vector[indexA];
                indexA++;
            }
        }
        System.arraycopy(sorted, 0, vector, 0, vector.length);
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
        if (i != j) {
            int temp = vector[i];
            vector[i] = vector[j];
            vector[j] = temp;
        }
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
