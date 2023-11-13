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
        while (true){
            System.out.println( "TicTacToe:" );
            Arraybefuellen( Spielfeld, 1,9 );
            System.out.println( "Spieler   X  , wohin möchtest du dein Stein setzen?" );
        }
        //Methode befüllen zwei Dimensionaler Array mit N Zahlen
       
    }
    static public void Arraybefuellen(int[][] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = NZahlen( min, max );
            }
        }
    }
    static int NZahlen(int min,int max){
        int zaehler=0;
        for (int i = min; i <max ; i++) {
            zaehler=i;
        }
        return zaehler;
    }
}
