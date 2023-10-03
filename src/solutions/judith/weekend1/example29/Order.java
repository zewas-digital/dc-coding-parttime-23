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

package solutions.judith.weekend1.example29;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        System.out.println("Bitte geben sie die Artikelbezeichnung ein");
        String artikelbezeichnung = scan.next();



        System.out.println("Bitte tagen sie die gewünschte Menge ein");
        int menge = scan.nextInt();
        System.out.println(menge);

        System.out.println("Bitte tragen sie den eizel Preis ein");
        float preis = scan.nextFloat();
        System.out.println(preis);


        System.out.println("Bitte geben sie die Artikelnummer ein");
        long artikelnummer = scan.nextLong();
        System.out.println(artikelnummer);



        System.out.println("***************************");
        System.out.println("*           " + artikelbezeichnung+ "        *");
        System.out.println("*           " + artikelnummer +"       *");
        System.out.println("*           " + preis*menge + "          *");
        System.out.println("***************************");



    }
}
