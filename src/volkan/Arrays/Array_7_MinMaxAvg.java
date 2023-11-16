package volkan.Arrays;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt. Die Methoden sollen jeweils
den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.

Erstelle zwei weitere Funktionen, die den Index des Minimums und des Maximums zurückgeben.
 */

import java.util.Random;
import java.util.function.Function;


    public class Array_7_MinMaxAvg {

        public static void Array_7_MinMaxAvg(int[] dizi) {
            for (int i = 0; i < dizi.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < dizi.length; j++) {
                    if (dizi[j] < dizi[minIndex]) {
                        minIndex = j;
                    }
                }

                // En küçük öğeyi, en başındaki öğeyle değiştir
                int temp = dizi[i];
                dizi[i] = dizi[minIndex];
                dizi[minIndex] = temp;
            }
        }

        public static void main(String[] args) {
            int[] dizi = {10, 5, 2, 7, 9, 8, 6, 3, 4};

            Array_7_MinMaxAvg(dizi);

            for (int i = 0; i < dizi.length; i++) {
                System.out.println(dizi[i]);
            }
        }
    }
