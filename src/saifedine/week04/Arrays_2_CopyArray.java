package saifedine.week04;

/*
Aufgabe: Kopie
Erstelle eine Funktion, die aus dem Parameter-Array eine Kopie erstellt.

public static int[] makeACopy(int[] original){
}
 */

import java.util.Arrays;

public class Arrays_2_CopyArray {

    public static void main(String[] args) {

        int [] numbers = { 10, 50, 60, 80, 90, 100 };

        System.out.println(Arrays.toString(numbers));
        makeACopy(numbers);
    }
    public static int[] makeACopy(int[] numbers) {

        for (int i = 0; i < 6; i++) {

            System.out.println("i: " + i + " = " + numbers[i] + " ");

        }
        return numbers;

    }


}
