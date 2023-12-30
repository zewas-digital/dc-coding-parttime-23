/*
Schreibe ein Programm, mit dem du die gängisten arithmetischen Operatoren ausprobierst!
Diese sind: +, -, *, /, ++, -- und Math.pow(a, b) für Potenzen.

Gib den Rechenweg sowie das Ergebnis auf der Console aus.
Hier ist die Übersicht aller Operatoren: https://de.wikibooks.org/wiki/Java_Standard:_Operatoren
 */

package saifedine.week02_weekend1.example18;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int zahl1 = 6, zahl2 = 3;

        System.out.println(zahl1 + " + " + zahl2 + " = " + (zahl1 + zahl2));
        System.out.println(zahl1 + " - " + zahl2 + " = " + (zahl1 - zahl2));
        System.out.println(zahl1 + " * " + zahl2 + " = " + zahl1 * zahl2);
        System.out.println(zahl1 + " / " + zahl2 + " = " + zahl1 / zahl2);
        System.out.println(zahl1 + " % " + zahl2 + " = " + zahl1 % zahl2);
        System.out.println(zahl1 + " ^ " + zahl2 + " = " + Math.pow(zahl1,zahl2));

        System.out.println();

        zahl2 = 3;

        System.out.println("zahl2: " + zahl2);                      // 3
        System.out.println("zahl2: " + zahl2++);                    // 3
        System.out.println("zahl2: " + zahl2);                      // 4

        System.out.println();

        int zahl3 = 3;

        System.out.println("zahl3: " + zahl3);                      // 3
        System.out.println("zahl3: " + ++zahl3);                    // 4
        System.out.println("zahl3: " + zahl3);                      // 4

        System.out.println();

        int zahl4 = 4;

        System.out.println("zahl4: " + zahl4);                      // 4
        System.out.println("zahl4: " + zahl4--);                    // 4
        System.out.println("zahl4: " + zahl4);                      // 3

        System.out.println();

        int zahl5 = 4;

        System.out.println("zahl5: " + zahl5);                      // 4
        System.out.println("zahl5: " + --zahl5);                    // 3
        System.out.println("zahl5: " + zahl5);                      // 3
    }
}
