package eslem.week04;

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
        Random random = new Random();

        int randomNumber = random.nextInt(0, 100);
        int[] nummer = new int[10];

        /*fori*/
        for (int i = 0; i < 10; i++) {
            nummer [i] = random.nextInt(0, 100);
        }
        System.out.println(Arrays.toString(nummer));

        /*foreach*/
        for (int var : nummer) {
            System.out.println(var);
        }

        /*2,5,10*/
        System.out.println("2: " + nummer[1]);
        System.out.println("5: " + nummer[4]);
        System.out.println("10: " + nummer[9]);

        /*2.Wert*/
        for (int i = 0; i < 10; i+=2) {
            nummer [i] = random.nextInt(0, 100);
            System.out.println(nummer[i] + " ");
        }
    }
}
