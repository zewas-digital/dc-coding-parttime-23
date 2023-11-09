package Simonsway.Week8;
/*
Das Spiel wird auf einem senkrecht stehenden hohlen Spielbrett gespielt, in das die Spieler abwechselnd ihre Spielsteine fallen lassen.
Das Spielbrett besteht aus sieben Spalten (senkrecht) und sechs Reihen (waagerecht).
Jeder Spieler besitzt 21 gleichfarbige Spielsteine. Wenn ein Spieler einen Spielstein in eine Spalte fallen lässt, besetzt dieser den untersten freien Platz der Spalte.
Gewinner ist der Spieler, der es als erster schafft, vier oder mehr seiner Spielsteine waagerecht, senkrecht oder diagonal in eine Linie zu bringen.

Das Spiel endet unentschieden, wenn das Spielbrett komplett gefüllt ist, ohne dass ein Spieler eine Viererlinie gebildet hat.
 */

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

        // Wenn ich jetzt bei Colum 4 eine Münze platziere, dann muss diese in der Row nach unten gehen solange nicht beseetzt!



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

    private static boolean whoHasWon(char[][] board, char symbol){




        return false;
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static boolean isGameFinished(char[][] board){

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
        System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "|" + board[0][3] + "|" + board[0][4] + "|" + board[0][5] + "|" + board[0][6]);
        System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "|" + board[1][3] + "|" + board[1][4] + "|" + board[1][5] + "|" + board[1][6]);
        System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "|" + board[2][3] + "|" + board[2][4] + "|" + board[2][5] + "|" + board[2][6]);
        System.out.println(board[3][0] + "|" + board[3][1] + "|" + board[3][2] + "|" + board[3][3] + "|" + board[3][4] + "|" + board[3][5] + "|" + board[3][6]);
        System.out.println(board[4][0] + "|" + board[4][1] + "|" + board[4][2] + "|" + board[4][3] + "|" + board[4][4] + "|" + board[4][5] + "|" + board[4][6]);
        System.out.println(board[5][0] + "|" + board[5][1] + "|" + board[5][2] + "|" + board[5][3] + "|" + board[5][4] + "|" + board[5][5] + "|" + board[5][6]);
        System.out.println(board[6][0] + "|" + board[6][1] + "|" + board[6][2] + "|" + board[6][3] + "|" + board[6][4] + "|" + board[6][5] + "|" + board[6][6]);
    }

}
