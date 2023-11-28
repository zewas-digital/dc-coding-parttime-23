

/*
Aufgabe:
Schreiben Sie ein Java-Programm, das die n-te Zahl in der Fibonacci-Folge berechnet, ohne die Verwendung von Arrays oder anderen Datenstrukturen außerhalb der Verwendung von Variablen.

Erläuterung:
    Das Programm sollte eine Methode fibonacci(int n) enthalten, die als Eingabe eine nicht negative ganze Zahl n erhält und die n-te Zahl in der Fibonacci-Folge zurückgibt.
    Achten Sie darauf, den Basisfall zu berücksichtigen: F(0) = 0 und F(1) = 1.
 */

package Matthias.week2_weekend_Scanner.example23;

public class Fibonacci {

    static  void checkEingabe ( int number1){
        if (number1 > 0) {
            System.out.println(number1 + " is a positive number.");
        }else {
            System.out.println(number1 + " is a negaive number.");
            System.out.println(number1 + " Please take a positiv number for the Methode input!!!! .");
        }
        System.out.println();// Abstand
    }
    static  void Fibonacci( int iAnzahlfolgeglieder){

        System.out.println("F(0) =" + "0");
        System.out.println("F(1) =" + "1");
        int counter = 2;
        int a1= 0;
        int a2 = 1;
        int Ergebnisa3=0;

        while (iAnzahlfolgeglieder > counter-1) {
            Ergebnisa3 = a2 + a1  ;
            System.out.println("F("+ (counter -2) + ") =" + Ergebnisa3);
            a1=a2;
            a2=Ergebnisa3;
            counter++;

        }

    }
    public static void main(String[] args) {
        int Eingabe= 12;

        checkEingabe(Eingabe);
        Fibonacci(Eingabe);
    }
}
