/*
Erstelle ein Programm, dass die gefahrenen Kilometer sowie den Benzinverbrauch in Litern einließt.
Speichere beide Werte in passenden Datentypen ab und gib den Benzinverbrauch in l/100km in der Console aus.
 */

package solutions.judith.weekend1.example28;

import java.util.Scanner;

public class GasolineConsumption {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte tragen sie die gefahrenen Kilometer ein");
        double km =scan.nextDouble();
        System.out.println("gefahrene KM " + km);

        System.out.println("Bitte tragen sie den verbrauchten Benzin in Liter ein" );
        double liter = scan.nextDouble();
        System.out.println("Verbrauchte Liter: " + liter);

        System.out.println("Benzinverbrauch in l/100km " + (liter/km*100));

    }

}

