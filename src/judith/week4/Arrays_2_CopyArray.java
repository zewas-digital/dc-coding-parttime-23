package judith.week4;

/*
Aufgabe: Kopie
Erstelle eine Funktion, die aus dem Parameter-Array eine Kopie erstellt.

public static int[] makeACopy(int[] original){
}
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_2_CopyArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte geben sie die gewünschte Dimension ein");
        int eingabe = scan.nextInt();

        int[] dimension = new int[eingabe];


        for (int i = 0; i < eingabe; i++) {
            dimension [i] = i + 1;
        }
        System.out.println(Arrays.toString(dimension));


        int[] copy = Arrays.copyOf(dimension,dimension.length);

        for (int i = 0; i< dimension.length;i++) {
            System.out.println("copy "  + copy[i]);
        }

    }

}
