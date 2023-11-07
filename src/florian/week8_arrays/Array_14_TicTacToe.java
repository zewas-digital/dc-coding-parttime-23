package florian.week8_arrays;
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
        Scanner userinput = new Scanner(System.in);

        int[][] field = new int[3][3];
        int leer = 0;
        int player1 = userinput.nextInt();
        int currentplayer = 1;


        // Spielfeld erstellen (Fertig)
        // Spieler einfügen & Interaktion mit Spielfeld ermöglichen
        // Siegbedingung erstellen (Fertig?)


        // Spielfeld

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (j == field[i].length - 1) {
                    System.out.print(field[i][j]);
                } else {
                    System.out.print(field[i][j] + " | ");
                }
            }
            System.out.println();
        }

        // Spieler einfügen & Interaktion mit Spielfeld ermöglichen
        while (currentplayer > 0) {
            if (currentplayer == 1)  {
                currentplayer = 2;
            }else {
                currentplayer = 1;
            }

            switch (player1) {
                case 1 -> field[0][0] = player1;
                case 2 -> field[0][1] = player1;
                case 3 -> field[0][2] = player1;
                case 4 -> field[1][0] = player1;
                case 5 -> field[1][1] = player1;
                case 6 -> field[1][2] = player1;
                case 7 -> field[2][0] = player1;
                case 8 -> field[2][1] = player1;
                case 9 -> field[2][2] = player1;
            }
        }


        // Siegbedingung (Fertig?)
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if ((field[0][0] == 1 && field[0][1] == 1 && field[0][2] == 1) || (field[0][0] == 2 && field[0][1] == 2 && field[0][2] == 2)){                    // Waagerecht Oben
                    System.out.println("Sieger ist: " + player1);
                    break;
                } else if ((field[1][0] == 1 && field [1][1] == 1 && field [1][2] == 1) || (field[1][0] == 2 && field [1][1] == 2 && field [1][2] == 2)){         // Waagerecht Mitte
                    System.out.println("Sieger ist: " + player1);
                    break;
                } else if ((field[2][0] == 1 && field[2][1] == 1 && field[2][2] == 1) || (field[2][0] == 2 && field[2][1] == 2 && field[2][2] == 2)){             // Waagerecht Unten
                    System.out.println("Sieger ist: " + player1);
                    break;
                } else if ((field[0][0] == 1 && field [1][1] == 1 && field [2][2] == 1) || (field[0][0] == 2 && field [1][1] == 2 && field [2][2] == 2)){         // Diagonal Obere Rechteecke zur Unteren Linkenecke
                    System.out.println("Sieger ist: " + player1);
                    break;
                } else if ((field[0][2] == 1 && field [1][1] == 1 && field [2][0] == 1) || (field[0][2] == 2 && field [1][1] == 2 && field [2][0] == 2)){         // Diagonal Obere Linkeecke zur Unteren Rechtenecke
                    System.out.println("Sieger ist: " + player1);
                    break;
                } else if ((field[0][0] == 1 && field [1][0] == 1 && field [2][0] == 1) || (field[0][0] == 2 && field [1][0] == 2 && field [2][0] == 2)){         // Senkrecht Links Oben
                    System.out.println("Sieger ist: " + player1);
                    break;
                } else if ((field[0][1] == 1 && field [1][1] == 1 && field [2][1] == 1) || (field[0][1] == 2 && field [1][1] == 2 && field [2][1] == 2)){         // Senkrecht Mitte Oben
                    System.out.println("Sieger ist: " + player1);
                    break;
                } else if ((field[0][2] == 1 && field [1][2] == 1 && field [2][2] == 1) || (field[0][2] == 2 && field [1][2] == 2 && field [2][2] == 2)) {        // Senkrecht Rechts Oben
                    System.out.println("Sieger ist: " + player1);
                    break;
                }else {System.out.println("Unentschieden");
                    break;
                }
            }
        }



    }
}
