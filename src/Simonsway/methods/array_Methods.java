package Simonsway.methods;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class array_Methods {
    public static void main(String[] args) {


    }

    public static int[] createNewRandomArray(int arraySize, int minRandomValue, int maxRandomValue){

        int [] newArray = new int[arraySize];

        Random random = new Random();

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt(minRandomValue, maxRandomValue);
        }

        return newArray;
    }


    public static int[][] createTwoDimensionRandomArrayWithUserInput(int minRandomValue, int maxRandomValue){

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bitte göße vom ersten Array");
        int userInputRows = scan.nextInt();
        System.out.println("Bitte göße vom zweiten Array");
        int userInputColumns = scan.nextInt();
        System.out.println();
        System.out.println("2 Dimensionales Array");
        System.out.println();

        int[][] array = new int[userInputRows][userInputColumns];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(minRandomValue, maxRandomValue);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        return array;
    }

}
