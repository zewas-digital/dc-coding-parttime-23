package saifedine.week01.example6;

/*
Schreiben Sie ein Programm, in dem sie die While Schleife verwenden.
Zählen Sie von der Zahl 10 bis 0 herunter.
(Wenn die Zähler variable den Wert 0 erreicht hat, dann beende die Schleife mit der break Anweisung.) --> unnötig!

 */

//while
// 10 bis 0

public class WhileLoop {

    public static void main(String[] args) {

        int zahl1 = 10;

        // Option 1:
        while (zahl1 != -1){
            System.out.println("Option 1: " + zahl1);
            zahl1--;
        }

        System.out.println();

        int zahl2 = 10;

        // Option 2:
        while (zahl2 >= 0){
            System.out.println("Option 2: " + zahl2);
            zahl2--;
        }
    }
}