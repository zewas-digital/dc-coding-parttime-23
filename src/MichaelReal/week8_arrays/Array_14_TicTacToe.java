package MichaelReal.week8_arrays;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */
/*
import java.util.Scanner;

public class Array_14_TicTacToe {
        private static int[][] board = new int[3][3];
        private static int currentPlayer = 1;

        public static void main(String[] args) {
            initializeBoard();
            printBoard();
            boolean gameWon = false;

            while (!gameWon) {
                playTurn();
                printBoard();
                gameWon = checkWin();
                if (gameWon) {
                    System.out.println("Spieler " + currentPlayer + " gewinnt!");
                } else if (isBoardFull()) {
                    System.out.println("Unentschieden! Das Spielfeld ist voll.");
                    break;
                }
                currentPlayer = (currentPlayer == 1) ? 2 : 1;
            }
        }

        private static void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = 0;
                }
            }
        }

        private static void printBoard() {
            System.out.println("Spielfeld:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == 0) {
                        System.out.print("   ");
                    } else if (board[i][j] == 1) {
                        System.out.print(" X ");
                    } else {
                        System.out.print(" O ");
                    }
                    if (j < 2) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (i < 2) {
                    System.out.println("-----------");
                }
            }
        }

        private static void playTurn() {
            Scanner scanner = new Scanner(System.in);
            int row, col;
            do {
                System.out.print("Spieler " + currentPlayer + ", gib die Zeile (0-2) und die Spalte (0-2) ein: ");
                row = scanner.nextInt();
                col = scanner.nextInt();
            } while (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != 0);

            board[row][col] = currentPlayer;
        }

        private static boolean checkWin() {
            // Überprüfe Zeilen und Spalten
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                    return true; // Spieler gewinnt in Zeile i
                }
                if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                    return true; // Spieler gewinnt in Spalte i
                }
            }

            // Überprüfe Diagonalen
            if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
                return true; // Spieler gewinnt in der Hauptdiagonale
            }
            if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
                return true; // Spieler gewinnt in der Nebendiagonale
            }

            return false;
        }

        private static boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == 0) {
                        return false;
                    }
                }
            }
            return true;
        }
    }*/


