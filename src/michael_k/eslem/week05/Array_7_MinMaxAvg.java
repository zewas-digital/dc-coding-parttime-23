package michael_k.eslem.week05;

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
        Random random = new Random();

        int [] number = new int[10];
        int length = number.length;

        int min = 0;
        int max = 0;

        for (int i = 0; i <length; i++) {
            int value = random.nextInt(100);
            number[i]= value;
        }

        double average = average(number);
        int maximum = maximum (number);
        int minimum = minimum (number);


        for (int i = 0; i < length; i++) {
            if (maximum == number[i]) { max = i+1; break;}
        }
        for (int i = 0; i < length; i++) {
            if (minimum == number[i]) { min = i+1; break;}
        }
        System.out.println(Arrays.toString(number));
        System.out.println(average);
        System.out.println("max:" + max);
        System.out.println("maximum:" + maximum);
        System.out.println("min:" + min);
        System.out.println("minimum:" + minimum);

    }

    static double average(int[] number){
        double average = 0;
        double sum = 0;
        int length = number.length;

        for (int i = 0; i < length; i++) {
            sum = sum + number[i];
        }
        average = sum / length;
        return average;
    }
    static int maximum(int[] number){
        int length = number.length;
        int maximum = number[0];

        for (int i = 0; i < length ; i++) {
            if (number[i] > maximum) {
                maximum = number[i];
            }
        }
        return maximum;
    }
    static int minimum(int[] number) {
        int length = number.length;
        int minimum = number[0];

        for (int i = 0; i < length ; i++) {
            if (number[i] < minimum) {
                minimum = number[i];
            }
        }
        return minimum;
    }
}
