package Alpi;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */

import java.util.Random;

public class Arrays_5_ArrayZaehlen {

    public static void main(String[] args) {
        int[] numbers = new int [4];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt (30 , 100) ;
        }



        // Dieser Methode wird verwendet wenn keine Werte definiert sind.
        //for (int i = 0; i < numbers.length; i++) {
            //System.out.print(numbers[i] + " ");



            // Dieser Methode kann verwendet werden wenn im int Array die Werte vordefiniert sind
            for (int number : numbers) {
            System.out.print(number + " ");

        }


    }
}
