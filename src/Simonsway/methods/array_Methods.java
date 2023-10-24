package Simonsway.methods;

import java.util.Random;

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

}
