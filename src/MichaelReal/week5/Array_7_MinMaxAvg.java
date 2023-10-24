package MichaelReal.week5;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt. Die Methoden sollen jeweils
den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.

Erstelle zwei weitere Funktionen, die den Index des Minimums und des Maximums zurückgeben.
 */

import java.util.Random;

public class Array_7_MinMaxAvg {
    public static void main(String[] args) {
        int[] randomArray = new int[20];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100) + 1;
        }

        for (int num : randomArray) {
            System.out.print(num + " ");
        }

        System.out.println();

        int minimum = findMinimum(randomArray);
        int maximum = findMaximum(randomArray);
        double average = calculateAverage(randomArray);


                System.out.println("Minimum: " + minimum);
                System.out.println("Maximum: " + maximum);
                System.out.println("Durchschnitt: " + average);

                // Index des Minimums und des Maximums finden und ausgeben
                int indexOfMinimum = findIndexOfMinimum(randomArray);
                int indexOfMaximum = findIndexOfMaximum(randomArray);

                System.out.println("Index des Minimums: " + indexOfMinimum);
                System.out.println("Index des Maximums: " + indexOfMaximum);
            }

            // Methode, um das Minimum im Array zu finden
            public static int findMinimum(int[] array) {
                int min = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                return min;
            }

            // Methode, um das Maximum im Array zu finden
            public static int findMaximum(int[] array) {
                int max = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                return max;
            }

            // Methode, um den Durchschnitt im Array zu berechnen
            public static double calculateAverage(int[] array) {
                int sum = 0;
                for (int value : array) {
                    sum += value;
                }
                return (double) sum / array.length;
            }

            // Methode, um den Index des Minimums im Array zu finden
            public static int findIndexOfMinimum(int[] array) {
                int min = array[0];
                int minIndex = 0;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < min) {
                        min = array[i];
                        minIndex = i;
                    }
                }
                return minIndex;
            }

            // Methode, um den Index des Maximums im Array zu finden
            public static int findIndexOfMaximum(int[] array) {
                int max = array[0];
                int maxIndex = 0;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                        maxIndex = i;
                    }
                }
                return maxIndex;
            }
        }



