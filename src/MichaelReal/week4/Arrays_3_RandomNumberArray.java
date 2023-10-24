package MichaelReal.week4;

import java.util.Random;

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
public class Arrays_3_RandomNumberArray {
    public static void main(String[] args) {
        int[] randomArray = new int[20];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(101);
        }

        System.out.println("Array mit foreach-Schleife:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("Array mit fori-Schleife:");
        System.out.print("[");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i]);
            if (i < randomArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Zweiter Wert: " +randomArray[1]);
        System.out.println("Fünfter Wert: " +randomArray[4]);
        System.out.println("Zehnter Wert: " +randomArray[9]);

        System.out.println("Jeden zweiten Wert:");
        for (int i = 0; i < randomArray.length; i += 2) {
            System.out.print(randomArray[i] + " ");
        }
    }
}
