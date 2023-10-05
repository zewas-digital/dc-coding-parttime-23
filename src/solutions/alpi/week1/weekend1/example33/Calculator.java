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

package solutions.alpi.week1.weekend1.example33;


import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menü ausgeben
        System.out.println("1. Addieren");
        System.out.println("2. Subtrahieren");
        System.out.println("3. Multiplizieren");
        System.out.println("4. Dividieren");
        System.out.println("5. Potenzieren");
        System.out.print("Wählen Sie eine Operation: ");

        // Operation auswählen
        int operation = scanner.nextInt();


        // Zahlen einlesen
        System.out.print("Erste Zahl: ");
        int zahl1 = scanner.nextInt();
        System.out.print("Zweite Zahl: ");
        int zahl2 = scanner.nextInt();

        // Berechnung durchführen
        double ergebnis;





        String operator = "";
        switch (operation) {


            case 1:
                ergebnis = zahl1 + zahl2;
                operator = "+";
                break;

            case 2:
                ergebnis = zahl1 - zahl2;
                operator = "-";

                break;
            case 3:
                ergebnis = zahl1 * zahl2;
                operator = "*";
                break;
            case 4:
                ergebnis = zahl1 / zahl2;
                operator = "/";
                break;
            case 5:
                ergebnis = Math.pow(zahl1, zahl2);
                operator = "*****";
                break;
            default:
                System.out.println("Ungültige Operation.");
                operator = "-------";
                return;








        }

        // Ergebnis ausgeben
        System.out.println(zahl1 + " " + operator  + " " + zahl2 + " = " + ergebnis);
    }
}