/*
Schreibe ein Programm, mit dem du die verschiedenen Datentypen (int, long, double, float, String und char) von der Console einließt und in eine Variable speicherst.

Eine Übersicht der primitiven Datentypen findest du hier: https://de.wikibooks.org/wiki/Java_Standard:_Primitive_Datentypen
*/

package Matthias.week2_weekend_Scanner;

import java.util.Scanner;

public class example_25_ReadDatatype {

    // Methoden deklareation

    //Methode 1: Datentype int Ausgeben

    static int getInt(){
        int intNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie eine ganze Zahl ein:");
        intNumber = scanner.nextInt();
        return intNumber;
    }

    //Methode 2: Datentype Long Ausgeben

    static long getLong(){
        long longNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie eine ganze Zahl ein:");
        longNumber = scanner.nextLong();
        return longNumber;
    }

    //Methode 3: Datentype double Ausgeben
    static double getDouble(){
        double doubleNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie eine Kommazahl  ein:");
        doubleNumber = scanner.nextDouble();
        return doubleNumber;
    }
    //Methode 4: Datentype float Ausgeben
    static float getFloat(){
        float floatNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie eine Kommazahl ein:");
        floatNumber = scanner.nextFloat();
        return floatNumber;
    }

    //Methode 5: Datentype String Ausgeben
    static String getString(){
        String nameSting;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippen Sie eine Namen ein:");
        nameSting = scanner.next();
        return nameSting;
    }

    public static void main(String[] args) {

        // Int Abfrage 1 Benutzer:
        int intEingabeBenutzer=getInt();
        System.out.println("A1: Die Zahl ist" + " " +intEingabeBenutzer);

        // Int Abfrage 2 Benutzer:
        long longEingabeBenutzer=getInt();
        System.out.println("A2:Die Zahl ist" + " " + longEingabeBenutzer);

        // Int Abfrage 3 Benutzer:
        double doubleEingabeBenutzer=getDouble();
        System.out.println("A3:Die Zahl ist" + " " + doubleEingabeBenutzer);

        // Int Abfrage 4 Benutzer:
        float floatEingabeBenutzer=getFloat();
        System.out.println("A4:Die Zahl ist" + " " + floatEingabeBenutzer);

        // Int Abfrage 5 Benutzer:
        String StringEingabeBenutzer=getString();
        System.out.println("A5: Der Name ist" + " " + StringEingabeBenutzer);
    }
}
