package Matthias.week9_arrays;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */

import java.util.Arrays;

public class Array_14_TicTacToe {
    public static String[] symbol = new String[]{"     ", "  X  ", "  O  "};
    public static void main( String[] args ) {

        /****Programm Ablaufplan****/
        // Darstellung des Feldes
        // 1. Benutzer Eingabe
        // 2. Felderbefüllen
        // 3. Spielfeldausgeben
        //
        // 4. Spieler Wechseln
        // 5. Überprüfe ob Feld befüllt
        // 6. Gewinnüberprüfen
        // 7. Gibt es einen Gewinner
        // 8. Spieler Wechseln

        //Ausgabe: Spieleanleitung fuer den Benutzer
        System.out.println("Tictactoe, zwei Spieler, drei gleiche Zeichen in Zeile, Spalte oder Diagonale gewinnen!");
        System.out.println("Wähle Position über entsprechende Zahl: ");
        System.out.println("[1   2   3]");
        System.out.println("[4   5   6]");
        System.out.println("[7   8   9]");

        //Spielfelder aufspannen
        int[][] Spielfeld = new int[3][3];
        int aktuellerSpieler=1;
        int uebrigeSpielzuege=9;
        boolean gwonnen=false;
        while (uebrigeSpielzuege >0 && !gwonnen){

            //Ausgabe Benutzerstart
            System.out.println( "Start TicTacToe:" );
            //
            arraybefuellen(Spielfeld);
            // Spielfeld ausgeben mit den Zahlen 1-9
            printArray(Spielfeld);
            // Benutzer Infromation für den Spielerwechel
            System.out.println( "Spieler   X  , wohin möchtest du dein Stein setzen?" );
            //if ( Spielfeld[0] ==  ) {
                
            //}
            gwonnen=true;
        }
    }
    //Methode 1: Gibt einen Array auf dem Terminal aus
    private static void printArray(int[][] Spielfeld) {
        for (int i = 0; i < Spielfeld.length; i++) {
            System.out.println(Arrays.toString(Spielfeld[i]));
        }
    }
    //Methode 2: Befuellt den Array mit Zahlen von 0-9
    static public void arraybefuellen(int[][] Spieldfeld) {
        for (int i = 0; i < Spieldfeld.length; i++) {
            for (int j = 0; j < Spieldfeld[i].length; j++) {
                Spieldfeld[i][j] = 0;
            }
        }
    }
    //Methode 3: Wechel der Spieler
    static public void spielerwechel(){

    }
    //Methode 4: Ueberpruefen ob die Eingabe des Benutzers den Richtlinien des Spieles entspricht!
    static public void spielfeldueberpruefen(int[][] Spieldfeld,String[] symbol){
        for (int i = 0; i < Spieldfeld.length; i++) {
            for (int j = 0; j < Spieldfeld[i].length; j++) {

            }
        }
    }

}


