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

    char[][] spielfeld = new char[3][3];

    public void TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                spielfeld[i][j] = ' ';
            }
        }
    }

    public void zeigeSpielfeld(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(spielfeld[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }
    public void spielerZug(char spieler) {
        Scanner scanner = new Scanner(System.in);
        int zeile, spalte;
        System.out.println("Spieler " + spieler + ", geben Sie die Zeile und Spalte ein (1-3):");
        do {
            System.out.print("Zeile: ");
            zeile = scanner.nextInt() - 1;
            System.out.print("Spalte: ");
            spalte = scanner.nextInt() - 1;
        } while (zeile < 0 || zeile > 2 || spalte < 0 || spalte > 2 || spielfeld[zeile][spalte] != ' ');

        spielfeld[zeile][spalte] = spieler;
    }

    public boolean istSpielBeendet(char spieler) {
        // Überprüfen, ob der Spieler in einer Zeile, Spalte oder Diagonale gewonnen hat
        for (int i = 0; i < 3; i++) {
            // Überprüfen der Zeilen
            if (spielfeld[i][0] == spieler && spielfeld[i][1] == spieler && spielfeld[i][2] == spieler) {
                return true;
            }
            // Überprüfen der Spalten
            if (spielfeld[0][i] == spieler && spielfeld[1][i] == spieler && spielfeld[2][i] == spieler) {
                return true;
            }
        }
        // Überprüfen der Diagonalen
        if (spielfeld[0][0] == spieler && spielfeld[1][1] == spieler && spielfeld[2][2] == spieler) {
            return true;
        }
        if (spielfeld[0][2] == spieler && spielfeld[1][1] == spieler && spielfeld[2][0] == spieler) {
            return true;
        }
        return false;
    }

    public boolean istUnentschieden() {
        // Überprüfen, ob das Spielfeld voll ist, ohne dass ein Spieler gewonnen hat
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (spielfeld[i][j] == ' ') {
                    return false; // Es gibt mindestens ein leeres Feld
                }
            }
        }
        return true; // Alle Felder sind belegt, Spiel endet unentschieden
    }

    public static void main(String[] args) {
        Array_14_TicTacToe spiel = new TicTacToe();
        char aktuellerSpieler = 'X';

        spiel.zeigeSpielfeld();

        while (true) {
            spiel.spielerZug(aktuellerSpieler);
            spiel.zeigeSpielfeld();

            if (spiel.istSpielBeendet(aktuellerSpieler)) {
                System.out.println("Spieler " + aktuellerSpieler + " gewinnt!");
                break;
            } else if (spiel.istUnentschieden()) {
                System.out.println("Unentschieden!");
                break;
            }

            aktuellerSpieler = (aktuellerSpieler == 'X') ? 'O' : 'X';
        }
    }
}*/


















    /*    private static int[][] board = new int[3][3];
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


