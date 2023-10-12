/*
Schreibe ein Programm, mit dem du die gängisten arithmetischen Operatoren ausprobierst!
Diese sind: +, -, *, /, ++, -- und Math.pow(a, b) für Potenzen.

Gib den Rechenweg sowie das Ergebnis auf der Console aus.
Hier ist die Übersicht aller Operatoren: https://de.wikibooks.org/wiki/Java_Standard:_Operatoren
 */

package solutions.claudia.weekend1.example18;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int zahl1 = 3, zahl2 = 5;

        System.out.println(zahl1 + " ^ " + zahl2 + " = " + Math.pow(zahl1, zahl2));
        System.out.println(zahl1 + " / " + zahl2 + " = " + zahl1 / zahl2);
        System.out.println(zahl1 + " % " + zahl2 + " = " + zahl1 % zahl2);
        System.out.println(zahl1 + " / " + zahl2 + " = " + zahl2 / zahl1);
        System.out.println(zahl1 + " % " + zahl2 + " = " + zahl2 % zahl1);

        System.out.println("Pre- und Postinkrement, Startwert i == 0");
        int j = 0;
        int ergebnis = ++j;
        System.out.println("Preinkrement ++i: " + ergebnis);
        int i = 0;
        ergebnis = i++;
        System.out.println("Postinkrement i++: " + ergebnis);

        int zahl3 = 3;
        System.out.println(zahl3);
        System.out.println(++zahl3);
        System.out.println(zahl3);
        zahl3 = 3;
        System.out.println(zahl3);
        System.out.println(zahl3++);
        System.out.println(zahl3);


    }
}
