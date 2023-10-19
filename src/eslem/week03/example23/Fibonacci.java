/*
Aufgabe:
Schreiben Sie ein Java-Programm, das die n-te Zahl in der Fibonacci-Folge berechnet, ohne die Verwendung von Arrays oder anderen Datenstrukturen außerhalb der Verwendung von Variablen.

Erläuterung:
    Das Programm sollte eine Methode fibonacci(int n) enthalten, die als Eingabe eine nicht negative ganze Zahl n erhält und die n-te Zahl in der Fibonacci-Folge zurückgibt.
    Achten Sie darauf, den Basisfall zu berücksichtigen: F(0) = 0 und F(1) = 1.
 */

package solutions.eslem.example23;

public class Fibonacci {
    public static void main(String[] args) {
        int fn1=1, fn2=0;       // fn=fn-1+fn-2

        for (int n = 2; n < 15 ; n++) {
            int fn=fn1+fn2;
            System.out.println(fn);

            fn2=fn1;        //fn2 übernimmt den Parameter von fn1, da es sich vermehre muss
            fn1=fn;
        }
        }
    }


