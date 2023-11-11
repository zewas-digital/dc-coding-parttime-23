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

package eslem.week03.example33;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Was möchtest du berechnen?: für Addieren +, Subtrahieren -, Multiplizieren *, Dividieren /, Potenzieren ^");
        char auswahl = scanner.next().charAt(0);

        double Ergebnis = 0;

        System.out.println("Zahl1");
        double zahl1 = scanner.nextDouble();

        System.out.println("Zahl2");
        double zahl2 = scanner.nextDouble();

        if (auswahl == '+') {
            Ergebnis = zahl1 + zahl2;
        }
        else if (auswahl == '-') {
            Ergebnis = zahl2 - zahl1;
        }
        else if (auswahl == '*') {
            Ergebnis = zahl1 * zahl2;
        }
        else if (auswahl == '/') {
            Ergebnis = zahl2 / zahl1;
        }
        else if (auswahl == '^') {
            Ergebnis = Math.pow(zahl1,zahl2);
        }
        System.out.println(zahl1+" " + auswahl+" "+zahl2+ " = "+ Ergebnis);
    }
}
