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

public class Calculator {
    public static void main(String[] args) {

        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("1. Addieren ");
            System.out.println("2. Subtrahieren ");
            System.out.println("3. Dividieren ");
            System.out.println("4. Multiplizieren ");
            System.out.println("5. Potentieren ");

            System.out.println("Bitte gib die erste Zahl ein: ");
            int value1 = scan.nextInt();

            System.out.println("Bitte gib die zweit Zahl ein: ");
            int value2 = scan.nextInt();

            int option = scan.nextInt();

            if (option == 1) {
                System.out.print(value1 + value2);
            }

            if (option == 2) {
                System.out.print(value1 - value2);
            }

            if (option == 3) {
                System.out.print(value1 / value2);
            }

            if (option == 4) {
                System.out.print(value1 * value2);
            }

            if (option == 5) {
                System.out.print(value1 ^ value2);
            }

        }
    }

}



