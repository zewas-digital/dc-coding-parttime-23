package saifedine.week04;

import java.util.Arrays;

public class Arrays_0_Array {

    public static void main(String[] args) {
        int length = 8;
        int[] numbers = new int[length];
        String[] names = new String[length];

        // array-felder befüllen
        numbers[0] = length;
        numbers[3] = 7;
        names[7] = "Hugo";

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(names[7]);
        System.out.println("länge von names: "+ names.length);

        // statisches array generieren
        int[] zahlen = {10, 50, 60, 80, 90, 100};

        // array mit fori schleife
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println("i: " + i + " = " + zahlen[i]);
        }

        // array mit for-each schleife
        for (int value : zahlen) {
            System.out.println(value);
        }


        // Fallbeispiel: package saifedine.week04.example37; Lustige Sieben


        int [] left = {2,4,6,9,11};
        int [] right = {3,5,8,10,12};

        int bet = 8;
        int dice = 3;
        int bid = 10;
        int win = 0;

        if (bet != dice) {

            for (int i = 0; i < left.length; i++) {
                if (bet != left[i]) {
                    if (dice != left[i]){
                        win = bid * (-1);
                        System.out.println("Ausgabe 1: " + win);
                    }
                }

                if (bet == left[i]){
                    if (dice == left[i]){
                        win = bid;
                        System.out.println("Ausgabe 3: " + win);
                    }
                }
            }

            for (int i = 0; i < right.length; i++) {
                if (bet != right[i]){
                    if (dice != right[i]){
                        win = bid * (-1);
                        System.out.println("Ausgabe 2: " + win);
                    }
                }
                if (bet == right[i]) {
                    if (dice == right[i]){
                        win = bid;
                        System.out.println("Ausgabe 4: " + win);
                    }
                }
            }
        }
        System.out.println("Ausgabe Ende: " + win);
    }
}