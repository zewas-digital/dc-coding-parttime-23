/*
Aufgabe:
Schreiben Sie ein Java-Programm, das die n-te Zahl in der Fibonacci-Folge berechnet, ohne die Verwendung von Arrays oder anderen Datenstrukturen außerhalb der Verwendung von Variablen.

Erläuterung:
    Das Programm sollte eine Methode fibonacci(int n) enthalten, die als Eingabe eine nicht negative ganze Zahl n erhält und die n-te Zahl in der Fibonacci-Folge zurückgibt.
    Achten Sie darauf, den Basisfall zu berücksichtigen: F(0) = 0 und F(1) = 1.
 */

package solutions.claudia.weekend1.example23;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println("Fibonaccizahlen, rekursiv: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo1(i) + "  ");
                    }
        System.out.println();
        System.out.println("Fibonaccizahlen, explizit: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(fibo2(i) + "  ");
        }
        System.out.println();
        System.out.println("Fibonaccizahlen, einfach: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo3(i) + " ");
        }
        System.out.println();
        System.out.println("Fibonaccizahlen, trickreich: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo4(i) + " ");
        }

    }

    static int fibo1(int n){
        //n-te Fibonaccizahl berechnen - Rekursion
        if (n == 0) return 0;
        if (n == 1) return 1;

        return (fibo1(n-1) + fibo1 (n-2));
    }

    static double fibo2(int n){
        //n-te Fibonaccizahl explizit
        double a = (1 + Math.sqrt(5)) * 0.5;
        double b = (1 - Math.sqrt(5)) * 0.5;
        return (1/Math.sqrt(5) * ((Math.pow(a, n)) - (Math.pow(b,n))));
    }

    static int fibo3(int n){
        //n-te Fibonaccizahl "einfach"
        if (n == 0 || n == 1) return n;
        int f0 = 0;
        int f1 = 1;
        int ergebnis = 0;
        for (int i = 2; i <= n ; i++) {
            ergebnis = f0 + f1;
            f0 = f1;
            f1 = ergebnis;
        }
        //System.out.println(n + "te F-Zahl: " + ergebnis);
        return ergebnis;
    }

    static int hilfsmethode(int n, int x, int y){
        if (n == 0) return x;
        if (n == 1) return y;
        else return hilfsmethode(n-1, y, x+y);
    }
    static int fibo4(int n){
        return hilfsmethode(n, 0, 1);
    }
}
