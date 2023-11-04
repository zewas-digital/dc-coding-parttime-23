package florian.week7_arrays;

/*
Aufgabe: Pascal Dreieck
Frage den Anwender nach der gewünschten Größe und erstelle ein Pascal-Dreieck mit der entsprechenden Dimension.

Regel: Jede Zahl in der Matrix ist gleich die Summe der Nachbarzahlen nach Links und nach Oben.
Beispiel-Bild in Slack
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Arrays_12_PascalDreieck {
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);
        System.out.println("Gib die Zeilen anzahl ein: ");
        int lines = userinput.nextInt(); // Gibt die Zeilenlänge an
        System.out.println("Gib die Spalten anzahl des Arrays ein: ");
        int columns = userinput.nextInt(); // Gibt die Spaltenlänge ein
        int [][] array = new int [lines][columns];

        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || j == 0){
                    array [i][j] = 1;
                } else { array[i][j] = array[i][j - 1] + array [i - 1][j];
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }


    }

}