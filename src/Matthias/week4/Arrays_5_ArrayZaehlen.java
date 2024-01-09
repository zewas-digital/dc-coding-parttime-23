package Matthias.week4;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */

import java.util.Arrays;
import java.util.Random;

public class Arrays_5_ArrayZaehlen {

    public static void main( String[] args ) {
        int arraysize= 100;
        int [] Arrayradomnumbers= new int[arraysize];

        // Ausgabe des Array mit den befüllten Randomzahlen
        System.out.println( Arrays.toString(Arrayradomnumbers= createRandomArrayWithMinMax(Arrayradomnumbers, 1,100)));

        // Zählt alle Werte, welche sich >30 sind
        countoverthirty( Arrayradomnumbers);
    }
    //Methode 1 Befüllt einen Array mit den Zufallszahlen von min bis max
    public static int[] createRandomArrayWithMinMax( int[] original, int min, int max ) {
        int[] Array = new int[original.length];
        Random random = new Random( );
        for (int i = 0; i < original.length; i++) {
            Array[i] = random.nextInt( min, max );
        }

        return Array;
    }
    //Methode 2: Druckt die Anzahl der Zahlen welche über 30 sind im Array auf der Console aus
    public static void countoverthirty(int[] original) {
        int counter = 0;
        for (int number: original) {
            if ( number > 30 ) {
                counter++;
            }
        }
        System.out.println( " Anzahl > 30 =" + counter );
    }
}
