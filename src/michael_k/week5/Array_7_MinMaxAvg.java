package michael_k.week5;

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

        int[] array = new int[5];
        Random randomnumber = new Random();
        int length = array.length;
        int minIndex =0;
        int maxIndex =0;


        for (int i = 0; i <length; i++) {
            int value =randomnumber.nextInt ( 100 );
            array[i] = value +1;
        }


        double average = average ( array );
        int min = min ( array );
        int max = max ( array );

        for (int i = 0; i < length; i++) {
            if(min == array[i]){ minIndex =i+1; break;}
        }

        for (int i = 0; i < length; i++) {
            if(max == array[i]){ maxIndex =i+1; break;}
        }



        System.out.println ( Arrays.toString ( array) );
        System.out.println (average );
        System.out.println ("MIN: "+min );
        System.out.println ("Min Index: "+ minIndex );
        System.out.println ("MAX: "+max );
        System.out.println ("Max Index: "+ maxIndex );
    }


    static double average(int[] array) {
        int length = array.length;
        double average =0;
        double summe=0;

        for (int i = 0; i < length; i++) {
            summe = summe + array[i];
        }

        average = summe / length;

        return average;
    }
    static int min(int[] array){

        int length = array.length;
        int min = array[0];

        for (int i = 0; i <length; i++) {

            if (array[i] < min) {
                min = array[i];

            }
        }
        return min;
    }

    static int max(int[] array){

        int length = array.length;
        int max = array[0];

        for (int i = 0; i <length; i++) {

            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }
}