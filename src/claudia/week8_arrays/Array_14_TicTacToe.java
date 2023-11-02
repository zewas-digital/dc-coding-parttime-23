package claudia.week8_arrays;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */

import claudia.BasicFunctions;

import java.util.Scanner;

public class Array_14_TicTacToe {
    public static void main(String[] args) {
        int[][] tictactoe = new int[3][3];

        System.out.println("Tictactoe, zwei Spieler, drei gleiche Zeichen in Zeile, Spalte oder Diagonale gewinnen!");
        System.out.println("Wähle Position über entsprechende Zahl: ");
        System.out.println("[1   2   3]");
        System.out.println("[4   5   6]");
        System.out.println("[7   8   9]");

        while (checkWin(tictactoe) == -1){
            System.out.println("Spieler " + player + " ist dran!");
            if (takeInput(tictactoe, inputDialog(tictactoe), player)) switchPlayer();
        }
        System.out.println("Spiel beendet, Endstand: ");
        BasicFunctions.print2DArray(tictactoe);
        switchPlayer();
        if (checkWin(tictactoe) != 0) System.out.println("Gewinner ist " + player);
    }
    static int player = 1;
    static void switchPlayer(){
        if (player == 1) player = 2;
        else player = 1;
    }
    static int checkWin(int[][] tictactoe) {
        //checks if game is already won and returns number of winner; returns 0 when it's a draw and -1 when not yet finished
        for (int i = 0; i < 3; i++) {
            if (tictactoe[i][0] != 0 && tictactoe[i][0] == tictactoe[i][1] && tictactoe[i][0] == tictactoe[i][2]) {
                //System.out.println("Gewinner Zeile");
                return tictactoe[i][0];
            }
            if (tictactoe[0][i] != 0 && tictactoe[0][i] == tictactoe[1][i] && tictactoe[0][i] == tictactoe[2][i]) {
                //System.out.println("Gewinner Spalte");
                return tictactoe[0][i];
            }
            if (tictactoe[0][0] != 0 && tictactoe[0][0] == tictactoe[1][1] && tictactoe[0][0] == tictactoe[2][2]) {
                //System.out.println("Gewinner Diagonale");
                return tictactoe[0][0];
            }
            if (tictactoe[0][2] != 0 && tictactoe[0][2] == tictactoe[1][1] && tictactoe[0][2] == tictactoe[2][0]) {
                //System.out.println("Gewinner Gegendiagonale");
                return tictactoe[0][2];
            }
        }
        //hier ist klar, es hat noch niemand gewonnen - zwei Möglichkeiten: unentschieden oder noch nicht fertig
        //System.out.println("kein Gewinner");
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tictactoe[i][j] != 0) counter++;
            }
        }
        //System.out.println("Counter: " + counter);
        if (counter == 9) {
            System.out.println("Unentschieden");
            return 0;
        }
        else return -1;
    }
    static int inputDialog(int[][] matrix) {
        //asks user for input of int position, returns position if in range, else 0
        //int[][] temp = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner sc = new Scanner(System.in);
        int position;
        System.out.println("Spielstand: ");
        BasicFunctions.print2DArray(matrix);
        System.out.println("Wo möchtest Du Dein Zeichen setzen?");
        //BasicFunctions.print2DArray(temp);
        System.out.print("Gib die entsprechende Zahl ein!  ");
        position = sc.nextInt();
        if (position < 1 || position > 9) position = 0;
        return position;
    }
    static boolean takeInput(int[][] matrix, int position, int player){
        //takes given int position between 1 and 9 and writes int player into corresponding place in matrix
        //1 2 3
        //4 5 6
        //7 8 9
        //returns false if position not in range
        switch ( position ){
            case 1:
                if (matrix[0][0] == 0) {
                    matrix[0][0] = player;
                    return true;
                }
                return false;
            case 2:
                if (matrix[0][1] == 0) {
                    matrix[0][1] = player;
                    return true;
                }
                return false;
            case 3:
                if (matrix[0][2] == 0) {
                    matrix[0][2] = player;
                    return true;
                }
                return false;
            case 4:
                if (matrix[1][0] == 0) {
                    matrix[1][0] = player;
                    return true;
                }
                return false;
            case 5:
                if (matrix[1][1] == 0) {
                    matrix[1][1] = player;
                    return true;
                }
                return false;
            case 6:
                if (matrix[1][2] == 0) {
                    matrix[1][2] = player;
                    return true;
                }
                return false;
            case 7:
                if (matrix[2][0] == 0) {
                    matrix[2][0] = player;
                    return true;
                }
                return false;
            case 8:
                if (matrix[2][1] == 0) {
                    matrix[2][1] = player;
                    return true;
                }
                return false;
            case 9:
                if (matrix[2][2] == 0) {
                    matrix[2][2] = player;
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

}
