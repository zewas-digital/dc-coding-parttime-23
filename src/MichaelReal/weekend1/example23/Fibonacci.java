/*
Aufgabe:
Schreiben Sie ein Java-Programm, das die n-te Zahl in der Fibonacci-Folge berechnet, ohne die Verwendung von Arrays oder anderen Datenstrukturen außerhalb der Verwendung von Variablen.

Erläuterung:
    Das Programm sollte eine Methode fibonacci(int n) enthalten, die als Eingabe eine nicht negative ganze Zahl n erhält und die n-te Zahl in der Fibonacci-Folge zurückgibt.
    Achten Sie darauf, den Basisfall zu berücksichtigen: F(0) = 0 und F(1) = 1.
 */

package solutions.michaelreal.weekend1.example23;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5; //kann man ändern

        int result = fibonacci(n);
        System.out.println("Die " + n + ". Fibonacci-Zahl ist: " + result);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Basisfall 0
        } else if (n == 1) {
            return 1; // Basisfall 1
        } else {
            int prev1 = 0;
            int prev2 = 1;
            int current = 0;

            for (int i = 2; i <= n; i++) {
                current = prev1 + prev2;
                prev1 = prev2;
                prev2 = current;
            }

            return current;

        }

    }
}
