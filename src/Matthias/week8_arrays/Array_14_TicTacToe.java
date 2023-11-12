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
    public static String[] symbol = new String[]{"     ", "  X  ", "  O  "};
    public static void main( String[] args ) {


        /****Programm Ablaufplan****/
        // 1. Benutzer Eingabe
        // 2. Felderbefüllen
        // 3. Spielfeldausgeben
        // 4. Gewinnüberprüfen
        // 5. Gibt es einen Gewinner
        // 6. Spieler Wechseln

        System.out.println("Tictactoe, zwei Spieler, drei gleiche Zeichen in Zeile, Spalte oder Diagonale gewinnen!");
        System.out.println("Wähle Position über entsprechende Zahl: ");
        System.out.println("[1   2   3]");
        System.out.println("[4   5   6]");
        System.out.println("[7   8   9]");
        //Spielfelder aufspannen
        int[][] Spielfeld = new int[3][3];
        while (true ){

        }
    }


}
