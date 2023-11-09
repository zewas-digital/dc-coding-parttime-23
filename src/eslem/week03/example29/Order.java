/*
Schreibe ein Programm, dass die Daten einer Bestellung von der Console einließt und in Variablen mit passendem Datentyp abspeichert.
Die Daten sind:
- Bezeichnung (String)  // Laptop
- Menge (int)           // 5
- Einzelreis (float)    // 2,1
- Artikelnummer (?)     // 12345678

Gib die Daten im nachfolgenden Format aus. Der Gesamtpreis berechnet sich aus Einzelpreis * Menge.      // int * double
**************************
*         Laptop         *
*        12345678        *
*          10.5          *
**************************

 */

package eslem.week03.example29;

import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("gib die Bezeichnung ein:");
    String bezeichnung = scanner.next();

    System.out.println("gib die Menge ein:");
    int Menge = scanner.nextInt();

    System.out.println("gib den Einzelpreis ein:");
    double preis = scanner.nextDouble();

    System.out.println("gib die Artikelnummer ein:");
    long Nummer = scanner.nextLong();


    double Gesamtpreis = 0;
    Gesamtpreis = Menge * preis;
    System.out.println(Gesamtpreis);


        System.out.println("********************");
        System.out.println("*     " + bezeichnung + "       *");
        System.out.println("*     " + Nummer + "     *");
        System.out.print("*     " + Gesamtpreis + "         *");
        System.out.println(" ");
        System.out.println("********************");
        }
    }
