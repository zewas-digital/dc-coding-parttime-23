package judith.week8_arrays;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.

Spiel soll so aufgebaut werden als würden zwei Spieler gemeinsam spielen.
 */

import judith.Methods.Eingabe_Scanner;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Array_14_TicTacToe {



    public static void main(String[] args) {

        Scanner Eingabe = new Scanner(System.in);
        System.out.println("Willkommen bei TicTacToe geben sie eine Zahl zwischen 1 - 9 ein");
        System.out.println();


            String[][] gameBoard = {
                    {" " + "|" + " " + "|" + " " + " "},
                    {"-" + "+" + "-" + "+" + "-"},
                    {" " + "|" + " " + "|" + " " + " "},
                    {"-" + "+" + "-" + "+" + "-"},
                    {" " + "|" + " " + "|" + " " + " "},
            };

            for (int zeile = 0; zeile < gameBoard.length; zeile++) {
                //  System.out.print(zeile );
                for (int spalte = 0; spalte < gameBoard[zeile].length; spalte++) {
                   System.out.print(gameBoard[zeile][spalte]);
                      System.out.println();
                }

            }



        int p1 = Eingabe.nextInt();


        switch (p1){
            case 1:
                gameBoard[0][0] = "x";
                break;
            case 2:
                gameBoard[0][2] = "x";
                break;
            case 3:
                gameBoard[0][4] = "x";
                break;
            case 4:
                gameBoard[1][0] = "x";
                break;
            case 5:
                gameBoard[1][2] = "x";
                break;
            case 6:
                gameBoard[1][4] = "x";
                break;
            case 7:
                gameBoard[2][0] = "x";
                break;
            case 8:
                gameBoard[2][2] = "x";
                break;
            case 9:
                gameBoard[2][4] = "x";
                break;
        };




    }
}
