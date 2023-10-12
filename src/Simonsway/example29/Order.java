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

package solutions.Simon.example29;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bitte gib den Artikel ein");
        String bezeichnung = scan.nextLine();

        System.out.println("Bitte gib deine Menge ein");
        int menge = scan.nextInt();

        System.out.println("Bitte gib den Einzelpreis ein");
        float einzelpreis = scan.nextFloat();

        System.out.println("Bitte gib die Artikelnummer ein");
        int artikelnummer = scan.nextInt();

        System.out.println("***************************");
        System.out.println("*           " + bezeichnung + "        *");
        System.out.println("*           " + artikelnummer +"       *");
        System.out.println("*           " + einzelpreis*menge + "          *");
        System.out.println("***************************");

    }
}
