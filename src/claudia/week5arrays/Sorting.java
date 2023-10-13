package claudia.week5arrays;

import java.util.Arrays;
import java.util.Random;

public class Sorting {
    public static void main(String[] args) {

        Random random = new Random();
        int[] vector = new int[50];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(1, 101);
        }
        //int [] vector = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,};
        //int [] vector = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Originalvektor: ");
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(cocktailSortAscending(vector)));
        System.out.println(Arrays.toString(bubbleSortAscending(vector)));
    }

    public static int[] cocktailSortAscending(int[] vector) {
        int counter = 0;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < vector.length - 1; i++) {
                counter++;
                if (vector[i] > vector[i + 1]) {
                    swapElements(vector, i, i + 1);
                    swapped = true;
                }
            }
            //System.out.println("nach erster For-Schleife " + Arrays.toString(vector));
            if (swapped) { //wenn oben nichts mehr geändert wurde, sind wir fertig
                swapped = false;
                for (int i = vector.length - 1; i > 0; i--) {
                    counter++;
                    if (vector[i] < vector[i - 1]) {
                        swapElements(vector, i, i - 1);
                        swapped = true;
                    }
                }
                //System.out.println("nach zweiter For-Schleife " + Arrays.toString(vector));
            }
        }
        System.out.println("Cocktailsort, Anzahl vorgenommene Vergleiche: " + counter);
        return vector;
    }

    public static int[] bubbleSortAscending(int[] vector) {
        int counter = 0;
        for (int j = 0; j < vector.length - 1; j++) {
            for (int i = 0; i < vector.length - j - 1; i++) {
                counter ++;
                if (vector[i] > vector[i + 1]) swapElements(vector, i, i + 1);
            }
        }
        System.out.println("Bubblesort, Anzahl vorgenommene Vergleiche: " + counter);
        return vector;
    }

    public static void swapElements(int [] vector, int i, int j){
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }
}
