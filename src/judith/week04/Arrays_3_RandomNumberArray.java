package judith.week04;

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
import java.util.Scanner;
import java.util.Random;

public class Arrays_3_RandomNumberArray {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(100);

       System.out.println(randomNumber);

       //foreach
        //for (int i: randomNumber) {
          //  System.out.println(i);

        }




    }



//}
