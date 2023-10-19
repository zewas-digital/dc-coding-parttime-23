package Alpi.Arrays;

/*
Erstelle ein int[] und sortiere es mit einem selbsterstellten Bubblesort Algorithmus und gib es dann aus.
Der Bubblesort Algorithmus soll in einer eigenen Methode implementiert werden.
Der Aufruf und die Ausgabe erfolgt in der main Methode.

    Sortiere der Größe nach aufsteigend (Ascending)
    Sortiere der Größe nach absteigend (Descending)

Erklärung Bubblesort: https://www.youtube.com/watch?v=qtXb0QnOceY
 */
import java.util.Arrays;
import java.util.Random;

public class Array_8_Bubblesort {
    public static void main(String[] args) {
            // Zufallszahlen erstellen mit Random
            Random random = new Random();

            // int[Array] mit 100 zahlen definieren
            int[] zahlen = new int[10];

            // int[Array] mit Zufallszahlen füllen
            for (int i = 0; i < zahlen.length; i++) {
                zahlen[i] = random.nextInt(100) + 1;
            }




            // Bubblesort-Sortierung aufsteigend Methode im Main definieren
            bubblesortAscending(zahlen);

            // int[Array] ausgeben
            System.out.println("Sortiert aufsteigend: " + Arrays.toString(zahlen));

            // Bubblesort-Sortierung absteigend Methode im Main definieren
            bubblesortDescending(zahlen);

            // int[Array] ausgeben
            System.out.println("Sortiert absteigend: " + Arrays.toString(zahlen));
        }

        // Bubblesort-Sortierung aufsteigend ausgeben
        public static void bubblesortAscending(int[] zahlen) {
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

        // Bubblesort-Sortierung absteigend ausgeben
        public static void bubblesortDescending(int[] zahlen) {
            for (int i = 0; i < zahlen.length - 1; i++) {
                for (int j = 0; j < zahlen.length - i - 1; j++) {
                    if (zahlen[j] < zahlen[j + 1]) {
                        int temp = zahlen[j];
                        zahlen[j] = zahlen[j + 1];
                        zahlen[j + 1] = temp;
                    }
                }
            }
        }
    }




