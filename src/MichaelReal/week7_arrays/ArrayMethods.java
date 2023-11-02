package MichaelReal.week7_arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
    public static Random rand = new Random();

    public static void main(String[] args) {
        int[][] randNumbers = createRandom2dArray(5,6);

        print2dArray(randNumbers);
    }

    public static int[][] createRandom2dArray(int xLength, int yLength) {
        int[][] numbers = new int[xLength][yLength];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rand.nextInt(100);
            }
        }

        return numbers;
    }

    public static void print2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
