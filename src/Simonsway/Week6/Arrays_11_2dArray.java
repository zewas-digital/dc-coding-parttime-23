package Simonsway.Week6;

/*
Aufgabe: 2D-Array

Erstelle ein Zwei-Dimension-Array int[][] und befülle es mit Zufallszahlen von 0 bis 100.
Frage dazu die Längen der Dimensionen vom Anwender ab.
Gib die Summe pro Zeile oder pro Spalte aus.
 */

import Simonsway.methods.array_Methods;

import java.util.Arrays;


public class Arrays_11_2dArray {

    public static void main(String[] args) {

        int[][] array = array_Methods.createTwoDimensionRandomArrayWithUserInput(10, 99);

        // int lines = 5; könnte das auch unten verwenden anstatt array
        // int columns = 5;

        int[] columnSum = new int[array.length];

        for (int j = 0; j < array.length; j++) { // Array befüllen
            for (int i = 0; i < array.length; i++) {
                columnSum[j] += array[i][j]; // Die Werte in der aktuellen Spalte addieren
            }
        }

        System.out.println("Spaltensummen:"); // Array ausgeben
        for (int j = 0; j < columnSum.length; j++) {
            System.out.println("Spalte " + j + ": " + columnSum[j]);
        }
    }
}
