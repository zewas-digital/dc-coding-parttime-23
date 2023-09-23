<<<<<<<< HEAD:src/solutions/florian/week1/example6/WhileLoop.java
package solutions.florian.week1.example6;
========
package solutions.matthias.week1.example6;
>>>>>>>> 3d1eb63b68f850f3a944ecbdcf79f465010b89eb:src/solutions/matthias/week1/example6/WhileLoop.java

/*
Schreiben Sie ein Programm, in dem sie die While Schleife verwenden.
Zählen Sie von der Zahl 10 bis 0 herunter. Wenn die Zähler variable den Wert 0 erreicht hat, dann beende die Schleife
mit der break Anweisung.

 */
public class WhileLoop {
    public static void main(String[] args) {
        int i = 10;
<<<<<<<< HEAD:src/solutions/florian/week1/example6/WhileLoop.java

        while(i >= 0){
========
        while (i >= 0) {
>>>>>>>> 3d1eb63b68f850f3a944ecbdcf79f465010b89eb:src/solutions/matthias/week1/example6/WhileLoop.java
            System.out.println(i);
            i--;
        }
    }
}
