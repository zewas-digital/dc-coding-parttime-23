package eslem.week08;
/*
Programmiere das Spiel TicTacToe.

Für das Spielfeld, verwende int[3][3] Array, in dem

    0 = Leer
    1 = Spieler 1
    2 = Spieler 2

Das Kriterium für Gewinn ist, 3 Zeichen in eine Reihe, Spalte oder Diagonal.
 */
<<<<<<< HEAD:src/eslem/week08/Array_14_TicTacToe.java

public class Array_14_TicTacToe {

        public static void main (String[]args){

=======
/*public class Array_14_TicTacToe {
    public static void main(String[] args) {
>>>>>>> origin/master:src/michael_k/eslem/week08/Array_14_TicTacToe.java
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int spieler1 = 1;
        int spieler2 = 2;

        boolean win = false;

        char[][] board = new char[3][3];

        //Spielfeld

        String[][] gameBoard = {
                {" " + "|" + " " + "|" + " " + " "},
                {"-" + "-" + "-" + "-" + "-"},
                {" " + "|" + " " + "|" + " " + " "},
                {"-" + "-" + "-" + "-" + "-"},
                {" " + "|" + " " + "|" + " " + " "},
        };

        for (int zeile = 0; zeile < gameBoard.length; zeile++) {

            //  System.out.print(zeile );

            for (int spalte = 0; spalte < gameBoard[zeile].length; spalte++) {
                System.out.print(gameBoard[zeile][spalte]);
                System.out.println();
            }
        }

*/