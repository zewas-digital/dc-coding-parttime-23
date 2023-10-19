package saifedine.week04;

/*
Aufgabe: Random Number Array Crazy Range
Erstelle ein int[] und befülle es mit Zufallszahlen von -50 bis 50 und gib es mit Hilfe einer foreach-Schleife aus.
 */


import java.util.Random;

public class Arrays_4_CrazyRangeArray {

    public static void main(String[] args) {

        int length = 10;

        int[] numbers = new int [length];


        for (int i = 0; i < length; i++) {

            Random random = new Random();
            int value = random.nextInt(-50,50);

            numbers[i] = value;

        }

        for (int value : numbers) {
            System.out.print(value + ", ");
        }

    }
}
