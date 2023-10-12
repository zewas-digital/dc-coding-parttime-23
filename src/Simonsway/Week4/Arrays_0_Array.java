package Simonsway.Week4;

import java.util.Arrays;

public class Arrays_0_Array {

    public static void main(String[] args) {
        int length = 9;
        int[] numbers = new int[length];
        String[] names = new String[length];

        numbers[0] = length;
        numbers[1] = 4;
        names[7] = "Hugo";

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(names[7]);
        System.out.println("länge von names: "+ names.length);
    }
}
