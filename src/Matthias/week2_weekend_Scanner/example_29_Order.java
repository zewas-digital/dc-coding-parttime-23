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

package Matthias.week2_weekend_Scanner;

import java.util.Scanner;

public class example_29_Order {
    static int getAnzahl(){
        int intNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie die Anzahl der Laptops ein: ");
        intNumber = scanner.nextInt();
        return intNumber;
    }

    static int getArtikelnummer(){
        int intNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie die Artikelnummer ein: ");
        intNumber = scanner.nextInt();
        return intNumber;
    }

    static float getEinzelpreis(){
        float floatNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie den Einezlpreis kein:");
        floatNumber = scanner.nextFloat();
        return floatNumber;
    }

    //Methode 5: Datentype String Ausgeben
    static String getNamePc(){
        String nameSting;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie eine Namen des Laptops ein:");
        nameSting = scanner.next();
        return nameSting;
    }
    public static void main(String[] args) {
        String pcname= getNamePc();
        int anzahl= getAnzahl();
        float einzelpreis= getEinzelpreis();
        int artikelnummer= getArtikelnummer();

        float gesamtpreis=  anzahl*einzelpreis;

        System.out.println("*************************");
        System.out.println("*      " + pcname);
        System.out.println("*      " + artikelnummer );
        System.out.println("*      " + gesamtpreis );
        System.out.println("*************************");
    }

}
