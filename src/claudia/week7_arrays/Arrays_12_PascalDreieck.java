package claudia.week7_arrays;

/*
Aufgabe: Pascal Dreieck
Frage den Anwender nach der gewünschten Größe und erstelle ein Pascal-Dreieck mit der entsprechenden Dimension.

Regel: Jede Zahl in der Matrix ist gleich die Summe der Nachbarzahlen nach Links und nach Oben.
Beispiel-Bild in Slack
 */

import java.util.Scanner;
import claudia.BasicFunctions;

import static claudia.BasicFunctions.print2DArray;

public class Arrays_12_PascalDreieck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Drucke Pascalsches Dreieck!");
        System.out.print("Gib gewünschte Anzahl an Zeilen ein: ");
        int rows = sc.nextInt();
        int columns = 2 * rows - 1;
        int[][] pascal = new int[rows][columns];

        pascal[0][columns/2] = 1;
        pascal[rows-1][0] = 1;
        pascal[rows-1][columns-1] = 1;

        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j-1 >= 0 && j + 1 < columns){
                    pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j+1];
                }
            }
        }
        print2DArray(pascal);
    }
}