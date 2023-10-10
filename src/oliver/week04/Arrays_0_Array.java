package oliver.week04;

import java.util.Arrays;

public class Arrays_0_Array {

    public static void main(String[] args) {
        int length = 8;
        int[] numbers = new int[length];
        String[] names = new String[length];

        numbers[0] = length;
        numbers[3] = 7;
        names[7] = "Hugo";

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(names[7]);
        System.out.println("länge von names: "+ names.length);

        // array mit for-each schleife
        int[] values = {10, 50, 60, 80, 90, 100};

        for (int i = 0; i < values.length; i++) {
            System.out.println("i: " + i + " = " + values[i] + " ");
        }

        for (int value : values) {
            System.out.println(value + " ");
        }
    }
}
