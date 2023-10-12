package michael_k.week5;

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

        int[] array = new int[5];
        //int[] arraysort = new int[];
        Random randomnumber = new Random();
        int length = array.length;


        for (int i = 0; i <length; i++) {
            int value =randomnumber.nextInt ( 100 );
            array[i] = value +1;
        }

        int[] arrayminmax = bubbleSortminmax ( array, length);
        int[] arraymaxmin = bubbleSortmaxmin ( array, length);

        System.out.println ( Arrays.toString ( array) );
        System.out.println (Arrays.toString ( arrayminmax ) );
        System.out.println (Arrays.toString ( arraymaxmin ) );


    }

    static int[] bubbleSortminmax(int[] array, int length){

        int[] arraySort= new int[length];
        int x;
        int y;
        int counter=0;

        for (int i = 0; i < length; i++) {
            arraySort[i] = array[i];
        }

        while(counter != length-1){
            counter =0;
            for (int i = 0; i <length-1 ; i++) {

                if (arraySort[i] > arraySort[i+1]){
                    x = arraySort[i];
                    y = arraySort[i+1];

                    arraySort[i] = y;
                    arraySort[i+1] = x;
                }else{ counter++;}
            }

        }

        return arraySort;
    }

    static int[] bubbleSortmaxmin(int[] array, int length){

        int[] arraySort= new int[length];
        int x;
        int y;
        int counter=0;

        for (int i = 0; i < length; i++) {
            arraySort[i] = array[i];
        }

        while(counter != length-1){
            counter =0;
            for (int i = 0; i <length-1 ; i++) {

                if (arraySort[i] < arraySort[i+1]){
                    x = arraySort[i];
                    y = arraySort[i+1];

                    arraySort[i] = y;
                    arraySort[i+1] = x;
                }else{ counter++;}
            }

        }

        return arraySort;
    }


}