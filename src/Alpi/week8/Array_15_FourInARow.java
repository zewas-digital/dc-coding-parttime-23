package Alpi.week8;
/*
Das Spiel wird auf einem senkrecht stehenden hohlen Spielbrett gespielt, in das die Spieler abwechselnd ihre Spielsteine fallen lassen.
Das Spielbrett besteht aus sieben Spalten (senkrecht) und sechs Reihen (waagerecht).
Jeder Spieler besitzt 21 gleichfarbige Spielsteine. Wenn ein Spieler einen Spielstein in eine Spalte fallen lässt, besetzt dieser den untersten freien Platz der Spalte.
Gewinner ist der Spieler, der es als erster schafft, vier oder mehr seiner Spielsteine waagerecht, senkrecht oder diagonal in eine Linie zu bringen.

Das Spiel endet unentschieden, wenn das Spielbrett komplett gefüllt ist, ohne dass ein Spieler eine Viererlinie gebildet hat.
 */

import java.util.Scanner;

public class Array_15_FourInARow {


    public static void main(String[] args) {
        int [][] array = new int[6][11];
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

    static void printTable (int [][] array) {

        for (int i = 0; i < 6; i++) {
            for (int j = 2; j < 9; j++) {
                System.out.print ( array[i][j]+"  " );
            }
            System.out.println ();
        }
    }
    static void set(int [][] array, int player){
        int column;
        Scanner inputkonsole = new Scanner ( System.in );

        while(true) {
            System.out.println ( "Spieler " + player + " ist an der Reihe" );
            System.out.println ( "In welche spalte möchtest du deinen Stein setzen?" );
            System.out.print ( "Spalte: " );
            column = inputkonsole.nextInt ( );
            System.out.println ( );
            if (column >0 && column < 8){

                if(array[0][column+1] == 0) {
                    for (int i = 5; i > -1; i--) {
                        if (array[i][column + 1] == 0) {
                            array[i][column + 1] = player;
                            break;
                        }

                    }
                    break;
                }else{
                    System.out.println ("Diese Spalte ist schon voll" );
                    System.out.println ( );
                }
            }else{
                System.out.println ( "Eingabe ungültig" );
            }
        }
    }
    static boolean checkWin(int [][] array){
        boolean win = false;
        // Kontrolle ob vier gleiche in einer Reihe sind
        for (int i = 0; i <6; i++) {
            int counter=0;
            for (int j = 2; j <10; j++) {
                if (array[i][j] == array[i][j+1] && array[i][j] != 0){
                    counter++;
                    if(counter == 3){break;}
                }else{counter=0;}
            }
            if(counter == 3){
                win = true;
                break;
            }
        }
        // Kontrolle ob vier gleiche in einer Spalte sind
        for (int i = 2; i <10; i++) {
            int counter=0;
            for (int j = 0; j <5; j++) {
                if (array[j][i] == array[j+1][i] && array[j][i] != 0){
                    counter++;
                    if(counter == 3){break;}
                }else{counter=0;}
            }
            if(counter == 3){
                win = true;
                break;
            }
        }
        // Kontrolle ob vier gleiche in einer Diagonale sind
        // von oben links nach unten rechts
        for (int i = 0; i < 6; i++) {
            int counter=0;
            int k = 0;

            for (int j = i; j < i+5; j++) {
                if (array[0 + k][j] == array[1 + k][j + 1] && array[0 + k][j] != 0) {
                    counter++;
                    if (counter == 3) {
                        break;
                    }
                } else {
                    counter = 0;
                }
                k++;
            }
            if(counter == 3){
                win = true;
                break;
            }
        }

        // Kontrolle ob vier gleiche in einer Diagonale sind
        // von oben rechts nach unten links
        for (int i = 0; i < 6; i++) {
            int counter=0;
            int k = 0;

            for (int j = i; j < i +5; j++) {
                if (array[5 - k][j] == array[4 - k][j + 1] && array[5 - k][j] != 0) {
                    counter++;
                    if (counter == 3) {
                        break;
                    }
                } else {
                    counter = 0;
                }
                k++;
            }
            if(counter == 3){
                win = true;
                break;
            }
        }

        return win;
    }

}

