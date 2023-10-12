package michael_k.week04;

/*
Aufgabe: Kopie
Erstelle eine Funktion, die aus dem Parameter-Array eine Kopie erstellt.

public static int[] makeACopy(int[] original){
}
 */

import java.util.Arrays;

public class Arrays_2_CopyArray {

    public static void main(String[] args) {

        int[] staticArray = new int[9];
        int arraylength = staticArray.length;

        for (int i = 0; i <arraylength; i++) {
            staticArray[i] = i+1;
        }

        System.out.println ( Arrays.toString ( staticArray) );



        int[] dynamicArray =new int[arraylength];

        for (int i = 0; i < arraylength; i++) {
            dynamicArray[i] = staticArray[i];
        }
        System.out.println (Arrays.toString ( dynamicArray ) );

    }

}
