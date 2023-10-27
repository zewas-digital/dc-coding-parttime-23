package judith.week7_arrays;

/*
Aufgabe: 2D-Array

Erstelle ein Zwei-Dimension-Array int[][] und befülle es mit Zufallszahlen von 0 bis 100.
Frage dazu die Längen der Dimensionen vom Anwender ab.
Gib die Summe pro Zeile oder pro Spalte aus.
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays_11_2dArray {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] numbers = new int [3][5];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5 ; j++) {
                numbers [i][j] = random.nextInt(1,100);
                System.out.println("i ");
                System.out.println(Arrays.toString(numbers[i]));
                System.out.println("j ");
                //hier kann nicht  System.out.println(Arrays.toString(numbers[j]));ausgegeben werden da
                // es sich bei j jetzt um einen Wert und ein Array handelt
                System.out.println((numbers[i][j]));

            }

        }
       // System.out.println(Arrays.toString(numbers[]); ???????????????????????????


    }



}