package judith.week8_arrays;
/*
Das Spiel wird auf einem senkrecht stehenden hohlen Spielbrett gespielt, in das die Spieler abwechselnd ihre Spielsteine fallen lassen.
Das Spielbrett besteht aus sieben Spalten (senkrecht) und sechs Reihen (waagerecht).
Jeder Spieler besitzt 21 gleichfarbige Spielsteine. Wenn ein Spieler einen Spielstein in eine Spalte fallen lässt, besetzt dieser den untersten freien Platz der Spalte.
Gewinner ist der Spieler, der es als erster schafft, vier oder mehr seiner Spielsteine waagerecht, senkrecht oder diagonal in eine Linie zu bringen.

Das Spiel endet unentschieden, wenn das Spielbrett komplett gefüllt ist, ohne dass ein Spieler eine Viererlinie gebildet hat.
 */

public class Array_15_FourInARow {

    public static void main(String[] args) {

        int[][] gameBoard = new int [7][6];

        Board(gameBoard);

    }

    private static void Board(int[][] gameBoard) {
        for (int zeile = 0; zeile < gameBoard.length; zeile++) {
           System.out.println( );
            for (int spalte = 0; spalte < gameBoard[zeile].length; spalte++) {
                //System.out.print(("|" + " " + "|") + ("--" + " " + "--"));
                System.out.print(gameBoard[zeile][spalte]);
           //System.out.println();
            }

        }
    }


}
