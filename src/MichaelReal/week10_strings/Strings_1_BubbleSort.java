package MichaelReal.week10_strings;

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

import MichaelReal.week5.Array_8_Bubblesort;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;

public class Strings_1_BubbleSort {

    public static void main(String[] args) {

        String[] names = new String[]{
                "Max", "Anna", "Paula", "Peter", "Julia", "Moritz", "Sarah", "Lukas", "Lisa", "Paul"
        };

        System.out.println("Original");
        printArray(names);

        bubbleSortByLengthAscending(names.clone());
        bubbleSortByLengthDescending(names.clone());
        bubbleSortLexicographicallyAscending(names.clone());
        bubbleSortLexicographicallyDescending(names.clone());
    }
        public static void bubbleSortByLengthAscending(String[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j].length() > array[j + 1].length()) {
                        //Swap
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            System.out.println("\nSortiert nach Länge aufsteigend");
            printArray(array);
        }

        public static void bubbleSortByLengthDescending(String[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j].length() < array[j + 1].length()) {
                        // Swap
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.println("\nSortiert nach länge absteigend");
            printArray(array);

        }
        public static void bubbleSortLexicographicallyAscending(String[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Swap
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSortiert alphabetisch aufsteigend");
        printArray(array);
    }

        public static void bubbleSortLexicographicallyDescending(String[] array) {
            int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j].compareTo(array[j + 1]) < 0) {
                        // Swap
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }

            System.out.println("\nSortiert alphabetisch absteigend");
            printArray(array);
        }

        public static void printArray(String[] array) {
            for (String name : array) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }