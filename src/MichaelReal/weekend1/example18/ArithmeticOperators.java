/*
Schreibe ein Programm, mit dem du die gängisten arithmetischen Operatoren ausprobierst!
Diese sind: +, -, *, /, ++, -- und Math.pow(a, b) für Potenzen.

Gib den Rechenweg sowie das Ergebnis auf der Console aus.
Hier ist die Übersicht aller Operatoren: https://de.wikibooks.org/wiki/Java_Standard:_Operatoren
 */

package MichaelReal.weekend1.example18;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int additionresultat = a + b;
        System.out.println(a + " + " + b + " = " + additionresultat);

        int subtraktionresultat = a - b;
        System.out.println(a + " - " + b + " = " + subtraktionresultat);

        int multiresultat = a * b;
        System.out.println(a + " * " + b + " = " + multiresultat);

        int divisionresultat = a / b;
        System.out.println(a + " / " + b + " = " + divisionresultat);

        a++;
        System.out.println("inkrement von a: " +a);

        b--;
        System.out.println("dekrement von b: " +b);

        double resultat = Math.pow(a, 2);
        System.out.println(a + "^2 = " + resultat);

    }
}
