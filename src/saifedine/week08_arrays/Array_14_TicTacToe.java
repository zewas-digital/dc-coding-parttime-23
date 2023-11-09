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

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                numbers[i][j] = 0;
            }
        }

        while (true) {

            printArray(y, numbers);

            int spielerZug = inputSpieler(numbers);

            placeTurn(spielerZug, numbers);

        }

    }

    private static void printArray(int y, int[][] numbers) {
        System.out.println("Spielfeld");
        for (int j = 0; j < y; j++) {
            System.out.println(Arrays.toString(numbers[j]));
        }
    }

    private static int inputSpieler(int [][] numbers) {
        System.out.println("Wähle ein Feld von 1 - 9:");
        Scanner Eingabe = new Scanner(System.in);
        int Spieler = Eingabe.nextInt();
        if (Spieler > 0 && Spieler < 10) {
            System.out.println("Ihre Eingabe: " + Spieler);
        }
        else{
            System.out.println("Falsche Eingabe, wähle bitte eine Zahl von 1 - 9:");
            return 0;
        }

        if (numbers[0][0] == 0) {
            placeTurn(Spieler, numbers);
        }
        else {
            System.out.println("Feld ist bereits besetzt");
        }
        return Spieler;
    }

    private static void placeTurn(int Spieler, int[][] numbers) {
        switch (Spieler) {
                case 1:
                        numbers[0][0] = Spieler;
                        break;
        }
    }




}