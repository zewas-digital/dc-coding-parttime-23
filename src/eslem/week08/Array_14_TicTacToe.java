package eslem.week08;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Array_14_TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        char [][] board = new char [3][3];

        char spieler1 = 'x';
        char spieler2 = 'o';


        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
            }
        }
    }

    private static boolean game(char [][] board, char symbol){
        //Zeilen
            if ((board [0][0] == symbol && board [0][1] == symbol && board [0][2] == symbol) ||
                (board [1][0] == symbol && board [1][1] == symbol && board [1][2] == symbol) ||
                (board [2][0] == symbol && board [2][1] == symbol && board [2][2] == symbol) ||
        //Spalten
                (board [0][0] == symbol && board [1][0] == symbol && board [2][0] == symbol) ||
                (board [0][1] == symbol && board [1][1] == symbol && board [2][1] == symbol) ||
                (board [2][0] == symbol && board [2][1] == symbol && board [2][2] == symbol) ||
        //Diagonale
                (board [0][0] == symbol && board [1][1] == symbol && board [2][2] == symbol)||
                (board [0][2] == symbol && board [1][1] == symbol && board [2][0] == symbol)) {
            return true;
        }
        return false;
    }
    private static boolean game2(char [][] board, char symbol){
        if (game(board,'x')) {
        }
    }
}
