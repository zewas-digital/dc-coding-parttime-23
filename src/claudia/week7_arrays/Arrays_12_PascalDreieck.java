package claudia.week7_arrays;

/*
Aufgabe: Pascal Dreieck
Frage den Anwender nach der gewünschten Größe und erstelle ein Pascal-Dreieck mit der entsprechenden Dimension.

Regel: Jede Zahl in der Matrix ist gleich die Summe der Nachbarzahlen nach Links und nach Oben.
Beispiel-Bild in Slack
 */

import claudia.BasicFunctions;
import java.util.Scanner;

public class Arrays_12_PascalDreieck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Drucke Pascalsches Dreieck!");
        System.out.print("Gib gewünschte Anzahl an Zeilen ein: ");
        int rows = sc.nextInt();
        int columns = 2 * rows - 1;
        int[][] pascal = new int[rows][rows]; //Darstellung in 2-D-Array, quadratisch
        int[][] pascalTri = new int[rows][columns];//dreieckige Darstellung, leere Einträge erforderlich

        pascalTri[0][columns/2] = 1;
        pascalTri[rows-1][0] = 1;
        pascalTri[rows-1][columns-1] = 1;

        //Pascal'sches Dreieck als Dreieck in 2-D-Array
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j-1 >= 0 && j + 1 < columns){
                    pascalTri[i][j] = pascalTri[i-1][j-1] + pascalTri[i-1][j+1];
                }
            }
        }
        //Umwandlung in String, damit die Ausgabe schöner ist (Leerstellen statt Nullen):
        String[][] pascalString = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(pascalTri[i][j] == 0){
                    pascalString[i][j] = " ";
                }
                else pascalString[i][j] = String.valueOf(pascalTri[i][j]);
            }
        }
        BasicFunctions.print2DArrayOfStrings(pascalString);

        //Pascal'sches Dreieck in rechteckiger Form
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else if (i > 0) {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }
        BasicFunctions.print2DArray(pascal);
    }
}