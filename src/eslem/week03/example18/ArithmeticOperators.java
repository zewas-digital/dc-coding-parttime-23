/*
Schreibe ein Programm, mit dem du die gängisten arithmetischen Operatoren ausprobierst!
Diese sind: +, -, *, /, ++, -- und Math.pow(a, b) für Potenzen.

Gib den Rechenweg sowie das Ergebnis auf der Console aus.
Hier ist die Übersicht aller Operatoren: https://de.wikibooks.org/wiki/Java_Standard:_Operatoren
 */

package eslem.week03.example18;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int zahl1=5;
        int zahl2=2;
        System.out.println(zahl1 + zahl2);

        System.out.println(zahl1 * zahl2);
        System.out.println(zahl2  - zahl1);
        System.out.println(zahl1 / zahl2);


        System.out.println(zahl1);
        System.out.println(zahl1++);
        System.out.println(zahl1);


        System.out.println(zahl1);
        System.out.println(++zahl1);
        System.out.println(zahl1);

        System.out.println(zahl2--);
        System.out.println(zahl2);

        System.out.println(--zahl2);
        System.out.println(zahl2);
    }
}
