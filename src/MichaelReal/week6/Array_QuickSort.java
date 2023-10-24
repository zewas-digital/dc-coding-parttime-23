package MichaelReal.week6;

public class Array_QuickSort {
        public static void main(String[] args) {
            int[] arr = Methods.createRandomArray(10);
            System.out.println("Unsortiertes Array:");
            printArray(arr);
            quickSort(arr, 0, arr.length - 1);
            System.out.println("\nSortiertes Array:");
            printArray(arr);
        }

        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int partitionIndex = partition(arr, low, high);

                System.out.println("Durchlauf:");
                printArray(arr);

                quickSort(arr, low, partitionIndex - 1);
                quickSort(arr, partitionIndex + 1, high);
            }
        }

        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] <= pivot) {
                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }

        public static void printArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


