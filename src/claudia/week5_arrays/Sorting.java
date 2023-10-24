package claudia.week5_arrays;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {


        int[] vector = createRandomArray(50);

        //TESTWERTE:
        //int [] a = {1, 3, 5};
        //int [] a = {8};
        //int [] b = {2, 4, 6, 8, 10};
        //int [] a = {2, 2, 2, 2, 2};
        //int [] b = {1};
        //int [] vector = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,};
        //int [] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int [] vector = {1, 2, 3, 7, 2, 4, 5, 5, 6, 100, 234};
        //int[] vector = {2, 1, 3, 1};
       // int[] vector = {2, 5, 1, 4};
        //int[] vector = {1, 2, 1, 2, 4};
        //int[] vector = {2, 1, 3};
        //int[] sorted = new int[vector.length];
        //int[] temp = {-1, -1, -1,-1,-1};
        //mergeArray(vector, 0, 1, 3, sorted);
        //mergeArray(vector, 0, 3, 10);
        //mergeSort(vector,0, 19, sorted);
        System.out.println(Arrays.toString(vector));
        //partition(vector, 0, 9);
        quicksort(vector);
        System.out.println(Arrays.toString(vector));


    }

    public static void quicksort(int[] vector) {
        qsort(vector, 0, vector.length-1);
    }
    public static void qsort(int[] vector, int lowest, int highest){
        if (lowest < highest){//=> vector.length > 1
            int indexPivot = partition(vector, lowest, highest); //then pivot at position indexPivot
            qsort(vector, lowest, indexPivot - 1);
            qsort(vector, indexPivot + 1, highest);
        }
    }
    public static int partition (int[] vector, int lowest, int highest){
        int pivot = vector[highest]; //TODO improve choice of pivot
        int i = lowest;
        for (int j = lowest; j < highest; j++) {
            if (vector[j] < pivot){
                swapElements(vector, i, j);
                i++; //i is only incremented if vector[j] < pivot!
            }
        }
        swapElements(vector, i, highest);//pivot is moved into its final position
        return i;
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

    /*public static void mergeSort(int[] vector, int lowest, int highest, int[] sorted){

        //while not sorted, divide array into approximate halves,
        //lower part: index 0 to (0,5 * (length - 1)) ! /2 by integer-division!
        //upper part: (0,5 * (length - 1) + 1) to (length - 1) ! /2 by integer-division!
        //until length of array is 1 => lowest and highest index == 0
        //subarray of length 1 is sorted by definition
        //merge sorted arrays recursively
            if (lowest < highest) {
                int middle = (highest + lowest) / 2;

                mergeSort(vector, lowest, middle, sorted);
                mergeSort(vector, middle + 1, highest, sorted);

                mergeArray(vector, lowest, middle, highest, sorted);
            }
        }

public static void mergeArray(int[] vector, int lowest, int middle, int highest, int[] sorted){
        int indexA = lowest;
        int indexB = middle + 1;
        int i = lowest;
        while (indexA <= middle && indexB <= highest){
            if(vector[indexA] < vector[indexB]){
                sorted[i] = vector[indexA];
                indexA++;
            } else {
                sorted[i] = vector[indexB];
                indexB++;
            }
            i++;
        }
        while(indexA <= middle){
            sorted[i] = vector[indexA];
            indexA++;
            i++;
        }
        while(indexB <= highest){
            sorted[i] = vector[indexB];
            indexB++;
            i++;
        }
    for (i = lowest; i <= highest; i++) {
        vector[i] = sorted[i];

    }
}

    /*public static void mergeArray (int[] vector, int lowest, int middle, int highest){
        //merge two sorted subarrays into one (sorted) array
        //subarrays must be sorted ascendingly
        System.out.println("Starte mergeArray, lowest, middle, highest " + lowest + " " + middle + " " + highest);
        int[] temp = new int[vector.length]; //array to store sorted values temporarily
        int indexA = lowest;
        int indexB = middle + 1;
        for (int i = 0; i < vector.length; i++) { //befüllt den Hilfsarray temp
            if (indexA <= middle && indexB <= highest) { //beide Indizes befinden sich im gültigen Bereich indexB <= highest?
                if (vector[indexA] <= vector[indexB]) {
                    temp[i] = vector[indexA];
                    indexA++;
                } else {
                    temp[i] = vector[indexB];
                    indexB++;
                }
            } else if (indexA > middle ) {//d.h. indexA ist zu groß, d.h. linke Hälfte des Arrays ist fertig && indexB <= highest
                temp[i] = vector[indexB];
                indexB++;
            } else if (indexB > highest && indexA <= middle) {//d.h. rechte Hälfte des Arrays ist fertig if (indexB > highest && indexA <= middle)
                temp[i] = vector[indexA];
                indexA++;
            }

            else System.out.println("Problem, i, indexA, indexB " + i + " " + indexA + " " + indexB); //diesen Fall sollte es nicht geben!
        }
        System.arraycopy(temp, 0, vector, 0, vector.length);
    }*/


 /*  public static void mergeArray (int[] vector, int lowest, int middle, int highest, int[] temp){
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
    }*/

//}
