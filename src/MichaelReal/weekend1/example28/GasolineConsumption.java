/*
Erstelle ein Programm, dass die gefahrenen Kilometer sowie den Benzinverbrauch in Litern einließt.
Speichere beide Werte in passenden Datentypen ab und gib den Benzinverbrauch in l/100km in der Console aus.
 */

package solutions.michaelreal.weekend1.example28;

import java.util.Scanner;

public class GasolineConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib die gefahrenen Kilometer ein: ");
        double gefahreneKilometer = scanner.nextDouble();

        System.out.print("Bib den Benzinverbrauch in Litern ein:" );
        double benzinverbrauchInLitern = scanner.nextDouble();

        double verbrauchPro100Km = (benzinverbrauchInLitern / gefahreneKilometer) * 100;

        System.out.println("Der Benzinverbrauch beträgt " + verbrauchPro100Km + " l/100km.");

        scanner.close();


    }
}
