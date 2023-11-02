package claudia.week7_arrays;

import java.util.Arrays;

public class Arrays_10_static2d {
    public static void main(String[] args) {
        int[][] numbers = new int [3][5];

        numbers[0][0] = 7;
        numbers[0][1] = 8;
        numbers[0][2] = 3;
        numbers[0][3] = 12;
        numbers[0][4] = 5;

        numbers[1][0] = 5;
        numbers[1][1] = 7;
        numbers[1][2] = 8;
        numbers[1][3] = 22;
        numbers[1][4] = 43;

        numbers[0] = new int[] {1, 2, 3, 4, 5};

        // numbers[2] = eindimensionales Array
        System.out.println(Arrays.toString(numbers[2]));


        int[] reference = numbers[2];
        reference[3] = 99;
        System.out.println(Arrays.toString(reference));

        // numbers[2][3] = wert
        System.out.println(numbers[2][3]);
    }
}
