package Alpi;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */

import java.util.Random;

public class Arrays_4_CrazyRangeArray {

  public static void main(String[] args) {
        int[] numbers = new int [2];

        Random random = new Random ();
      for (int i = 0; i < numbers.length ; i++) {
          numbers[i] = random.nextInt (-50 , 50) ;
      }


        for (int number : numbers) {
            System.out.print(number + " ");

        }

    }

}
