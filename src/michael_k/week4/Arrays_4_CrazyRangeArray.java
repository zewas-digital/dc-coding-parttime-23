package michael_k.week04;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */


import java.util.Random;

public class Arrays_4_CrazyRangeArray {

    public static void main(String[] args) {

        Random randomValue = new Random ();
        int[] array = new int[10];
        int length = array.length;

        for (int i = 0; i <length; i++) {
            array[i] = randomValue.nextInt ( 101) -50;
            System.out.println ( array[i] );
        }

        for (int value : array ) {
            System.out.print (value + ", " );
        }
    }

}
