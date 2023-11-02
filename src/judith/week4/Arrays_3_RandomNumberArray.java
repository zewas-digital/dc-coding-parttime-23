package judith.week4;

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


        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers [i] = random.nextInt(0,100);
            //System.out.print(numbers[i] + " ");
        }
        System.out.println(Arrays.toString(numbers));

        for (int var : numbers) {
            System.out.println(var + " var");

        }

        System.out.println(" 2: " + numbers[1]);
        System.out.println(" 5: " + numbers[4]);
        System.out.println(" 10: " + numbers[9]);

        for (int i = 0; i <10 ; i += 2) {
            numbers [i] = random.nextInt(0,100);
            System.out.println(numbers[i] + " i ");

        }








}







    }









