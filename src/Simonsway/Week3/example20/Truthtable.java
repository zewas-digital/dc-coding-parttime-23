/*
In dieser Aufgabe erstellen wir eine Wahrheitstabelle für die logischen Operatoren AND, OR und NOT für zwei Eingangsvariablen (A und B).
Wir berechnen alle möglichen Kombinationen von Werten für A und B und zeigen das Ergebnis für jede Kombination in der Tabelle an.
 */



package solutions.Simon.example20;

public class Truthtable {

    public static void main(String[] args) {
        //
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && true);

        System.out.println(false && false);       // False -- beide müssen true sein
        System.out.println(false || false);      // False -- eines muss true sein
        System.out.println(false == false);     // True -- beides gleich
        System.out.println(8.6 == 8.6);        // True -- beide gleich
        System.out.println("test" == "test"); // True -- beide gleich
    }
}
