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

    // 2D-Array mit länge 2
    // Inhalt der Felder ist leer (0)
    // Felder nummerieren (Zuordnung Array)
    // Switch
    // Eingabe Spieler
    // überprüfung der Eingabe (1 - 9)
    // überprüfung ob Feld bereits befüllt
    // Überprüfung 3 Zeichen in einer Reihe, Spalte oder Diagonal


    public static void main(String[] args) {

        int x = 3;
        int y = 3;
        int[][] numbers = new int[x][y];
        int Spieler = 0;
        boolean fieldOk = false;

        // Arrays befüllen
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                numbers[i][j] = 0;
            }
        }

        while (true) {

            printArray(Spieler, x, y, numbers);

           Spieler = inputSpieler(numbers);

           fieldOk = checkField(numbers, Spieler);

           if (fieldOk){

               placeTurn(Spieler,numbers);
           }

        }

    }

    // Array ausgeben
    private static void printArray(int Spieler, int x, int y, int[][] numbers) {
        System.out.println("Spielfeld");

        if (Spieler == 0){
            for (int i = 0; i < x; i++) {
                System.out.println(Arrays.toString(numbers[i]));
            }
        }
        else if (Spieler > 0) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                }
            }
        }
    }



    private static int inputSpieler(int [][] numbers) {

        // Scanner-Eingabe
        System.out.println("Wähle ein Feld von 1 - 9:");
        Scanner Eingabe = new Scanner(System.in);
        int Spieler = Eingabe.nextInt();

        // Überprüfung Eingabe zw. 1-9
        if (Spieler > 0 && Spieler < 10) {
            System.out.println("Ihre Eingabe: " + Spieler);
        }
        // Falsche Eingabe --> 0 für die while
        else{
            System.out.println("Falsche Eingabe, wähle bitte eine Zahl von 1 - 9:");
            return 0;
        }
        return Spieler;
    }

    private static boolean checkField(int[][] numbers, int Spieler) {
        if (numbers[0][0] == 0) {
           // placeTurn(Spieler, numbers);
            return true;
        }

        System.out.println("Feld ist bereits besetzt");
        return false;
    }

    private static void placeTurn(int Spieler, int[][] numbers) {
        switch (Spieler) {
            case 1:
                numbers[0][0] = Spieler;
                break;
        }
    }

}