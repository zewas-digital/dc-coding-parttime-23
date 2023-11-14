package volkan.Arrays;

/*
Aufgabe: Random Number Array Zählen
Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */


import java.util.Random;

public class Arrays_5_ArrayZaehlen {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101);
        }

        int count = countNumbersGreaterThan30(numbers);

        System.out.println("Es gibt " + count + " Werte größer als 30.");
    }

    public static int countNumbersGreaterThan30(int[] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number > 30) {
                count++;
            }
        }

        return count;
    }
}