/*
Schreibe ein Programm, das die Daten einer Bestellung von der Console einliest und in Variablen mit passendem Datentyp abspeichert.
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

package solutions.claudia.weekend1.example29;
import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int amount;
        float price;
        long articleNumber;

        System.out.print("Was willst Du bestellen? Bitte eingeben: ");
        name = scanner.next();
        System.out.print("Wieviel davon? Bitte eingeben: ");
        amount = scanner.nextInt();
        System.out.print("Was kostet eins davon? Bitte eingeben, Achtung, mit Komma: ");
        price = scanner.nextFloat();
        System.out.print("Wie ist die Artikelnummer? Bitte eingeben: ");
        articleNumber = scanner.nextLong();
        System.out.println("Hier kommt Dein Gesamtpreis:");
        System.out.println("********************************");
        System.out.println("*  " + name);
        System.out.println("*  " + articleNumber);
        System.out.println("*  " + amount * price);
        System.out.println("********************************");
    }
}
