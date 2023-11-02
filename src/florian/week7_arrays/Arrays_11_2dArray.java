package florian.week7_arrays;

/*
Aufgabe: 2D-Array

Erstelle ein Zwei-Dimension-Array int[][] und befülle es mit Zufallszahlen von 0 bis 100.
Frage dazu die Längen der Dimensionen vom Anwender ab.
Gib die Summe pro Zeile oder pro Spalte aus.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_11_2dArray {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner userinput = new Scanner(System.in);
        System.out.println("Gib die Länge des Arrays ein: ");
        int length = userinput.nextInt();
        int [][] array = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                array [i][j] = random.nextInt(0,101);
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }




    }






}