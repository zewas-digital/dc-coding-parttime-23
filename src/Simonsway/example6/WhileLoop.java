package solutions.Simon.example6;

/*
Schreiben Sie ein Programm, in dem sie die While Schleife verwenden.
Zählen Sie von der Zahl 10 bis 0 herunter. Wenn die Zähler variable den Wert 0 erreicht hat, dann beende die Schleife
mit der break Anweisung.

 */
public class WhileLoop {
    public static void main(String[] args) {
        int i = 10;
        while (i>=0){
            System.out.println(i);
            i--;
        }
        for (int j = 10; j >=0 ; j--) {
            System.out.println(j);

        }

    }
}