/*
Schreibe ein Programm, mit dem du die gängisten arithmetischen Operatoren ausprobierst!
Diese sind: +, -, *, /, ++, -- und Math.pow(a, b) für Potenzen.

Gib den Rechenweg sowie das Ergebnis auf der Console aus.
Hier ist die Übersicht aller Operatoren: https://de.wikibooks.org/wiki/Java_Standard:_Operatoren
 */

<<<<<<<< HEAD:src/solutions/alpi/week1/weekend1/example18/ArithmeticOperators.java
package solutions.alpi.week1.weekend1.example18;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int zahl1 = 3, zahl2 = 5;
        System.out.println(zahl1 + " ^ " + zahl2 + " = :" + Math.pow(zahl1,zahl2));
        System.out.println(zahl1 + " % " + zahl2 + " = :" + zahl1 % zahl2);
========
package solutions.eslem.example18;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int zahl1=5;
        int zahl2=2;
        System.out.println(zahl1 + zahl2);

        System.out.println(zahl1 * zahl2);
        System.out.println(zahl2  - zahl1);
        System.out.println(zahl1 / zahl2);

>>>>>>>> eslem:src/solutions/eslem/example18/ArithmeticOperators.java

        System.out.println(zahl1);
        System.out.println(zahl1++);
        System.out.println(zahl1);

<<<<<<<< HEAD:src/solutions/alpi/week1/weekend1/example18/ArithmeticOperators.java
        zahl1 = 3;
========
>>>>>>>> eslem:src/solutions/eslem/example18/ArithmeticOperators.java

        System.out.println(zahl1);
        System.out.println(++zahl1);
        System.out.println(zahl1);

<<<<<<<< HEAD:src/solutions/alpi/week1/weekend1/example18/ArithmeticOperators.java

        zahl1 = 3;
        System.out.println(zahl1 = zahl1 +2);
        zahl1 = 3;
        System.out.println(zahl1 += 2);







========
        System.out.println(zahl2--);
        System.out.println(zahl2);

        System.out.println(--zahl2);
        System.out.println(zahl2);
>>>>>>>> eslem:src/solutions/eslem/example18/ArithmeticOperators.java
    }
}
