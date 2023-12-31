/*
Erstelle ein Programm, dass die gefahrenen Kilometer sowie den Benzinverbrauch in Litern einließt.
Speichere beide Werte in passenden Datentypen ab und gib den Benzinverbrauch in l/100km in der Console aus.
 */

package saifedine.week02_weekend1.example28;

import java.util.Scanner;

public class GasolineConsumption {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Gib die gefahrenen Km ein: ");
        float km = eingabe.nextFloat();
        System.out.println("Gib den Verbrauch in Liter ein: ");
        float liter = eingabe.nextFloat();

        System.out.println();
        System.out.println("Eingelesene Werte:");
        System.out.println("gefahrenen Km: " + km);
        System.out.println("Verbrauch in Liter: " + liter);
        System.out.println();

        float verbrauch = (liter / km) * 100;
        System.out.println("Der Verbrauch in l/100km ist: " + verbrauch);
    }
}