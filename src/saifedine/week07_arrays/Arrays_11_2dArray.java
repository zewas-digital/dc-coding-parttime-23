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
        Random Zufall = new Random();


        System.out.println("Geben Sie die Länge der Spalten: ");
        int Spalten = Eingabe.nextInt();

        System.out.println("Geben Sie die Länge der Zeilen: ");
        int Zeilen = Eingabe.nextInt();

        int[][] numbers = new int[Zeilen][Spalten];

        for (int i = 0; i < Zeilen; i++) {
            for (int j = 0; j < Spalten; j++) {
                numbers[i][j] = Zufall.nextInt(0, 100);
            }
        }

        //Version 1 lt. Oliver
        System.out.println("2D-Array");
        for (int i = 0; i < Zeilen; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }

        /*
        //Version 2 lt Jeremias
        for (int i = 0; i < Zeilen; i++) {
            for (int j = 0; j < Spalten; j++) {
                System.out.print(numbers[i][j] + ", ");
            }
            System.out.println();
        }
        */

        System.out.println("Summe Spalten: ");

        for (int j = 0; j < Spalten; j++) {
            int summeSpalten = 0;
            for (int i = 0; i < Zeilen; i++) {
                summeSpalten = summeSpalten + numbers[i][j];
            }
            System.out.print(summeSpalten + " ");
        }

        System.out.println();
        System.out.println("Summe Zeilen: ");

        for (int i = 0; i < Zeilen; i++) {
            int summeZeilen = 0;
            for (int j = 0; j < Spalten; j++) {
                summeZeilen = summeZeilen + numbers[i][j];
            }
            System.out.print(summeZeilen + " ");
        }
    }
}