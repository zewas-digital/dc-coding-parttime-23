package Alpi.Arrays;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */


import java.util.Arrays;
import java.util.Random;

public class Arrays_5_ArrayZaehlen {

    public static void main(String[] args) {

        Random randomValue = new Random ();
        int[] array = new int[10];
        int length = array.length;
        int counter = 0 ;

        for (int i = 0; i <length; i++) {
            array[i] = randomValue.nextInt ( 50);
        }

        for (int value: array) {
            if ( value > 20){ counter++;}
        }

        System.out.println ( Arrays.toString(array ) );
        System.out.println ( );
        System.out.println ("Es befinden sich "+counter+" Zahlen über 30 in dem Array" );
    }

}
