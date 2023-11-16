package Matthias.week10_arrays;

/*
Aufgabe: Bubblesort mit Strings
Verwende den gegebenen String[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.
Sortiere zuerst nach der Länge der Namen, dann nach dem Alphabet.
Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
Der Aufruf und die Ausgabe erfolgt in der main Methode.

Sortiere die Namen nach Länge aufsteigend (Ascending)
Sortiere die Namen nach Länge absteigend (Descending)
Sortiere die Namen lexikographisch aufsteigend (Ascending)
Sortiere die Namen lexikographisch absteigend (Descending)

Tip.: Strings können mit der Instanz Methode compareTo der String Klasse verglichen werden: "a".compareTo("b")
 */

import Matthias.week5_arrays.Array_8_Bubblesort;

import java.util.Arrays;

public class Strings_1_BubbleSort {
    public static void bubbleSort1( String[] arr ) {
        // 1. Bubblephase Prüfen der Arrays 9,4 - 4,9
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].compareTo( arr[j+1] ) < 0) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.println(i + "+"+ Arrays.toString(arr));
        }
    }
    public static void bubbleSort2( String[] arr ) {
        // 1. Bubblephase Prüfen der Arrays 9,4 - 4,9
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].compareTo( arr[j+1] ) > 0) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.println(i + "+"+ Arrays.toString(arr));
        }
    }
    public static void bubbleSort3( String[] arr ) {
        // 1. Bubblephase Prüfen der Arrays 9,4 - 4,9
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].length() > arr[j+1].length()) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.println(i + "+"+ Arrays.toString(arr));
        }
    }
    public static void bubbleSort4( String[] arr ) {
        // 1. Bubblephase Prüfen der Arrays 9,4 - 4,9
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].length() < arr[j+1].length()) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.println(i + "+"+ Arrays.toString(arr));
        }
    }
    static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static String[] names = new String[]{
            "Max", "Anna", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
    };
    public static void main( String[] args ) {
        System.out.println( "BubbleSort Alphabetisch Vorwärts" );
        bubbleSort1( names );
        System.out.println( "BubbleSort Alphabetisch Rückwärts" );
        bubbleSort2( names );
        System.out.println( "BubbleSort (Ascending)" );
        bubbleSort3( names );
        System.out.println( "BubbleSort (Descending)" );
        bubbleSort4( names );
    }



}