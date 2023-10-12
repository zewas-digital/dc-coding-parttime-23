package florian.week4;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */

import java.util.Random;

public class Arrays_5_ArrayZaehlen {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array [i] = random.nextInt(1,100);

        }




    }
}
