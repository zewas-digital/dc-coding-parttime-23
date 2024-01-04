package Matthias.week9_arrays;

import java.util.Scanner;

public class Array_14_TicTacToe_finished {
    public static char[] symbol = new char[]{' ', 'X','o'};
    public static void main( String[] args ) {
        //1.Print the Board
        char [][] board={{'x','o','o'},
                         {'x','o','x'},
                         {'x','x','x'}};

        printboard( board );
        playerTrun( board );
        while ( true ){
            Scanner scanner= new Scanner( System.in );
            int user2=scanner.nextInt();
            if ( isValidMove( board,user2 )) {
                break;
            }
            printboard( board );
        }
    /*
        for (char [] row:board) {
            for (char pos:row) {
                System.out.print( pos +"|" );
            }
            System.out.println();
        }
        //2. Check if the Game is Over
        //

     */
    }

    private static void playerTrun( char[][] board ) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Where would you like to play?(1-9)");
        String userInput=scanner.nextLine();
        placeMove( board, userInput, 'c');
    }

    private static void placeMove( char[][] board, String userInput, char symbol) {
        switch ( userInput ){
            case "1": {
                board[0][0]=symbol;
                break;
            }
            case "2": {
                board[0][1]=symbol;
                break;
            }
            case "3": {
                board[0][2]=symbol;
                break;
            }
            case "4": {
                board[1][0]=symbol;
                break;
            }
            case "5": {
                board[1][1]=symbol;
                break;
            }
            case "6": {
                board[1][2]=symbol;
                break;
            }case "7": {
                board[2][0]=symbol;
                break;
            }
            case "8": {
                board[2][1]=symbol;
                break;
            }
            case "9": {
                board[2][2]=symbol;
                break;
            }
            default:{
                System.out.println( ":(" );
            }
        }
    }

    private static void printboard( char[][] board ) {
        for (int i = 0; i < board.length; i++) {
            if ( i > 0) {
                System.out.println(  );
            }
            for (int j = 0; j < board[i].length; j++) {
                System.out.print( board[i][j]);
                if ( j < board[i].length-1 ) {
                    System.out.print( "|" );
                }
            }
            System.out.println(  );
            if ( i < board.length-1 ) {
                System.out.print( "-+-+-" );
            }
        }
    }

    private static boolean isValidMove( char[][]board, int position){
        switch ( position ) {
            case 1: {
                return (board[0][0] == ' ');
            }
            case 2: {
                return (board[0][1] == ' ');
            }
            case 3: {
                return (board[0][2] == ' ');
            }
            case 4: {
                return (board[1][0] == ' ');
            }
            case 5: {
                return (board[1][1] == ' ');
            }
            case 6: {
                return (board[1][2] == ' ');
            }
            case 7: {
                return (board[2][0] == ' ');
            }
            case 8: {
                return (board[2][1] == ' ');
            }
            case 9: {
                return (board[2][2] == ' ');
            }
            default: {
                return false;
            }
        }
    };
}
