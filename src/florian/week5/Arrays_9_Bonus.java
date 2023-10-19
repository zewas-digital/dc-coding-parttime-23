package florian.week5;

/*
Bonusaufgabe: 15 verschiedene Sortieralgorithmen
Implementiere 3 unterschiedliche Algorithmen deiner Wahl auf folgendem Video:

https://www.youtube.com/watch?v=kPRA0W1kECg
Den Pseudo-Code der Algorithmen findest du unter:

https://panthema.net/2013/sound-of-sorting/SoS-CheatSheet.pdf
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays_9_Bonus {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 100);
        }


        int[] copy = makeaCopy(array);

        int[] insert = insertsort(array);
        System.out.println(Arrays.toString(insert));

        int[] gnome = gnomesort(makeaCopy(copy));
        System.out.println(Arrays.toString(gnome));

        int[] quick = quicksort(makeaCopy(copy));
        System.out.println(Arrays.toString(quick));


    }

    static int[] makeaCopy(int[] array) {
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }


    static int[] insertsort(int[] insert) {
        int sort;
        int j;

        for (int i = 0; i < insert.length; i++) {
            sort = insert[i];
            j = i;

            while (j > 0 && insert[j - 1] > sort) {
                insert[j] = insert[j - 1];
                j = j - 1;
            }
            insert[j] = sort;
        }
        return insert;
    }

    static int[] gnomesort(int[] gnome) {
        int sort;

        for (int i = 1; i < gnome.length; ) {
            if (gnome[i - 1] <= gnome[i]) {
                i++;

            } else {
                sort = gnome[i];
                gnome[i] = gnome[i - 1];
                gnome[i - 1] = sort;
                i--;

                if (i == 0) {
                    i = 1;
                }
            }

        }
        return gnome;
    }

    static int[] quicksort(int[] quick) {
        int sort;
        int min = Array_7_MinMaxAvg.minimum(quick);







        return quick;
    }

}
