package claudia;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BasicFunctions {

    public static void main(String[] args) {
        System.out.print("5 Leerzeichen:");
        printBlanks(5);
        System.out.println("!");
        System.out.print("10 Leerzeichen:");
        printBlanks(10);
        System.out.println("!");
    }

    public static void printBlanks(int n){
        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
    }

    public static void printDashes(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
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
    public static void swapElements(String[] list, int i, int j) {
        if (i != j) {
            String temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }

    public static void print1DArray(int[] vector){
        System.out.println(Arrays.toString(vector));
    }

    public static void print1DArray(String[] vector){
        System.out.println(Arrays.toString(vector));
    }
    public static void print1DArray(char[] vector){
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

    /**
     * Reads in integer, catches InputMismatchException
     *
     * @param message the String which is displayed before the input
     * @return the given input or -1, if wrong type is given
     */
    public static int readInt(String message){
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        int input = -1;
        try{
            input = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Fehler, Eingabe keine ganze Zahl!"); //auch möglich: z.B. switch (e.toString()) um auf verschiedene Fehler verschieden zu reagieren
        }
        return input;
    }
    public static char readChar(String message){
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        String input = "";
        try{
            input = sc.next();
        } catch (InputMismatchException e) {
        }
        return input.charAt(0);
    }
}