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

package solutions.claudia.weekend1.example33;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ergebnis = 0;
        System.out.println("Was möchtest Du berechnen? + für Addieren, - für Subtrahieren, * für Multiplizieren, / für Dividieren, ^ für Potenzieren: ");
        char operator = scanner.next().charAt(0);
        System.out.println("Zahl 1: ");
        double zahl1 = scanner.nextDouble();
        System.out.println("Zahl 2: ");
        double zahl2 = scanner.nextDouble();

        if (operator == '+') {
            ergebnis = zahl1 + zahl2;
        }
        else if (operator == '-') {
            ergebnis = zahl1 - zahl2;
        }
        else if (operator == '*') ergebnis = zahl1 * zahl2;
        else if (operator == '/') ergebnis = zahl1 / zahl2;
        else if (operator == '^') ergebnis = Math.pow(zahl1, zahl2);


        System.out.println(zahl1 + " " + operator + " " + zahl2 + " = " + ergebnis) ;


    }
}

