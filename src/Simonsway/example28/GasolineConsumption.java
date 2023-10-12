/*
Erstelle ein Programm, dass die gefahrenen Kilometer sowie den Benzinverbrauch in Litern einließt.
Speichere beide Werte in passenden Datentypen ab und gib den Benzinverbrauch in l/100km in der Console aus.
 */

package solutions.Simon.example28;

import java.util.Scanner;

public class GasolineConsumption {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte trage deine gefahrenen Kilometer ein: ");
        double kilomter = scan.nextDouble();
        System.out.println("Danke für die Eingabe: ");

        System.out.println("Bitte nenn mir dein Bezin Verbrauch gesamt: ");
        double verbrauch = scan.nextDouble();
        System.out.println("Danke für deine Eingabe: ");

        System.out.println("Dein Bezinverbrauch bei l/100km ist: " + (verbrauch/kilomter*100));
    }
}
