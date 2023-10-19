package MichaelReal.week6;

public class Arrays_9_Bonus_2 {
        public static void main(String[] args) {
            int[] arr = Methods.createRandomArray(10);

            System.out.println("Unsortiertes Array:");
            printArray(arr);

            gnomeSort(arr);

            System.out.println("Sortiertes Array:");
            printArray(arr);
        }

        public static void gnomeSort(int[] arr) {
            int index = 0;
            int n = arr.length;

            while (index < n) {
                if (index == 0) {
                    index++;
                }
                if (arr[index] >= arr[index - 1]) {
                    index++;
                } else {
                    int temp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = temp;
                    index--;
                }

                System.out.println("Durchlauf " + index + ":");
                printArray(arr);
            }
        }

        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


