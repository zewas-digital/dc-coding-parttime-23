/*
Aufgabe:
Schreiben Sie ein Java-Programm, das die n-te Zahl in der Fibonacci-Folge berechnet, ohne die Verwendung von Arrays oder anderen Datenstrukturen außerhalb der Verwendung von Variablen.

Erläuterung:
    Das Programm sollte eine Methode fibonacci(int n) enthalten, die als Eingabe eine nicht negative ganze Zahl n erhält und die n-te Zahl in der Fibonacci-Folge zurückgibt.
    Achten Sie darauf, den Basisfall zu berücksichtigen: F(0) = 0 und F(1) = 1.
 */

<<<<<<<< HEAD:src/solutions/alpi/week1/weekend1/example23/Fibonacci.java
package solutions.alpi.week1.weekend1.example23;
========
package solutions.eslem.example23;
>>>>>>>> eslem:src/solutions/eslem/example23/Fibonacci.java

public class Fibonacci {
    public static void main(String[] args) {
        int fn1=1, fn2=0;       // fn=fn-1+fn-2

<<<<<<<< HEAD:src/solutions/alpi/week1/weekend1/example23/Fibonacci.java
        int fn1 = 1, fn2 = 0;

        for (int n = 2; n < 10; n++) {
            int fn = fn1 + fn2;

            System.out.println(fn);

            fn2 = fn1;
            fn1 = fn;




        }

========
        for (int n = 2; n < 15 ; n++) {
            int fn=fn1+fn2;
            System.out.println(fn);

            fn2=fn1;        //fn2 übernimmt den Parameter von fn1, da es sich vermehre muss
            fn1=fn;
        }
        }
>>>>>>>> eslem:src/solutions/eslem/example23/Fibonacci.java
    }


