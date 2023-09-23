/*
In dieser Aufgabe erstellen wir eine Wahrheitstabelle für die logischen Operatoren AND, OR und NOT für zwei Eingangsvariablen (A und B).
Wir berechnen alle möglichen Kombinationen von Werten für A und B und zeigen das Ergebnis für jede Kombination in der Tabelle an.
 */

package solutions.florian.weekend1.example20;

import solutions.florian.week2.example12.PrintTriangle;

public class Truthtable {


    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (15 % 10 == 0 && 10 + 10 == 20){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

        if (20 > 30 || 40 - 10  == 30){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

        if ('a' == 'a') {
            System.out.println(a);
        }else {
            System.out.println(b);
        }





    }

}

/*System.out.println(false && false);  beide müssen true sein */
/*System.out.println(false || true);   eines muss true sein */
/*System.out.println(100 == 100);      beide müssen gleich sein */