package MichaelReal.week5;

/*
Erstelle ein int[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus. Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden. Der Aufruf und die Ausgabe erfolgt in der main Methode.

    Sortiere der Größe nach aufsteigend (Ascending)
    Sortiere der Größe nach absteigend (Descending)

Erklärung Bubblesort: https://www.youtube.com/watch?v=qtXb0QnOceY
 */

import MichaelReal.week6.Methods;

public class Array_8_Bubblesort {
        public static void main(String[] args) {
            int[] arr = Methods.createRandomArray(5);
            int[] arro = Methods.createRandomArray(5);

            System.out.println("Unsortiertes Array:");
            printArray(arr);
            System.out.println("Unsortiertes Array:");
            printArrayShowFull(arro);

            bubbleSortAscending(arr);
            System.out.println("\nAufsteigend sortiertes Array:");
            printArray(arr);
            bubbleSortAscendingShowFull(arro);
            System.out.println("\nAufsteigend sortiertes Array:");
            printArrayShowFull(arro);

            bubbleSortDescending(arr);
            System.out.println("\nAbsteigend sortiertes Array:");
            printArray(arr);
            bubbleSortDescendingShowFull(arro);
            System.out.println("\nAbsteigend sortiertes Array:");
            printArrayShowFull(arro);
        }

        // Bubblesort-Algorithmus für aufsteigende Sortierung
        public static void bubbleSortAscending(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        // Bubblesort-Algorithmus für absteigende Sortierung
        public static void bubbleSortDescending(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        // Hilfsmethode zum Ausgeben des Arrays
        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }


        //------------------------------------------------------------------------

    public static void bubbleSortAscendingShowFull(int[] arro) {
        int n = arro.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arro[j] > arro[j + 1]) {
                    int temp = arro[j];
                    arro[j] = arro[j + 1];
                    arro[j + 1] = temp;
                    swapped = true;
                }
                printArray(arro);
            }
            if (!swapped) {
                // Array bereits sortiert
                break;
            }
        }
    }

    public static void bubbleSortDescendingShowFull(int[] arro) {
        int n = arro.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arro[j] < arro[j + 1]) {
                    int temp = arro[j];
                    arro[j] = arro[j + 1];
                    arro[j + 1] = temp;
                    swapped = true;
                }
                printArray(arro);
            }
            if (!swapped) {
                // Array bereits sortiert
                break;
            }
        }
    }

    public static void printArrayShowFull(int[] arro) {
        for (int num : arro) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


