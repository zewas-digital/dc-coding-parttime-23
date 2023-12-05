package Simonsway.Week8;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */

import java.util.Random;

import Simonsway.Methods.Scanner_Helper;

public class Array_14_TicTacToe {
    public static void main(String[] args) {

        // 1. Zwei verschiedene User Eingaben
        // 2. Prüfung ob im 2D array zwischgen row and col größer als 0 vorhanden sind
        // 3. Je nach dem welcher User die X oder O eintragen
        // 4. Gewinner ermitteln

        char[][] board = {{' ', ' ', ' '},
                          {' ', ' ', ' '},
                          {' ', ' ', ' '}};

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
    private static boolean whoHasWon(char[][] board, char symbol){

        if ((board [0][0] == symbol && board [0][1] == symbol && board [0][2] == symbol) ||
            (board [1][0] == symbol && board [1][1] == symbol && board [1][2] == symbol) ||
            (board [2][0] == symbol && board [2][1] == symbol && board [2][2] == symbol) ||

            (board [0][0] == symbol && board [1][0] == symbol && board [2][0] == symbol) ||
            (board [0][1] == symbol && board [1][1] == symbol && board [2][1] == symbol) ||
            (board [2][0] == symbol && board [2][1] == symbol && board [2][2] == symbol) ||

            (board [0][0] == symbol && board [1][1] == symbol && board [2][2] == symbol) ||
            (board [0][2] == symbol && board [1][1] == symbol && board [2][0] == symbol) ) {
            return true;
        }
    return false;
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static boolean isGameFinished(char[][] board) {

       if (whoHasWon(board, 'X')){
           printBoard(board);
           System.out.println("Player Wins");
           return true;
       }

        if (whoHasWon(board, 'O')){
            printBoard(board);
            System.out.println("Computer Wins");
            return true;
        }

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
               if (board[row][col] == ' '){
                   return false;  // We interate as long as the system can find blank spots
               }
            }
        }

        printBoard(board);
        System.out.println("The Game ended in a tie!");
        return true; // If the system doesnt find a blank spot we return true as the game is finished then
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
                return (board[1][0] == ' ');
            case 5:
                return (board[1][1] == ' ');
            case 6:
                return (board[1][2] == ' ');
            case 7:
                return (board[2][0] == ' ');
            case 8:
                return (board[2][1] == ' ');
            case 9:
                return (board[2][2] == ' ');
            default:
                return false;
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void computerTurn(char[][] board) {

        Random random = new Random();

        int computerTurn;

        while (true){
            computerTurn = random.nextInt(9) + 1;
            if (isTurnValid(board, computerTurn)){ // computerTurn checks in the method position valid true or false
                break;
            }
        }
        System.out.println("Computer turn " + computerTurn);
        placeTurn(board, computerTurn, 'O');
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void playerTurn(char[][] board) {

        int userInput;

        while (true){
            System.out.println("Place your bit between (1-9)");
            userInput = Scanner_Helper.scannerHelperInt("Wrong input please number between 1-9");
            if (isTurnValid(board, userInput)){
                break;
            } else {
                System.out.println(userInput + " Is already taken");
            }
        }

        placeTurn(board, userInput, 'X');
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void placeTurn(char[][] board, int position, char symbol) {

        switch (position){
            case 1:
                board[0][0] = symbol;
            break;
            case 2:
                board[0][1] = symbol;
                break;
            case 3:
                board[0][2] = symbol;
                break;
            case 4:
                board[1][0] = symbol;
                break;
            case 5:
                board[1][1] = symbol;
                break;
            case 6:
                board[1][2] = symbol;
                break;
            case 7:
                board[2][0] = symbol;
                break;
            case 8:
                board[2][1] = symbol;
                break;
            case 9:
                board[2][2] = symbol;
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void printBoard(char[][] board) {

        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
    }
}
