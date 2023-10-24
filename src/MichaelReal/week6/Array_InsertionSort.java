package MichaelReal.week6;

public class Array_InsertionSort {
        public static void main(String[] args) {
            int[] arr = Methods.createRandomArray(10);
            System.out.println("Ursprüngliches Array:");
            printArray(arr);
            insertionSort(arr);
            System.out.println("Sortiertes Array:");
            printArray(arr);
        }

        public static void insertionSort(int[] arr) {
            int n = arr.length;

            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                }

                arr[j + 1] = key;

                System.out.println("Durchlauf " + i + ":");
                printArray(arr);
            }
        }

        public static void printArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


