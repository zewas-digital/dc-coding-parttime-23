package eslem.week08;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */
import Alpi.week9.ScannerHelper;
import java.util.Scanner;
import java.util.Random;


public class Array_14_TicTacToe {
        public static String[] symbol = new String[]{" ", " x ", " o "};

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Random random = new Random();

                int[][] feld = new int[3][3];
                int spieler = 1;
                int züge = 9;           // 9>0
                boolean win = false;

                printFeld(feld);

                                while (züge > 0 && !win) {
                                        int nextFeld = getUserInput(feld, spieler) - 1;

                                        feld[nextFeld / 3][nextFeld % 3] = spieler;

                                        printFeld(feld);

                                        win = checkWinner(feld, spieler);

                                        if (win) {
                                                System.out.println("Gratulation!" + symbol[spieler] + "Sie haben Gewonnen!");
                                                break;
                                        }

                                        spieler = 3 - spieler;
                                        --züge;

                                        if (!win) {
                                                System.out.println("Unentschieden!");
                                        }
                                }
                        }

                public static void printFeld(int[][] feld){
                        System.out.println();
                        System.out.println("Tic-Tac-Toe");
                        for (int i = 0; i < feld.length; i++) {
                                if(i > 0){
                                        System.out.println("-------");
                                }
                                System.out.println();
                                for (int j = 0; j < feld[i].length; j++) {
                                        if(j > 0) {
                                                System.out.print("|");
                                        }
                                        if(feld[i][j] > 0){
                                                System.out.print(symbol[feld[i][j]]);
                                        } else {
                                                System.out.printf("%1d",(3*i+j+1));
                                        }
                                }
                                System.out.println();
                        }
                }

                public static int getUserInput (int[][] feld, int spieler){
                        int ergebnis = -1;
                        while (ergebnis < 1 || ergebnis > 9) {
                                ergebnis = ScannerHelper.readNumber("Spieler" + symbol[spieler] + "Wohin möchtest du deine Stein setzen?");
                                if (ergebnis < 1 || ergebnis > 9) {
                                        System.out.println("Nicht gültig, wähle etwas anderes!");
                                        ergebnis = -1;
                                } else if (feld[(ergebnis - 1) / 3][(ergebnis - 1) % 3] != 0) {
                                        System.out.println("Feld ist schon besetzt, wähle etwas anderes!");
                                        ergebnis = -1;
                                }
                        }
                        return ergebnis;
                }

                public static boolean checkWinner(int[][] feld, int spieler){
                        for (int i = 0; i < feld.length; i++) {
                                if(checkRows(feld, i , spieler) || checkCols(feld, i , spieler)){
                                        return true;
                                }
                        }
                        return false;
                }
                public static boolean checkRows(int[][] feld, int row, int spieler){
                        for (int i = 0; i < feld[row].length; i++) {
                                if(feld[row][i] != spieler){
                                        return false;
                                }
                        }
                        return true;
                }

        public static boolean checkCols(int[][] feld, int col, int spieler){
                for (int i = 0; i < feld.length; i++) {
                        if(feld[i][col] != spieler){
                                return false;
                        }
                }
                return true;
        }
}