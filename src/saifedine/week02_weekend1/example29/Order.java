/*
Schreibe ein Programm, dass die Daten einer Bestellung von der Console einließt und in Variablen mit passendem Datentyp abspeichert.
Die Daten sind:
- Bezeichnung (String)  // Laptop
- Menge (int)           // 5
- Einzelreis (float)    // 2,1
- Artikelnummer (?)     // 12345678

Gib die Daten im nachfolgenden Format aus. Der Gesamtpreis berechnet sich aus Einzelpreis * Menge.
**************************
*         Laptop         *
*        12345678        *
*          10.5          *
**************************
 */

package saifedine.week02_weekend1.example29;

import java.util.Scanner;

public class Order {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Geben Sie die Bezeichnung ein: ");
        String bezeichnung = eingabe.next();

        System.out.println("Geben Sie die Menge ein: ");
        int menge = eingabe.nextInt();

        System.out.println("Geben Sie den Einzelpreis ein: ");
        float einzelpreis = eingabe.nextFloat();

        System.out.println("Geben Sie die Artikelnummer ein: ");
        int artikelnummer = eingabe.nextInt();

        float gesamtPreis = einzelpreis * menge;

        System.out.println("Ihre Bestellung ist:");
        System.out.println();
        System.out.println("**************************");
        System.out.println("*         " + bezeichnung + "         *");
        System.out.println("*        " + artikelnummer + "        *");
        System.out.println("*          " + gesamtPreis + "          *");
        System.out.println("**************************");
    }
}