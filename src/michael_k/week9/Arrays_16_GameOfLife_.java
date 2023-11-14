package michael_k.week9;

import java.util.Random;

public class Arrays_16_GameOfLife_ {


    public static void main(String[] args) {

        int iteration=1;
        int[][] board = new int[50][100];

        randomFill ( board );

        while(true) {
            printboard ( board );
            System.out.println (iteration );
            int[][] cacheArray = createNewGeneration ( board );
            overwriteBoard ( board, cacheArray );
            System.out.println ( );

            try {
                Thread.sleep ( 500);
            } catch (InterruptedException e) {
                throw new RuntimeException ( e );
            }
            iteration++;
        }
    }

    static void randomFill(int[][] board){
        // Zufällige füllung des Spielfelds
        Random randomNumber = new Random ();
        int rows = board.length;
        int column = board[0].length;

        for (int i = 0; i <rows; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j] = randomNumber.nextInt ( 2);
            }
        }
        // Der Spielfeldrand wird statisch mit toten Zellen befüllt
        for (int i = 0; i < column; i++) {
            board[0][i] = 0;
        }
        for (int i = 0; i < column; i++) {
            board[rows-1][i] = 0;
        }
        for (int i = 0; i < rows; i++) {
            board[i][0] = 0;
        }
        for (int i = 0; i < rows; i++) {
            board[i][column-1] = 0;
        }

    }
    static void printboard(int[][] board){

        String[][] convertedBoard = new String[board.length][board[0].length];
        int rows = board.length;
        int column = board[0].length;

        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    convertedBoard[i][j] = " ";
                } else {
                    convertedBoard[i][j] = "X";
                }
            }
        }
        for (int i = 0; i < column; i++) {
            convertedBoard[0][i] = "_";
        }
        for (int i = 0; i < column; i++) {
            convertedBoard[rows-1][i] = "_";
        }
        for (int i = 1; i < rows; i++) {
            convertedBoard[i][0] = "|";
        }
        for (int i = 1; i < rows; i++) {
            convertedBoard[i][column-1] = "|";
        }

        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print ( convertedBoard[i][j]);
            }
            System.out.println ( );
        }



    }
    static int[][] createNewGeneration(int[][] board){

        int[][] cacheArray = new int[board.length][board[0].length];
        int rows = board.length;
        int column = board[0].length;
        int deathCell=0;
        int livingCell=0;

        for (int i = 1; i < board.length-1; i++) {
            for (int j = 1; j < board[0].length-1; j++) {

                for (int k = i-1; k <i+2; k++) {
                    for (int l = j-1; l <j+2 ; l++) {
                        if(k==i && l==j){
                            continue;
                        }
                        if (board[k][l]==0 ){
                            deathCell++;
                        }else{
                            livingCell++;
                        }
                    }
                }

                if(board[i][j]== 0){
                    if(livingCell==3){
                        cacheArray[i][j]=1;
                    }
                }

                if(board[i][j]== 1){

                    if(livingCell < 2){
                        cacheArray[i][j] = 0;
                    }

                    if(livingCell > 1 && livingCell <4){
                        cacheArray[i][j] = 1;
                    }

                    if(livingCell > 3){
                        cacheArray[i][j] = 0;
                    }

                }
                deathCell=0;
                livingCell=0;
            }

        }

        return cacheArray;

    }
    static void overwriteBoard(int[][] board, int[][] cacheArray){

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = cacheArray[i][j];
            }
        }
    }

}
