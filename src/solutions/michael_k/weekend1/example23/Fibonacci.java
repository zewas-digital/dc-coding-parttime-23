/*
Aufgabe:
Schreiben Sie ein Java-Programm, das die n-te Zahl in der Fibonacci-Folge berechnet, ohne die Verwendung von Arrays oder anderen Datenstrukturen außerhalb der Verwendung von Variablen.

Erläuterung:
    Das Programm sollte eine Methode fibonacci(int n) enthalten, die als Eingabe eine nicht negative ganze Zahl n erhält und die n-te Zahl in der Fibonacci-Folge zurückgibt.
    Achten Sie darauf, den Basisfall zu berücksichtigen: F(0) = 0 und F(1) = 1.
 */

package solutions.michael_k.weekend1.example23;

public class Fibonacci {
    public static void main(String[] args) {
        int result = fibonacci(8);
        System.out.println(result);
    }

    static int fibonacci(int n) {
        int value = 0;
        int zahl1=0;
        int zahl2=1;

        if (n == 0) {
            value = 0;
        }else if (n == 1) {
            value = 1;
        }else{

            for (int i = 2; i <n; i++) {
                for (int j = 0; j < 1; j++) {
                    value = zahl1 + zahl2;
                }
                zahl1= zahl2;
                zahl2= value;
            }
        }


        return value;
    }

}