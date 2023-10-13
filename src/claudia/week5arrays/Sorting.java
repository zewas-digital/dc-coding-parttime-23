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

        //int [] vector1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,};
        //int [] vector1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] vector2 = Arrays.copyOf(vector1, vector1.length);
        System.out.println("Originalvektor: ");
        System.out.println(Arrays.toString(vector1));
        System.out.println(Arrays.toString(cocktailSortAscending(vector1)));
        System.out.println(Arrays.toString(bubbleSortAscending(vector2)));
    }

    public static int[] cocktailSortAscending(int[] vector) {
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

        return vector;
    }

    public static int[] bubbleSortAscending(int[] vector) {
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

        return vector;
    }

    public static void swapElements(int [] vector, int i, int j){
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }
}
