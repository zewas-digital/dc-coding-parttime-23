/*
Erstelle ein Programm, dass die gefahrenen Kilometer sowie den Benzinverbrauch in Litern einließt.
Speichere beide Werte in passenden Datentypen ab und gib den Benzinverbrauch in l/100km in der Console aus.
 */


package Alpi.week2.example28;

import java.util.Scanner;

public class GasolineConsumption {
    public static void main(String[] args) {

        Scanner Eingabe = new Scanner(System.in);

        System.out.println("Gib die gefahrenen Km ein: ");
        float floatKm = Eingabe.nextFloat();

        System.out.println("Gib den Benzinverbrauch in Liter ein: ");
        float floatVerbrauch = Eingabe.nextFloat();

        System.out.println("Eingelesene Werte:");
        System.out.println(floatKm);
        System.out.println(floatVerbrauch);

        System.out.println("Benzinverbrauch in l/100km ist: " + (floatVerbrauch/floatKm)*100);

    }

}
