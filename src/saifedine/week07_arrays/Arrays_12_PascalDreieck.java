package saifedine.week07_arrays;

/*
Aufgabe: Pascal Dreieck
Frage den Anwender nach der gewünschten Größe und erstelle ein Pascal-Dreieck mit der entsprechenden Dimension.

Regel: Jede Zahl in der Matrix ist gleich die Summe der Nachbarzahlen nach Links und nach Oben.
Beispiel-Bild in Slack
 */

import java.util.Arrays;


public class Arrays_12_PascalDreieck {

    public static void main(String[] args) {

        // Zwei-Dimension-Array --> int[][]
        // Abfrage länge der Dimensionen vom Anwender --> Scanner
        // index 0 ist 1 für beide Dimensionen
        // Summe lt Beispiel-Bild in Slack

        int Zeilen = 5;
        int Spalten = Zeilen;

        int[][] numbers = new int[Zeilen][Spalten];

        for (int i = 0; i < Zeilen; i++) {
            for (int j = 0; j < Spalten; j++) {
                if (i == 0 || j == 0){
                    numbers[i][j] = 1;
                }
                else {
                    numbers[i][j] = numbers[i][j-1] /* Position LINKS*/ + numbers[i-1][j];

                }
            }
        }
        for (int i = 0; i < Zeilen; i++) {
            System.out.println(Arrays.toString(numbers[i]));

        }
    }

}