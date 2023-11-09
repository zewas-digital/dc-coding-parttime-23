package Alpi.week8;
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

        private static int[][] field = new int[3][3];
        private static int turn = 1;

        public static void main(String[] args) {

            // Spielfeld initialisieren
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    field[i][j] = 0;
                }
            }

            // Spiel starten
            play();
        }

        private static void play() {

            while (true) {

                // Spieler an der Reihe
                System.out.println("Spieler " + turn + " ist an der Reihe.");

                // Spielerzug
                makeMove();

                // Spielstand prüfen
                if (checkWin()) {
                    break;
                }

                // Spieler wechseln
                turn = (turn == 1) ? 2 : 1;
            }

            // Spielstand ausgeben
            printField();

            // Spiel beenden
            if (turn == 1) {
                System.out.println("Spieler 2 hat gewonnen!");
            } else {
                System.out.println("Spieler 1 hat gewonnen!");
            }
        }

        private static void makeMove() {

            // Eingabe abfragen
            System.out.print("Zeile: ");
            int row = new Scanner(System.in).nextInt();
            System.out.print("Spalte: ");
            int col = new Scanner(System.in).nextInt();

            // Symbol setzen
            field[row - 1][col - 1] = turn;
        }

        private static boolean checkWin() {

            // Horizontale Prüfung
            for (int i = 0; i < field.length; i++) {
                if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][0] != 0) {
                    return true;
                }
            }

            // Vertikale Prüfung
            for (int i = 0; i < field.length; i++) {
                if (field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[0][i] != 0) {

                    return true;
                }
            }

            // Diagonale Prüfung
            if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[0][0] != 0) {
                return true;
            }

            if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[0][2] != 0) {
                return true;
            }

            // Wenn kein Spieler gewonnen hat, ist das Spiel unentschieden.
            return false;
        }

        private static void printField() {

            // Das Spielfeld wird ausgegeben.

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    switch (field[i][j]) {
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                            System.out.print("X");
                            break;
                        case 2:
                            System.out.print("O");
                            break;
                    }
                }
                System.out.println();
            }

        }

    }

