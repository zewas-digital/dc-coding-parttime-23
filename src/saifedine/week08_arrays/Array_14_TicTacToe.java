package saifedine.week08_arrays;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array_14_TicTacToe {

    // 2D-Array mit länge 3
    // Inhalt der Felder ist leer (0)
    // Felder nummerieren (Zuordnung Array)
    // Switch
    // Eingabe Spieler
    // überprüfung der Eingabe (1 - 9)
    // überprüfung ob Feld bereits befüllt
    // Überprüfung 3 Zeichen in einer Reihe, Spalte oder Diagonal
    // Spielerwechsel


    public static void main(String[] args) {

        int x = 3;
        int y = 3;
        int[][] numbers = new int[x][y];
        int Spieler = 0;
        int field = 0;
        boolean fieldOk = false;

        // initial Arrays befüllen
        if (field == 0){
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                numbers[i][j] = 0;
                }
            }
        }

        while (true) {

           printArray(numbers);

           field = inputSpieler(numbers);

           fieldOk = checkField(numbers, field);

           if (fieldOk){

               placeTurn(field,numbers);
           }

        }

    }

    // Array ausgeben
    private static void printArray(int[][] numbers) {
        System.out.println("Spielfeld");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
    }

    private static int inputSpieler(int [][] numbers) {

        // Scanner-Eingabe
        System.out.println("Wähle ein Feld von 1 - 9:");
        Scanner Eingabe = new Scanner(System.in);
        int field = Eingabe.nextInt();

        // Überprüfung Eingabe zw. 1-9
        if (field > 0 && field < 10) {
            System.out.println("Ihre Eingabe: " + field);
        }
        // Falsche Eingabe --> 0 für die while
        else{
            System.out.println("Falsche Eingabe, wähle bitte eine Zahl von 1 - 9:");
            return 0;
        }
        return field;
    }


    private static void placeTurn(int field, int[][] numbers) {

        // Felder nummerieren (Zuordnung Array)
        switch (field) {
            case 1: numbers[0][0] = field; break;
            case 4: numbers[1][0] = field; break;
            case 7: numbers[2][0] = field; break;
            case 2: numbers[0][1] = field; break;
            case 5: numbers[1][1] = field; break;
            case 8: numbers[2][1] = field; break;
            case 3: numbers[0][2] = field; break;
            case 6: numbers[1][2] = field; break;
            case 9: numbers[2][2] = field; break;
        }
    }

    private static boolean checkField(int[][] numbers, int field) {
        if (field != 0) {
            placeTurn(field, numbers);
            return true;
        }
        System.out.println("Feld ist bereits besetzt");
        return false;
    }

}