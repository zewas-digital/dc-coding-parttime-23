package Simonsway.Week8;
/*
Das Spiel wird auf einem senkrecht stehenden hohlen Spielbrett gespielt, in das die Spieler abwechselnd ihre Spielsteine fallen lassen.
Das Spielbrett besteht aus sieben Spalten (senkrecht) und sechs Reihen (waagerecht).
Jeder Spieler besitzt 21 gleichfarbige Spielsteine. Wenn ein Spieler einen Spielstein in eine Spalte fallen lässt, besetzt dieser den untersten freien Platz der Spalte.
Gewinner ist der Spieler, der es als erster schafft, vier oder mehr seiner Spielsteine waagerecht, senkrecht oder diagonal in eine Linie zu bringen.

Das Spiel endet unentschieden, wenn das Spielbrett komplett gefüllt ist, ohne dass ein Spieler eine Viererlinie gebildet hat.
 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array_15_FourInARow {
    public static void main(String[] args) {

        char[][] board = {{' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' '},
                          {' ', ' ', ' ', ' ', ' ', ' ', ' '}};

        printBoard(board);

        while (true) {
            playerTurn(board);
            if (isGameFinished(board)){
                break;
            }
            printBoard(board);
            computerTurn(board);
            printBoard(board);
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static boolean checkWinner(char[][] board, char symbol) {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                // Check horizontal
                if (symbol != ' ' && col + 3 < board[row].length &&
                        board[row][col] == symbol && board[row][col + 1] == symbol &&
                        board[row][col + 2] == symbol && board[row][col + 3] == symbol) {
                    return true;
                }
                // Check vertical
                if (symbol != ' ' && row + 3 < board.length &&
                        board[row][col] == symbol && board[row + 1][col] == symbol &&
                        board[row + 2][col] == symbol && board[row + 3][col] == symbol) {
                    return true;
                }
            }
        }
        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 0; col < board[row].length - 3; col++) {
                if (symbol != ' ' && board[row][col] == symbol &&
                        board[row + 1][col + 1] == symbol &&
                        board[row + 2][col + 2] == symbol &&
                        board[row + 3][col + 3] == symbol) {
                    return true;
                }
            }
        }

        for (int row = 0; row < board.length - 3; row++) {
            for (int col = 3; col < board[row].length; col++) {
                if (symbol != ' ' && board[row][col] == symbol &&
                        board[row + 1][col - 1] == symbol &&
                        board[row + 2][col - 2] == symbol &&
                        board[row + 3][col - 3] == symbol) {
                    return true;
                }
            }
        }

        return false;

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static boolean isGameFinished(char[][] board){

        if (checkWinner(board, 'X')){
            printBoard(board);
            System.out.println("PlayerWins");
            return true;
        }

        if (checkWinner(board, 'O')){
            printBoard(board);
            System.out.println("PlayerWins");
            return true;
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void computerTurn(char[][] board) {
        Random random = new Random();
        int computerTurn;
        while (true){
            computerTurn = random.nextInt(6) + 1;
            if (isTurnValid(board, computerTurn)){ // computerTurn checks in the method position valid true or false
                break;
            }
        }
        System.out.println("Computer turn " + computerTurn);
        placeTurn(board, Integer.toString(computerTurn), 'O');
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void playerTurn(char[][] board) {

        String userInput;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Place your bit between (1-7)");
            userInput = scanner.nextLine();
            if (isTurnValid(board, Integer.parseInt(userInput))){
                break;
            } else {
                System.out.println(userInput + " Is already taken");
            }
        }
        placeTurn(board, userInput, 'X');
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void placeTurn(char[][] board, String position, char symbol) {

        int col = Integer.parseInt(position) -1;

        for (int row = board.length - 1; row >= 0; row--){
            if (board[row][col]== ' '){
                board[row][col] = symbol;
                return;
            }
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static boolean isTurnValid (char[][] board, int position){
        switch (position){
            case 1:
                return (board[0][0] == ' ');
            case 2:
                return (board[0][1] == ' ');
            case 3:
                return (board[0][2] == ' ');
            case 4:
                return (board[0][3] == ' ');
            case 5:
                return (board[0][4] == ' ');
            case 6:
                return (board[0][5] == ' ');
            case 7:
                return (board[0][6] == ' ');
            default:
                return false;
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void printBoard(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col]);
                if (col < board[row].length - 1)
                    System.out.print("|");
            }
            System.out.println();
        }
        System.out.println();

    }

}
