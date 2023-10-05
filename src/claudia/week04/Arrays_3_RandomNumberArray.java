package claudia.week04;

/*
Aufgabe: Random Number Array
Erstelle ein int[] und befülle es mit Zufallszahlen von 0 bis 100.

Random random = new Random();
...
int randomNumber = random.nextInt([Upper bound]);
Gib es mit Hilfe einer foreach-Schleife aus.
Gib es mit Hilfe einer fori-Schleife aus. Das Ziel ist eine identische Ausgabe, wie Arrays.toString()
Gib den zweiten, fünften und zehnten Wert des Arrays aus.
Gib jeden zweiten Wert des int[] mit Hilfe einer Schleife aus.
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays_3_RandomNumberArray {

    public static void main(String[] args) {
        int size = 50;
        int [] vector = new int [size];
        Random random = new Random();

        //Befüllen mit Zufallszahlen
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(100);
        }
        System.out.println("for-each-Schleife:");
        for (int i : vector) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("for-i-Schleife:");
        for (int i = 0; i < size; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        System.out.println("Zweiter, fünfter, zehnter Wert: " + vector[1] + " " + vector[4] + " " + vector[9]);
        System.out.println("Jeder zweite Wert: ");
        for (int i = 1; i < size; i+=2) {
            System.out.print(vector[i] + " ");
        }
    }
}
