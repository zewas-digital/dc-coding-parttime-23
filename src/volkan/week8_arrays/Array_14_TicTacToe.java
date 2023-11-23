package volkan.week8_arrays;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */

import java.util.Scanner;

public class Array_14_TicTacToe {

    public static void main(String[] args) {
        // Spielfeld initialisieren
        int[][] board = new int[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 0;
            }
        }

        // Spieler initialisieren
        int player = 1;

        // Spielschleife
        while (true) {
            // Spielfeld ausgeben
            printBoard(board);

            // Spielerzug
            int row = 0, col = 0;
            do {
                System.out.print("Spieler " + player + ", gib deine Eingabe ein (1-9): ");
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();

                // Gültige Eingabe prüfen
                if (input < 1 || input > 9) {
                    System.out.println("Ungültige Eingabe.");
                } else {
                    row = input / 3;
                    col = input % 3;
                }
            } while (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != 0);

            // Spielfeld aktualisieren
            board[row][col] = player;

            // Spielstand prüfen
            boolean gameOver = checkGameOver(board);
            if (gameOver) {
                break;
            }

            // Spieler wechseln
            player = (player == 1) ? 2 : 1;
        }

        // Spielstand ausgeben
        printBoard(board);

        // Sieger ausgeben
        if (player == 1) {
            System.out.println("Spieler 1 hat gewonnen!");
        } else {
            System.out.println("Spieler 2 hat gewonnen!");
        }
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkGameOver(int[][] board) {
        // Horizontale Gewinne prüfen
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0) {
                return true;
            }
        }

        // Vertikale Gewinne prüfen
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0) {
                return true;
            }
        }

        // Diagonale Gewinne prüfen
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
            return true;
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0) {
            return true;
        }

        // Unentschieden prüfen
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }

        // Spiel ist beendet
        return true;
    }
}