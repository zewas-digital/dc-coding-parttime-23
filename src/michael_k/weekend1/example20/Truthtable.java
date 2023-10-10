/*
In dieser Aufgabe erstellen wir eine Wahrheitstabelle für die logischen Operatoren AND, OR und NOT für zwei Eingangsvariablen (A und B).
Wir berechnen alle möglichen Kombinationen von Werten für A und B und zeigen das Ergebnis für jede Kombination in der Tabelle an.
 */

package solutions.michael_k.weekend1.example20;

public class Truthtable {
    public static void main(String[] args) {
 boolean A =true;
 boolean B =false;

        System.out.println( A && B );
        System.out.println( A || B );
        System.out.println( A == B );
        System.out.println( A && A );
    }
}
