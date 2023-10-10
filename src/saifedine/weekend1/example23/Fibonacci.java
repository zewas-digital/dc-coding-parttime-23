/*
Aufgabe:
Schreiben Sie ein Java-Programm, das die n-te Zahl in der Fibonacci-Folge berechnet, ohne die Verwendung von Arrays oder anderen Datenstrukturen außerhalb der Verwendung von Variablen.

Erläuterung:
    Das Programm sollte eine Methode fibonacci(int n) enthalten, die als Eingabe eine nicht negative ganze Zahl n erhält und die n-te Zahl in der Fibonacci-Folge zurückgibt.
    Achten Sie darauf, den Basisfall zu berücksichtigen: F(0) = 0 und F(1) = 1.
 */

package solutions.saifedine.weekend1.example23;

public class Fibonacci {
    public static void main(String[] args) {

        int nfibo = 7;
        int f0 = 0;
        int f1 = 1;
        int ergebnis = 0;

        for (int i = 2; i <= nfibo; i++) {

            ergebnis = f0 + f1;
            //System.out.println("ergebnis " + ergebnis);

            f0 = f1;
            //System.out.println("f0 " + f0);
            f1 = ergebnis;
            System.out.println("ergebnis " + f1);




        }


    }

        }

    /*
        for (int i = 0; i < nfibo ; i++) {
            System.out.println("zeilen: " + i);

            zwsumme1 = bzahl1 + bzahl2;
            System.out.println("zwsumme1: " + zwsumme1);

            zwsumme2 = zwsumme1 + zwsumme2;
            System.out.println("zwsumme2: " + zwsumme2);

            }
        }

    }
*/