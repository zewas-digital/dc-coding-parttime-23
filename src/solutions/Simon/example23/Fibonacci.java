/*
Aufgabe:
Schreiben Sie ein Java-Programm, das die n-te Zahl in der Fibonacci-Folge berechnet, ohne die Verwendung von Arrays oder anderen Datenstrukturen außerhalb der Verwendung von Variablen.

Erläuterung:
    Das Programm sollte eine Methode fibonacci(int n) enthalten, die als Eingabe eine nicht negative ganze Zahl n erhält und die n-te Zahl in der Fibonacci-Folge zurückgibt.
    Achten Sie darauf, den Basisfall zu berücksichtigen: F(0) = 0 und F(1) = 1.
 */

package solutions.Simon.example23;

public class Fibonacci {
    public static void main(String[] args) {

        int nfibo = 20;
        int f0 = 0; // Muss als start definiert sein
        int f1 = 1; // Muss als start deviniert sein
        int ergebnis = 0;

        for (int i = 2; i <= nfibo; i++) {

            ergebnis = f0 + f1; // Ergebniss 1

            f0 = f1;
            f1 = ergebnis;
            System.out.println("ergebnis " + f1);
        }
    }
}
