package claudia.week9_arrays;

/*
Bonus-Aufgabe: Conways Game of life

In der Aufgabe soll Conways Spiel des Lebens implementiert werden.
https://de.wikipedia.org/wiki/Conways_Spiel_des_Lebens

1. Die Spielregeln findest du hier: https://de.wikipedia.org/wiki/Conways_Spiel_des_Lebens#Die_Spielregeln

2. Als Ausgangsfeld verwende folgende 2D-Arrays GLEITER und SEGLER aus der externen Klasse
2.1 oliver.week9_arrays.GameOfLife.GLEITER
2.2 oliver.week9_arrays.GameOfLife.SEGLER
2.3 Ein zufällig generiertes Array
 */

import claudia.BasicFunctions;

import java.util.Random;
import java.util.Scanner;

public class Arrays_16_GameOfLife {
    //public static int[][] playingfield = GameOfLife.SEGLER;
    //public static int[][] playingfield = GameOfLife.GLEITER;
    public static int[][] playingfield = createRandom2DArray(30, 30);

    public static void main(String[] args) {
        System.out.println("Game of Life, Torusgeometrie");
        BasicFunctions.print2DArrayOfChars(playingfieldToChar());
        for (int i = 0; i < 10000; i++) {
            System.out.println("A");
            nextStep();
            BasicFunctions.print2DArrayOfChars(playingfieldToChar());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }



    public static void nextStep(){
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                next[i][j] = sumOfNeighbours(i, j);
            }
        }
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (next[i][j] == 2 && playingfield[i][j] == 1) playingfield[i][j] = 1;
                else if (next[i][j] == 3) playingfield[i][j] = 1;
                else playingfield[i][j] = 0;

            }

        }
    }
    public static int sumOfNeighbours(int row, int col) {
        int sum = -playingfield[row][col];
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                sum = sum + playingfield[(row + i + numberOfRows) % numberOfRows][(col + j + numberOfColumns) % numberOfColumns];
            }
        }
        return sum;
    }


    public static int numberOfRows = playingfield.length;
    public static int numberOfColumns = playingfield[0]. length;
    static int[][] next = new int[numberOfRows][numberOfColumns];
    static char[][] playingfieldToChar() {
        char[][] charMatrix = new char[numberOfRows][numberOfColumns];
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                if (playingfield[i][j] == 0) charMatrix[i][j] = ' ';
                if (playingfield[i][j] == 1) charMatrix[i][j] = 'X';
            }
        }
        return charMatrix;
    }
    public static int[][] createRandom2DArray(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(0, 2);
            }
        }
        return matrix;
    }

}