package saifedine.week09_arrays.oliver;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */

import oliver.week9_arrays.ScannerHelper;

public class Arrays_14_TicTacToe {
    public static String[] symbol = new String[]{"     ", "  X  ", "  O  "};

    public static void main(String[] args) {
        int[][] fields = new int[3][3];
        int currentPlayer = 1;
        int movesLeft = 9;
        boolean won = false;

        // Spielfeld ausgeben
        printField(fields);

        // Spiele, solange Züge übrig sind oder ein Gewinner feststeht
        while (movesLeft > 0 && !won) {

            // gültige Benutzer-Eingabe
            int nextField = getUserInput(fields, currentPlayer) - 1;

            System.out.println(nextField +".."+ (nextField / 3) +".."+ (nextField % 3));

            // Feld befüllen
            fields[nextField / 3][nextField % 3] = currentPlayer;

            // Spielfeld ausgeben
            printField(fields);

            // Gewinner überprüfen
            won = checkWinCondition(fields, currentPlayer);

            // Gibt es einen Gewinner?
            if (won) {
                System.out.println("Gratuliere " + symbol[currentPlayer] + "! Du hast gewonnen!");
                break;
            }

            // Spieler wechseln
            currentPlayer = 3 - currentPlayer;
            // Anzahl Züge reduzieren
            --movesLeft;
        }
        // Wenn unentschieden...
        if (!won) {
            System.out.println("Es ist unentschieden. Gutes Spiel!");
        }
    }

    public static void printField(int[][] fields) {
        System.out.println();
        System.out.println("TicTacToe:");
        for (int i = 0; i < fields.length; i++) {
            if (i > 0) {
                System.out.println("-----|-----|-----");
            }
            System.out.println("     |     |     ");
            for (int j = 0; j < fields[i].length; j++) {
                if (j > 0) {
                    System.out.print("|");
                }
                if (fields[i][j] > 0) {
                    System.out.print(symbol[fields[i][j]]);
                } else {
                    System.out.printf("  %1d  ", (3 * i + j + 1));
                }
            }
            System.out.println();
            System.out.println("     |     |     ");
        }
    }

    public static int getUserInput(int[][] fields, int player) {
        int result = -1;

        while (result < 1 || result > 9) {
            result = ScannerHelper.readNumber("Spieler " + symbol[player] + ", wohin möchtest du dein Stein setzen?");

            if (result < 1 || result > 9) {
                System.out.println("Kein gültiges Feld, bitte wähle etwas anderes.");
                result = -1;
            } else if (fields[(result - 1) / 3][(result - 1) % 3] != 0) {
                System.out.println("Das Feld ist schon belegt, bitte wähle etwas anderes.");
                result = -1;
            }
        }
        return result;
    }

    public static boolean checkWinCondition(int[][] fields, int player) {
        // Prüfe Diagonalen
        if (checkDiag(fields, player) || checkDiag2(fields, player)) {
            return true;
        }
        // Prüfe Zeilen und Spalten
        for (int i = 0; i < fields.length; i++) {
            if (checkRows(fields, i, player) || checkCols(fields, i, player)) {
                return true;
            }
        }
        return false;
    }


    public static boolean checkRows(int[][] fields, int row, int player) {
        for (int i = 0; i < fields[row].length; i++) {
            if (fields[row][i] != player) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCols(int[][] fields, int col, int player) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][col] != player) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDiag(int[][] fields, int player) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][i] != player) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkDiag2(int[][] fields, int player) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][fields[i].length - i - 1] != player) {
                return false;
            }
        }
        return true;
    }
}
