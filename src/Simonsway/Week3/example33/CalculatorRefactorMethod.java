/*
Programmiere einen Rechner mit den nachfolgenden Operationen:
1. Addieren
2. Subtrahieren
3. Multiplizieren
4. Dividieren
5. Potenzieren

Der Nutzer kann eine der fünf Operationen auswählen und zwei Zahlen zur Berechnung eingeben.
Gib' den Rechenweg und das Ergebnis auf der Console aus. Zum Beispiel: 5 ^ 2 = 25
 */

package solutions.Simon.example33;


import java.util.Scanner;

public class CalculatorRefactorMethod {


    static void addieren(){
        int selection = 0;
        Scanner consoleInput = new Scanner(System.in);
        if (selection == 1) {
            System.out.println("Bitte geben sie die erste Zahl ein");
            int value1 = consoleInput.nextInt();
            System.out.println("Bitte gben sie die zweite Zahl ein");
            int value2 = consoleInput.nextInt();
            System.out.println("Ihr ergeniss ist " + (value1 + value2));
        }
    }
    public static void main(String[] args) {

        Scanner consoleInput = new Scanner(System.in);

        while (true) {

            System.out.println("1. Addieren ");
            System.out.println("2. Subtrahieren ");
            System.out.println("3. Dividieren ");
            System.out.println("4. Multiplizieren ");
            System.out.println("5. Potentieren ");
            System.out.println("Bitte Funktion wählen");

            addieren();
        }
    }
}
