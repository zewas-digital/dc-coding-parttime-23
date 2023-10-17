package Alpi.Arrays;

/*
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.
Erstelle jeweils eine Methode für das Minimum, das Maximum und den Durchschnitt. Die Methoden sollen jeweils
den Wert zurückgeben (nicht Ausgeben). In der main Methode Rufe die Methoden mit den Zufallszahlen auf und gib diese aus.

Erstelle zwei weitere Funktionen, die den Index des Minimums und des Maximums zurückgeben.
 */
import java.util.Random;
public class Array_7_MinMaxAvg {


        public static void main(String[] args) {
            // Zufallszahlen erstellen mit Random
            Random random = new Random();

            // int[] mit 20 zahlen
            int[] zahlen = new int[20];

            // int[] mit Zufallszahlen füllen
            for (int i = 0; i < zahlen.length; i++) {
                zahlen[i] = random.nextInt(20) + 1;
            }

            // Minimum berechnen
            int minimum = minimum(zahlen);

            // Maximum berechnen
            int maximum = maximum(zahlen);

            // Durchschnitt berechnen
            double durchschnitt = durchschnitt(zahlen);

            // Minimum, Maximum und Durchschnitt ausgeben
            System.out.println("Minimum: " + minimum);
            System.out.println("Maximum: " + maximum);
            System.out.println("Durchschnitt: " + durchschnitt);

            // Index des Minimums berechnen
            int indexMinimum = indexMinimum(zahlen);

            // Index des Maximums berechnen
            int indexMaximum = indexMaximum(zahlen);

            // Index des Minimums und des Maximums ausgeben
            System.out.println("Index des Minimums: " + indexMinimum);
            System.out.println("Index des Maximums: " + indexMaximum);
        }

    // Funktion zur Berechnung des Minimums
    public static int minimum(int[] zahlen) {
        int minimum = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] < minimum) {
                minimum = zahlen[i];
            }
        }
        return minimum;
    }

    // Methode zur Berechnung des Maximums
    public static int maximum(int[] zahlen) {
        int maximum = zahlen[0];
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > maximum) {
                maximum = zahlen[i];
            }
        }
        return maximum;
    }

    // Methode zur Berechnung des Durchschnitts
    public static double durchschnitt(int[] zahlen) {
        int sum = 0;
        for (int i = 0; i < zahlen.length; i++) {
            sum += zahlen[i];
        }
        return sum / zahlen.length;
    }

    // Methode zur Berechnung des Index des Minimums
    public static int indexMinimum(int[] zahlen) {
        int minimum = zahlen[0];
        int indexMinimum = 0;
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] < minimum) {
                minimum = zahlen[i];
                indexMinimum = i;
            }
        }
        return indexMinimum;
    }

    // Methode zur Berechnung des Index des Maximums
    public static int indexMaximum(int[] zahlen) {
        int maximum = zahlen[0];
        int indexMaximum = 0;
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] > maximum) {
                maximum = zahlen[i];
                indexMaximum = i;
            }
        }
        return indexMaximum;
    }


}


