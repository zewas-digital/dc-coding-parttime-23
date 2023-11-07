package eslem.week08;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Array_14_TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int[][] numbers = new int [3][3];
        boolean spieler1 = true;
        boolean spieler2 = false;

        char[][] tabelle = {{' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}};

    }
}
