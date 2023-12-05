/*
Schreibe ein Programm, mit dem du die gängisten arithmetischen Operatoren ausprobierst!
Diese sind: +, -, *, /, ++, -- und Math.pow(a, b) für Potenzen.

Gib den Rechenweg sowie das Ergebnis auf der Console aus.
Hier ist die Übersicht aller Operatoren: https://de.wikibooks.org/wiki/Java_Standard:_Operatoren
 */

package solutions.Simon.example18;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int zahl1 = 3, zahl2 = 5; // so können mehrere  Variablen vom gleichen Typen definiert werden und muss somit nicht mit INT Wer... und nochmals INT Wert angegeben werden sprich nicht zwei Zeilen notwendig
        System.out.println(zahl1 + " ^ " + zahl2 + " = " + Math.pow(zahl1, zahl2)); // 3 Hoch 5
        System.out.println(zahl1 + " % " + zahl2 + " = " + zahl1 % zahl2); // Zeigt den Restwert der Rechnung
        System.out.println(zahl1 + " : " + zahl2 + " = " + zahl1 / zahl2); // Hier wird abgefragt ob 3 durch 5 Teilbar ist... nicht möglich somit NEIN


        System.out.println(zahl1);
        System.out.println(zahl1++);
        System.out.println(zahl1);

        // drei Zeilen ergeben folgende Werte 3/3/4 Wert wird erst nach der Ausgabe erhöht

        zahl1 = 3;

        System.out.println(zahl1);
        System.out.println(++zahl1);
        System.out.println(zahl1);
        // drei Zeilen ergeben folgende Werte 3/4/4 Wert wird vor der Ausgabe erhöht.


        zahl1 = 3;
        System.out.println(zahl1+=2); // so wird der Wert um die dahinter stehende Zahl vergrößert ist die Kurzform von Zahl1 = Zahl1 + 2

        zahl1 = 3;
        System.out.println(zahl1 + zahl2);

        zahl1 = 3;
        System.out.println(zahl1 - zahl2);

        zahl1 = 3;
        System.out.println(zahl1 * zahl2);

        zahl1 = 3;
        System.out.println(zahl1 / zahl2);

        zahl1 = 3;
        System.out.println(zahl1 % zahl2);





    }
}