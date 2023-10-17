package Alpi.Arrays;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Summe der Werte zurückgibt.
 */

import java.util.Random;

public class Array_6_Summe {

        public static void main(String[] args) {
            // Zufallszahlengenerator erstellen
            Random random = new Random();

            // int[] mit 100 Elementen erstellen
            int[] zahlen = new int[100];

            // int[] mit Zufallszahlen füllen
            for (int i = 0; i < zahlen.length; i++) {
                zahlen[i] = random.nextInt(100) + 1;
            }

            // Summe der int[]-Elemente berechnen
            int summe = sum(zahlen);

            // Summe ausgeben
            System.out.println("Die Summe der Zufallszahlen beträgt: " + summe);
        }

        // Funktion zur Berechnung der Summe
        public static int sum(int[] zahlen) {
            int summe = 0;
            for (int i = 0; i < zahlen.length; i++) {
                summe += zahlen[i];
            }
            return summe;
        }
    }