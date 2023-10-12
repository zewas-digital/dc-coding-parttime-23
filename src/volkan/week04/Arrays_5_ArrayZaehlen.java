package volkan.week04;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */

import java.util.Random;


public class Arrays_5_ArrayZaehlen {

    public static void main(String[] args) {
       /* Random random = new Random();
        int randomNumber = random.nextInt( bound: 100); {
            System.out.println(randomNumber);
        }*/



        int[] numbers = { 10, 20, 30, 40, 50};


        //for (int i = 0; i < numbers.length; i++) {
        //  System.out.println(numbers[i] + " ");


            for (int value : numbers) {
            System.out.print(value + " ");

        }


    }
}