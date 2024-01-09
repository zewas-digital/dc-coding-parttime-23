package saifedine.week03.example36;

/*
1. Aufgabe:
Erweitere den Taschenrechner aus der vorhergehenden Aufgabe so, dass nach der Berechnung nachgefragt wird, ob eine neue Berechnung stattfinden soll, falls nicht, soll das Programm beendet werden.

2. Aufgabe
Erweiter deinen Taschenrechner mit der Funktion, um das Zwischenergebnis weiterverwenden zu können

Zum Beispiel:

3

+

2 (Ergebnis: 5)

*

4 (Ergebnis: 20)

/

40 (Ergebnis: 0.5)

3. Aufgabe:

Erweiter deinen Taschenrechner mit der Memory Funktion.

Neue Operationen sind:

MC Memory Clear

M+ Memory Add

M- Memory Sub

MR Memory Read

Die erwartete Funktion ist identisch mit dem normalen Taschenrechner
 */

import java.util.Scanner;

public class CalculatorExtended {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        char beenden = ' ';
        int count = 0;
        char operation = ' ';
        double zahl1 = 0;

        while (beenden != 'j'){

            if (count == 0){
                System.out.println("Geben Sie die 1. Zahl der Operation ein: ");
                zahl1 = eingabe.nextDouble();
                count++;
            }
            else {
                System.out.println(zahl1);
            }

            while (operation == ' '){
                System.out.println("Bitte wählen Sie unter folgenden Operationen: +, -, *, /, ^");
                operation = eingabe.next().charAt(0);
            }

            System.out.println("Geben Sie die 2. Zahl der Operation ein: ");
            double zahl2 = eingabe.nextDouble();

            if (operation == '+') {
                zahl1 = addieren(zahl1, zahl2);
            }

            if (operation == '-') {
                zahl1 = subtrahieren(zahl1, zahl2);
            }

            if (operation == '*') {
                zahl1 = multiplizieren(zahl1, zahl2);
            }

            if (operation == '/') {
                zahl1 = dividieren(zahl1, zahl2);
            }

            if (operation == '^') {
                zahl1 = potenzieren(zahl1, zahl2);
            }

            while (beenden != 'j' && beenden != 'n'){

                System.out.println("Beenden (j/n): ");
                beenden = eingabe.next().charAt(0);
            }
            if (beenden == 'j'){
                break;
            } else if (beenden == 'n') {
                beenden = ' ';
                operation = ' ';
                continue;
            }
        }
    }

    static double addieren (double zahl1, double zahl2){

        double ergebnis;

        ergebnis = zahl1 + zahl2;

        System.out.println("Das Ergebnis ist: " + zahl1 + " + " + zahl2 + " = " + ergebnis);
        return ergebnis;
    }

    static double subtrahieren (double zahl1, double zahl2){

        double ergebnis = 0;

        ergebnis = zahl1 - zahl2;

        System.out.println("Das Ergebnis ist: " + zahl1 + " - " + zahl2 + " = " + ergebnis);
        return ergebnis;
    }

    static double multiplizieren (double zahl1, double zahl2){

        double ergebnis = 0;

        ergebnis = zahl1 * zahl2;

        System.out.println("Das Ergebnis ist: " + zahl1 + " * " + zahl2 + " = " + ergebnis);
        return ergebnis;
    }

    static double dividieren (double zahl1, double zahl2){

        double ergebnis = 0;

        ergebnis = zahl1 / zahl2;

        System.out.println("Das Ergebnis ist: " + zahl1 + " / " + zahl2 + " = " + ergebnis);
        return ergebnis;
    }

    static double potenzieren (double zahl1, double zahl2){

        double ergebnis = 0;

        ergebnis = Math.pow(zahl1, zahl2);

        System.out.println("Das Ergebnis ist: " + zahl1 + " ^ " + zahl2 + " = " + ergebnis);
        return ergebnis;
    }
}
