/*
In dieser Aufgabe erstellen wir eine Wahrheitstabelle für die logischen Operatoren AND, OR und NOT für zwei Eingangsvariablen (A und B).
Wir berechnen alle möglichen Kombinationen von Werten für A und B und zeigen das Ergebnis für jede Kombination in der Tabelle an.
 */

package solutions.eslem.example20;

public class Truthtable {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;

        if(20 % 10 == 0 && 20 + 20 == 40) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        if(20 > 40 || 50 - 10 == 40){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        if('a'=='a'){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
