package Matthias.week8_arrays;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */

public class Array_14_TicTacToe {
    public static void main( String[] args ) {
        int[][] tictactoe = new int[3][3];

        System.out.println("Tictactoe, zwei Spieler, drei gleiche Zeichen in Zeile, Spalte oder Diagonale gewinnen!");
        System.out.println("Wähle Position über entsprechende Zahl: ");
        System.out.println("[1   2   3]");
        System.out.println("[4   5   6]");
        System.out.println("[7   8   9]");
    }

}
