package saifedine.week08_arrays.oliver;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */

public class Arrays_14_TicTacToe_Bard_Kommentare {

    // Array mit den Symbolen für die Spieler X und O
    public static String[] symbol = new String[]{"   ", " X ", " O "};

    // Main-Methode, die das Spiel ausführt
    public static void main(String[] args) {
        // Spielfeld initialisieren
        int[][] fields = new int[3][3];

        // Spielstartspieler festlegen
        int currentPlayer = 1;

        // Anzahl der verbleibenden Züge
        int movesLeft = 9;

        // Spielfeld ausgeben
        printField(fields);

        // Spielzug-Schleife
        while (movesLeft > 0 && !checkWinCondition(fields, currentPlayer)) {
            // Spieler X oder O
            String player = symbol[currentPlayer];

            // Benutzereingabe für den nächsten Spielzug erhalten
            int nextField = getUserInput(fields, currentPlayer) - 1;

            // Spielstein auf dem ausgewählten Feld setzen
            fields[nextField / 3][nextField % 3] = currentPlayer;

            // Spielfeld ausgeben
            printField(fields);

            // Überprüfen, ob der Spieler gewonnen hat
            boolean won = checkWinCondition(fields, currentPlayer);

            // Spielende
            if (won) {
                System.out.println("Gratuliere " + player + "! Du hast gewonnen!");
                break;
            }

            // Nächster Spieler
            currentPlayer = 3 - currentPlayer;

            // Verbleibende Züge verringern
            movesLeft--;
        }

        // Unentschieden
        if (!checkWinCondition(fields, currentPlayer)) {
            System.out.println("Es ist unentschieden. Gutes Spiel!");
        }
    }

    // Spielfeld ausgeben
    public static void printField(int[][] fields) {
        System.out.println();
        System.out.println("TicTacToe:");

        for (int i = 0; i < fields.length; i++) {
            // Trennlinie zwischen den Zeilen
            if (i > 0) {
                System.out.println("-----|-----|-----");
            }

            // Leere Zeile
            System.out.println("     |     |     ");

            // Spielsteine oder Feldnummern ausgeben
            for (int j = 0; j < fields[i].length; j++) {
                // Trennlinie zwischen den Spalten
                if (j > 0) {
                    System.out.print("|");
                }

                // Spielstein oder Feldnummer
                if (fields[i][j] > 0) {
                    System.out.print(symbol[fields[i][j]]);
                } else {
                    System.out.printf("  %1d  ", (3 * i + j + 1));
                }
            }

            // Leere Zeile
            System.out.println();
            System.out.println("     |     |     ");
        }
    }

    // Spielzug-Eingabe des Benutzers erhalten
    public static int getUserInput(int[][] fields, int player) {
        int result = -1;

        // Benutzereingabe anfordern, bis ein gültiges Feld ausgewählt wird
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
    // Überprüfen, ob der Spieler die Gewinnbedingung erfüllt hat
    public static boolean checkWinCondition(int[][] fields, int player) {
        // Prüfen der Diagonalen
        if (checkDiag(fields, player) || checkDiag2(fields, player)) {
            return true;
        }

        // Prüfen der Zeilen und Spalten
        for (int i = 0; i < fields.length; i++) {
            if (checkRows(fields, i, player) || checkCols(fields, i, player)) {
                return true;
            }
        }

        // Keine Gewinnbedingung erfüllt
        return false;
    }

    // Prüfen, ob Spieler alle Felder in einer Zeile besetzt hat
    public static boolean checkRows(int[][] fields, int row, int player) {
        // Durchlaufen der Felder in der Zeile
        for (int i = 0; i < fields[row].length; i++) {
            // Feld gehört nicht dem Spieler
            if (fields[row][i] != player) {
                return false;
            }
        }

        // Alle Felder in der Zeile gehören dem Spieler
        return true;
    }

    // Prüfen, ob Spieler alle Felder in einer Spalte besetzt hat
    public static boolean checkCols(int[][] fields, int col, int player) {
        // Durchlaufen der Felder in der Spalte
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][col] != player) {
                return false;
            }
        }

        // Alle Felder in der Spalte gehören dem Spieler
        return true;
    }

    // Prüfen, ob Spieler alle Felder in der Diagonale besetzt hat
    public static boolean checkDiag(int[][] fields, int player) {
        // Durchlaufen der Diagonale
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][i] != player) {
                return false;
            }
        }

        // Alle Felder in der Diagonale gehören dem Spieler
        return true;
    }

    // Prüfen, ob Spieler alle Felder in der Gegendiagonale besetzt hat
    public static boolean checkDiag2(int[][] fields, int player) {
        // Durchlaufen der Gegendiagonale
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][fields.length - i - 1] != player) {
                return false;
            }
        }

        // Alle Felder in der Gegendiagonale gehören dem Spieler
        return true;
    }
}