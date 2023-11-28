/*
In dieser Aufgabe erstellen wir eine Wahrheitstabelle für die logischen Operatoren AND, OR und NOT für zwei Eingangsvariablen (A und B).
Wir berechnen alle möglichen Kombinationen von Werten für A und B und zeigen das Ergebnis für jede Kombination in der Tabelle an.
 */

package Matthias.week2_weekend_Scanner.example20;

public class Truthtable {

    static void odder(boolean Kobination1, boolean Kobination2){
        System.out.println(" a " +" | " + " b " + " = " + " c ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 ; j++) {

                if (Kobination1 || Kobination2) {
                    System.out.print("  "+ 1 + "  ");
                }else {
                    System.out.print(0);
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean zahl1=true;
        boolean zahl2=true;

        odder(zahl1, zahl2);
    }
}
