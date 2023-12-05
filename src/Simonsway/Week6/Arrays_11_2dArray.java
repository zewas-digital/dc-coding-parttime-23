package Simonsway.Week6;

/*
Aufgabe: 2D-Array

Erstelle ein Zwei-Dimension-Array int[][] und befülle es mit Zufallszahlen von 0 bis 100.
Frage dazu die Längen der Dimensionen vom Anwender ab.
Gib die Summe pro Zeile oder pro Spalte aus.
 */

import Simonsway.Methods.Array_Methods;


public class Arrays_11_2dArray {

    public static void main(String[] args) {

        int[][] array = Array_Methods.createTwoDimensionRandomArrayWithUserInput(10, 99);

        // int lines = 5; könnte das auch unten verwenden anstatt array
        // int columns = 5;

        int[] columnSum = new int[array.length];

        for (int column = 0; column < array.length; column++) { // Array befüllen solange wie array.length
            for (int line = 0; line < array.length; line++) {
                columnSum[column] += array[line][column]; // Die Werte in der aktuellen Spalte addieren
            }
        }

        System.out.println("Column Sum:"); // Array ausgeben
        for (int column = 0; column < columnSum.length; column++) {
            System.out.println("Spalte " + column + ": " + columnSum[column]);
        }
    }
}
