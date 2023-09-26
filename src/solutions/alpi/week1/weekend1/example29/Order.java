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

package solutions.alpi.week1.weekend1.example29;


import java.util.Scanner;
public class Order {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Bestelldaten
        System.out.print("Bezeichnung: ");
        String bezeichnung = scanner.nextLine();

        System.out.print("Menge: ");
        int menge = scanner.nextInt();

        System.out.print("Einzelpreis: ");
        float einzelpreis = scanner.nextFloat();

        System.out.print("Artikelnummer: ");
        long artikelnummer = scanner.nextLong();

        // Berechnung des Gesamtpreises
        float gesamtpreis = einzelpreis * menge;

        // Ausgabe der Bestelldaten im Format
        System.out.println("**************************");
        System.out.println("               *" + bezeichnung + "     *");
        System.out.println("             *" + artikelnummer + "   *");
        System.out.println("           *" + gesamtpreis +  "    *");
        System.out.println("**************************");

        // Scanner Usereingabe schließen
        scanner.close();
    }
}
