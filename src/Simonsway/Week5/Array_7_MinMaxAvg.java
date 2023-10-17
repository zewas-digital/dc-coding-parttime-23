package Simonsway.Week5;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt. Die Methoden sollen jeweils
den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.

Erstelle zwei weitere Funktionen, die den Index des Minimums und des Maximums zurückgeben.
 */

import java.util.Random;

public class Array_7_MinMaxAvg {
    public static void main(String[] args) {
        // create array

        // call method getMinimum
        // getMinimum(array1);
        // getMinimum(array2);
        // system out

        // call method getMaximum

        // call


        smallestNumberSearch();
    }

    public static void smallestNumberSearch(){
        int arraySize = 10;
        int[] numbers = new int[arraySize]; // Array für Zufallszahlen erstellen

        Random random = new Random(); // Radom starten

        for (int i = 0; i < arraySize; i++) {         // Zufallszahlen generieren und in das Array speichern
            numbers[i] = random.nextInt(100); // Zufallszahlen zwischen 0 und 100 !!! Erklärung i ist doch keine Position in Array?
        }

        int smallestNumber = numbers[0]; // Annahme: Die erste Zahl ist die kleinste // Die kleinste Zahl im Array finden

        for (int i = 1; i < arraySize; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
            }
        }
        // Die kleinste Zahl ausgeben
        System.out.println("Die kleinste Zahl im Array ist: " + smallestNumber);
    }

}
