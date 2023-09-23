

/*
Aufgabe:
Schreiben Sie ein Java-Programm, das die n-te Zahl in der Fibonacci-Folge berechnet, ohne die Verwendung von Arrays oder anderen Datenstrukturen außerhalb der Verwendung von Variablen.

Erläuterung:
    Das Programm sollte eine Methode fibonacci(int n) enthalten, die als Eingabe eine nicht negative ganze Zahl n erhält und die n-te Zahl in der Fibonacci-Folge zurückgibt.
    Achten Sie darauf, den Basisfall zu berücksichtigen: F(0) = 0 und F(1) = 1.
 */

package solutions.matthias.week2.weekend1.example23;

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
        int Rückgabewert=0;
        System.out.println("F(0) =" + "0");
        System.out.println("F(0) =" + "1");
        int counter = 2;
        int Zahl1= 0;
        int Zahl2 = 1;
        while (iAnzahlfolgeglieder > counter) {
            Rückgabewert = Zahl1 + Zahl2;
            System.out.println(Rückgabewert);
            counter++;

        }
    }
    public static void main(String[] args) {
        int zahl1= -12;
        int zahl2= 12;

        checkEingabe(zahl1);
        checkEingabe(zahl2);

    }
}
