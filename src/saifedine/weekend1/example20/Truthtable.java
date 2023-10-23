/*
In dieser Aufgabe erstellen wir eine Wahrheitstabelle für die logischen Operatoren AND, OR und NOT für zwei Eingangsvariablen (A und B).
Wir berechnen alle möglichen Kombinationen von Werten für A und B und zeigen das Ergebnis für jede Kombination in der Tabelle an.
 */

/*
AND     = &&
OR      = ||
NOT     = !
 */

package saifedine.weekend1.example20;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Truthtable {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        if (a && b)
        System.out.println("AND: " + true);
        else
            System.out.println("AND: " + false);
        /*
        FALSE
         */

        if (a || b)
        System.out.println("OR: " + true);
        else
            System.out.println("OR: " + false);
        /*
        TRUE
         */

        if (a != b)
        System.out.println("NOT: " + true);
        else
            System.out.println("NOT: " + false);

        System.out.println(a && b); // false
        System.out.println(b && a);
    }
}
