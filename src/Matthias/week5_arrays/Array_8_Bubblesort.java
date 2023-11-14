package Matthias.week5_arrays;

/*
Erstelle ein int[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode.

    Sortiere der Größe nach aufsteigend (Ascending)
    Sortiere der Größe nach absteigend (Descending)

Erklärung Bubblesort: https://www.youtube.com/watch?v=qtXb0QnOceY
 */

import Matthias.week6_arrays.Methods;

import java.util.Arrays;

public class Array_8_Bubblesort {

    public static void main( String[] args) {

        int[] numbers = Methods.createRandomArray(10);
        System.out.println("Random Array 1:");
        System.out.println( Arrays.toString( numbers ) + ";");
        System.out.println("initial array: "+ Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("sorted array: "+ Arrays.toString(numbers));


        // Matthias BubbleSort:
        System.out.println("Random Array 2:");
        int[] number1= Methods.createRandomArray(10);
        System.out.println( "Array mit 10 Random Zahlen:" + Arrays.toString( number1  ) + ";");
        bubbleSort1( number1 );
        System.out.println("Sortierter Array:"+ Arrays.toString(number1));
        System.out.println("Ende des Sortiervorgangs!");
    }


    //Methode 1: Oliver
    static void bubbleSort(int[] arr){
        System.out.println("+ bubble sort ------");

        // x Anzahl Durchläufe
        for (int i = 0; i < arr.length; i++) {

            // für jeden Durchlauf alle Spalten vergleichen
            for (int j = 0; j < arr.length - 1; j++) {

                // wenn größer dann austauschen
                if (arr[j] > arr[j + 1]) {
                    // tauschen
                }
                System.out.println(Arrays.toString(arr));
                // nach durchlauf kontrollausgabe array
            }

            System.out.println("+ "+ Arrays.toString(arr));
        }
        System.out.println("+ end bubble sort ------");
    }
    //Methode 2: Matthias
    static void bubbleSort1(int[] arr) {
        // 1. Bubblephase Prüfen der Arrays 9,4 - 4,9
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}