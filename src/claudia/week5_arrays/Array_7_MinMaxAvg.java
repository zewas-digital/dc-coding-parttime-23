package claudia.week5_arrays;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt. Die Methoden sollen jeweils
den Wert zurückgeben (nicht Ausgeben). In der main Methode rufe die Methoden mit den Zufallszahlen auf und gib diese aus.

Erstelle zwei weitere Funktionen, die den Index des Minimums und des Maximums zurückgeben.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_7_MinMaxAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Wie lang? ");
        int[] randomArray = new int[scanner.nextInt()];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(1, 101);
        }
        System.out.println("Array = " + Arrays.toString(randomArray));
        System.out.println("Kleinstes Element = " + minArray(randomArray));
        System.out.println("Kleinstes Element an Position " + minArrayIndex(randomArray));
        System.out.println("Größtes Element = " + maxArray(randomArray));
        System.out.println("Größtes Element an Position " + maxArrayIndex(randomArray));
        System.out.println("Durchschnittsgröße der Einträge = " + averageArray(randomArray));
    }

    public static int minArray(int [] vector){
        int minimum = 101;
        for (int elem : vector){
            if (elem < minimum) minimum = elem;
        }
        return minimum;
    }
    public static int minArrayIndex(int[] vector){
        int index = -1;
        int minimum = 101;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < minimum){
                minimum = vector[i];
                index = i;
            }
        }
        return index;
    }
    public static int maxArray(int [] vector){
        int maximum = 0;
        for (int elem : vector){
            if (elem > maximum) maximum = elem;
        }
        return maximum;
    }
    public static int maxArrayIndex(int[] vector){
        int index = -1;
        int maximum = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > maximum){
                maximum = vector[i];
                index = i;
            }
        }
        return index;
    }
    public static double averageArray(int [] vector){
        double sum = 0;
        for (int elem : vector){
            sum+=elem;
        }
        return sum/vector.length;
    }

}
