package michael_k.week7;

/*
Aufgabe: Pascal Dreieck
Frage den Anwender nach der gewünschten Größe und erstelle ein Pascal-Dreieck mit der entsprechenden Dimension.

Regel: Jede Zahl in der Matrix ist gleich die Summe der Nachbarzahlen nach Links und nach Oben.
Beispiel-Bild in Slack
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_12_PascalDreieck {

    public static void main(String[] args) {

        Scanner inputKonsole = new Scanner ( System.in );

        System.out.print ("Wie groß soll das Pascal-Dreieck sein? :" );
        int eingabe = inputKonsole.nextInt ( );
        int size = eingabe;

        int[][] pascalDreieck = new int[size][size];

        for (int i = 0; i < eingabe; i++) {
            pascalDreieck [i][0]= 1;
            pascalDreieck [0][i]= 1;
        }

        for (int i = 1; i <size; i++) {
            for (int j = 1; j <size ; j++) {
              pascalDreieck[j][i] = pascalDreieck[j][i-1] + pascalDreieck[j-1][i];
            }

        }
        for (int i = 0; i <eingabe; i++) {
            System.out.println ( Arrays.toString ( pascalDreieck[i]) );
        }

    }

}