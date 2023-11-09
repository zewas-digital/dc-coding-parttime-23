package Alpi.week5;

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


        int[] zahlen = new int[10];


        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = random.nextInt(100) + 1;

        }


        LSDRadixSor(zahlen);
        System.out.println("Sortiert aufsteigend: " + Arrays.toString(zahlen));

        lsdRadixSort(zahlen);
        System.out.println("Radix LSD Sort: " + Arrays.toString(zahlen));
    }

        // Bubblesort-Sortierung aufsteigend ausgeben
        public static void LSDRadixSor(int[] zahlen){
            for (int i = 0; i < zahlen.length - 1; i++) {
                for (int j = 0; j < zahlen.length - i - 1; j++) {
                    if (zahlen[j] > zahlen[j + 1]) {
                        int temp = zahlen[j];
                        zahlen[j] = zahlen[j + 1];
                        zahlen[j + 1] = temp;
                    }
                }
            }
        }

    public static void lsdRadixSort(int[] array) {
        int radix = 10; // Basis des Zahlensystems
        int maxDigits = Integer.toString(array[4]).length(); // Maximale Anzahl an Ziffern

        for (int i = 0; i < maxDigits; i++) {
            // Initialisiere die Körbe
            int[] Korb = new int[radix];

            // Verteile die Elemente in die Körbe
            for (int j = 0; j < array.length; j++) {
                int digit = (array[j] / radix) % radix;
                Korb[digit]++;
            }

            // Fülle das Array mit den Elementen aus den Korb
            int index = 0;
            for (int j = 0; j < radix; j++) {
                for (int k = 0; k < Korb[j]; k++) {
                    array[index++] = j;
                }
            }
        }
    }

}

