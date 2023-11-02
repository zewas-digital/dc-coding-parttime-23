package michael_k.week8;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Array_14_TicTacToe {

    public static void main(String[] args) {

        int [][] array = new int[3][3];
        int player=1;
        boolean win = false;

        while(true) {


            printTable ( array );
            set ( array, player );
            win = checkWin ( array );

            if(win == true){
                printTable ( array );
                System.out.println ("Spieler "+player+" hat gewonnen" );
                break;
            }

            if(player==1){
                player = 2;
            }else{player=1;}
        }
    }


static void set(int [][] array, int player){
    int row;
    int column;
    Scanner inputkonsole = new Scanner ( System.in );

    while(true) {
        System.out.println ( "Spieler " + player + " ist an der Reihe" );
        System.out.println ( "In welches Feld möchtest du deinen Stein setzen?" );
        System.out.print ( "Zeile: " );
        row = inputkonsole.nextInt ( );
        System.out.print ( "Spalte: " );
        column = inputkonsole.nextInt ( );
        System.out.println ( );

        if (array[row - 1][column - 1] == 0) {
            array[row - 1][column - 1] = player;
            break;
        } else {
            System.out.println ( "Dieses Feld ist schon belegt" );
        }
    }
}

static void printTable (int [][] array){

    for (int i = 0; i <3; i++) {
        System.out.println ( Arrays.toString ( array[i]) );
    }

}
static boolean checkWin(int [][] array){
   boolean win = false;
   // Kontrolle ob 3 gleiche in einer Zeile
    for (int i = 0; i < 3; i++) {
        int a;
        int b;
        int c;
        a = array[i][0];
        b = array[i][1];
        c = array[i][2];
        if (a == b && b == c && a != 0){
            win = true;
        }
    }
    // Kontrolle ob 3 gleiche in einer Spalte
    for (int i = 0; i < 3; i++) {
        int a;
        int b;
        int c;
        a = array[0][i];
        b = array[1][i];
        c = array[2][i];
        if (a == b && b == c && a != 0){
            win = true;
        }
    }
    // Kontrolle ob 3 gleiche in einer Diagonale
    int u = array[0][0];
    int v = array[1][1];
    int w = array[2][2];
    if (u == v && v == w && u != 0){
        win = true;
    }
    // Kontrolle ob 3 gleiche in der anderen Diagonale
    int x = array[0][2];
    int y = array[1][1];
    int z = array[2][0];
    if (x == y && y == z && x != 0){
        win = true;
    }

    return win;
}

}
