/*
In dieser Aufgabe erstellen wir eine Wahrheitstabelle für die logischen Operatoren AND, OR und NOT für zwei Eingangsvariablen (A und B).
Wir berechnen alle möglichen Kombinationen von Werten für A und B und zeigen das Ergebnis für jede Kombination in der Tabelle an.
 */

package solutions.claudia.weekend1.example20;

public class Truthtable {
    public static void main(String[] args) {

        System.out.println("   &&   | TRUE  | FALSE ");
        System.out.println("________________________");
        System.out.println(" TRUE   | " + (true && true) + " | " + (true && false));
        System.out.println("________________________");
        System.out.println("FALSE   | " + (false && true) + " | " + (false && false));

        System.out.println();
        System.out.println();

        System.out.println("   ||   | TRUE  | FALSE ");
        System.out.println("________________________");
        System.out.println(" TRUE   | " + (true || true) + " | " + (true || false));
        System.out.println("________________________");
        System.out.println("FALSE   | " + (false || true) + " | " + (false || false));

        System.out.println();
        System.out.println();

        System.out.println("   !   ");
        System.out.println("________________________");
        System.out.println(" TRUE   | " + !true);
        System.out.println("________________________");
        System.out.println("FALSE   | " + !false);
    }
}
