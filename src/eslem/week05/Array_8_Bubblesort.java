package eslem.week05;

/*
Erstelle ein int[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode.

    Sortiere der Größe nach aufsteigend (Ascending)
    Sortiere der Größe nach absteigend (Descending)

Erklärung Bubblesort: https://www.youtube.com/watch?v=qtXb0QnOceY
 */
import java.util.Arrays;
import java.util.Random;

public class Array_8_Bubblesort {
    public static void main(String[] args) {
        Random randomnumber = new Random();

        int[] array = new int [4];
        int length = array.length;

        for (int i = 0; i < length; i++) {
            int value = randomnumber.nextInt(10);
            array[i] = value;
        }
        //int[] maxTomin = maxTomin (array);
        //int[] mintomax = mintomax (array);


        System.out.println(Arrays.toString(array));
        //System.out.println(Arrays.toString(maxTomin));
        //System.out.println(Arrays.toString(mintomax));
    }

    //static int[] maxTomin(int[] array, int length){
        //int[] sortedArray = new int[length];

    }
//}
