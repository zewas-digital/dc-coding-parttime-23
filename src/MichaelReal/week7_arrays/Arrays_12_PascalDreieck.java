package MichaelReal.week7_arrays;

/*
Aufgabe: Pascal Dreieck
Frage den Anwender nach der gewünschten Größe und erstelle ein Pascal-Dreieck mit der entsprechenden Dimension.

Regel: Jede Zahl in der Matrix ist gleich die Summe der Nachbarzahlen nach Links und nach Oben.
Beispiel-Bild in Slack
 */

import java.util.Scanner;

public class Arrays_12_PascalDreieck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die Anzahl der Zeilen im Pascal-Dreieck ein: ");
        int numRows = scanner.nextInt();

        // Das Pascal-Dreieck erstellen und ausgeben
        int[][] triangle = generatePascalTriangle(numRows);

        System.out.println("Pascal-Dreieck mit " + numRows + " Zeilen:");
        printPascalTriangle(triangle);
    }

    // Methode zur Generierung des Pascal-Dreiecks
    public static int[][] generatePascalTriangle(int numRows) {
        int[][] triangle = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1; // Erstes Element in jeder Zeile ist immer 1
            triangle[i][i] = 1; // Letztes Element in jeder Zeile ist immer 1

            for (int j = 1; j < i; j++) {
                // Berechnung des Werts im Dreieck durch Addition der beiden darüberliegenden Werte
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        return triangle;
    }

    // Methode zur Ausgabe des Pascal-Dreiecks
    public static void printPascalTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

