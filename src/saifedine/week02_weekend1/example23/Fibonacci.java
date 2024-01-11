/*
Aufgabe:
Schreiben Sie ein Java-Programm, das die n-te Zahl in der Fibonacci-Folge berechnet, ohne die Verwendung von Arrays oder anderen Datenstrukturen außerhalb der Verwendung von Variablen.

Erläuterung:
    Das Programm sollte eine Methode fibonacci(int n) enthalten, die als Eingabe eine nicht negative ganze Zahl n erhält und die n-te Zahl in der Fibonacci-Folge zurückgibt.
    Achten Sie darauf, den Basisfall zu berücksichtigen: F(0) = 0 und F(1) = 1.
 */

// siehe: https://studyflix.de/mathematik/fibonacci-folge-5511

package saifedine.week02_weekend1.example23;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Fibonaccizahlen: ");
        for (int i = 0; i < 7; i++) {
            System.out.println("Ergebnis: " + fibonacci(i));
        }
    }

    static int fibonacci(int n){

        if (n == 0 || n == 1) return n;
        int nfibo = n;
        int f0 = 0;
        int f1 = 1;
        int ergebnis = 0;

        // i = 2, da f0 und f1 vordefiniert sind und nicht mehr berücksichtigt werden müssen.
        for (int i = 2; i <= nfibo; i++) {

            ergebnis = f0 + f1;
            //System.out.println("ergebnis1 " + ergebnis);

            f0 = f1;
            //System.out.println("f0 " + f0);

            f1 = ergebnis;
            //System.out.println("ergebnis " + f1);
        }
        return ergebnis;
    }
}