package solutions.volkan.week1.example6;

/*
Schreiben Sie ein Programm, in dem sie die While Schleife verwenden.
Zählen Sie von der Zahl 10 bis 0 herunter. Wenn die Zähler variable den Wert 0 erreicht hat, dann beende die Schleife
mit der break Anweisung.

 */
public class WhileLoop {
    public static void main(String[] args) {
        int i = 10;
        while (true) {

            System.out.println(i);
            if (i == 0) {
                break;
            }
            i--;
        }
    }
}
