package Alpi.Arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays_0_Array {


    //Testen von ARRAY Bubblesort
    public static void main(String[] args) {
        Random random = new Random();

        int[] zahlen = new int[10];


        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = random.nextInt(100) + 1;

        }

        bubblesortaufsteigend(zahlen);

        System.out.println("Sortiert aufsteigend: " + Arrays.toString(zahlen));

        bubblesortabsteigend(zahlen);

        System.out.println("Sortiert absteigend: " + Arrays.toString(zahlen));
    }


    public static void bubblesortaufsteigend(int[] zahlen) {
        for (int i = 0; i < zahlen.length - 1; i++) {
            System.out.println("Durchlauf i:" + i);


            for (int j = 0; j < zahlen.length - 1; j++) {


                if (zahlen[j] > zahlen[j + 1]) {

                    int temp = zahlen[j];
                    zahlen[j] = zahlen[j + 1];
                    zahlen[j + 1] = temp;

                }

                System.out.println(Arrays.toString(zahlen));
            }
        }
    }

    public static void bubblesortabsteigend(int[] zahlen) {
        for (int i = 0; i < zahlen.length - 1; i++) {


            for (int j = 0; j < zahlen.length - 1; j++) {

                if (zahlen[j] < zahlen[j + 1]) {
                    int temp = zahlen[j];
                    zahlen[j] = zahlen[j + 1];
                    zahlen[j + 1] = temp;

                }
            }
        }
    }
}
