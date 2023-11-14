package claudia;

import java.util.Arrays;
import java.util.Random;

public class BasicFunctions {

    public static void main(String[] args) {
    }

    public static int[] createRandom1DArray(int size) {
        Random random = new Random();
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(1, 101);
        }
        return vector;
    }

    public static void swapElementsIn1DArray(int[] vector, int i, int j) {
        if (i != j) {
            int temp = vector[i];
            vector[i] = vector[j];
            vector[j] = temp;
        }
    }

    public static void print1DArray(int[] vector){
        System.out.println(Arrays.toString(vector));
    }

    public static int[][] createRandom2DArray(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(1, 101);
            }
        }
        return matrix;
    }

    public static void print2DArray(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void print2DArrayOfStrings(String[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void print2DArrayOfChars(char[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}