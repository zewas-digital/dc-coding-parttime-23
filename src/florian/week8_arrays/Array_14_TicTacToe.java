package florian.week8_arrays;
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
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        int[][] field = new int[3][3];
        int leer = 0;
        int player1 = 1;
        int player2 = 2;



        // Spielfeld
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j == field[i].length - 1) {
                    System.out.print(field[i][j]);
                } else {
                    System.out.print(field[i][j] + " | ");
                }
            }
            System.out.println();
        }










    }
}
