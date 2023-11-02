package saifedine.week07_arrays;

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

        // Zwei-Dimension-Array --> int[][]
        // Zufallszahlen von 0 bis 100 --> Random
        // Abfrage Dimensionen vom Anwender --> Scanner
        // Summer pro Zeile
        // Summer pro Spalte
        // um ein 2D-Array auszugeben, braucht es zusätzlich

        Scanner Eingabe = new Scanner(System.in);

        System.out.println("Geben Sie die Länge der xDimension: ");
        int xDimension = Eingabe.nextInt();

        System.out.println("Geben Sie die Länge der yDimension: ");
        int yDimension = Eingabe.nextInt();

        int[][] numbers = new int[xDimension][yDimension];

        for (int i = 0; i < xDimension; i++) {
            for (int j = 0; j < yDimension; j++) {
                Random Zufall = new Random();
                numbers[i][j] = Zufall.nextInt(0, 100);
            }
        }

        for (int i = 0; i < xDimension; i++) {
            for (int j = 0; j < yDimension; j++) {
                System.out.println(numbers[i][j]);
            }

        }
        System.out.println(Arrays.toString(numbers));
    }
}