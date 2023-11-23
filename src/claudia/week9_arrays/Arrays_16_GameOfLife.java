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
    //public static int[][] playingfield = GameOfLife.PULSATOR;
    public static int[][] playingfield = createRandom2DArray(20, 30);
    public static boolean torus = true;


    public static void main(String[] args) {
        if (torus) {
            //TORUSGEOMETRIE!

            BasicFunctions.print2DArrayOfChars(playingfieldToChar());
            for (int i = 0; i < 10000; i++) {
                nextStep();
                BasicFunctions.print2DArrayOfChars(playingfieldToChar());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else {
            //KEINE TORUSGEOMETRIE
            //Setze Ränder auf 1 d.h. "lebendig", ganzen Rest auf 0, d.h. "tot"
            /*for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    if (i == 0 || i == numberOfRows - 1 || j == 0 || j == numberOfColumns - 1){
                        playingfield[i][j] = 1;
                    }
                    else playingfield[i][j] = 0;
                }

            }*/
            //Setze Ränder auf 0, d.h. "tot", Rest zufällig
            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    if (i == 0 || i == numberOfRows - 1 || j == 0 || j == numberOfColumns - 1) {
                        playingfield[i][j] = 0;
                    }
                }

            }

            BasicFunctions.print2DArrayOfChars(playingfieldToChar());
            for (int i = 0; i < 10000; i++) {
                nextStepNotToric();
                BasicFunctions.print2DArrayOfChars(playingfieldToChar());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void nextStepNotToric(){
        //lasse Ränder unberücksichtigt auf 1
        for (int i = 1; i < numberOfRows - 1; i++) {
            for (int j = 1; j < numberOfColumns - 1; j++) {
                next[i][j] = sumOfNeighbours(i, j);
            }
        }
        for (int i = 1; i < numberOfRows - 1; i++) {
            for (int j = 1; j < numberOfColumns - 1; j++) {
                if (next[i][j] == 2 && playingfield[i][j] == 1) playingfield[i][j] = 1;
                else if (next[i][j] == 3) playingfield[i][j] = 1;
                else playingfield[i][j] = 0;

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
        int charRows = numberOfRows + 2;
        int charCols = numberOfColumns + 2;
        char[][] charMatrix = new char[charRows][charCols];
        for (int i = 0; i < charRows; i++) {
            for (int j = 0; j < charCols; j++) {
                charMatrix[i][j] = ' ';
                //first and last row:
                if (i == 0 || i == charRows - 1) charMatrix[i][j] = '_';
                //first and last column:
                else if (j == 0 || j == charCols - 1) charMatrix[i][j] = '|';
                //i > 0, j > 0:
                //i < charCols - 1, j < charCols - 1
                else if (playingfield[i - 1][j - 1] == 0) charMatrix[i][j] = ' ';
                else charMatrix[i][j] = 'X';
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