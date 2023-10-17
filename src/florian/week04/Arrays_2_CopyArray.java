package florian.week04;

/*
Aufgabe: Kopie
Erstelle eine Funktion, die aus dem Parameter-Array eine Kopie erstellt.

public static int[] makeACopy(int[] original){
}
 */

import java.util.Arrays;

public class Arrays_2_CopyArray {
    public static void main(String[] args) {

        int number = 10;
        int[] original = new int[number];

        for (int i = 0; i < number; i++) {
            original [i]= i;
        }
        System.out.println(Arrays.toString(original));

        int[] copy = makeaCopy(original);
        System.out.println(Arrays.toString(copy));
    }

    public static int[] makeaCopy(int[] original){
        int [] copy = new int[original.length];


        for (int i = 0; i < original.length ; i++) {


            copy [i] = i;
        }
        return copy;
    }
}

