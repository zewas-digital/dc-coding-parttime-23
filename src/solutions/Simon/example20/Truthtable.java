/*
In dieser Aufgabe erstellen wir eine Wahrheitstabelle für die logischen Operatoren AND, OR und NOT für zwei Eingangsvariablen (A und B).
Wir berechnen alle möglichen Kombinationen von Werten für A und B und zeigen das Ergebnis für jede Kombination in der Tabelle an.
 */

package solutions.Simon.example20;

public class Truthtable {
    public static void main(String[] args) {

        System.out.println("Vergelich mit && hierbei muss der Wert genau gleich sein");
        System.out.println(true && true); // true
        System.out.println(true && false); //false
        System.out.println(false && true); //false
        System.out.println(false && false); //false

        System.out.println("Vergleich mit || hierbei muss nur einer der Werte richtig sein");
        System.out.println(true || true); //true
        System.out.println(true || false); // true
        System.out.println(false || true); // true

        System.out.println("Vergleich  mit == hierbei muss der Wert der gleiche sein");
        System.out.println(true == true); //true
        System.out.println(true == false); // false
        System.out.println(false == true); //false

        System.out.println("Vergleich mit != hierbei wird geprüft ob der Wert ungleich dem anderen ist");
        // " ! " dreht den wert bei true und false z.b. um sprich aus "!true" wird false
        System.out.println(2 != 3); // ungleich / true
        System.out.println(true != true); //gleich / true
        System.out.println(true != false); // ungleich / false
        System.out.println(false != true); //ungleich / false


    }


}