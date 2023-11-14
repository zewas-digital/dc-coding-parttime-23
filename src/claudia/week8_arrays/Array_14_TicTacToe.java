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

import java.util.InputMismatchException;
import java.util.Scanner;

public class Array_14_TicTacToe {
    public static void main(String[] args) {
        System.out.println("Tictactoe, zwei Spieler, drei gleiche Zeichen in Zeile, Spalte oder Diagonale gewinnen!");
        System.out.println("Spieler 1 = X, Spieler 2 = O");
        System.out.println("Wähle Position über entsprechende Zahl: ");
        System.out.println("[1   2   3]");
        System.out.println("[4   5   6]");
        System.out.println("[7   8   9]");

        //TODO Anzahl Züge gleich mitzählen, anstatt erst am Ende!

        while (checkWin() == -1){
            System.out.println("Spieler " + player + " ist dran!");
            if (takeInput(inputDialog())) switchPlayer();
        }
        System.out.println("Spiel beendet, Endstand: ");

        BasicFunctions.print2DArrayOfChars(matrixToChar());
        switchPlayer();
        if (checkWin() != 0) System.out.println("Gewinner ist " + player);
    }

     static void switchPlayer() {
        if (player == 1) player = 2;
        else player = 1;
    }
    static int checkWin() {
        //checks if game is already won and returns number of winner; returns 0 when it's a draw and -1 when not yet finished
        if (checkRows() != 0) return checkRows();
        if (checkCols() != 0) return checkCols();
        if (checkDiags() != 0) return checkDiags();

        //no win - two possibilities: draw or not yet finished
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tictactoe[i][j] != 0) counter++;
            }
        }
        if (counter == 9) {
            System.out.println("Unentschieden");
            return 0;
        } else return -1;
    }
    static int[][] tictactoe = new int[3][3];
    static int player = 1;
    static int checkDiags() {
        // returns int of winning player, else ß
        if (tictactoe[0][0] != 0 && tictactoe[0][0] == tictactoe[1][1] && tictactoe[0][0] == tictactoe[2][2]) {
            //System.out.println("Gewinner Diagonale");
            return tictactoe[0][0];
        }
        if (tictactoe[0][2] != 0 && tictactoe[0][2] == tictactoe[1][1] && tictactoe[0][2] == tictactoe[2][0]) {
            //System.out.println("Gewinner Gegendiagonale");
            return tictactoe[0][2];
        }
        return 0;
    }
    static int checkRows() {
        //returns int of winning player, else 0
        for (int i = 0; i < 3; i++) {
            if (tictactoe[i][0] != 0 && tictactoe[i][0] == tictactoe[i][1] && tictactoe[i][0] == tictactoe[i][2]) {
                //System.out.println("Gewinner Zeile");
                return tictactoe[i][0];
            }
        }
        return 0;
    }
    static int checkCols() {
        //returns int of winning player, else 0
        for (int i = 0; i < 3; i++) {
            if (tictactoe[0][i] != 0 && tictactoe[0][i] == tictactoe[1][i] && tictactoe[0][i] == tictactoe[2][i]) {
                //System.out.println("Gewinner Spalte");
                return tictactoe[0][i];
            }
        }
        return 0;
    }
    static int inputDialog() {
        //asks user for input of int position, returns position if in range, else 0
        //int[][] temp = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner sc = new Scanner(System.in);
        int position = 0;
        System.out.println("Spielstand: ");
        BasicFunctions.print2DArrayOfChars(matrixToChar());
        System.out.println("Wo möchtest Du Dein Zeichen setzen?");
        //BasicFunctions.print2DArray(temp);
        System.out.print("Gib die entsprechende Zahl ein!  ");
        try {
            position = sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("\nGib ganze Zahl ein - versuch's noch mal!\n");
        }
        if (position < 1 || position > 9) {
            position = 0;
            System.out.println("\nDie Zahl sollte zwischen 1 und 9 liegen - versuch's noch mal!\n");
        }
        return position;
    }
    static boolean takeInput(int position){
        //takes given int position between 1 and 9 and writes int player into corresponding place in matrix
        //1 2 3
        //4 5 6
        //7 8 9
        //returns false if position not in range or position already taken
        if (position < 1 || position > 9) return false;

        int row;
        int col;

        if (position % 3 != 0) {
            row = position / 3;
            col = (position % 3 - 1) % 3;
        } else {
            row = position / 3 - 1;
            col = 2;
        }

        if (tictactoe[row][col] == 0) {
            tictactoe[row][col] = player;

        return true;}
        System.out.println("\nFeld schon belegt - versuch's noch mal!\n");
        return false;
    }
    static boolean takeInput_oldversion(int position) {
        //takes given int position between 1 and 9 and writes int player into corresponding place in matrix
        //1 2 3
        //4 5 6
        //7 8 9
        //returns false if position not in range
        switch ( position ) {
            case 1:
                if (tictactoe[0][0] == 0) {
                    tictactoe[0][0] = player;
                    return true;
                }
                return false;
            case 2:
                if (tictactoe[0][1] == 0) {
                    tictactoe[0][1] = player;
                    return true;
                }
                return false;
            case 3:
                if (tictactoe[0][2] == 0) {
                    tictactoe[0][2] = player;
                    return true;
                }
                return false;
            case 4:
                if (tictactoe[1][0] == 0) {
                    tictactoe[1][0] = player;
                    return true;
                }
                return false;
            case 5:
                if (tictactoe[1][1] == 0) {
                    tictactoe[1][1] = player;
                    return true;
                }
                return false;
            case 6:
                if (tictactoe[1][2] == 0) {
                    tictactoe[1][2] = player;
                    return true;
                }
                return false;
            case 7:
                if (tictactoe[2][0] == 0) {
                    tictactoe[2][0] = player;
                    return true;
                }
                return false;
            case 8:
                if (tictactoe[2][1] == 0) {
                    tictactoe[2][1] = player;
                    return true;
                }
                return false;
            case 9:
                if (tictactoe[2][2] == 0) {
                    tictactoe[2][2] = player;
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
    static char[][] matrixToChar() {
        char[][] charMatrix = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tictactoe[i][j] == 0) charMatrix[i][j] = '.';
                if (tictactoe[i][j] == 1) charMatrix[i][j] = 'X';
                if (tictactoe[i][j] == 2) charMatrix[i][j] = 'O';
            }
        }
        return charMatrix;
    }


}

