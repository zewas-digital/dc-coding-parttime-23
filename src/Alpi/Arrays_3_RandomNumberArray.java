package Alpi;

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


import java.util.Random;

public class Arrays_3_RandomNumberArray {
    public static void main(String[] args) {
        int[] numbers = {10,20,40,60,70,80,90,100};
        Random random = new Random();

        for (int nummer : numbers){
            System.out.print(nummer + " ");
        }



    }
}
