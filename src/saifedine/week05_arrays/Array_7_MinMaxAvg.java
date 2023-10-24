package saifedine.week05_arrays;

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

        int[] numbers = getZufallsZahlen();
        int minimum = calculateMinimum(numbers);
        int maximum = calculateMaximum(numbers);
        double average = calculateAverage(numbers);


    }
    public static int[] getZufallsZahlen(){

        int arrayLength = 10;

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {

            Random zufallsZahl = new Random();
            int value = zufallsZahl.nextInt(1, 100);

            numbers[i] = value;
        }
        System.out.println(Arrays.toString(numbers));

        return numbers;
    }
    static int calculateMinimum(int[] numbers){

        int arrayLength = 10;
        int minimum = numbers[0];
        int min = 0;

        for (int i = 1; i < arrayLength; i++) {

            System.out.println(numbers[i] + " < " + minimum);

            if (numbers[i] < minimum){

                 minimum = numbers[i];

                 min = i;
            }

        }
        System.out.println("Minimum " + minimum);
        System.out.println("Index min: " + min);
        return minimum;
    }

    static int calculateMaximum(int[] numbers){

        int arrayLength = 10;
        int maximum = numbers[0];
        int max = 0;

        for (int i = 1; i < arrayLength; i++) {

            System.out.println( numbers[i] + " > " + maximum);

            if (numbers[i] > maximum){

                maximum = numbers[i];

                max = i;
            }

        }
        System.out.println("Maximum: " + maximum);
        System.out.println("Index max: " + max);
        return maximum;
    }

    static double calculateAverage(int [] numbers){

        int arrayLength = 10;
        double sum = 0;
        double avarage = 0;

        for (int i = 0; i < arrayLength; i++) {

            sum = sum + numbers[i];
            avarage = sum / arrayLength;

        }

        System.out.println("Avarage: " + avarage);
        return avarage;

    }


}
