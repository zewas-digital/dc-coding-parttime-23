package Matthias.week1;

/*
Schreiben Sie ein Programm, in dem sie die While Schleife verwenden.
Zählen Sie von der Zahl 10 bis 0 herunter. Wenn die Zähler variable den Wert 0 erreicht hat, dann beende die Schleife
mit der break Anweisung.

 */
public class example_6_WhileLoop {
    public static void main(String[] args) {
        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
}
