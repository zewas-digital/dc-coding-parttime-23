package claudia.week8_arrays;
/*
Das Spiel wird auf einem senkrecht stehenden hohlen Spielbrett gespielt, in das die Spieler abwechselnd ihre Spielsteine fallen lassen.
Das Spielbrett besteht aus sieben Spalten (senkrecht) und sechs Reihen (waagerecht).
Jeder Spieler besitzt 21 gleichfarbige Spielsteine. Wenn ein Spieler einen Spielstein in eine Spalte fallen lässt, besetzt dieser den untersten freien Platz der Spalte.
Gewinner ist der Spieler, der es als erster schafft, vier oder mehr seiner Spielsteine waagerecht, senkrecht oder diagonal in eine Linie zu bringen.

Das Spiel endet unentschieden, wenn das Spielbrett komplett gefüllt ist, ohne dass ein Spieler eine Viererlinie gebildet hat.
 */

import claudia.BasicFunctions;
import java.util.Scanner;

public class Array_15_FourInARow {
    public static void main(String[] args) {

        int winningPlayer = 0;

        System.out.println("Vier gewinnt, zwei Spieler 1 und 2.");
        gamescore();

        while (winningPlayer == 0) {
            int column = playersInput() - 1;
            int row = move(column);
            winningPlayer = checkWin(row, column);
            gamescore();
            switchPlayer();
        }
        switchPlayer();
        System.out.println("Spieler " + player + " hat gewonnen!");
    }

     private static void gamescore() {

        System.out.println("Spielstand: ");
        for (int i = 1; i <= 7; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("_________________________");
        BasicFunctions.print2DArray(spielfeld);
        System.out.println();
    }

    /**
     * Asks player into which column to put his/her piece, repeats until input is within range;
     * 1 <= column <= 7
     *
     * @return the chosen column
     */
    static int playersInput(){
        int column = 0;
        Scanner sc = new Scanner(System.in);
        while (column < 1 || column > 7) {
            System.out.println("Spieler " + player + " ist dran.");
            System.out.println("Wo willst Du Deinen Spielstein einwerfen?");
            System.out.print("Bitte gib die Spalte ein: ");
            column = sc.nextInt();
        }
        return column;
    }

    /**
     * checks if there are four equal pieces in a row, column or diagonally,
     * starting with spielfeld[row][column],
     * which must be the last piece to have been inserted => spielfeld[row][column] = player!
     *
     * @param row the row of the last inserted piece
     * @param column the column of the last inserted piece
     * @return number of winning player (1 or 2) or else 0, if not yet finished
     */
    static int checkWin(int row, int column){
        //check column
        int counter = 1;
        for (int i = row; i < 5; i++) {//no need to check upwards!
            if (spielfeld[i][column] == spielfeld[i + 1][column]) counter++;
            else break;
        }
        if (counter >= 4) return player;

        //check row
        counter = 1;
        int j = column;
        while (j > 0 && spielfeld[row][j - 1] == spielfeld[row][j]) {//to the left
            counter++;
            j--;
        }
        j = column;
        while (j < 6 && spielfeld[row][j] == spielfeld[row][j + 1]) {//to the right
            counter++;
            j++;
        }
        if (counter >= 4) return player;

        //check diagonals
        //bottom left to up right
        counter = 1;
        int i = row;
        j = column;
        while(i > 0 && j < 6 && spielfeld[i][j] == spielfeld[i-1][j+1]){ //up and right
            counter++;
            i--;
            j++;
        }
        i = row;
        j = column;
        while(i < 5 && j > 0 && spielfeld[i][j] == spielfeld[i+1][j-1]){ //down and left
            counter++;
            i++;
            j--;
        }
        if (counter >= 4) return player;

    // up left to bottom right
        counter = 1;
        i = row;
        j = column;
        while(i < 5 && j < 6 && spielfeld[i][j] == spielfeld[i+1][j+1]){ //down and right
            counter++;
            i++;
            j++;
        }
        i = row;
        j = column;
        while(i < 5 && j > 0 && spielfeld[i][j] == spielfeld[i-1][j-1]){ //up and left
            counter++;
            i--;
            j--;
        }
        if (counter >= 4) return player;
        //if no win yet:
        return 0;
    }

    /**
     *Puts players piece into chosen column
     *
     * @param column column the player has chosen
     * @return row in which piece was put
     */
    static int move(int column){
        int i = 5;
        while (i > 0 && spielfeld[i][column] != 0) {
            i--;
            }
        spielfeld[i][column] = player;
       // counter[player - 1]--;
        return i;
        }
    //static int[] counter = {21, 21}; //counter[i] = Anzahl Spielsteine Player i + 1
    static int player = 1;
    static int[][] spielfeld = new int[6][7];

    /**
     * Switches player from 1 to 2 or vice versa
     */
    static void switchPlayer(){
        if (player == 1) player = 2;
        else player = 1;
    }
}
