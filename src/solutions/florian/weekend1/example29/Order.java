/*
Schreibe ein Programm, dass die Daten einer Bestellung von der Console einließt und in Variablen mit passendem Datentyp abspeichert.
Die Daten sind:
- Bezeichnung (String)  // Laptop
- Menge (int)           // 5
- Einzelpreis (float)    // 2,1
- Artikelnummer (?)     // 12345678

Gib die Daten im nachfolgenden Format aus. Der Gesamtpreis berechnet sich aus Einzelpreis * Menge.
**************************
*         Laptop         *
*        12345678        *
*          10.5          *
**************************

 */
package solutions.florian.weekend1.example29;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib die Bezeichnung ein: ");
        String bezeichnung = scanner.next();
        System.out.println("Gib die Menge ein: ");
        int menge = scanner.nextInt();
        System.out.println("Gib den Einzelpreis ein: ");
        float einzelpreis = scanner.nextFloat();
        System.out.println("Gib die Artikelnummer ein: ");
        int artikelnummer = scanner.nextInt();
        float gesamtpreis = 0;

        gesamtpreis = einzelpreis * menge;
        System.out.println(gesamtpreis);


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 24; j++) {
                if (i == 0) {
                    System.out.print('*');
                }  else if (i == 3 -1 ) {
                    System.out.print('*');
                } else if (j == 24 -14 ) {
                    System.out.println(bezeichnung);
                    System.out.println("          " +artikelnummer);
                    System.out.print("          "+gesamtpreis);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }




    }

}
