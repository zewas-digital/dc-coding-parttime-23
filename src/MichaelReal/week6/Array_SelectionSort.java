package MichaelReal.week6;

public class Array_SelectionSort {
        public static void main(String[] args) {
            int[] arr = Methods.createRandomArray(10);
            selectionSortAndPrint(arr);

            System.out.println("Sortiertes Array:");
            printArray(arr);
        }

        public static void selectionSortAndPrint(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                // Finde das Minimum im unsortierten Teil des Arrays
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                // Tausche das gefundene Minimum mit dem aktuellen Element (i)
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;

                // Gib den aktuellen Durchlauf aus
                System.out.print("Durchlauf " + (i + 1) + ": ");
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


