package Simonsway.Week5;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt. Die Methoden sollen jeweils
den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.

Erstelle zwei weitere Funktionen, die den Index des Minimums und des Maximums zurückgeben.
 */

import java.util.Arrays;
import java.util.Random;

public class Array_7_MinMaxAvg {
    public static void main(String[] args) {

        int arraySize = 10;                                       // Größe des Arrays
        int[] array = new int[arraySize];                         // Array für Zufallszahlen erstellen

        Random random = new Random();                             // Radom starten

        for (int i = 0; i < arraySize; i++) {                    // Zufallszahlen generieren und in das Array speichern
            array[i] = random.nextInt(1, 100);
            System.out.println(Arrays.toString(array));           // Zufallszahlen zwischen 1 und 100 !!! Erklärung i ist doch keine Position in Array?

        }

        int min = minimumNumber(array);
        System.out.println("Min " + min);

        int max = maximumNumber(array);
        System.out.println("Max " + max);

        int average = averageNumber(array);
        System.out.println("Average " + average);

        int maxIndex = maximumNumberIndex(array);
        System.out.println("Maximum Index " + maxIndex);

    }

    public static int minimumNumber(int[] array){
        int min = array[0]; // Mit der Null mach ich einen Zugriff auf die Position 0 im Array und schauen welche Zufallszahl auf Postion null steht und übergebe diese an die Varaible min..


        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) { // Ist wieder ein Zugriff auf das Array auf Position 1 in dem fall bei ersten Durchlauf das könnte dann irgendeine Random Zahl sein.
                min = array[i]; // Wenn if true dann überschreibt er die min mit der zahl die kleiner ist als min.
            }
        }
        return min;
    }


    public static int maximumNumber(int[] array){
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static int averageNumber(int[] array){
        int sum = 0;

        for (int i : array){
            sum = sum + i;
        }

        return sum / array.length;
    }

    public static int maximumNumberIndex(int[] array){
        int max = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }

        }
        return index;
    }

}
