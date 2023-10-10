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

package solutions.michael_k.weekend1.example33;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        while (true) {

            double Summe = 0;
            Scanner inputKonsole = new Scanner ( System.in );

            System.out.println ( "Funktion wählen:" );
            System.out.println ( "    1. Addieren" );
            System.out.println ( "    2. Subtrahieren" );
            System.out.println ( "    3. Multiplizieren" );
            System.out.println ( "    4. Dividieren" );
            System.out.println ( "    5. Potenzieren" );
            System.out.println ( );
            System.out.print ("Wähle Fubnktion 1-5: " );


            int Funktion = inputKonsole.nextInt ( );
            if (Funktion > 5) {
                System.out.println ( "Eingabe ungültig" );
                System.out.println ( );
            } else if (Funktion == 1) {
                System.out.print ( "Geben sie den ersten Wert ein den sie addieren wollen: " );
                double Wert1 = inputKonsole.nextDouble ( );
                System.out.print ( "Geben sie den zweiten Wert ein den sie addieren wollen: " );
                double Wert2 = inputKonsole.nextDouble ( );
                Summe = Wert1 + Wert2;
                System.out.println ( Wert1 + " + " + Wert2 + " = " + Summe );
                System.out.println ( );
            } else if (Funktion == 2) {
                System.out.print ( "Geben sie den ersten Wert ein den sie subtrahieren wollen: " );
                double Wert1 = inputKonsole.nextDouble ( );
                System.out.print ( "Geben sie den zweiten Wert ein den sie subtrahieren wollen: " );
                double Wert2 = inputKonsole.nextDouble ( );
                Summe = Wert1 - Wert2;
                System.out.println ( Wert1 + " - " + Wert2 + " = " + Summe );
                System.out.println ( );
            } else if (Funktion == 3) {
                System.out.print ( "Geben sie den ersten Wert ein den sie multiplizieren wollen: " );
                double Wert1 = inputKonsole.nextDouble ( );
                System.out.print ( "Geben sie den zweiten Wert ein den sie multiplizieren wollen: " );
                double Wert2 = inputKonsole.nextDouble ( );
                Summe = Wert1 * Wert2;
                System.out.println ( Wert1 + " * " + Wert2 + " = " + Summe );
                System.out.println ( );
            } else if (Funktion == 4) {
                System.out.print ( "Geben sie den ersten Wert ein den sie dividieren wollen: " );
                double Wert1 = inputKonsole.nextDouble ( );
                System.out.print ( "Geben sie den zweiten Wert ein den sie dividieren wollen: " );
                double Wert2 = inputKonsole.nextDouble ( );
                Summe = Wert1 / Wert2;
                System.out.println ( Wert1 + " / " + Wert2 + " = " + Summe );
                System.out.println ( );
            } else if (Funktion == 5) {
                System.out.print ( "Geben sie den ersten Wert ein den sie potenzieren wollen: " );
                double Wert1 = inputKonsole.nextDouble ( );
                System.out.print ( "Geben sie den zweiten Wert ein den sie potenzieren wollen: " );
                double Wert2 = inputKonsole.nextDouble ( );
                Summe = Math.pow ( Wert1, Wert2 );
                System.out.println ( Wert1 + "^" + Wert2 + " = " + Summe );
                System.out.println ( );

            }
        }
    }
}
