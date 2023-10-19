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

package MichaelReal.weekend1.example29;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print("Gib die Bezeichnung ein: ");
        String bezeichnung = scanner.next();

        System.out.print("Gib die Menge ein: ");
        int menge = scanner.nextInt();

        System.out.print("Gib den Einzelpreis ein: ");
        float einzelpreis = scanner.nextFloat();

        System.out.print("Gib die Artikelnummer ein: ");
        long artikelnummer = scanner.nextLong();

        double gesamtpreis = einzelpreis * menge;

        System.out.println("*************************");
        System.out.println("*        " + bezeichnung + "         *");
        System.out.println("*        " + artikelnummer + "       *");
        System.out.println("*        " + gesamtpreis + "           *");
        System.out.println("*************************");






    }
}
