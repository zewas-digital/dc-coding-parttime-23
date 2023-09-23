/*
In dieser Aufgabe erstellen wir eine Wahrheitstabelle für die logischen Operatoren AND, OR und NOT für zwei Eingangsvariablen (A und B).
Wir berechnen alle möglichen Kombinationen von Werten für A und B und zeigen das Ergebnis für jede Kombination in der Tabelle an.
 */

package solutions.marcelsimma.weekend1;

public class Truthtable {
    public static void main(String[] args) {
/*
        if (12 % 5 == 2 && 5 > 7) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

 */

        System.out.println(false && false); // beide muessen true sein
        System.out.println(false || false); // eines muss true sein
        System.out.println(0.6 == 0.6); // beide gleich
        System.out.println("test" == "test");
        System.out.println('ü' == 'ü');


    }
}
