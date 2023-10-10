package MichaelReal.week4;

import java.util.Scanner;

/*
        Aufgabe: Kopie
        Erstelle eine Funktion, die aus dem Parameter-Array eine Kopie erstellt.

public static int[] makeACopy(int[] original){
        }
        */
public class Arrays_2_CopyArray {
    public static int[] makeACopy(int[] original) {
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }


    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = makeACopy(originalArray);

        System.out.println("Original Array: ");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Kopiertes Array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }


    }

}