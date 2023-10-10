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

package solutions.michael_k.weekend1.example29;
import java.util.Scanner;
public class Order {
    public static void main(String[] args) {

        Scanner inputKonsole = new Scanner (System.in);

        System.out.print ("Bezeichnung: ");
        String Bezeichnung = inputKonsole.next();

        System.out.print ("Menge: ");
        int Menge = inputKonsole.nextInt();

        System.out.print ("Einzelpreis: ");
        float Einzelpreis = inputKonsole.nextFloat ();

        System.out.print ("Artikelnummer: ");
        long Artikelnummer = inputKonsole.nextLong();

        System.out.println ("*****************************" );
        System.out.println (Bezeichnung );
        System.out.println ("Art-Nr.: "+ Artikelnummer );
        System.out.println (Menge*Einzelpreis+ " €");
        System.out.println ("*****************************" );


    }
}
