package michael_k.week04;

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

        int[] array = new int[10];
        Random randomnumber = new Random();
        int lenght = array.length;

        for (int i = 0; i <lenght; i++) {
            int value =randomnumber.nextInt ( 100 );
            array[i] = value;
        }

        System.out.println ( Arrays.toString ( array) );
        System.out.println ( );

        for (int zahl:array) {
            System.out.print (zahl+", " );
        }
        System.out.println ( );

        for (int i = 0; i <lenght; i++) {
            System.out.print (array[i]+", " );
        }
        System.out.println ( );

        for (int i = 0; i <lenght; i+=2) {
            System.out.print (array[i]+", " );
        }
        System.out.println ( );

        System.out.println (array[1]+" "+array[4]+" "+array[9] );

    }

}
