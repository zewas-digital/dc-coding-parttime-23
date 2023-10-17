package Simonsway.Week5;

import java.util.Random;
public class Array_7_MinMaxAvg_Temp {
    public static void main(String[] args) {
        // Größe des Arrays
        int arraySize = 10;

        // Ein Array von Zufallszahlen erstellen
        int[] numbers = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = random.nextInt(100); // Zufallszahlen zwischen 0 und 99
        }

        // Die kleinste Zahl finden
        int smallestNumber = numbers[0]; // Annahme: Die erste Zahl ist die kleinste

        for (int zahl : numbers) {
            if (zahl < smallestNumber) {
                smallestNumber = zahl;
            }
        }
        // Ergebnis ausgeben
        System.out.println("Das kleinste Zahl im Array ist: " + smallestNumber);
    }
}

