package claudia.week5arrays;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {

        Random random = new Random();
        int[] vector1 = new int[50];
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = random.nextInt(1, 101);
        }
        //TESTWERTE:
        //int [] a = {1, 3, 5};
        //int [] a = {8};
        //int [] b = {2, 4, 6, 8, 10};
        //int [] a = {2, 2, 2, 2, 2};
        //int [] b = {1};
        //int [] vector1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,};
        //int [] vector1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        //int [] vector = {1, 2, 3, 7, 2, 4, 5, 5, 6, 100, 234};
        //int[] vector = {2, 1, 3, 1};
        int[] vector = {2, 5, 1, 4};
        int[] sorted = new int[vector.length];
        //mergeArray(vector, 0, 3, 10);
        mergeSort(vector,0, 3, sorted);
        System.out.println(Arrays.toString(vector));
        /*
        int [] vector2 = Arrays.copyOf(vector1, vector1.length);
        System.out.println("Originalvektor: ");
        System.out.println(Arrays.toString(vector1));
        cocktailSortAscending(vector1);
        System.out.println(Arrays.toString(vector1));
        bubbleSortAscending(vector2);
        System.out.println(Arrays.toString(vector2));*/
    }

    public static void mergeSort(int[] vector, int lowest, int highest, int[] temp){
        //boolean sorted = false;
        //while (!sorted){

        //while not sorted, divide array into approximate halves,
        //lower part: index 0 to (0,5 * (length - 1)) ! /2 by integer-division!
        //upper part: (0,5 * (length - 1) + 1) to (length - 1) ! /2 by integer-division!
        //until length of array is 1 => lowest and highest index == 0
        //subarray of length 1 is sorted by definition
        //merge sorted arrays recursively
            if (lowest < highest) {
                int middle = (highest + lowest) / 2;


                mergeSort(vector, lowest, middle, temp);

                mergeSort(vector, middle + 1, highest, temp);

                mergeArray(vector, lowest, middle, highest, temp);
            };
        }
    //}

    public static void mergeArray (int[] vector, int lowest, int middle, int highest, int[] temp){
        //merge two sorted subarrays into one (sorted) array
        //subarrays must be sorted ascendingly

        //int[] sorted = new int[vector.length]; //array to store sorted values temporarily
        int indexA = lowest;
        int indexB = middle + 1;
        for (int i = 0; i < vector.length; i++) {
            if (indexA <= middle && indexB <= highest && vector[indexA] <= vector[indexB]) {

                temp[i] = vector[indexA];

                indexA++;
            } else if (indexA <= middle && indexB <= highest && vector[indexA] > vector[indexB]) {

                temp[i] = vector[indexB];
                indexB++;
            } else if (indexA > middle && indexB <= highest) {//!!!!
                temp[i] = vector[indexB];
                indexB++;
            } else if (indexA <= middle && indexB > highest){
                temp[i] = vector[indexA];
                indexA++;
            }
        }
        System.arraycopy(temp, 0, vector, 0, vector.length);
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
                counterLoop ++;
                if (vector[i] > vector[i + 1]) {
                    swapElements(vector, i, i + 1);
                    counterSwap++;
                }
            }
        }
        System.out.println("Bubblesort, Anzahl Ausführung Schleife: " + counterLoop);
        System.out.println("Bubblesort, Anzahl vorgenommene Swaps: " + counterSwap);
    }

    public static void swapElements(int [] vector, int i, int j){
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }
}
