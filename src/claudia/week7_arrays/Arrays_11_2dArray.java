package claudia.week7_arrays;

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
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Erstelle 2-D Array; wieviele Zeilen? ");
        int rows = sc.nextInt();
        System.out.print("Wieviele Spalten? ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(0, 101);
            }
        }
        System.out.println("Gesamtes Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Summe zeilenweise: ");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            System.out.print("Zeile " + i + ": ");
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Summe: " + sum);
        }

        System.out.println("Summe spaltenweise: ");
        for (int j = 0; j < columns; j++) {
            int sum = 0;
            System.out.print("Spalte " + j + ": ");
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Summe: " + sum);
        }

    }
}