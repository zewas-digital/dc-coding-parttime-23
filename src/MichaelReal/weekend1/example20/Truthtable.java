/*
In dieser Aufgabe erstellen wir eine Wahrheitstabelle für die logischen Operatoren AND, OR und NOT für zwei Eingangsvariablen (A und B).
Wir berechnen alle möglichen Kombinationen von Werten für A und B und zeigen das Ergebnis für jede Kombination in der Tabelle an.
 */

package MichaelReal.weekend1.example20;

public class Truthtable {
    public static void main(String[] args) {
        System.out.println("Wahrheitstabelle für logische Operatoren AND, OR und NOT");
        System.out.println("--------------------------------------------------");
        System.out.println("|  A  |  B  |  AND  |  OR  |  NOT A  |  NOT B  |");
        System.out.println("-----------------------------------------------");

        boolean[] values = {true, false};

        for (boolean a : values) {
            for (boolean b : values) {
                boolean andResult = a && b;
                boolean orResult = a || b;
                boolean notAResult = !a;
                boolean notBResult = !b;
                System.out.printf("| %3b | %3b |  %3b  | %3b  |   %3b   |   %3b   |\n", a, b, andResult, orResult, notAResult, notBResult);



            }
        }
        System.out.println("---------------------------------------------------------------------");
    }
}
