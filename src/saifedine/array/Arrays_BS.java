package saifedine.array;

import java.util.Arrays;

public class Arrays_BS {

    public static void main(String[] args) {

        // 1-Dimensionales Array
        // statisches int Array generieren
        int[] numbers = new int[3];

        numbers[0] = 4;
        numbers[1] = 17;
        numbers[2] = 62;

        System.out.println(Arrays.toString(numbers));

        // Ausgabe mit foreach
        int[] values = {10, 20, 30, 40, 50};

        for (int ausgabe : values) {
            System.out.print(ausgabe + " ");
        }
        System.out.println();

        // Ausgabe mit fori
        for (int i = 0; i <= 4; i++) {
            System.out.println("i: " + i + " = " + values[i]);
        }

        // statisches String Array generieren
        String[] names = new String[3];

        names[0] = "Hugo";
        names[1] = "Bello";
        names[2] = "Anna";

        System.out.println(Arrays.toString(names));
    }
}
