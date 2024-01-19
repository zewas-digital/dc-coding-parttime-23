package volkan.week14_Selbsttest;

public class Selbsttest_3 {
    // Aufgabe 3 -------------------
        /* Zähle mit Hilfe einer while-Schleife und einer separaten Zählvariable von 0 bis inklusive 10 und
         * gib die Zahlen aus. Wenn die Zahl größer als 5 ist mach 2 Zeilenumbrüche.
         * Ausgabe
0
1
2
3
4
5
6

7

8

9

10
         */
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            if (i > 5) {
                System.out.println();

            }
            i++;
        }
    }

}
