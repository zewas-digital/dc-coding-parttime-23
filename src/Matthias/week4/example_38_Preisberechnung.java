package Matthias.week4;

/*
Preisberechnung

Ein Supermarkt eröffnet einen Online-Shop. Es gibt unterschiedliche Varianten der Preisberechnung. Implementieren Sie die aufgelisteten Funktionen zur Berechnung des Gesamtpreises des Lebensmittel-Einkaufs durch Überladen der Funktionen:

    static double calculatePrice(int amount, double price) berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis. Runden Sie den Gesamtpreis auf 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
    static double calculatePrice(int amount, double price, int discountInPercent) berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen Rabatt in Prozent. Runden Sie den Gesamtpreis auf 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.
    static double calculatePrice(int amount, double price, double totalDiscount) berechnet den Gesamtpreis aus der Anzahl und dem Stückpreis und gewährt einen fixen Rabatt (in €). Runden Sie den Gesamtpreis auf 2 Kommastellen. Bei ungültigen Parameterwerten oder ungültigem Ergebnis soll -1 als Ergebnis geliefert werden.

Hinweise:

    Der errechnete Gesamtpreis darf nicht kleiner 0 sein!
    Genauso darf auch kein negativer Rabatt gewährt werden.
    Für das Runden von Zahlen inkl. Nachkommastellen können Sie die Funktion Math.round() verwenden. Beispiel:

Runden Beispiel:
double x = 123.456
x = (double) Math.round(x * 100) / 100;
Out.println(x); //x hat jetzt den Wert 123.46



 */

import java.util.Scanner;

public class
example_38_Preisberechnung {
    static Scanner scanner = new Scanner( System.in );
    // Methoden //
    static double calculatePrice(int amount, double price) {
        return  amount * price;
    }
    static double calculatePrice(int amount, double price, int discountInPercent){
        double Gesamtpreis=amount*price;
        double Gesamtpreisminusdiscount=Gesamtpreis*((100.0-discountInPercent)/100.0);
        return Gesamtpreisminusdiscount;
    }
    static double calculatePrice2(int amount, double price, double totalDiscount) {
    double Gesamtpreis = (amount * price);
    double Gesamtpreisinclusivedis= Gesamtpreis-totalDiscount;
    return Gesamtpreisinclusivedis;
    }


    public static void main( String[] args ){
        // Apfel 1 Stück Preis 5 Euro
        double iStückPreisApfel = 5.0;
        int iStückApfel = 2;

        // Birne 2 Stück Preis 5 Euro 5% Rabatt
        int iStückBirne = 2;
        double iStückPreisBirne=5.0;
        int iProzentRabatBirne= 5;

        // Anannas  3 Stück Preis 5 Euro  -3 Euro Rabatt
        int iStückAnnanas= 3;
        double iStückPreisAnannas = 5.0;
        int iAnnanasRabatt=3;


        System.out.println("Apfel Preis: " + calculatePrice(iStückApfel,iStückPreisApfel) );
        System.out.println("Birnen Preis: " +calculatePrice( iStückBirne, iStückPreisBirne,iProzentRabatBirne ) );
        System.out.println( "Annanas Preis: " + calculatePrice2( iStückAnnanas, iStückPreisAnannas,iAnnanasRabatt ));

    }


}
