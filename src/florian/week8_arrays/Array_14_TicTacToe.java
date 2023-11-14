package florian.week8_arrays;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */




import java.util.Scanner;

public class Array_14_TicTacToe {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        int[][] field = new int[3][3];
        int moves = 9;
        int currentplayer = 1;



        // Spielfeld erstellen (Fertig)
        // Interaktion mit Spielfeld ermöglichen (Fertig)
        // Siegbedingung erstellen (Fertig)
        // Erneute Abfrage bei Falscher Eingabe ()

        gamefield(field); // Spielfeld (Fertig)


        // Interaktion mit Spielfeld ermöglichen
        while (moves > 0) {
           System.out.println("Spieler: " + currentplayer + " Gib eine Zahl von 1 bis 9 ein: ");
            int playerinput = userinput.nextInt();

            switch (playerinput) {
                case 1 -> field[0][0] = currentplayer;
                case 2 -> field[0][1] = currentplayer;
                case 3 -> field[0][2] = currentplayer;
                case 4 -> field[1][0] = currentplayer;
                case 5 -> field[1][1] = currentplayer;
                case 6 -> field[1][2] = currentplayer;
                case 7 -> field[2][0] = currentplayer;
                case 8 -> field[2][1] = currentplayer;
                case 9 -> field[2][2] = currentplayer;
            }
            gamefield(field);
            if (checkwinner(field, currentplayer)) {
                break;
            }
            if (currentplayer == 1) {
                currentplayer = 2;
            } else {
                currentplayer = 1;
            }
            moves--;

        }
        if (moves == 0) {
            System.out.println("Unentschieden");
        }
    }

    public static int[][] gamefield(int[][] field) {
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
        return field;
    }

    public static boolean checkwinner(int[][] field, int currentplayer) {
        // Siegbedingung (Fertig)

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if ((field[0][0] == 1 && field[0][1] == 1 && field[0][2] == 1) || (field[0][0] == 2 && field[0][1] == 2 && field[0][2] == 2)) {                    // Waagerecht Oben
                    System.out.println("Sieger ist: " + currentplayer);
                    return true;
                } else if ((field[1][0] == 1 && field[1][1] == 1 && field[1][2] == 1) || (field[1][0] == 2 && field[1][1] == 2 && field[1][2] == 2)) {         // Waagerecht Mitte
                    System.out.println("Sieger ist: " + currentplayer);
                    return true;
                } else if ((field[2][0] == 1 && field[2][1] == 1 && field[2][2] == 1) || (field[2][0] == 2 && field[2][1] == 2 && field[2][2] == 2)) {             // Waagerecht Unten
                    System.out.println("Sieger ist: " + currentplayer);
                    return true;
                } else if ((field[0][0] == 1 && field[1][1] == 1 && field[2][2] == 1) || (field[0][0] == 2 && field[1][1] == 2 && field[2][2] == 2)) {         // Diagonal Obere Rechteecke zur Unteren Linkenecke
                    System.out.println("Sieger ist: " + currentplayer);
                    return true;
                } else if ((field[0][2] == 1 && field[1][1] == 1 && field[2][0] == 1) || (field[0][2] == 2 && field[1][1] == 2 && field[2][0] == 2)) {         // Diagonal Obere Linkeecke zur Unteren Rechtenecke
                    System.out.println("Sieger ist: " + currentplayer);
                    return true;
                } else if ((field[0][0] == 1 && field[1][0] == 1 && field[2][0] == 1) || (field[0][0] == 2 && field[1][0] == 2 && field[2][0] == 2)) {         // Senkrecht Links Oben
                    System.out.println("Sieger ist: " + currentplayer);
                    return true;
                } else if ((field[0][1] == 1 && field[1][1] == 1 && field[2][1] == 1) || (field[0][1] == 2 && field[1][1] == 2 && field[2][1] == 2)) {         // Senkrecht Mitte Oben
                    System.out.println("Sieger ist: " + currentplayer);
                    return true;
                } else if ((field[0][2] == 1 && field[1][2] == 1 && field[2][2] == 1) || (field[0][2] == 2 && field[1][2] == 2 && field[2][2] == 2)) {        // Senkrecht Rechts Oben
                    System.out.println("Sieger ist: " + currentplayer);
                    return true;
                }
            }
        }
        return false;
    }

}
