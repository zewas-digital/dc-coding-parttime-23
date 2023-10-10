/*
Erstelle ein Programm, dass die gefahrenen Kilometer sowie den Benzinverbrauch in Litern einließt.
Speichere beide Werte in passenden Datentypen ab und gib den Benzinverbrauch in l/100km in der Console aus.
 */

package solutions.eslem.example28;

import java.util.Scanner;

public class GasolineConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Bitte geben Sie die gefahrenen Kilometer ein:");
        int valuekm = scanner.nextInt();

        System.out.println("Bitte geben Sie den Benzinverbrauch in Litern ein:");
        double Value = scanner.nextDouble();

        System.out.println("eingelesene Werte");
        System.out.println(valuekm);
        System.out.println(Value);

        System.out.println("Benzinvebrauch/100km ist: " + (Value/valuekm) * 100);
    }
}
