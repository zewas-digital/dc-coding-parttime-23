/*
Erstelle ein Programm, dass als Primzahlen innerhalb eines bestimmten Intervalls auf der Console ausgibt.
 */

package solutions.alpi.week1.weekend1.example24;

public class PrimeNumbers {
    public static void main(String[] args) {

        int n = 100;


        for (int i = 2; i <= n; i++) {


            boolean istPrimzahl = true;

            for (int j = 2; j < i && istPrimzahl; j++) {
                // Wenn eine division als rest 0 hat dann ist die Zahl keine
                // Primzahl und somit ist isPrimzahl auf false zu setzten
                if ((i % j) == 0) {
                    istPrimzahl = false;
                }
            }
            // gib eine Meldung aus falls es sich um eine Primzahl handelt.
            if (istPrimzahl) {
                System.out.println(i + " ist eine Primzahl");


            }

            System.out.println();


        }
    }
}