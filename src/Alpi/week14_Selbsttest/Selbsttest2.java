package Alpi.week14_Selbsttest;

// Aufgabe 2 -------------------
        /* Zähle in einer for-Schleife von -30 bis inklusive 30 und gib jede Zahl aus die ohne Rest durch 3 teilbar ist.
         * Ausgabe:
            -30
            -27
            -24
            ...
            24
            27
            30
         */

public class Selbsttest2 {
    public static void main(String[] args) {

        for (int i = -30; i <= 30; i += 3){
            System.out.print(i + " ");

        }

    }
}
