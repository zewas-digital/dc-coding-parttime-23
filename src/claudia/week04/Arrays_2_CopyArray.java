package claudia.week04;

/*
Aufgabe: Kopie
Erstelle eine Funktion, die aus dem Parameter-Array eine Kopie erstellt.

public static int[] makeACopy(int[] original){
}
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays_2_CopyArray {
    public static void main(String[] args) {
        int size = 10;
        int [] vector = new int [size];
        Random random = new Random();
        //Befüllen
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(100);
        }

        System.out.println("Originalvektor: " + Arrays.toString(vector));
        System.out.println("Kopie:          " + Arrays.toString(makeACopy(vector)));

    }

    public static int[] makeACopy(int[] original) {
        int size = original.length;
        int[] copy = new int[size];
        for (int i = 0; i < size; i++) {
            copy[i] = original[i];
        }
        return copy;

    }
}
