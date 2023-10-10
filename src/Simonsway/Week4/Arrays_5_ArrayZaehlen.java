package Simonsway.Week4;

/*
Aufgabe: Random Number Array Zählen

1.Erstelle ein int[] und befülle es mit Zufallszahlen von 1 bis 100.

2. Erstelle eine Funktion, die die Werte größer als 30 zählt.
 */
import java.util.Random;
import java.util.Arrays;

public class Arrays_5_ArrayZaehlen {
    public static void main(String[] args) {
        int arrayLength = 10;
        Random rand = new Random();
        int [] randomArray = new int[arrayLength];

        for (int i = 0; i < arrayLength ; i++) {
            int randomValue = rand.nextInt(100) + 1;
            randomArray[i] = randomValue;
        }

        int count = 0;

        for (int value : randomArray){
            System.out.print(value + " ");
            if (value > 30){
                count++;
            }
        }
        System.out.print("Anzahl größer als 30 " + count);
    }
}
