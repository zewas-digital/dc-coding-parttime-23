/*
Erstelle ein Programm, dass die gefahrenen Kilometer sowie den Benzinverbrauch in Litern einließt.
Speichere beide Werte in passenden Datentypen ab und gib den Benzinverbrauch in l/100km in der Console aus.
 */

package Matthias.week2.weekend1.example28;

import java.util.Scanner;

public class GasolineConsumption {
    // Methoden deklareation

    //Methode 4: Datentype float Ausgeben
    static float getBenzinverbrauch(){
        float floatNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie den Benzinverbrauch in l ein:");
        floatNumber = scanner.nextFloat();
        return floatNumber;
    }
    static float getKilometer(){
        float floatNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie den Kilometerstand kmein:");
        floatNumber = scanner.nextFloat();
        return floatNumber;
    }

    //Methode 5: Datentype String Ausgeben
    static String getString(){
        String nameSting;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie eine Namen ein:");
        nameSting = scanner.next();
        return nameSting;
    }


    public static void main(String[] args) {
        float BenzininL=getBenzinverbrauch();
        float kilometer=getKilometer();
        float berechnet= (BenzininL/kilometer)*100;

        System.out.println(" Der Sprintverbrauch: " + berechnet + " " + "l/100 km" );

    }
}
