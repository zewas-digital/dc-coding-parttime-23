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

package solutions.saifedine.weekend1.example29;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        float Einzelpreis = 2.1f;

        Scanner Eingabe = new Scanner(System.in);

        System.out.println("Geben Sie die Bezeichnung: ");
        String stringBezeichnung = Eingabe.next();

        System.out.println("Geben Sie die Artikelnummer: ");
        long longArtikelnummer = Eingabe.nextLong();

        System.out.println("Geben Sie die Menge ein: ");
        int intMenge = Eingabe.nextInt();


        System.out.println("**************************");
        System.out.println("*         " + stringBezeichnung + "         *");
        System.out.println("*        " + longArtikelnummer + "        *");
        System.out.println("*          " + Einzelpreis*intMenge + "          *");
        System.out.println("**************************");


    }
}
